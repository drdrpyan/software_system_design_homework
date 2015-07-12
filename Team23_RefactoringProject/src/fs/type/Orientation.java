package fs.type;

/**
 * ���� ���� ������ ������ Ÿ��.
 * ���, ��� ���� üũ�� ����Ѵ�.
 */
public enum Orientation {
	VERTICAL,
	HORIZONTAL,
	POSITIVE_GRADIENT,
	NEGATIVE_GRADIENT;
	
	/**
	 * @return �� ������ �������� ���� ������ ��, x��ǥ�� �����ϴ� ��
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
	 * @return �� ������ �������� ���� ������ ��, y��ǥ�� �����ϴ� ��
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