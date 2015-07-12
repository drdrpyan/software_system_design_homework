package fs.type;

/**
 * �Ϸķ� ������ ������ ĭ�� ��ȸ�ϴ� �ݺ���
 */
public class LineIterator extends PointIterator {
	private Orientation orientation;
	
	public LineIterator(Point startPoint, Orientation orientation) {
		super(startPoint);
		this.orientation = orientation;
	}
	
	public LineIterator(int startX, int startY, Orientation orientation) {
		super(startX, startY);
		this.orientation = orientation;
	}
	
	public LineIterator(LineIterator lineIterator) {
		super(lineIterator);
		this.orientation = lineIterator.orientation;
	}
	
	public LineIterator moveNext(int distance) {
		move(orientation.xIncrment() * distance,
				orientation.yIncrement() * distance);
		return this;
	}
	
	public LineIterator movePrevious(int distance) {
		move(-1 * orientation.xIncrment() * distance,
				-1 * orientation.yIncrement() * distance);
		return this;
	}
	
	public Point getMovedPoint(int distance) {
		LineIterator temp = new LineIterator(this);
		return temp.moveNext(distance);
	}
	/**
	 * ���� �� ���� �ٸ� ��ġ���� �����ϴ� �� �ݺ��ڸ� ��ȯ
	 * @param distance �� �ݺ��ڿ� ������ �Ÿ�
	 * @return ���ο� ��ġ�� �� �ݺ���
	 */
	public LineIterator createMovedIterator(int distance) {
		LineIterator movedIterator = new LineIterator(this);
		movedIterator.moveNext(distance);
		return movedIterator;		
	}
	
	static public LineIterator getPositiveGradientIterator(int x, int y) {
		return new LineIterator(x, y, Orientation.POSITIVE_GRADIENT);
	}
	
	static public LineIterator getNegativeGradientIterator(int x, int y) {
		return new LineIterator(x, y, Orientation.NEGATIVE_GRADIENT);
	}
	
	static public LineIterator getVerticalIterator(int x, int y) {
		return new LineIterator(x, y, Orientation.VERTICAL);
	}
	
	static public LineIterator getHorizontalIterator(int x, int y) {
		return new LineIterator(x, y, Orientation.HORIZONTAL);
	}
}
