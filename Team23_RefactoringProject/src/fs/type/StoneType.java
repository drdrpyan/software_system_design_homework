package fs.type;
public enum StoneType {
	WHITE, BLACK;

	public String toString() {
		switch (this) {
		case WHITE:
			return "O";
		case BLACK:
			return "X";
		}
		return null;
	}
	
	public StoneType getOppositeColorStone() {
		if(this == WHITE)
			return BLACK;
		else
			return WHITE;
	}
}
