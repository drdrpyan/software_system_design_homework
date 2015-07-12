package fs.type;

public enum CellState {
	WHITE, BLACK, EMPTY;
	
	public String toString() {
		switch (this) {
		case WHITE:
			return "O";
		case BLACK:
			return "X";
		case EMPTY:
			return " ";
		}
		return null;		
	}
}
