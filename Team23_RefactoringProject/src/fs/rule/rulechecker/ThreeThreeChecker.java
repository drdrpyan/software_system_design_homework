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
import fs.pattern.PatternInLine;
import fs.pattern.PatternInLineChecker;
import fs.type.CellState;
import fs.type.LineIterator;
import fs.type.Orientation;
import fs.type.StoneType;

public class ThreeThreeChecker implements FiveStoneRuleChecker {
	final PatternInLine patternBlack3 =
			new PatternInLine(StoneType.BLACK,
					CellState.BLACK, CellState.BLACK, CellState.BLACK);
	final PatternInLine patternBlack12 =
			new PatternInLine(StoneType.BLACK,
					CellState.BLACK, CellState.EMPTY, CellState.BLACK, CellState.BLACK);
	final PatternInLine patternBlack21 =
			new PatternInLine(StoneType.BLACK,
					CellState.BLACK, CellState.BLACK, CellState.EMPTY, CellState.BLACK);
	final PatternInLine[] blackThreePatterns = {patternBlack3, patternBlack12, patternBlack21};
	final PatternInLineChecker patternInLineChecker = PatternInLineChecker.getInstance();
	
	private GameBoardInfo boardInfo;
	
	static private ThreeThreeChecker threeThreeChecker = null;
	
	private ThreeThreeChecker() { }
	
	static public ThreeThreeChecker getInstance() {
		if(threeThreeChecker == null)
			threeThreeChecker = new ThreeThreeChecker();
		return threeThreeChecker;
	}
	@Override
	public boolean isValidMove(FiveStoneGameInfo gameInfo, int x, int y,
								StoneType stone) 
			throws DuplicatePlaceException,
			OutOfBoundPositionException, NoMoreGameException,
			ThreeThreePlaceException, FourFourPlaceException,
			SixStonePlaceException, InvalidTurnException,
			GeneralFiveStoneException {
		// TODO checkNegativeGradient에 대한 리펙토링중. debug변수들도 언젠간 고칠것
				//리펙토링용 임시 변수. 나중에 없앨것
				boardInfo = (GameBoardInfo) gameInfo;
				int debug_x = x;
				int debug_y = y;
						
				x=x+1;
				y=y+1;
				int count3 = 0;
			
				int dx = 7, dy = 6;
			
				if (checkHorizontalCount3(debug_x, debug_y, stone)) {
					debuggingFunction(debug_x, debug_y, dx, dy, 1);
					count3++;
				}
				if (checkVerticalCount3(debug_x, debug_y, stone)) {
					debuggingFunction(debug_x, debug_y, dx, dy, 2);
					count3++;
				}
				if (checkPositiveGradientCount3(debug_x, debug_y, stone)) {
					debuggingFunction(debug_x, debug_y, dx, dy, 3);
					count3++;
				}
				if (checkNegativeGradientCount3(x, y, stone)) {
					debuggingFunction(x, y, dx, dy, 4);
					count3++;
				}
			
				if (count3 >= 2) {
					throw new ThreeThreePlaceException(x,y);
				}
				return true;
	}
	private void debuggingFunction(int x, int y, int dx, int dy, int num) {
		if (x == dx && y == dy) {
			System.out.println("debug" + num);
		}
	}
	
//	//TODO 여기 정의되어있는 Point를 제거할것
//	private boolean checkThreeInLine(GameBoardInfo boardInfo, fs.type.Point basisPoint, Orientation orientation)
//			throws OutOfBoundPositionException {
//		
//		if(!boardInfo.isInBound(basisPoint))
//			throw new OutOfBoundPositionException(basisPoint.getX(), basisPoint.getY());
//		
//		for(PatternInLine pattern: blackThreePatterns) {
//			LineIterator startPointIterator = new LineIterator(basisPoint, orientation);
//			startPointIterator.movePrevious(pattern.getLength()-1);
//			for(int i=0; i<pattern.getLength(); i++) {
//				if(!boardInfo.isInBound(startPointIterator)) {
//					startPointIterator.moveNext(1);
//					continue;
//				}
//				if(!boardInfo.isInBound(startPointIterator.getMovedPoint(pattern.getLength()-1)))
//					break;
//				if(patternInLineChecker.checkPatternInLineFromHere(boardInfo, startPointIterator, pattern)) {
//					if(!boardInfo.isInBound(startPointIterator.getMovedPoint(-1))) {
//						startPointIterator.moveNext(1);
//						continue;
//					}
//					if(!boardInfo.isInBound(startPointIterator.getMovedPoint(pattern.getLength()))) {
//						break;
//					}
//					if(!boardInf))
//				}
//			}
//		}
//			for(int i=0; i<pattern.getLength(); i++)
//				if(patternInLineChecker.checkPatternInLineFromHere(boardInfo, basisPoint, pattern, orientation)) 
//		return false;
//	}
	private boolean checkNegativeGradientCount3(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO isNegativeGradient3StonesPattern에 대한 리펙토링 중, debug용 변수 언젠간 없앨것
		//리팩토링용 변수
		int debug_x = x-1;
		int debug_y = y-1;
		
		if (isNegativeGradient3Stones(debug_x, debug_y, stone)) {
			return true;
		}
		if (isNegativeGradient3StonesPattern(debug_x, debug_y, stone, ThreeStonePattern.get12StonePattern())) {
			return true;
		}
		if (isNegativeGradient3StonesPattern(debug_x, debug_y, stone, ThreeStonePattern.get21StonePattern())) {
			return true;
		}
		return false;
	}

