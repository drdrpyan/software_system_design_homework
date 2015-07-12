package fs.rule;

import fs.FiveStoneGame;
import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.rule.rulechecker.*;
import fs.type.StoneType;

public class RenjuEndRule extends FiveStoneRule {

	public RenjuEndRule(FiveStoneGame fiveStoneGame) {
		super(fiveStoneGame);
		// TODO Auto-generated constructor stub
	}
	
	public void initRule() {
		addRuleChecker(RenjuSixStoneChecker.getInstance(),
				FiveStoneChecker.getInstance());
	}
	
	//TODO ������ ��������. �� �޼ҵ� ���� ����� ����. ������ ã�� �����Ұ�
	@Override
	public boolean checkRule(int x, int y, StoneType stoneType)
			throws DuplicatePlaceException, OutOfBoundPositionException,
			NoMoreGameException, ThreeThreePlaceException,
			FourFourPlaceException, SixStonePlaceException,
			InvalidTurnException, GeneralFiveStoneException {
		for(FiveStoneRuleChecker ruleChecker: ruleCheckers)
			if(!ruleChecker.isValidMove(gameInfo, x, y, stoneType))
				return false;
		return true;
	}

	@Override
	public int getBoardSizeX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBoardSizeY() {
		// TODO Auto-generated method stub
		return 0;
	}
}