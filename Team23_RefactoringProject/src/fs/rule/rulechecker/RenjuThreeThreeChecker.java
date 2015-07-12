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
import fs.type.StoneType;

public class RenjuThreeThreeChecker implements FiveStoneRuleChecker {
	ThreeThreeChecker threeThreeRuleChecker = ThreeThreeChecker.getInstance();
	
	static private RenjuThreeThreeChecker renjuThreeThreeChecker = null;
	
	private RenjuThreeThreeChecker() { }
	
	static public RenjuThreeThreeChecker getInstance() {
		if(renjuThreeThreeChecker == null)
			renjuThreeThreeChecker = new RenjuThreeThreeChecker();
		return renjuThreeThreeChecker;
	}
	
	@Override
	public boolean isValidMove(FiveStoneGameInfo gameInfo, int x, int y,
			StoneType stoneType) throws DuplicatePlaceException,
			OutOfBoundPositionException, NoMoreGameException,
			ThreeThreePlaceException, FourFourPlaceException,
			SixStonePlaceException, InvalidTurnException,
			GeneralFiveStoneException {
		if(stoneType == StoneType.BLACK)
			return threeThreeRuleChecker.isValidMove(gameInfo, x, y, stoneType);
		else
			return true;
	}

}
