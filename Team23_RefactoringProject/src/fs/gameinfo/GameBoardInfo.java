package fs.gameinfo;

import fs.excep.OutOfBoundPositionException;
import fs.type.CellState;
import fs.type.Point;

/**
 * 게임보드 관련 정보를 제공하는 인터페이스
 */
public interface GameBoardInfo extends FiveStoneGameInfo {
	/**
	 * 게임 보드 내 원하는 위치의 상태 값을 아는데 이용.
	 * @param x
	 * @param y
	 * @return 게임판 위 (x, y)지점에서의 값.
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCellState(int x, int y)
			throws OutOfBoundPositionException;
	
	/**
	 * 게임 보드 내 원하는 위치의 상태 값을 아는데 이용.
	 * @param point 게임판 위의 (x, y) 좌표
	 * @return 게임판 위 (x, y)지점에서의 값.
	 * @throws OutOfBoundPositionException
	 */
	public CellState getCellState(Point point)
			throws OutOfBoundPositionException;
	
	/**
	 * @return 게임판의 최대 x좌표값.
	 */
	public int getMaxX();
	
	/**
	 * @return 게임판의 최소 x좌표값.
	 */
	public int getMinX();
	
	/**
	 * @return 게임판의 최대 y좌표값.
	 */
	public int getMaxY();
	
	/**
	 * @return 게임판의 최소 y좌표값.
	 */
	public int getMinY();
	
	/**
	 * 위치 (x, y)가 게임판 위의 점인지를 판단.
	 * @param x
	 * @param y
	 * @return 게임판 위의 점이면 true, 게임판 영역을 벗어난 위치면 false를 반환.
	 */
	public boolean isInBound(int x, int y);
	/**
	 * 
	 * @param x
	 * @return x축 점만 판단해서 반환
	 */
	public boolean isXInBound(int x);
	/**
	 * 
	 * @param y
	 * @return y축 점만 판단해서 반환
	 */
	public boolean isYInBound(int y);
	
	/**
	 * 위치 (x, y)가 게임판 위의 점인지를 판단.
	 * @param point 게임판 위의 (x, y) 좌표
	 * @return 게임판 위의 점이면 true, 게임판 영역을 벗어난 위치면 false를 반환.
	 */
	public boolean isInBound(Point point);
}
