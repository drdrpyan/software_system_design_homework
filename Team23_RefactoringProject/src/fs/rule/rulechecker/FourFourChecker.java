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

public class FourFourChecker implements FiveStoneRuleChecker {
	private GameBoardInfo boardInfo;
	
	static private FourFourChecker fourFourChecker = null;
	
	private FourFourChecker() { }
	
	static public FourFourChecker getInstance() {
		if(fourFourChecker == null)
			fourFourChecker = new FourFourChecker();
		return fourFourChecker;
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
		int count4 = 0;

		int dx = 4, dy = 4;

		count4 += checkHorizontalCount4(x, y, stone);
		debuggingFunction(x, y, dx, dy, count4);
		count4 += checkVerticalCount4(x, y, stone);
		debuggingFunction(x, y, dx, dy, count4);
		count4 += checkPositiveGradientCount4(x, y, stone);
		debuggingFunction(x, y, dx, dy, count4);
		count4 += checkNegativeGradientCount4(x, y, stone);
		debuggingFunction(x, y, dx, dy, count4);
		if (count4 >= 2) {
			throw new FourFourPlaceException(x,y);
		}

		return true;
	}

	private int checkNegativeGradientCount4(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;
		
		int dx = 4, dy = 4;
		System.out.println("=============");
		
		if (isNegativeGradient4Stones(x, y, stone)) {
			count++;
		}
		count += isNegativeGradient4StonesPattern(x, y, stone, FourStonePattern.get13StonePattern());
		debuggingFunction(x, y, dx, dy, count);
		count += isNegativeGradient4StonesPattern(x, y, stone, FourStonePattern.get22StonePattern());
		debuggingFunction(x, y, dx, dy, count);
		count += isNegativeGradient4StonesPattern(x, y, stone, FourStonePattern.get31StonePattern());
		debuggingFunction(x, y, dx, dy, count);

		return count;
	}

	private int isNegativeGradient4StonesPattern(int x, int y,
			StoneType stone, FourStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;

		int theMostLeftStone;
		int theMostUpStone;

		if (x - 4 < 0 || y + 4 > 14) {
			if (x > 14 - y) {
				theMostLeftStone = x - (14 - y);
				theMostUpStone = 14;
			}
			else if (14 - y > x) {
				theMostLeftStone = 0;
				theMostUpStone = y + x;
			}
			else {
				theMostLeftStone = 0;
				theMostUpStone = 14;
			}
		}
		else {
			theMostLeftStone = x - 4;
			theMostUpStone = y + 4;
		}

		int theMostRightStone;
		int theMostDownStone;

		if (x + 4 > 14 || y - 4 < 0) {
			int add_mount = 14 - x > y ? y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostDownStone = y - add_mount;
		}
		else {
			theMostRightStone = x + 4;
			theMostDownStone = y - 4;
		}

		for (int xi = theMostLeftStone, yi = theMostUpStone; xi + 4 <= theMostRightStone && yi - 4 >= theMostDownStone; xi++, yi--) {
			if (boardInfo.getCellState(xi+1, yi+1) == pattern.first && 
					boardInfo.getCellState(xi+2, yi) == pattern.second && 
					boardInfo.getCellState(xi+3, yi-1) == pattern.third && 
					boardInfo.getCellState(xi+4, yi-2) == pattern.forth && 
					boardInfo.getCellState(xi+5, yi-3) == pattern.fifth) {

				if (xi == 0 && yi == 4)
					count++;
				else if (xi == 10 && yi == 14)
					count++;
				else if (xi == 0 || yi == 14) {
					if (xi + 5 <= 14 && yi - 5 >= 0 && boardInfo.getCellState(xi+6, yi-4) != CellState.BLACK)
						count++;

				}
				else if (xi + 4 == 14 || yi - 4 == 0) {
					if (boardInfo.getCellState(xi, yi+2) != CellState.BLACK)
						count++;
				}
				else {
					if (xi - 1 >= 0 && yi + 1 <= 14 && xi + 5 <= 14 && yi - 5 >= 0)
						if (boardInfo.getCellState(xi, yi+2) != CellState.BLACK && boardInfo.getCellState(xi+6, yi-4) != CellState.BLACK) 
							count++;
				}
			}
		}

		return count;
	}

	private boolean isNegativeGradient4Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		int theMostUpStone;

