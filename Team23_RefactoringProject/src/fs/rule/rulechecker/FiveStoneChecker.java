package fs.rule.rulechecker;

import fs.FiveStoneGame;
import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.gameinfo.FiveStoneGameInfo;
import fs.gameinfo.GameBoardInfo;
import fs.type.CellState;
import fs.type.StoneType;

public class FiveStoneChecker implements FiveStoneRuleChecker{
	private GameBoardInfo boardInfo;
	
	static private FiveStoneChecker fiveStoneChecker = null;
	
	private FiveStoneChecker() { }
	
	static public FiveStoneChecker getInstance() {
		if(fiveStoneChecker == null)
			fiveStoneChecker = new FiveStoneChecker();
		return fiveStoneChecker;
	}
	
	@Override
	public boolean isValidMove(FiveStoneGameInfo gameInfo, int x, int y,
								StoneType stone) 
			throws DuplicatePlaceException,
			OutOfBoundPositionException, NoMoreGameException,
			ThreeThreePlaceException, FourFourPlaceException,
			SixStonePlaceException, InvalidTurnException,
			GeneralFiveStoneException {
		boardInfo = (GameBoardInfo) gameInfo;
		
		if (checkHorizontalFiveStone(x, y, stone)) {System.out.println("true");
			return true;
		}
		if (checkVerticalFiveStone(x, y, stone)) {System.out.println("true");
			return true;
		}
		if (checkPositiveGradientFiveStone(x, y, stone)) {System.out.println("true");
			return true;
		}
		if (checkNegativeGradientFiveStone(x, y, stone)) {System.out.println("true");
			return true;
		} 
		
		return false;
	}

	private boolean checkNegativeGradientFiveStone(int x, int y, StoneType st) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		Point luPoint = getLeftUpPoint(x, y, st);
		Point rdPoint = getRightDownPoint(x, y, st);

		int leftX = luPoint.x;
		int upY = luPoint.y;

		int rightX = rdPoint.x;
		int downY = rdPoint.y;

		CellState stoneType = getPuttedStone(st);

		for (int xi = leftX, yi = upY; xi <= rightX && yi >= downY; xi++, yi--) {
			int blackCount = 0;
			for (int xj = xi, yj = yi; xj <= rightX && yj >= downY; xj++, yj--) {
				if (boardInfo.getCellState(xj+1,yj+1) == stoneType) {
					blackCount++;
				}
				else
					break;
			}

			if (blackCount == 5)
				return true;
		}

		return false;
	}


	private boolean checkPositiveGradientFiveStone(int x, int y, StoneType st) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		if (x == 3 && y == 10) {
			System.out.println("debug");
		}

		Point ldPoint = getLeftDownPoint(x, y, st);
		Point ruPoint = getRightUpPoint(x, y, st);

		int leftX = ldPoint.x;
		int downY = ldPoint.y;


		int rightX = ruPoint.x;
		int upY = ruPoint.y;

		CellState stoneType = getPuttedStone(st);

		for (int xi = leftX, yi = downY; xi <= rightX && yi <= upY; xi++, yi++) {
			int blackCount = 0;
			for (int xj = xi, yj = yi; xj <= rightX && yj <= upY; xj++, yj++) {
				if (boardInfo.getCellState(xj+1,yj+1) == stoneType) {
					blackCount++;
				}
				else
					break;
			}
			if (blackCount >= 5)
				return true;
		}

		return false;
	}

	private boolean checkVerticalFiveStone(int x, int y, StoneType st) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int downY = getInitIndex(y - 5);
		int upY = getlastIndex(y + 5);

		CellState stoneType = getPuttedStone(st);


		for (int i = downY; i <= upY; i++) {

			int blackCount = 0;
			for (int j = i; j <= upY; j++) {
				if (boardInfo.getCellState(x+1,j+1) == stoneType) {
					blackCount++;
				}
				else
					break;
			}
			if (blackCount == 5)
				return true;
		}

		return false;
	}

	private boolean checkHorizontalFiveStone(int x, int y, StoneType st) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		if (x == 14 && y == 0)
			System.out.println("debug");
		int leftX = getInitIndex(x - 5);
		int rightX = getlastIndex(x + 5);

		CellState stoneType = getPuttedStone(st);

		for (int i = leftX; i <= rightX; i++) {
			int blackCount = 0;
			for (int j = i; j <= rightX; j++) {
				if (boardInfo.getCellState(j+1,y+1) == stoneType) {
					blackCount++;
				}
				else
					break;
			}
			if (blackCount == 5)
				return true;
		}

		return false;
	}
	private int getInitIndex(int x) {
		if (x < 0)
			return 0;
		return x;
	}



	private int getlastIndex(int x) {
		if (x >= 15)
			return 14;
		return x;
	}

	private Point getLeftDownPoint(int x, int y, StoneType st) {
		int leftX = x - 5;
		int downY = y - 5;

		if (leftX > downY && downY < 0) {
			leftX = x - y;
			downY = 0;
		}
		else if (leftX < downY && leftX < 0) {
			leftX = 0;
			downY = y - x;
		}
		else if (leftX == downY && leftX < 0) {
			leftX = 0;
			downY = 0;
		}

		return new Point(leftX, downY, st);
	}

	private Point getRightUpPoint(int x, int y, StoneType st) {
		int rightX = x + 5;
		int upY = y + 5;

		if (rightX > upY && rightX > 14) {
			rightX = 14;
			upY = y + (14 - x);
		}
		else if (upY > rightX && upY > 14) {
			rightX = x + (14 - y);
			upY = 14;
		}
		else if (rightX == upY && rightX > 14) {
			rightX = 14;
			upY = 14;
		}

		return new Point(rightX, upY, st);
	}

	private Point getLeftUpPoint(int x, int y, StoneType st) {
		int leftX = x - 5;
		int upY = y + 5;

		if (leftX < 0 && upY < 15) {
			leftX = 0;
			upY = y + x;
		}
		else if (leftX >= 0 && upY > 14) {
			leftX = x - (14 - y);
			upY = 14;
		}
		else if (leftX < 0 && upY > 14) {
			if (x < 14 - y) {
				leftX = 0;
				upY = y + x;
			}
			else if (x > 14 - y) {
				leftX = x - (14 - y);
				upY = 14;
			}
			else {
				leftX = 0;
				upY = 14;
			}

		}

		return new Point(leftX, upY, st);
	}

	private Point getRightDownPoint(int x, int y, StoneType st) {
		int rightX = x + 5;
		int downY = y - 5;

		if (rightX > 14 && downY >= 0) {
			rightX = 14;
			downY = y - (14 - x);
		}
		else if (rightX <= 14 && downY < 0) {
			rightX = x + y;
			downY = 0;
		}
		else if (rightX > 14 && downY < 0) {
			if (14 - x < y) {
				rightX = 14;
				downY = y - (14 - x);
			}
			else if (14 - x > y) {
				rightX = x + y;
				downY = 0;
			}
			else {
				rightX = 14;
				downY = 0;
			}

		}

		return new Point(rightX, downY, st);
	}
	private CellState getPuttedStone(StoneType st) {
		if (st == StoneType.BLACK)
			return CellState.BLACK;
		else
			return CellState.WHITE;
	}

}
class Point {
	int x;
	int y;
	StoneType st;

	public Point(int x, int y, StoneType st) {
		this.x = x;
		this.y = y;
		this.st = st;
	}
}
