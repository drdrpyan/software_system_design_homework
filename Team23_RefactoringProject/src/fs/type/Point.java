package fs.type;

/**
 * 게임판 위의 한 위치를 표현하기 위한 데이터형
 * 주어진 방향을 따라 앞, 뒤로 이동하는 iterator 구현
 */
public class Point {
	private int x;
	private int y;
	
	public  Point() {
		//TODO 언젠간 삭제할 생성자
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
		//TODO 언젠간 삭제할 접근자
		this.x = x;
	}
	
	protected void setY(int y) {
		//TODO 언젠간 삭제할 접근자
		this.y = y;
	}
}
