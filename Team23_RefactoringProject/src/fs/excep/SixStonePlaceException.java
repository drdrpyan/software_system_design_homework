package fs.excep;

public class SixStonePlaceException extends Exception {
	private int x;
	private int y;

	public SixStonePlaceException(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public String toString() {
		System.err.println("point(" + x + ", " + y +") is error!!");
		return String.format("SixStonePlaceException : (%d , %d)", x, y);
	}
}
