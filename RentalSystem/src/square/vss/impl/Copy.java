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
		//TODO ���� �Ȱǵ����
		this.barcode = barcode;
		state = CopyState.FOR_RENT;
	}

	public static Copy getCopy(String barcode) {
		//TODO ���� �Ȱǵ����
		if (!copies.containsKey(barcode)) {
			copies.put(barcode, new Copy(barcode));
		}
		return copies.get(barcode);
	}

	public CopyState getState() {
		//TODO ���� �Ȱǵ����
		return state;
	}

	public String getBarcode() {
		//TODO ���� �Ȱǵ����
		return barcode;
	}

	public Title getTitle() {
		//TODO ���� �Ȱǵ����
		return title;
	}

	public Reservation getReservation() {
		//TODO ���� �Ȱǵ����
		return reservation;
	}

	public Rental getRental() {
		//TODO ���� �Ȱǵ����
		return rental;
	}

	public void setTitle(Title title) {
		//TODO ���� �Ȱǵ����
		this.title = title;
	}

	public void setReservation(Reservation reservation) {
		//TODO ���� �Ȱǵ����
		this.reservation = reservation;
	}

	public void cancelReservation() {
		if(!doesTitleHavePendingReservation())
			state = CopyState.FOR_RENT;
		//TODO ���� �Ȱǵ����
	
	}

	public void holdExpire() {
		//TODO Reservation �ϼ� �� �ٽ� �׽�Ʈ�� ��
		reservation.expire();
		
		//TODO ȣ�� ���� state������ Ȯ���� error exception�� �ϴ°��� ������?
		if(!doesTitleHavePendingReservation())
			state = CopyState.FOR_RENT;
	}

	public void rent(Rental r) {
		//TODO rental = r�� �ǹ� ���߿� Ȯ���� ��
		rental = r;
		
		if(state == CopyState.ON_HOLD)
			reservation.fulfill(r);
		
		state = CopyState.RENTED;
	}

	public void returnCopy() {
		if(doesTitleHavePendingReservation()) {
			//TODO ���� reservation�� �������� �ʾ����Ƿ� �� �ڵ�� Ȯ��ġ ����. ���ֿ� �ٽ� �׽�Ʈ�� ��
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
		//TODO ���� �Ȱǵ����
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
		//TODO ���� �Ȱǵ����
		// TODO Auto-generated method stub
		int hashCode = 17;
		hashCode = hashCode * 31 + barcode.hashCode();
		return hashCode;
	}

	public static void clear() {
		//TODO ���� �Ȱǵ����
		// TODO Auto-generated method stub
		copies.clear();
	}
	
	/**
	 * returnCopy(), holdExpire(), cancelReservation()�� precondition�� üũ�ϱ� ���� �޼ҵ�
	 * @return title�� reservation ť ���� Pending������ Reservation�� �����ϸ� true, ������ false�� ����
	 */
	private boolean doesTitleHavePendingReservation() {
		Collection<Reservation> titleReservation = title.getReservations();
		for(Reservation r : titleReservation)
			if(r.getState() == ReservationState.PENDING)
				return true;
		return false;
	}

}
