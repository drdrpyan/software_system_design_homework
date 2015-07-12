package fs.excep;

public class OutOfBoundPositionException extends Exception {
	private int x;
	private int y;

	public OutOfBoundPositionException(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		System.err.println("point(" + x + ", " + y +") is error!!");
		return String.format("OutOfBoundPositionException : (%d , %d)", x, y);
	}
}
