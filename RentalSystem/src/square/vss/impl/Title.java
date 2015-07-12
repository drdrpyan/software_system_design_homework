package square.vss.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Title {
	private Reservation oldestPending;
	private Reservation secondOldestPending;
	private String name;
	private Queue<Reservation> reservation;
	private Double rentFee;
	private Double salePrice;
	private static Map<String, Title> titles = new HashMap<String, Title>();
	private Map<String, Copy> copies;

	private Title(String name) {
		this.name = name;
		reservation = new LinkedList<Reservation>();
		copies = new HashMap<String, Copy>();
	}

	public static Title getTitle(String name) {
		if (!titles.containsKey(name)) {
			titles.put(name, new Title(name));
		}
		return titles.get(name);
	}

	public Integer checkTitle() {
		return 0;
	}

	public Collection<Copy> getCopies() {
		return copies.values();
	}

	public Copy getCopy(String barcode) {
		return copies.get(barcode);
	}

	public void addCopy(String barcode) {
		Copy copy = Copy.getCopy(barcode);
		copy.setTitle(this);
		copies.put(barcode, copy);
	}

	public void removeCopy(String barcode) {
		copies.remove(barcode);
	}

	public Collection<Reservation> getReservations() {
		return reservation;
	}

	public Reservation getOldestPending() {
		return oldestPending;
	}

	public Reservation getSecondOldestPending() {
		return secondOldestPending;
	}

	public Set<Reservation> getOutstanding() {
		Set<Reservation> outstandingReservation = new HashSet<Reservation>();
		for (Reservation r : reservation) {
			if (r.getState() == ReservationState.OUTSTANDING) {
				outstandingReservation.add(r);
			}
		}
		return outstandingReservation;
	}

	public void changeOldestPending() {
		reservation.poll();
		if (reservation.size() == 0) {
			oldestPending = null;
			secondOldestPending = null;
		} else if (reservation.size() == 1) {
			oldestPending = reservation.peek();
			secondOldestPending = null;
		} else {
			oldestPending = reservation.peek();
			Iterator<Reservation> iterator = reservation.iterator();
			iterator.next();
			secondOldestPending = iterator.next();
		}
	}

	public void setRentFee(String rentFee) {
		this.rentFee = Double.valueOf(rentFee);
	}

	public String getRentFee() {
		return rentFee.toString();
	}

	public void setSalePrice(String salePrice) {
		this.salePrice = Double.valueOf(salePrice);
	}

	public String getSalePrice() {
		return salePrice.toString();
	}

	public void addReservation(Reservation r) {
		if (reservation.size() == 0) {
			oldestPending = r;
		} else if (reservation.size() == 1) {
			secondOldestPending = r;
		}
		r.setTitle(this);
		reservation.add(r);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this)
			return true;

		if (obj instanceof Title) {
			Title t = (Title) obj;
			return t.name.equals(name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hashCode = 17;
		hashCode = hashCode * 31 + name.hashCode();
		return hashCode;
	}

	public static void clear() {
		// TODO Auto-generated method stub
		titles.clear();
	}
}
