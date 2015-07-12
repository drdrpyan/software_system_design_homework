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
 * ���ַ�� ���� üũ
 * �鵹�� ���ʿ� ������ valid, �浹�� ��쿡 ������ üũ�Ѵ�.
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
		//TODO input�� ������ 0~14�� ����. ��ſ�� x,y ��� debugX,debugY �����, ���߿� input�� 1~15�� �ǵ��� �����Ұ�.
		//debug��
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
