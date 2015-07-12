package fs.rule.rulechecker;

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
import fs.type.Orientation;
import fs.type.StoneType;
import fs.type.Point;
import fs.pattern.PatternInLine;
import fs.pattern.PatternInLineChecker;

/**
 * 렌주룰용 육목 체크
 * 백돌의 차례엔 무조건 valid, 흑돌의 경우에 육목을 체크한다.
 */
public class RenjuSixStoneChecker implements FiveStoneRuleChecker {
	private GameBoardInfo boardInfo;
	final private PatternInLine blackSixPattern =
			new PatternInLine(StoneType.BLACK,
					CellState.BLACK, CellState.BLACK, CellState.BLACK,
					CellState.BLACK, CellState.BLACK, CellState.BLACK);
	final private PatternInLineChecker patternInLineChecker = 
			PatternInLineChecker.getInstance();
	
	static private RenjuSixStoneChecker renjuSixStoneChecker = null;
	
	private RenjuSixStoneChecker() { }
	
	static public RenjuSixStoneChecker getInstance() {
		if(renjuSixStoneChecker == null)
			renjuSixStoneChecker = new RenjuSixStoneChecker();
		return renjuSixStoneChecker;
	}
	
	@Override
	public boolean isValidMove(FiveStoneGameInfo gameInfo, int x, int y,
			StoneType stoneType) throws DuplicatePlaceException,
			OutOfBoundPositionException, NoMoreGameException,
			ThreeThreePlaceException, FourFourPlaceException,
			SixStonePlaceException, InvalidTurnException,
			GeneralFiveStoneException {
		//TODO input의 범위가 0~14인 상태. 이탓에 x,y 대신 debugX,debugY 사용중, 나중에 input이 1~15가 되도록 수정할것.
		//debug중
		int debugX = x+1;
		int debugY = y+1;
		
		boardInfo = (GameBoardInfo) gameInfo;
		
		PatternInLine pattern = blackSixPattern.getPattern(StoneType.BLACK);
		if(stoneType == StoneType.BLACK) {
			if(patternInLineChecker.checkPatternInLine(boardInfo, new Point(debugX, debugY), pattern, Orientation.HORIZONTAL))
				throw new SixStonePlaceException(x,y);
			if(patternInLineChecker.checkPatternInLine(boardInfo, new Point(debugX, debugY), pattern, Orientation.NEGATIVE_GRADIENT))
				throw new SixStonePlaceException(x,y);
			if(patternInLineChecker.checkPatternInLine(boardInfo, new Point(debugX, debugY), pattern, Orientation.POSITIVE_GRADIENT))
				throw new SixStonePlaceException(x,y);
			if(patternInLineChecker.checkPatternInLine(boardInfo, new Point(debugX, debugY), pattern, Orientation.VERTICAL))
				throw new SixStonePlaceException(x,y);
		}
		return true;
	}

}
