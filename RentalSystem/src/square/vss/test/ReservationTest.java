package square.vss.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import square.vss.empty_entity.Rental;
import square.vss.impl.Copy;
import square.vss.impl.CopyState;
import square.vss.impl.Reservation;
import square.vss.impl.ReservationState;
import square.vss.impl.Title;

public class ReservationTest {	
	private Title title;

	private Reservation reservation;
	private Copy c;
	private Rental r;

	@Before
	public void setUp() {
		Title.clear();
		Copy.clear();
		Reservation.clear();
		title = Title.getTitle("Gone with the wind");
		title.addCopy("C#1");
		title.addCopy("C#2");

		Copy c1 = title.getCopy("C#1");
		c = title.getCopy("C#2");

		title.addReservation(Reservation.getReservation("R#01"));
		title.addReservation(Reservation.getReservation("R#02"));

		Reservation oldestReservation = title.getOldestPending();
		Reservation secondOldestReservation = title.getSecondOldestPending();
		reservation = secondOldestReservation;
		reservation.setHeldCopy(c);
		oldestReservation.copyAvailable(c1);
		assertEquals(ReservationState.PENDING, secondOldestReservation.getState());
	}

	@Test
	public void testReservationA() {
		if (!isOldestPendingReservation(reservation) || 
				(isOldestPendingReservation(reservation) && !areThereAnyPendingReservationsExcept(reservation))) {
			reservation.cancel();
		}
		assertEquals(ReservationState.CANCELLED, reservation.getState());
	}

	@Test
	public void testReservationB() {
		title.addReservation(Reservation.getReservation("R#03"));
		Reservation r = reservation.getTitle().getOldestPending();
		if (isOldestPendingReservation(reservation) &&
				areThereAnyPendingReservationsExcept(reservation)) {
			reservation.cancel();
		}
		assertNotEquals(r, reservation.getTitle().getOldestPending());
		assertEquals(ReservationState.CANCELLED, reservation.getState());
	}

	@Test
	public void testReservationC() {
		title.addReservation(Reservation.getReservation("R#03"));
		Reservation v1 = reservation.getTitle().getSecondOldestPending();
		if (isOldestPendingReservation(reservation) && 
				areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(v1, reservation.getTitle().getOldestPending());
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		reservation.fulfill(r);
		assertEquals(ReservationState.FULFILLED, reservation.getState());
	}

	@Test
	public void testReservationD() {
		if (isOldestPendingReservation(reservation) && 
				!areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		reservation.fulfill(r);
		assertEquals(ReservationState.FULFILLED, reservation.getState());
	}

	@Test
	public void testReservationE() {
		if (isOldestPendingReservation(reservation) && 
				!areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		if (!areThereAnyPendingReservations()) {
			reservation.expire();
		}
		assertEquals(ReservationState.EXPIRED, reservation.getState());
	}

	@Test
	public void testReservationF() {
		if (!areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		title.addReservation(Reservation.getReservation("R#03"));
		if (areThereAnyPendingReservations()) {
			reservation.expire();
		}
		assertEquals(ReservationState.EXPIRED, reservation.getState());
	}

	@Test
	public void testReservationG() {
		if (isOldestPendingReservation(reservation) && 
				!areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		if (!areThereAnyPendingReservations()) {
			reservation.cancel();
			assertEquals(CopyState.FOR_RENT, c.getState());
		}

		assertEquals(ReservationState.CANCELLED, reservation.getState());
	}

	@Test
	public void testReservationH() {
		if (isOldestPendingReservation(reservation) && 
				!areThereAnyPendingReservationsExcept(reservation)) {
			reservation.copyAvailable(c);
		}
		assertEquals(ReservationState.OUTSTANDING, reservation.getState());

		title.addReservation(Reservation.getReservation("R#03"));
		if (areThereAnyPendingReservations()) {
			reservation.cancel();
			//			assertEquals(ReservationState.OUTSTANDING, reservation.getTitle().getOldestPending().getState());
			assertEquals(CopyState.FOR_RENT, c.getState());
		}

		assertEquals(ReservationState.CANCELLED, reservation.getState());
	}

	private boolean isOldestPendingReservation(Reservation reservation) {
		if (reservation.getTitle().getOldestPending().equals(reservation))
			return true;
		return false;
	}

	private boolean areThereAnyPendingReservationsExcept(Reservation rsv) {

		for (Reservation v : reservation.getTitle().getReservations()) {
			if (v.getState() == ReservationState.PENDING && !v.equals(rsv))
				return true;
		}


		return false;
	}

	private boolean areThereAnyPendingReservations() {
		for (Reservation v : reservation.getTitle().getReservations()) {
			if (v.getState() == ReservationState.PENDING)
				return true;
		}
		return false;
	}
}


