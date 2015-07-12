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
import fs.gameinfo.TurnInfo;
import fs.type.StoneType;

public class RenjuFirstThreeMoveChecker implements FiveStoneRuleChecker {

	private TurnInfo turnInfo;
	
	static private RenjuFirstThreeMoveChecker renjuFirstThreeMoveChecker = null;
	
	private RenjuFirstThreeMoveChecker() { }
	
	static public RenjuFirstThreeMoveChecker getInstance() {
		if(renjuFirstThreeMoveChecker == null)
			renjuFirstThreeMoveChecker = new RenjuFirstThreeMoveChecker();
		return renjuFirstThreeMoveChecker;
	}
	
	@Override
	public boolean isValidMove(FiveStoneGameInfo gameInfo, int x, int y,
								StoneType stoneType) 
			throws DuplicatePlaceException,
			OutOfBoundPositionException, NoMoreGameException,
			ThreeThreePlaceException, FourFourPlaceException,
			SixStonePlaceException, InvalidTurnException,
			GeneralFiveStoneException {
		
		turnInfo = (TurnInfo) gameInfo;
		
		if(turnInfo.getTurnCount()==1 && (x!=8 || y!=8))
			throw new GeneralFiveStoneException("·»ÁÖ·ê 1¹øÀç Âø¼ö ¹®Á¦!!");
		else if (turnInfo.getTurnCount()==2 && ((x < 7 || x > 9) || (y < 7 || y > 9)))
			throw new GeneralFiveStoneException("·»ÁÖ·ê 2¹øÀç Âø¼ö ¹®Á¦!!");
		else if (turnInfo.getTurnCount()==3 && ((x < 6 || x > 10) || (y < 6 || y > 10)))
			throw new GeneralFiveStoneException("·»ÁÖ·ê 3¹øÀç Âø¼ö ¹®Á¦!!");
		return true;
	}

}
