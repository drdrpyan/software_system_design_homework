package fs.excep;
public class DuplicatePlaceException extends Exception {
	private int x;
	private int y;
	
	public DuplicatePlaceException(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		System.err.println("point(" + x + ", " + y +") is error!!");
		return String.format("DuplicatePlaceException : (%d , %d)", x, y);
	}
}
