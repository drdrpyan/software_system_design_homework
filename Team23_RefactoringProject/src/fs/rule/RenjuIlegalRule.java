package fs.rule;

import fs.FiveStoneGame;
import fs.rule.rulechecker.*;

public class RenjuIlegalRule extends FiveStoneRule {

	public RenjuIlegalRule(FiveStoneGame fiveStoneGame) {
		super(fiveStoneGame);
		// TODO Auto-generated constructor stub
	}
	
	public void initRule() {
		addRuleChecker(RenjuSixStoneChecker.getInstance(),
				FourFourChecker.getInstance(), RenjuThreeThreeChecker.getInstance());
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