package square.vss.impl;
public enum ReservationState {
	PENDING("Pending"), OUTSTANDING("Outstanding"), CANCELLED("Cancelled"), EXPIRED(
			"Expired"), FULFILLED("Fulfilled");

	private String str;

	private ReservationState(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
}