	private boolean isNegativeGradient3StonesPattern(int x, int y,
			StoneType stone, ThreeStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
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

		for (int xi = theMostLeftStone, yi = theMostUpStone; xi + 3 <= theMostRightStone && yi - 3 >= theMostDownStone; xi++, yi--) {
			if (boardInfo.getCellState(xi+1, yi+1) == pattern.first && 
					boardInfo.getCellState(xi+2, yi) == pattern.second && 
					boardInfo.getCellState(xi+3, yi-1) == pattern.third && 
					boardInfo.getCellState(xi+4, yi-2) == pattern.forth) { 
				if (xi == 0 || yi == 15) {
					return false;
				}
				else if (xi + 3 == 14 || yi - 3 == 0) {
					return false;
				}
				else {
					if (xi - 1 >= 0 && yi + 1 <= 14 && boardInfo.getCellState(xi, yi+2) == CellState.WHITE) {
						return false;
					}
					if (xi + 4 <= 14 && yi - 4 <= 14 && boardInfo.getCellState(xi+5, yi-3) == CellState.WHITE) {
						return false;
					}

					if (xi - 1 >= 0 && yi + 1 <= 14 && boardInfo.getCellState(xi, yi+2) == CellState.BLACK) { 		
						return false;
					}
					if (xi - 2 >= 0 && yi + 2 <= 14 && boardInfo.getCellState(xi-1, yi+3) == CellState.BLACK) { 		
						return false;
					}

					if (xi + 4 <= 14 && yi - 4 >= 0 && boardInfo.getCellState(xi+5, yi-3) == CellState.BLACK) {
						return false;
					}
					if (xi + 5 <= 14 && yi - 5 >= 14 && boardInfo.getCellState(xi+6, yi-4) == CellState.BLACK) {
						return false;
					}	
				}
				return true;
			}
		}

		return false;
	}

	private boolean isNegativeGradient3Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		int theMostUpStone;

		if (x - 2 < 0 || y + 2 > 14) {
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
			theMostLeftStone = x - 2;
			theMostUpStone = y + 2;
		}

		int theMostRightStone;
		int theMostDownStone;

		if (x + 2 > 14 || y - 2 < 0) {
			int add_mount = 14 - x > y ? y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostDownStone = y - add_mount;
		}
		else {
			theMostRightStone = x + 2;
			theMostDownStone = y - 2;
		}

