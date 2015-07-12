package fs.excep;

import fs.type.StoneType;

public class GeneralFiveStoneException extends Exception {
	
	private String reason;

	public GeneralFiveStoneException(String reason) {
		this.reason = reason;
	}
	
	public String toString() {

		return String.format("GeneralFiveStoneException: " + reason);
	}

}
