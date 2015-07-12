package square.vss.impl;

public enum CopyState {
	FOR_RENT("ForRent"), ON_HOLD("OnHold"), FOR_SALE("ForSale"), RENTED(
			"Rented"), SOLD("Sold");

	private String str;

	private CopyState(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}
}
