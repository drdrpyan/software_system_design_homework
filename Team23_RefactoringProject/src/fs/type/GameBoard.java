package fs.type;

import fs.excep.OutOfBoundPositionException;;

/*
 * 오목 게임의 게임판을 표현하는 클래스
 * FiveStoneGame의 data를 class로 추출하여 게임판, 게임판 내 칸의 상태 표현 변경시 일어나는 부수적인
 * 효과를 최소화하도록 하였다.
 * GameBoard 외부에선 게임판의 각 칸의 위치를 (1, 1) ~ (sizeX, sizeY)의 범위로 접근
 * 실제 내부 구현은 배열, (0, 0) ~ (sizeX-1, sizeY-1)의 범위이다.
 */
public class GameBoard {
	
	private CellState board[][];
	
	/*
	 * 게임판 초기화 메소드. 게임판 크기를 지정하고 각 칸을 모두 EMPTY로 초기화한다.
	 * @param sizeX 게임판의 x축 크기
	 * @param sizeY 게임판의 y축 크기
	 */
	public void initBoard(int sizeX, int sizeY) throws OutOfBoundPositionException {
		board = new CellState[sizeX][sizeY];
		for(int i=1; i<=sizeX; i++)
			for(int j=1; j<=sizeY; j++)
				setCell(i, j, CellState.EMPTY);
	}
	
	/*
	 * 칸 접근 메소드.
	 * @param x 접근하려는 칸의 x 좌표
	 * @param y 접근하려는 칸의 y 좌표
	 * @return 칸의 상태 값
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCell(int x, int y) throws OutOfBoundPositionException {
		if(!isInBound(x, y))
			throw new OutOfBoundPositionException(x, y);
		return board[x-1][y-1];
	}
	
	/*
	 * 칸의 상태 값 변경 메소드
	 * @param x 상태 값을 변경하려는 칸의 x 좌표
	 * @param y 상태 값을 변경하려는 칸의 y 좌표
	 * @throws OutOfBoundPositionException
	 */
	public void setCell(int x, int y, CellState cellState)
			throws OutOfBoundPositionException {
		if(!isInBound(x, y))
			throw new OutOfBoundPositionException(x, y);
		board[x-1][y-1] = cellState;
	}
	
	/*
	 * @return 게임판의 x 좌표 최소값
	 */
	public int getMinX() {
		return 1;
	}
	
	/*
	 * @return 게임판의 x 좌표 최대값
	 */
	public int getMaxX() {
		return board.length;
	}
	
	/*
	 * @return 게임판의 y 좌표 최소값
	 */
	public int getMinY() {
		return 1;
	}
	
	/*
	 * @return 게임판의 y좌표 최대값
	 */
	public int getMaxY() {
		return board[0].length;
	}
	

	/*
	 * 해당 칸의 좌표(외부에서 보는 기준)가 게임판 내부의 칸인지 판단
	 * @param x 판단하고자 하는 좌표의 x 값
	 * @param y 판단하고자 하는 좌표의 y 값
	 * @return 게임판 위의 값이면 true, 아니면 false를 리턴
	 */
	private boolean isInBound(int x, int y) {
		if(x<getMinX() || x>getMaxX() || y<getMinY() || y>getMaxY())
			return false;
		else
			return true;
	}
}
