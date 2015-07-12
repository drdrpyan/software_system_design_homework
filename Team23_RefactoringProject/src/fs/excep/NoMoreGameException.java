package fs.excep;

public class NoMoreGameException extends Exception {
	
	private static String str;
	
	public static void setEndPoint(String endpoint) {
		str = endpoint;
	}
	
	public String toString() {
		return String.format("NoMoreGameException : " + str);
	}

}
