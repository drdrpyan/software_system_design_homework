package fs.excep;

public class ThreeThreePlaceException extends Exception {
	private int x;
	private int y;

	public ThreeThreePlaceException(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		System.err.println("point(" + x + ", " + y +") is error!!");
		return String.format("ThreeThreePlaceException : (%d , %d)", x, y);
	}
}
