package fs.excep;

public class FourFourPlaceException extends Exception {
	private int x;
	private int y;

	public FourFourPlaceException(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		System.err.println("point(" + x + ", " + y +") is error!!");
		return String.format("FourFourPlaceException : (%d , %d)", x, y);
	}
	
}
