package fs.excep;

import fs.type.StoneType;


public class InvalidTurnException extends Exception {
	
	private int x;
	private int y;
	private StoneType stone;

	public InvalidTurnException(int x, int y, StoneType stone) {
		this.x = x;
		this.y = y;
		this.stone = stone;
	}
	
	public String toString() {
		return String.format("InvalidTurnException : " + stone.toString() + "턴이 아닙니다. By Point(" + x + ", " + y + ")");
	}

}
