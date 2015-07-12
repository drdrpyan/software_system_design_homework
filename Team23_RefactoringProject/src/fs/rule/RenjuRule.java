package fs.rule;

import fs.gameinfo.FiveStoneGameInfo;
import fs.rule.rulechecker.RenjuFirstThreeMoveChecker;

public class RenjuRule extends FiveStoneRule {
	final int boardSize = 15;
	
	public RenjuRule(FiveStoneGameInfo fiveStoneGame) {
		super(fiveStoneGame);
	}

	@Override
	public void initRule() {
		addCheckersBeforePutStone(RenjuFirstThreeMoveChecker.getInstance());		
	}

	@Override
	public int getBoardSizeX() {
		return boardSize;
	}

	@Override
	public int getBoardSizeY() {
		return boardSize;
	}

}