		for (int xi = theMostLeftStone, yi = theMostUpStone; 
				xi + 2 <= theMostRightStone && yi - 2 >= theMostDownStone; xi++, yi--) {
			if (boardInfo.getCellState(xi+1, yi+1) == CellState.BLACK && 
					boardInfo.getCellState(xi+2, yi) == CellState.BLACK &&  
					boardInfo.getCellState(xi+3, yi-1) == CellState.BLACK) {

				if (xi == 0 || yi == 14) {
					return false;
				}
				else if (xi + 2 == 14 || yi - 2 == 0) {
					return false;
				}
				else if ((xi == 1 && y == 3)|| (xi == 11 && yi == 13)) {
					return false;
				}
				else {

					if (boardInfo.getCellState(xi, yi+2) == CellState.WHITE || boardInfo.getCellState(xi+4, yi-2) == CellState.WHITE)
						return false;
					
					if (xi - 2 >= 0 && yi + 2 <= 14 && xi + 4 <= 14 && yi - 4 >= 0) {
						if (boardInfo.getCellState(xi-1, yi+3) == CellState.WHITE && boardInfo.getCellState(xi+5, yi-3) == CellState.WHITE)
							return false;
					}

					if (xi - 2 > 0 && yi + 2 <= 14 && boardInfo.getCellState(xi-1, yi+3) == CellState.BLACK) 
						return false;
					if (xi - 1 > 0 && yi + 1 <= 14 && boardInfo.getCellState(xi, yi+2) == CellState.BLACK) 
						return false;

					if (xi + 3 <= 14 && yi - 3 >= 0 && boardInfo.getCellState(xi+4, yi-2) == CellState.BLACK) 
						return false;
					if (xi + 4 <= 14 && yi - 4 >= 0 && boardInfo.getCellState(xi+5, yi-3) == CellState.BLACK) 
						return false;
				}

				return true;
			}
		}
		return false;
	}

	private boolean checkPositiveGradientCount3(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		if (isPositiveGradient3Stones(x, y, stone)) {
			return true;
		}
		if (isPositiveGradient3StonesPattern(x, y, stone, ThreeStonePattern.get12StonePattern())) {
			return true;
		}
		if (isPositiveGradient3StonesPattern(x, y, stone, ThreeStonePattern.get21StonePattern())) {
			return true;
		}
		return false;
	}

	private boolean isPositiveGradient3StonesPattern(int x, int y,
			StoneType stone, ThreeStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		int theMostDownStone;

		if ( x == 3 && y == 11) {
			System.out.println("debug");
			System.out.println(pattern.toString());
		}

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

		int theMostRightStone ;
		int theMostUpStone;

		if (x + 3 > 14 || y + 4 > 3) {
			int add_mount = 14 - x > 14 - y ? 14 - y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostUpStone = y + add_mount;
		}
		else {
			theMostRightStone = x + 3;
			theMostUpStone = y + 3;
		}

		for (int xi = theMostLeftStone, yi = theMostDownStone; xi + 3 <= theMostRightStone && yi + 3 <= theMostUpStone; xi++, yi++) {
			if (boardInfo.getCellState(xi+1, yi+1) == pattern.first && 
					boardInfo.getCellState(xi+2, yi+2) == pattern.second && 
					boardInfo.getCellState(xi+3, yi+3) == pattern.third && 
					boardInfo.getCellState(xi+4, yi+4) == pattern.forth) {
				if (xi == 0 || yi == 0) {

					return false;
				}
				else if (xi + 3 == 14 || yi + 3 == 14) {

					return false;
				}
				else {
					if (xi - 1 >= 0 && yi - 1 >= 0 && boardInfo.getCellState(xi, yi) == CellState.WHITE) {
						return false;
					}
					if (xi + 4 <= 14 && yi + 4 <= 14 && boardInfo.getCellState(xi+5, yi+5) == CellState.WHITE) {
						return false;
					}

					if (xi - 1 >= 0 && yi - 1 >= 0 && boardInfo.getCellState(xi, yi) == CellState.BLACK) { 		
						return false;
					}
					if (xi - 2 >= 0 && yi - 2 >= 0 && boardInfo.getCellState(xi-1, yi-1) == CellState.BLACK) { 		
						return false;
					}

					if (xi + 4 <= 14 && yi + 4 <= 14 && boardInfo.getCellState(xi+5, yi+5) == CellState.BLACK) {
						return false;
					}
					if (xi + 5 <= 14 && yi + 5 <= 14 && boardInfo.getCellState(xi+6, yi+6) == CellState.BLACK) {
						return false;
					}	
				}

				return true;
			}
		}

		return false;
	}

	private boolean isPositiveGradient3Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		int theMostDownStone;

		if (x - 2 < 0 || y - 2 < 0) {
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
			theMostLeftStone = x - 2;
			theMostDownStone = y - 2;
		}

		int theMostRightStone;
		int theMostUpStone;

		if (x + 2 > 14 || y + 2 > 14) {
			int add_mount = 14 - x > 14 - y ? 14 - y : 14 - x;  
			theMostRightStone = x + add_mount;
			theMostUpStone = y + add_mount;
		}
		else {
			theMostRightStone = x + 2;
			theMostUpStone = y + 2;
		}

		for (int xi = theMostLeftStone, yi = theMostDownStone; xi + 2 <= theMostRightStone && yi + 2 <= theMostUpStone; xi++, yi++) {
			if (boardInfo.getCellState(xi+1, yi+1) == CellState.BLACK && 
					boardInfo.getCellState(xi+2, yi+2) == CellState.BLACK && 
					boardInfo.getCellState(xi+3, yi+3) == CellState.BLACK) {
				if (xi == 0 || yi == 0) {
					return false;
				}
				
				else if (xi + 3 == 14 || yi + 3 == 14) {
					return false;
				}
				else if ((xi == 1 && yi == 11) || (xi == 11 && yi == 1)) {
					return false;
				}

				else {
					if (xi - 1 >= 0 && yi -1 >= 0 && boardInfo.getCellState(xi, yi) == CellState.WHITE)
						return false;
					if (xi + 3 <= 14 && yi + 3 <= 14 && boardInfo.getCellState(xi+4, yi+4) == CellState.WHITE)
						return false;
					
					if (xi - 2 >= 0 && yi - 2 >= 0 && xi + 4 <= 14 && yi + 4 <= 14) {
						if (boardInfo.getCellState(xi-1, yi-1) == CellState.WHITE && boardInfo.getCellState(xi+5, yi+5) == CellState.WHITE)
							return false;
					}

					if (xi - 1 >= 0 && yi - 1 >= 0 && boardInfo.getCellState(xi, yi) == CellState.BLACK)
						return false;
					if (xi - 2 > 0 && yi - 2 >= 0 && boardInfo.getCellState(xi-1, yi-1) == CellState.BLACK) 
						return false;
					if (xi + 3 <= 14 && yi + 3 <= 14 && boardInfo.getCellState(xi+4, yi+4) == CellState.BLACK)
						return false;
					if (xi + 4 <= 14 && yi + 4 <= 14 && boardInfo.getCellState(xi+5, yi+5) == CellState.BLACK)						
						return false;

				}

				return true;
			}
		}
		return false;
	}

	private boolean checkVerticalCount3(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		if (isVertical3Stones(x, y, stone)) {
			return true;
		}
		if (isVertical3StonesPattern(x, y, stone, ThreeStonePattern.get12StonePattern())) {
			return true;
		}
		if (isVertical3StonesPattern(x, y, stone, ThreeStonePattern.get21StonePattern())) {
			return true;
		}
		return false;
	}

	private boolean isVertical3StonesPattern(int x, int y, StoneType stone,
			ThreeStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		int theMostDownStone;
		if (y - 3 < 0)
			theMostDownStone = 0;
		else
			theMostDownStone = y - 3;

		int theMostUpStone;
		if (y + 3 > 14)
			theMostUpStone = 14;
		else
			theMostUpStone = y + 3;

		for (int i = theMostDownStone; i + 3 <= theMostUpStone; i++) {
			if (boardInfo.getCellState(x+1, i+1) == pattern.first && 
					boardInfo.getCellState(x+1, i+2) == pattern.second && 
					boardInfo.getCellState(x+1, i+3) == pattern.third &&  
					boardInfo.getCellState(x+1, i+4) == pattern.forth) {
				if (i == 0) {
					return false;
				}
				else if (i + 3 == 14) {
					return false;
				}
				else {
					if (boardInfo.getCellState(x+1, i) == CellState.WHITE || boardInfo.getCellState(x+1, i+5) == CellState.WHITE) {
						return false;
					}
					if (boardInfo.getCellState(x+1, i) == CellState.BLACK || boardInfo.getCellState(x+1, i+5) == CellState.BLACK) {
						return false;
					}

					if (i - 2 >= 0 && boardInfo.getCellState(x+1, i-1) == CellState.BLACK)
						return false;
					if (i + 5 <= 14 && boardInfo.getCellState(x+1, i+6) == CellState.BLACK)
						return false;
				}

				return true;
			}
		}

		return false;
	}

	private boolean isVertical3Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostDownStone;
		if (y - 2 < 0)
			theMostDownStone = 0;
		else
			theMostDownStone = y - 2;

		int theMostUpStone;
		if (y + 2 > 14)
			theMostUpStone = 14;
		else
			theMostUpStone = y + 2;

		for (int i = theMostDownStone; i + 2 <= theMostUpStone; i++) {
			if (boardInfo.getCellState(x+1, i+1) == CellState.BLACK && 
					boardInfo.getCellState(x+1, i+2) == CellState.BLACK && 
					boardInfo.getCellState(x+1, i+3) == CellState.BLACK) {

				if (i == 0) {
					return false;

				}
				else if (i + 2 == 14) {
					return false;
				}
				else {
					if (boardInfo.getCellState(x+1, i) == CellState.WHITE || boardInfo.getCellState(x+1, i+4) == CellState.WHITE)
						return false;
					
					if (i - 2 >= 0 && i + 4 <= 14) {
						if (boardInfo.getCellState(x+1, i-1) == CellState.WHITE && boardInfo.getCellState(x+1, i+5) == CellState.WHITE)
							return false;
					}

					if (i - 1 >= 0 && boardInfo.getCellState(x+1, i) == CellState.BLACK)
						return false;					
					if (i - 2 >= 0 && boardInfo.getCellState(x+1, i-1) == CellState.BLACK)
						return false;

					if (i + 3 <= 14 && boardInfo.getCellState(x+1, i+4) == CellState.BLACK)
						return false;
					if (i + 4 <= 14 && boardInfo.getCellState(x+1, i+5) == CellState.BLACK)
						return false;
				}

				return true;
			}
		}
		return false;
	}
	private boolean checkHorizontalCount3(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		if (isHorizontal3Stones(x, y, stone)) {
			return true;
		}
		if (isHorizontal3StonesPattern(x, y, stone, ThreeStonePattern.get12StonePattern())) {
			return true;
		}
		if (isHorizontal3StonesPattern(x, y, stone, ThreeStonePattern.get21StonePattern())) {
			return true;
		}
		return false;
	}

	private boolean isHorizontal3StonesPattern(int x, int y, StoneType stone,
			ThreeStonePattern pattern) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub

		int theMostLeftStone;
		if (x - 3 < 0)
			theMostLeftStone = 0;
		else
			theMostLeftStone = x - 3;

		int theMostRightStone;
		if (x + 3 > 14)
			theMostRightStone = 14;
		else
			theMostRightStone = x + 3;

		for (int i = theMostLeftStone; i + 3 <= theMostRightStone; i++) {
			if (boardInfo.getCellState(i+1,y+1) == pattern.first && 
					boardInfo.getCellState(i + 2,y+1) == pattern.second && 
					boardInfo.getCellState(i + 3,y+1) == pattern.third &&  
					boardInfo.getCellState(i + 4,y+1) == pattern.forth) {   
				if (i == 0) {
					return false;
				}
				else if (i + 3 == 14) {
					return false;
				}
				else {
					if (boardInfo.getCellState(i,y+1) == CellState.WHITE || boardInfo.getCellState(i + 5,y+1) == CellState.WHITE) {
						return false;
					}
					if (boardInfo.getCellState(i,y+1) == CellState.BLACK || boardInfo.getCellState(i + 5,y+1) == CellState.BLACK) {
						return false;
					}
					if (i - 2 >= 0 && boardInfo.getCellState(i - 1,y) == CellState.EMPTY && boardInfo.getCellState(i - 1,y+1) == CellState.BLACK)
						return false;
					if (i + 5 <= 14 && boardInfo.getCellState(i + 4,y) == CellState.EMPTY && boardInfo.getCellState(i + 6,y+1) == CellState.BLACK)
						return false;
				}

				return true;
			}
		}

		return false;
	}

	private boolean isHorizontal3Stones(int x, int y, StoneType stone) throws GeneralFiveStoneException, OutOfBoundPositionException {
		// TODO Auto-generated method stub
		int theMostLeftStone;
		if (x - 2 < 0)
			theMostLeftStone = 0;
		else
			theMostLeftStone = x - 2;

		int theMostRightStone;
		if (x + 2 > 14)
			theMostRightStone = 14;
		else
			theMostRightStone = x + 2;

		for (int i = theMostLeftStone; i + 2 <= theMostRightStone; i++) {
			if (boardInfo.getCellState(i+1,y+1) == CellState.BLACK && 
					boardInfo.getCellState(i + 2,y+1) == CellState.BLACK && 
					boardInfo.getCellState(i + 3,y+1) == CellState.BLACK) {

				if (i == 0 ) {
					return false;
				}
				else if (i + 2 == 14) {
					return false;
				}
				else {
					if (i - 1 >= 0 && i + 3 <= 14) {
						if (boardInfo.getCellState(i,y+1) == CellState.WHITE || boardInfo.getCellState(i + 4,y+1) == CellState.WHITE)
							return false;
					}
					if (i - 2 >= 0 && i + 4 <= 14) {
						if (boardInfo.getCellState(i - 1,y+1) == CellState.WHITE && boardInfo.getCellState(i + 5,y+1) == CellState.WHITE)
							return false;
					}
					if (i - 1 >= 0 && boardInfo.getCellState(i,y+1) == CellState.BLACK)
						return false;					
					if (i - 2 >= 0 && boardInfo.getCellState(i - 1,y+1) == CellState.BLACK)
						return false;

					if (i + 3 <= 14 && boardInfo.getCellState(i + 4,y+1) == CellState.BLACK)
						return false;
					if (i + 4 <= 14 && boardInfo.getCellState(i + 5,y+1) == CellState.BLACK)
						return false;
				}

				return true;
			}
		}
		return false;
	}

}
class ThreeStonePattern {
	CellState first;
	CellState second;
	CellState third;
	CellState forth;

	public ThreeStonePattern(CellState first, CellState second,
			CellState third, CellState forth) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
	}

	static ThreeStonePattern get12StonePattern() {
		return new ThreeStonePattern(CellState.BLACK, CellState.EMPTY, CellState.BLACK, CellState.BLACK);
	}

	static ThreeStonePattern get21StonePattern() {
		return new ThreeStonePattern(CellState.BLACK, CellState.BLACK, CellState.EMPTY, CellState.BLACK);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return first + " " + second + " " + " " +third + " " + forth;
	}
}