		if (x - 3 < 0 || y + 3 > 14) {
			if (x > 14 - y) {
				theMostLeftStone = x - (14 - y);
				theMostUpStone = 14;
			}
			else if (14 - y > x) {
				theMostLeftStone = 0;
				theMostUpStone = y + x;
			}
			else {
				theMostLeftStone = 0;
				theMostUpStone = 14;
			}
		}
		else {
			theMostLeftStone = x - 3;
			theMostUpStone = y + 3;
		}

		int theMostRightStone;
		int theMostDownStone;

		if (x + 3 > 14 || y - 3 < 0) {
			int add_mount = 14 - x > y ? y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostDownStone = y - add_mount;
		}
		else {
			theMostRightStone = x + 3;
			theMostDownStone = y - 3;
		}

		if (x == 4 && y == 12) {
			System.out.println("debug");
		}

		for (int xi = theMostLeftStone, yi = theMostUpStone; 
				xi + 3 <= theMostRightStone && yi - 3 >= theMostDownStone; xi++, yi--) {
			if (boardInfo.getCellState(xi+1, yi+1) == CellState.BLACK && 
					boardInfo.getCellState(xi+2, yi) == CellState.BLACK && 
					boardInfo.getCellState(xi+3, yi-1) == CellState.BLACK && 
					boardInfo.getCellState(xi+4, yi-2) == CellState.BLACK) {

				if (xi == 0 || yi == 14) {
					if (xi + 4 > 14 || yi - 4 < 0) {
						return false;
					}
					if (boardInfo.getCellState(xi+5, yi-3) == CellState.WHITE) {
						return false;
					}
					if (boardInfo.getCellState(xi+6, yi-4) == CellState.BLACK) {
						return false;
					}
				}
				else if (xi + 3 == 14 || yi - 3 == 0) {
					if (xi - 1 < 0 || yi + 1 > 14) {
						return false;
					}
					if (boardInfo.getCellState(xi, yi+2) == CellState.WHITE) {
						return false;
					}
					if (boardInfo.getCellState(xi-1, yi+3) == CellState.BLACK) {
						return false;
					}
				}
				else {

					if (xi - 1 >= 0 && yi + 1 <= 14 && xi + 4 <= 14 && yi - 4 >= 0 &&
							boardInfo.getCellState(xi, yi+2) == CellState.WHITE && boardInfo.getCellState(xi+5, yi-3) == CellState.WHITE) {
						return false;
					}
					if (xi - 1 >= 0 && yi + 1 <= 14 && xi + 5 <= 14 && yi - 5 >= 0 &&
							boardInfo.getCellState(xi, yi+2) == CellState.WHITE && boardInfo.getCellState(xi+6, yi-4) == CellState.BLACK) {
						return false;
					}
					if (xi - 2 >= 0 && yi + 2 <= 14 && xi + 4 <= 14 && yi - 4 >= 0 &&
							boardInfo.getCellState(xi+5, yi-3) == CellState.WHITE && boardInfo.getCellState(xi-1, yi+3) == CellState.BLACK) {
						return false;
					}

					if (xi - 2 >= 0 && yi + 2 <= 14 && xi + 5 <= 14 && yi - 5 >= 0) {
						if (boardInfo.getCellState(xi-1, yi+3) == CellState.BLACK && boardInfo.getCellState(xi+6, yi-4) == CellState.BLACK)
							return false;
					}
				}

				return true;
			}
		}
		return false;
	}

	private int checkPositiveGradientCount4(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;
		if (isPositiveGradient4Stones(x, y, stone)) {
			count++;
		}
		count += isPositiveGradient4StonesPattern(x, y, stone, FourStonePattern.get13StonePattern());
		count += isPositiveGradient4StonesPattern(x, y, stone, FourStonePattern.get22StonePattern());
		count += isPositiveGradient4StonesPattern(x, y, stone, FourStonePattern.get31StonePattern());

		return count;
	}

	private int isPositiveGradient4StonesPattern(int x, int y,
			StoneType stone, FourStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		int count = 0;

		int theMostLeftStone;
		int theMostDownStone;

		if (x - 4 < 0 || y - 4 < 0) {
			if (x > y) {
				theMostLeftStone = x - y;
				theMostDownStone = 0;
			}
			else if (y > x) {
				theMostLeftStone = 0;
				theMostDownStone = y - x;
			}
			else {
				theMostLeftStone = theMostDownStone = 0;
			}
		}
		else {
			theMostLeftStone = x - 4;
			theMostDownStone = y - 4;
		}

		int theMostRightStone ;
		int theMostUpStone;

		if (x + 4 > 14 || y + 4 > 14) {
			int add_mount = 14 - x > 14 - y ? 14 - y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostUpStone = y + add_mount;
		}
		else {
			theMostRightStone = x + 4;
			theMostUpStone = y + 4;
		}

		for (int xi = theMostLeftStone, yi = theMostDownStone; xi + 4 <= theMostRightStone && yi + 4 <= theMostUpStone; xi++, yi++) {
			if (boardInfo.getCellState(xi+1, yi+1) == pattern.first && 
					boardInfo.getCellState(xi+2, yi+2) == pattern.second && 
					boardInfo.getCellState(xi+3, yi+3) == pattern.third && 
					boardInfo.getCellState(xi+4, yi+4) == pattern.forth && 
					boardInfo.getCellState(xi+5, yi+5) == pattern.fifth) {
				if (xi == 0 && yi == 10)
					count++;
				else if (xi == 10 && yi == 0)
					count++;

				else if (xi == 0 || yi == 0) {
					if (boardInfo.getCellState(xi+6, yi+6) != CellState.BLACK)
						count++;
				}
				else if (xi + 4 == 14 || yi + 4 == 14) {
					if (xi - 1 >= 0 && yi - 1 >= 0 && boardInfo.getCellState(xi, yi) != CellState.BLACK)
						count++;
				}
				else {
					if (xi - 1 >= 0 && yi - 1 >= 0 && xi + 5 <= 14 && yi + 5 <= 14) 
						if (boardInfo.getCellState(xi, yi) != CellState.BLACK && boardInfo.getCellState(xi+6, yi+6) != CellState.BLACK)
							count++;
				}
			}
		}

		return count;
	}

	private boolean isPositiveGradient4Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		int theMostDownStone;

		if (x - 3 < 0 || y - 3 < 0) {
			if (x > y) {
				theMostLeftStone = x - y;
				theMostDownStone = 0;
			}
			else if (y > x) {
				theMostLeftStone = 0;
				theMostDownStone = y - x;
			}
			else {
				theMostLeftStone = theMostDownStone = 0;
			}
		}
		else {
			theMostLeftStone = x - 3;
			theMostDownStone = y - 3;
		}

		int theMostRightStone;
		int theMostUpStone;

		if (x + 3 > 14 || y + 3 > 14) {
			int add_mount = 14 - x > 14 - y ? 14 - y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostUpStone = y + add_mount;
		}
		else {
			theMostRightStone = x + 3;
			theMostUpStone = y + 3;
		}

		for (int xi = theMostLeftStone, yi = theMostDownStone; xi + 3 <= theMostRightStone && yi + 3 <= theMostUpStone; xi++, yi++) {
			if (boardInfo.getCellState(xi+1,yi+1) == CellState.BLACK && 
					boardInfo.getCellState(xi + 2,yi + 2) == CellState.BLACK && 
					boardInfo.getCellState(xi + 3,yi + 3) == CellState.BLACK && 
					boardInfo.getCellState(xi + 4,yi + 4) == CellState.BLACK) {
				if (xi == 0 || yi == 0) {
					if (xi + 4 > 14 || yi + 4 > 14) {
						return false;
					}
					if (boardInfo.getCellState(xi + 5,yi + 5) == CellState.WHITE) {
						return false;
					}
					if (boardInfo.getCellState(xi + 6,yi + 6) == CellState.BLACK) {
						return false;
					}
				}
				else if (xi + 3 == 14 || yi + 3 == 14) {
					if (xi - 1 < 0 || yi - 1 < 0) {
						return false;
					}
					if (xi - 1 >= 0 && yi -1 >= 0 && boardInfo.getCellState(xi,yi) == CellState.WHITE)
						return false;
					if (xi - 2 >= 0 && yi -2 >= 0 && boardInfo.getCellState(xi - 1,yi - 1) == CellState.BLACK)
						return false;
				}
				else {
					if (xi - 1 >= 0 && yi - 1 >= 0 && xi + 4 <= 14 && yi + 4 <= 14 &&
							boardInfo.getCellState(xi,yi) == CellState.WHITE && boardInfo.getCellState(xi + 5,yi + 5) == CellState.WHITE)
						return false;
					if (xi - 1 >= 0 && yi - 1 >= 0 && xi + 5 <= 14 && yi + 5 <= 14 &&
							boardInfo.getCellState(xi,yi) == CellState.WHITE && boardInfo.getCellState(xi + 6,yi + 6) == CellState.BLACK)
						return false;
					if (xi - 2 >= 0 && yi - 2 >= 0 && xi + 4 <= 14 && yi + 4 >= 14 &&
							boardInfo.getCellState(xi + 5,yi + 5) == CellState.WHITE && boardInfo.getCellState(xi - 1,yi - 1) == CellState.BLACK)
						return false;

					if (xi - 2 >= 0 && yi - 2 >= 0 && xi + 5 <= 14 && yi + 5 <= 14) 
						if (boardInfo.getCellState(xi - 1,yi - 1) == CellState.BLACK && boardInfo.getCellState(xi + 6,yi + 6) == CellState.BLACK)
							return false;
				}

				return true;
			}
		}
		return false;
	}

	private int checkVerticalCount4(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;
		if (isVertical4Stones(x, y, stone)) {
			count++;
		}
		count += isVertical4StonesPattern(x, y, stone, FourStonePattern.get13StonePattern());
		count += isVertical4StonesPattern(x, y, stone, FourStonePattern.get22StonePattern());
		count += isVertical4StonesPattern(x, y, stone, FourStonePattern.get31StonePattern());

		return count;
	}

	private int isVertical4StonesPattern(int x, int y, StoneType stone,
			FourStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;

		int theMostDownStone;
		if (y - 4 < 0)
			theMostDownStone = 0;
		else
			theMostDownStone = y - 4;

		int theMostUpStone;
		if (y + 4 > 14)
			theMostUpStone = 14;
		else
			theMostUpStone = y + 4;

		for (int i = theMostDownStone; i + 4 <= theMostUpStone; i++) {
			if (boardInfo.getCellState(x+1,i+1) == pattern.first && 
					boardInfo.getCellState(x+1,i + 2) == pattern.second && 
					boardInfo.getCellState(x+1,i + 3) == pattern.third && 
					boardInfo.getCellState(x+1,i + 4) == pattern.forth && 
					boardInfo.getCellState(x+1,i + 5) == pattern.fifth) {
				if (i == 0) {
					if (boardInfo.getCellState(x+1,i + 6) != CellState.BLACK) {
						count++;
					}
				}
				else if (i + 4 == 14) {
					if (boardInfo.getCellState(x+1,i) != CellState.BLACK) {
						count++;
					}
				}
				else {
					if (boardInfo.getCellState(x+1,i) != CellState.BLACK && boardInfo.getCellState(x+1,i + 6) != CellState.BLACK) {
						count++;
					}
				}
			}
		}

		return count;
	}

	private boolean isVertical4Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostDownStone;
		if (y -3 < 0)
			theMostDownStone = 0;
		else
			theMostDownStone = y - 3;

		int theMostUpStone;
		if (y + 3 > 14)
			theMostUpStone = 14;
		else
			theMostUpStone = y + 3;

		for (int i = theMostDownStone; i <= theMostUpStone - 3; i++) {
			if (boardInfo.getCellState(x+1,i+1) == CellState.BLACK && 
					boardInfo.getCellState(x+1,i + 2) == CellState.BLACK && 
					boardInfo.getCellState(x+1,i + 3) == CellState.BLACK && 
					boardInfo.getCellState(x+1,i + 4) == CellState.BLACK) {
				if (i == 0) {
					if (boardInfo.getCellState(x+1,5) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(x+1,6) == CellState.BLACK)
						return false;
				}
				else if (i + 3 == 14) {
					if (boardInfo.getCellState(x+1,11) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(x+1,10) == CellState.BLACK)
						return false;
				}
				else {
					if (boardInfo.getCellState(x+1,i) == CellState.WHITE && boardInfo.getCellState(x+1,i + 5) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(x+1,i) == CellState.WHITE && boardInfo.getCellState(x+1,i + 6) == CellState.BLACK)
						return false;
					if (boardInfo.getCellState(x+1,i + 5) == CellState.WHITE && boardInfo.getCellState(x+1,i - 1) == CellState.BLACK)
						return false;
					if (i - 2 >= 0 && i + 5 <= 14) 
						if (boardInfo.getCellState(x+1,i - 1) == CellState.BLACK && boardInfo.getCellState(x+1,i + 6) == CellState.BLACK)
							return false;
				}

				return true;
			}
		}
		return false;

	}

	private int checkHorizontalCount4(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int count = 0;
		if (isHorizontal4Stones(x, y, stone)) {
			count++;
		}
		count += isHorizontal4StonesPattern(x, y, stone, FourStonePattern.get13StonePattern());
		count += isHorizontal4StonesPattern(x, y, stone, FourStonePattern.get22StonePattern());
		count += isHorizontal4StonesPattern(x, y, stone, FourStonePattern.get31StonePattern());

		return count;
	}

	private int isHorizontal4StonesPattern(int x, int y, StoneType stone, FourStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		int count = 0;

		int theMostLeftStone;
		if (x - 4 < 0)
			theMostLeftStone = 0;
		else
			theMostLeftStone = x - 4;

		int theMostRightStone;
		if (x + 4 > 14)
			theMostRightStone = 14;
		else
			theMostRightStone = x + 4;

		for (int i = theMostLeftStone; i + 4 <= theMostRightStone; i++) {
			if (boardInfo.getCellState(i+1,y+1) == pattern.first && 
					boardInfo.getCellState(i + 2,y+1) == pattern.second && 
					boardInfo.getCellState(i + 3,y+1) == pattern.third && 
					boardInfo.getCellState(i + 4,y+1) == pattern.forth && 
					boardInfo.getCellState(i + 5,y+1) == pattern.fifth) {
				if (i == 0) {
					if (boardInfo.getCellState(i + 6,y+1) != CellState.BLACK) 
						count++;
				}
				else if (i + 4 == 14) {
					if (boardInfo.getCellState(i,y+1) != CellState.BLACK) 
						count++;
				}
				else {
					if (boardInfo.getCellState(i,y+1) != CellState.BLACK && boardInfo.getCellState(i + 6,y+1) != CellState.BLACK) {
						count++;
					}
				}

			}
		}

		return count;
	}

	private boolean isHorizontal4Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		if (x -3 < 0)
			theMostLeftStone = 0;
		else
			theMostLeftStone = x - 3;

		int theMostRightStone;
		if (x + 3 > 14)
			theMostRightStone = 14;
		else
			theMostRightStone = x + 3;

		for (int i = theMostLeftStone; i <= theMostRightStone - 3; i++) {
			if (boardInfo.getCellState(i+1,y+1) == CellState.BLACK && 
					boardInfo.getCellState(i + 2,y+1) == CellState.BLACK && 
					boardInfo.getCellState(i + 3,y+1) == CellState.BLACK && 
					boardInfo.getCellState(i + 4,y+1) == CellState.BLACK) {

				if (i == 0) {
					if (boardInfo.getCellState(5,y+1) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(6,y+1) == CellState.BLACK)
						return false;
				}
				else if (i + 3 == 14) {
					if (boardInfo.getCellState(11,y+1) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(10,y+1) == CellState.BLACK)
						return false;
				}
				else {
					if (boardInfo.getCellState(i,y+1) == CellState.WHITE && boardInfo.getCellState(i + 5,y+1) == CellState.WHITE)
						return false;
					if (boardInfo.getCellState(i,y+1) == CellState.WHITE && boardInfo.getCellState(i + 6,y+1) == CellState.BLACK)
						return false;
					if (boardInfo.getCellState(i + 5,y+1) == CellState.WHITE && boardInfo.getCellState(i - 1,y+1) == CellState.BLACK)
						return false;
					if (i - 2 >= 0 && i + 5 <= 14) 
						if (boardInfo.getCellState(i - 1,y+1) == CellState.BLACK && boardInfo.getCellState(i + 6,y+1) == CellState.BLACK)
							return false;

				}

				return true;
			}
		}
		return false;
	}
	private void debuggingFunction(int x, int y, int dx, int dy, int num) {
		if (x == dx && y == dy) {
			System.out.println("debug" + num);
		}
	}
	
}
class FourStonePattern {
	CellState first;
	CellState second;
	CellState third;
	CellState forth;
	CellState fifth;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return first + " " + second + " " + " " +third + " " + forth + " " + fifth;
	}


	public FourStonePattern(CellState first, CellState second, CellState third, CellState forth, CellState fifth) {

		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
		this.fifth = fifth;
	}

	static FourStonePattern get13StonePattern() {
		return new FourStonePattern(CellState.BLACK, CellState.EMPTY, CellState.BLACK, CellState.BLACK, CellState.BLACK);
	}

	static FourStonePattern get22StonePattern() {
		return new FourStonePattern(CellState.BLACK, CellState.BLACK, CellState.EMPTY, CellState.BLACK, CellState.BLACK);
	}


	static FourStonePattern get31StonePattern() {
		return new FourStonePattern(CellState.BLACK, CellState.BLACK, CellState.BLACK, CellState.EMPTY, CellState.BLACK);
	}
}