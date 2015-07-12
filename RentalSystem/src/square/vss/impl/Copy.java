package square.vss.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import square.vss.empty_entity.Rental;

public class Copy {
	private String barcode;
	private CopyState state;

	private static Map<String, Copy> copies = new HashMap<String, Copy>();

	private Title title;
	private Reservation reservation;
	private Rental rental;

	private Copy(String barcode) {
		//TODO 아직 안건드렸음
		this.barcode = barcode;
		state = CopyState.FOR_RENT;
	}

	public static Copy getCopy(String barcode) {
		//TODO 아직 안건드렸음
		if (!copies.containsKey(barcode)) {
			copies.put(barcode, new Copy(barcode));
		}
		return copies.get(barcode);
	}

	public CopyState getState() {
		//TODO 아직 안건드렸음
		return state;
	}

	public String getBarcode() {
		//TODO 아직 안건드렸음
		return barcode;
	}

	public Title getTitle() {
		//TODO 아직 안건드렸음
		return title;
	}

	public Reservation getReservation() {
		//TODO 아직 안건드렸음
		return reservation;
	}

	public Rental getRental() {
		//TODO 아직 안건드렸음
		return rental;
	}

	public void setTitle(Title title) {
		//TODO 아직 안건드렸음
		this.title = title;
	}

	public void setReservation(Reservation reservation) {
		//TODO 아직 안건드렸음
		this.reservation = reservation;
	}

	public void cancelReservation() {
		if(!doesTitleHavePendingReservation())
			state = CopyState.FOR_RENT;
		//TODO 아직 안건드렸음
	
	}

	public void holdExpire() {
		//TODO Reservation 완성 후 다시 테스트할 것
		reservation.expire();
		
		//TODO 호출 전에 state조건을 확인해 error exception을 하는것이 나은가?
		if(!doesTitleHavePendingReservation())
			state = CopyState.FOR_RENT;
	}

	public void rent(Rental r) {
		//TODO rental = r의 의미 나중에 확인할 것
		rental = r;
		
		if(state == CopyState.ON_HOLD)
			reservation.fulfill(r);
		
		state = CopyState.RENTED;
	}

	public void returnCopy() {
		if(doesTitleHavePendingReservation()) {
			//TODO 아직 reservation이 구현되지 않았으므로 이 코드는 확실치 않음. 나주엥 다시 테스트할 것
			title.getOldestPending().copyAvailable(this);
			state = CopyState.ON_HOLD;
		}
		else {
			state = CopyState.FOR_RENT;
		}
	}

	public void sell() {
		state = CopyState.SOLD;
		
	}

	public void setForSale() {
		state = CopyState.FOR_SALE;
	}

	@Override
	public boolean equals(Object obj) {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		if (obj == this)
			return true;

		if (obj instanceof Copy) {
			Copy c = (Copy) obj;
			return c.barcode.equals(barcode);
		}
		return false;
	}

	@Override
	public int hashCode() {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		int hashCode = 17;
		hashCode = hashCode * 31 + barcode.hashCode();
		return hashCode;
	}

	public static void clear() {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		copies.clear();
	}
	
	/**
	 * returnCopy(), holdExpire(), cancelReservation()의 precondition을 체크하기 위한 메소드
	 * @return title의 reservation 큐 내에 Pending상태의 Reservation이 존재하면 true, 없으면 false를 리턴
	 */
	private boolean doesTitleHavePendingReservation() {
		Collection<Reservation> titleReservation = title.getReservations();
		for(Reservation r : titleReservation)
			if(r.getState() == ReservationState.PENDING)
				return true;
		return false;
	}

}
