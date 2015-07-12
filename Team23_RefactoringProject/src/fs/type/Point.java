package fs.type;

/**
 * ������ ���� �� ��ġ�� ǥ���ϱ� ���� ��������
 * �־��� ������ ���� ��, �ڷ� �̵��ϴ� iterator ����
 */
public class Point {
	private int x;
	private int y;
	
	public  Point() {
		//TODO ������ ������ ������
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point) {
		this.x = point.x;
		this.y = point.y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void setX(int x) {
		//TODO ������ ������ ������
		this.x = x;
	}
	
	protected void setY(int y) {
		//TODO ������ ������ ������
		this.y = y;
	}
}
