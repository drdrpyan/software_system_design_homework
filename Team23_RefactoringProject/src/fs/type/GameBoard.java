package fs.type;

import fs.excep.OutOfBoundPositionException;;

/*
 * ���� ������ �������� ǥ���ϴ� Ŭ����
 * FiveStoneGame�� data�� class�� �����Ͽ� ������, ������ �� ĭ�� ���� ǥ�� ����� �Ͼ�� �μ�����
 * ȿ���� �ּ�ȭ�ϵ��� �Ͽ���.
 * GameBoard �ܺο��� �������� �� ĭ�� ��ġ�� (1, 1) ~ (sizeX, sizeY)�� ������ ����
 * ���� ���� ������ �迭, (0, 0) ~ (sizeX-1, sizeY-1)�� �����̴�.
 */
public class GameBoard {
	
	private CellState board[][];
	
	/*
	 * ������ �ʱ�ȭ �޼ҵ�. ������ ũ�⸦ �����ϰ� �� ĭ�� ��� EMPTY�� �ʱ�ȭ�Ѵ�.
	 * @param sizeX �������� x�� ũ��
	 * @param sizeY �������� y�� ũ��
	 */
	public void initBoard(int sizeX, int sizeY) throws OutOfBoundPositionException {
		board = new CellState[sizeX][sizeY];
		for(int i=1; i<=sizeX; i++)
			for(int j=1; j<=sizeY; j++)
				setCell(i, j, CellState.EMPTY);
	}
	
	/*
	 * ĭ ���� �޼ҵ�.
	 * @param x �����Ϸ��� ĭ�� x ��ǥ
	 * @param y �����Ϸ��� ĭ�� y ��ǥ
	 * @return ĭ�� ���� ��
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCell(int x, int y) throws OutOfBoundPositionException {
		if(!isInBound(x, y))
			throw new OutOfBoundPositionException(x, y);
		return board[x-1][y-1];
	}
	
	/*
	 * ĭ�� ���� �� ���� �޼ҵ�
	 * @param x ���� ���� �����Ϸ��� ĭ�� x ��ǥ
	 * @param y ���� ���� �����Ϸ��� ĭ�� y ��ǥ
	 * @throws OutOfBoundPositionException
	 */
	public void setCell(int x, int y, CellState cellState)
			throws OutOfBoundPositionException {
		if(!isInBound(x, y))
			throw new OutOfBoundPositionException(x, y);
		board[x-1][y-1] = cellState;
	}
	
	/*
	 * @return �������� x ��ǥ �ּҰ�
	 */
	public int getMinX() {
		return 1;
	}
	
	/*
	 * @return �������� x ��ǥ �ִ밪
	 */
	public int getMaxX() {
		return board.length;
	}
	
	/*
	 * @return �������� y ��ǥ �ּҰ�
	 */
	public int getMinY() {
		return 1;
	}
	
	/*
	 * @return �������� y��ǥ �ִ밪
	 */
	public int getMaxY() {
		return board[0].length;
	}
	

	/*
	 * �ش� ĭ�� ��ǥ(�ܺο��� ���� ����)�� ������ ������ ĭ���� �Ǵ�
	 * @param x �Ǵ��ϰ��� �ϴ� ��ǥ�� x ��
	 * @param y �Ǵ��ϰ��� �ϴ� ��ǥ�� y ��
	 * @return ������ ���� ���̸� true, �ƴϸ� false�� ����
	 */
	private boolean isInBound(int x, int y) {
		if(x<getMinX() || x>getMaxX() || y<getMinY() || y>getMaxY())
			return false;
		else
			return true;
	}
}
