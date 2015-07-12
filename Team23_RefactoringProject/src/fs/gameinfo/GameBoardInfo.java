package fs.gameinfo;

import fs.excep.OutOfBoundPositionException;
import fs.type.CellState;
import fs.type.Point;

/**
 * ���Ӻ��� ���� ������ �����ϴ� �������̽�
 */
public interface GameBoardInfo extends FiveStoneGameInfo {
	/**
	 * ���� ���� �� ���ϴ� ��ġ�� ���� ���� �ƴµ� �̿�.
	 * @param x
	 * @param y
	 * @return ������ �� (x, y)���������� ��.
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCellState(int x, int y)
			throws OutOfBoundPositionException;
	
	/**
	 * ���� ���� �� ���ϴ� ��ġ�� ���� ���� �ƴµ� �̿�.
	 * @param point ������ ���� (x, y) ��ǥ
	 * @return ������ �� (x, y)���������� ��.
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCellState(Point point)
			throws OutOfBoundPositionException;
	
	/**
	 * @return �������� �ִ� x��ǥ��.
	 */
	public int getMaxX();
	
	/**
	 * @return �������� �ּ� x��ǥ��.
	 */
	public int getMinX();
	
	/**
	 * @return �������� �ִ� y��ǥ��.
	 */
	public int getMaxY();
	
	/**
	 * @return �������� �ּ� y��ǥ��.
	 */
	public int getMinY();
	
	/**
	 * ��ġ (x, y)�� ������ ���� �������� �Ǵ�.
	 * @param x
	 * @param y
	 * @return ������ ���� ���̸� true, ������ ������ ��� ��ġ�� false�� ��ȯ.
	 */
	public boolean isInBound(int x, int y);
	/**
	 * 
	 * @param x
	 * @return x�� ���� �Ǵ��ؼ� ��ȯ
	 */
	public boolean isXInBound(int x);
	/**
	 * 
	 * @param y
	 * @return y�� ���� �Ǵ��ؼ� ��ȯ
	 */
	public boolean isYInBound(int y);
	
	/**
	 * ��ġ (x, y)�� ������ ���� �������� �Ǵ�.
	 * @param point ������ ���� (x, y) ��ǥ
	 * @return ������ ���� ���̸� true, ������ ������ ��� ��ġ�� false�� ��ȯ.
	 */
	public boolean isInBound(Point point);
}
