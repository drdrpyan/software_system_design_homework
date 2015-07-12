package fs.pattern;

import fs.excep.OutOfBoundPositionException;
import fs.gameinfo.GameBoardInfo;
import fs.type.LineIterator;
import fs.type.Orientation;
import fs.type.Point;

public class PatternInLineChecker {
	private static PatternInLineChecker patternInLineChecker = null;
	
	private PatternInLineChecker() { }
	
	static public PatternInLineChecker getInstance() {
		if(patternInLineChecker == null) {
			patternInLineChecker = new PatternInLineChecker();
		}
		return patternInLineChecker;
	}
	
	public boolean checkPatternInLine(GameBoardInfo boardInfo, Point basisPoint, PatternInLine pattern, Orientation orientation)
			throws OutOfBoundPositionException {
		
		if(!boardInfo.isInBound(basisPoint))
			throw new OutOfBoundPositionException(basisPoint.getX(), basisPoint.getY());
				
		LineIterator startPointIterator = new LineIterator(basisPoint, orientation);
		startPointIterator.movePrevious(pattern.getLength()-1);
		
		//startPointIterator 진행용 루프
		for(int i=0; i<pattern.getLength(); i++) {
			if(!boardInfo.isInBound(startPointIterator)) {
				startPointIterator.moveNext(1);
				continue;
			}
			if(!boardInfo.isInBound(startPointIterator.getMovedPoint(pattern.getLength()-1)))
				break;
			
			if(checkPatternInLineFromHere(boardInfo, startPointIterator, pattern))
				return true;
			else
				startPointIterator.moveNext(1);
		}
		
		return false;
	}
	
	public boolean checkPatternInLineFromHere(GameBoardInfo boardInfo, LineIterator startingPosition, PatternInLine pattern)
			throws OutOfBoundPositionException {
		if(!boardInfo.isInBound(startingPosition))
			return false;
		if(!boardInfo.isInBound(startingPosition.getMovedPoint(pattern.getLength()-1)))
			return false;
		
		LineIterator iterator = new LineIterator(startingPosition);
		int count = 0;
		for(int i=0; i<pattern.getLength(); i++) {
			if(boardInfo.getCellState(iterator) == pattern.at(i)) {
				count++;
				iterator.moveNext(1);
			}
			else
				break;
		}
		
		if(count == pattern.getLength())
			return true;
		else
			return false;
	}

}
