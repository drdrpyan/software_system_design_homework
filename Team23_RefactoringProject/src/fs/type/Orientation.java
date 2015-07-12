package fs.type;

/**
 * 돌의 진행 방향을 정의한 타입.
 * 삼삼, 사사 등의 체크에 사용한다.
 */
public enum Orientation {
	VERTICAL,
	HORIZONTAL,
	POSITIVE_GRADIENT,
	NEGATIVE_GRADIENT;
	
	/**
	 * @return 현 방향을 기준으로 돌을 진행할 때, x좌표가 증가하는 양
	 */
	public int xIncrment() {
		switch(this) {
		case VERTICAL:
			return 0;
		case HORIZONTAL:
		case POSITIVE_GRADIENT:
		case NEGATIVE_GRADIENT:
			return 1;
		}
		return 0;
	}
	
	/**
	 * @return 현 방향을 기준으로 돌을 진행할 때, y좌표가 증가하는 양
	 */
	public int yIncrement() {
		switch(this) {
		case VERTICAL:
		case NEGATIVE_GRADIENT:
			return -1;
		case HORIZONTAL:
			return 0;
		case POSITIVE_GRADIENT:
			return 1;
		}
		return 0;
	}
}