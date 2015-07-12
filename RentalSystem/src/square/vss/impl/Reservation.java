package square.vss.impl;

import java.util.HashMap;
import java.util.Map;

import square.vss.empty_entity.Member;
import square.vss.empty_entity.Rental;

public class Reservation {
	private String reservationNo;
	private ReservationState state;

	private static Map<String, Reservation> reservations = new HashMap<String, Reservation>();

	private Title title;
	private Copy heldCopy;
	private boolean isoldest=false;
	private Reservation(String reservationNo) {
		//TODO 아직 안건드렸음
		this.reservationNo = reservationNo;
		state = ReservationState.PENDING;
	}

	public static Reservation getReservation(String reservationNo) {
		//TODO 아직 안건드렸음
		if (!reservations.containsKey(reservationNo)) {
			reservations.put(reservationNo, new Reservation(reservationNo));
		}
		return reservations.get(reservationNo);
	}

	public Title getTitle() {
		//TODO 아직 안건드렸음
		return title;
	}

	public void setTitle(Title title) {
		//TODO 아직 안건드렸음
		this.title = title;
	}
	
	public void copyAvailable(Copy c) {
		//TODO Copy를 테스트하기 위해 구현함. Reservation의 구현사항을 만족하지는 않음.
		if(title.getOldestPending()==this&&title.getReservations().size()>1){
			title.changeOldestPending();
			if(title.getSecondOldestPending()!=null){
				title.getSecondOldestPending().beOldestPending();
			}
			state = ReservationState.OUTSTANDING;
		}
		else if(title.getOldestPending()==this&&title.getReservations().size()<=1){
			state = ReservationState.OUTSTANDING;
		}
	}

	public void beOldestPending() {
		//TODO 아직 안건드렸음
		isoldest=true;
	}

	public void cancel() {
		//TODO 아직 안건드렸음
		if(state==ReservationState.PENDING){
			if(title.getOldestPending()!=this||
					(title.getOldestPending()==this&&title.getReservations().size()<=1)){
				state = ReservationState.CANCELLED;
			}
			else if(title.getOldestPending()==this&&title.getReservations().size()>1){
				title.changeOldestPending();
				if(title.getSecondOldestPending()!=null){
					title.getSecondOldestPending().beOldestPending();
				}
				state = ReservationState.CANCELLED;
			}
		}
		else if(state==ReservationState.OUTSTANDING){
			if(!title.getReservations().isEmpty()){
				title.getOldestPending().copyAvailable(heldCopy);
				this.heldCopy.cancelReservation();
				state = ReservationState.CANCELLED;
			}
			else if(title.getReservations().isEmpty()){
				this.heldCopy.cancelReservation();
				state = ReservationState.CANCELLED;
			}
		}
    }

	public void expire() {
		if(title.getReservations().size()>1){
			title.getOldestPending().copyAvailable(heldCopy);
			state = ReservationState.EXPIRED;
		}
		else if(title.getReservations().size()<=1){
			state = ReservationState.EXPIRED;
		}
		//TODO Copy를 테스트하기 위해 구현함. Reservation의 구현사항을 만족하지는 않음.
	}

	public void fulfill(Rental r) {
		//TODO Copy를 테스트하기 위해 구현함. Reservation의 구현사항을 만족하지는 않음.
		state = ReservationState.FULFILLED;
    }

	public ReservationState getState() {
		//TODO 아직 안건드렸음
		return state;
	}

	@Override
	public boolean equals(Object obj) {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		if (obj == this)
			return true;

		if (obj instanceof Reservation) {
			Reservation r = (Reservation) obj;
			return r.reservationNo.equals(reservationNo);
		}
		return false;
	}

	@Override
	public int hashCode() {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		int hashCode = 17;
		hashCode = hashCode * 31 + reservationNo.hashCode();
		return hashCode;
	}

	public static void clear() {
		//TODO 아직 안건드렸음
		// TODO Auto-generated method stub
		reservations.clear();
	}

	public Copy getHeldCopy() {
		//TODO 아직 안건드렸음
		return heldCopy;
	}

	public void setHeldCopy(Copy heldCopy) {
		//TODO 아직 안건드렸음
		this.heldCopy = heldCopy;
	}

}
