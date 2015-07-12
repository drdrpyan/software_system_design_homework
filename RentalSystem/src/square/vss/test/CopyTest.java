package square.vss.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import square.vss.empty_entity.Rental;
import square.vss.impl.Copy;
import square.vss.impl.CopyState;
import square.vss.impl.Reservation;
import square.vss.impl.ReservationState;
import square.vss.impl.Title;


public class CopyTest {
	
	private Title title;

	private Copy copy;
	
	private Rental r1;
	private Rental r2;

	@Before
	public void setUp() {
		Title.clear();
		Copy.clear();
		Reservation.clear();
		title = Title.getTitle("Gone with the wind");
		title.addCopy("C#1");
		title.addCopy("C#2");
		title.addCopy("C#3");
		title.addCopy("C#4");
		title.addCopy("C#5");
		
		Copy copy2 = title.getCopy("C#2");
		copy2.rent(new Rental());
		
		copy = title.getCopy("C#1");
		
		r1 = new Rental();
		r2 = new Rental();
	}

	@Test
	public void testCopyA() {
		int forRentPreCount = countCopyState(CopyState.FOR_RENT);
		int forSalePreCount = countCopyState(CopyState.FOR_SALE);
		copy.setForSale();
		assertEquals(CopyState.FOR_SALE, copy.getState());
		assertEquals(forRentPreCount - 1, countCopyState(CopyState.FOR_RENT));
		assertEquals(forSalePreCount + 1, countCopyState(CopyState.FOR_SALE));
		
		int soldPreCount = countCopyState(CopyState.SOLD);
		copy.sell();
		assertEquals(CopyState.SOLD, copy.getState());
		assertEquals(forSalePreCount, countCopyState(CopyState.FOR_SALE));
		assertEquals(soldPreCount + 1, countCopyState(CopyState.SOLD));
	}

	@Test
	public void testCopyB() {
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		int forRentPreCount = countCopyState(CopyState.FOR_RENT);
		if (!isExistPendingReservations()) {
			copy.returnCopy();
		}
		assertEquals(CopyState.FOR_RENT, copy.getState());
		assertEquals(forRentPreCount + 1, countCopyState(CopyState.FOR_RENT));
		assertEquals(rentedPreCount, countCopyState(CopyState.RENTED));
		
	}
	
	@Test
	public void testCopyC() {
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		Reservation rsv = Reservation.getReservation("R#01");
		assertEquals(ReservationState.PENDING, rsv.getState());
		copy.setReservation(rsv);
		title.addReservation(rsv);
		
		
		int onHoldCount = countCopyState(CopyState.ON_HOLD);
		if (isExistPendingReservations()) {
			copy.returnCopy();
		}
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.OUTSTANDING, rsv.getState());
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));

		copy.rent(r2);
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.FULFILLED, rsv.getState());
	}

	@Test
	public void testCopyD() {
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		Reservation rsv = Reservation.getReservation("R#01");
		assertEquals(ReservationState.PENDING, rsv.getState());
		title.addReservation(rsv);
		
		
		int onHoldCount = countCopyState(CopyState.ON_HOLD);
		if (isExistPendingReservations()) {
			copy.returnCopy();
		}
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.OUTSTANDING, rsv.getState());
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
	
		if (isExistPendingReservations()) {
			copy.cancelReservation();
		}
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
	}
	
	@Test
	public void testCopyE() {		
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		Reservation rsv = Reservation.getReservation("R#01");
		copy.setReservation(rsv);	
		assertEquals(ReservationState.PENDING, rsv.getState());
		title.addReservation(rsv);

		Reservation rsv2 = Reservation.getReservation("R#02");
		Copy copy2 = title.getCopy("C#2");
		copy2.rent(new Rental());		
		copy2.setReservation(rsv2);
		rsv2.setTitle(title);
		title.addReservation(rsv2);
		
		int onHoldCount = countCopyState(CopyState.ON_HOLD);
		if (isExistPendingReservations()) {
			copy.returnCopy();
		}
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.OUTSTANDING, rsv.getState());
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
	
		if (isExistPendingReservations()) {
			copy.holdExpire();
		}
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.EXPIRED, rsv.getState());
	}
	
	@Test
	public void testCopyF() {
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		Reservation rsv = Reservation.getReservation("R#01");
		assertEquals(ReservationState.PENDING, rsv.getState());
		copy.setReservation(rsv);
		title.addReservation(rsv);
		
		int onHoldCount = countCopyState(CopyState.ON_HOLD);
		if (isExistPendingReservations()) {
			copy.returnCopy();
		}
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.OUTSTANDING, rsv.getState());
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
		
		int forRentPreCount = countCopyState(CopyState.FOR_RENT);
		if (!isExistPendingReservations()) {
			copy.holdExpire();
		}
		//TODO Reservation이 구현되지 않아 holdExpire()가 호출되지 않았을 수도 있음. 나중에 다시 테스트할것
		assertEquals(CopyState.FOR_RENT, copy.getState());
		assertEquals(forRentPreCount + 1, countCopyState(CopyState.FOR_RENT));
		//TODO Reservation 완성 후 다시 테스트할 것
		assertEquals(ReservationState.EXPIRED, rsv.getState());
	}
	
	@Test
	public void testCopyG() {
		int rentedPreCount = countCopyState(CopyState.RENTED);
		copy.rent(r1);
		assertEquals(r1, copy.getRental());
		assertEquals(CopyState.RENTED, copy.getState());
		assertEquals(rentedPreCount + 1, countCopyState(CopyState.RENTED));
		
		Reservation rsv = Reservation.getReservation("R#01");
		assertEquals(ReservationState.PENDING, rsv.getState());
		title.addReservation(rsv);
		
		int onHoldCount = countCopyState(CopyState.ON_HOLD);
		if (isExistPendingReservations()) {
			copy.returnCopy();
		}
		//assertEquals(ReservationState.OUTSTANDING, rsv.getState());
		assertEquals(CopyState.ON_HOLD, copy.getState());
		assertEquals(onHoldCount + 1, countCopyState(CopyState.ON_HOLD));
		
		int forRentPreCount = countCopyState(CopyState.FOR_RENT);
		if (!isExistPendingReservations()) {
			copy.cancelReservation();;
		}
		//TODO Reservation이 구현되지 않아cancelReservation()이 호출되지 않았을 수도 있음. 나중에 다시 테스트할것
		assertEquals(CopyState.FOR_RENT, copy.getState());
		assertEquals(forRentPreCount + 1, countCopyState(CopyState.FOR_RENT));
	}
	
	private int countCopyState(CopyState copyState) {
		int stateCount = 0;
		for (Copy c : copy.getTitle().getCopies()) {
			if (c.getState() == copyState)
				stateCount++;
		}
		
		return stateCount;
	}

	private boolean isExistPendingReservations() {
		for (Reservation v : copy.getTitle().getReservations()) {
			if (v.getState() == ReservationState.PENDING)
				return true;
		}
		return false;
	}

}
