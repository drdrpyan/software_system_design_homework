package fs.rule;

import fs.rule.rulechecker.*;
import fs.FiveStoneGame;
import fs.type.StoneType;
import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.gameinfo.FiveStoneGameInfo;

import java.util.List;
import java.util.ArrayList;

abstract public class FiveStoneRule {
	//TODO 에러 원인 찾고 private로 되돌릴것
	protected FiveStoneGameInfo gameInfo;
	protected List<FiveStoneRuleChecker> ruleCheckers = new ArrayList<FiveStoneRuleChecker>();
	
	private List<FiveStoneRuleChecker> checkersBeforePutStone = new ArrayList<FiveStoneRuleChecker>();
	private List<FiveStoneRuleChecker> checkersAfterPutStone = new ArrayList<FiveStoneRuleChecker>();
	
	
	public FiveStoneRule(FiveStoneGameInfo fiveStoneGame) {
		this.gameInfo = fiveStoneGame;
		initRule();
	}
	
	//TODO 규칙 클래스 자체의 초기화 (체커 추가)코드를 삽입할 것
	abstract public void initRule();
	
	//abstract public void initGame();
	
	/**
	 * 이 오목 규칙이 정의하는 보드의 크기를 반환한다.
	 * FiveStone이 게임판을 초기화하는데 사용한다.
	 * @return 게임판의 X측 크기
	 */
	abstract public int getBoardSizeX();
	
	/**
	 * 이 오목 규칙이 정의하는 보드의 크기를 반환한다.
	 * FiveStone이 게임판을 초기화하는데 사용한다.
	 * @return 게임판의 Y축 크기
	 */
	abstract public int getBoardSizeY();
	
	//TODO 나중에 지워버릴것
	public void addRuleChecker(FiveStoneRuleChecker... ruleCheckers) {
		for(int i=0; i<ruleCheckers.length; i++)
			this.ruleCheckers.add(ruleCheckers[i]);			
	}
	
	/**
	 * 돌을 착수하기 전 체크하는 요소들을 룰에 추가한다.
	 * @param ruleCheckers
	 */
	public void addCheckersBeforePutStone(FiveStoneRuleChecker... ruleCheckers) {
		for(FiveStoneRuleChecker ruleChecker: ruleCheckers)
			this.checkersBeforePutStone.add(ruleChecker);	
	}
	
	public void addCheckersAfterPutStone(FiveStoneRuleChecker... ruleCheckers) {
		for(FiveStoneRuleChecker ruleChecker: ruleCheckers)
			this.checkersAfterPutStone.add(ruleChecker);	
	}
	
	public boolean checkRuleBeforePutStone(int x, int y, StoneType stoneType)
			throws DuplicatePlaceException, OutOfBoundPositionException,
			NoMoreGameException, ThreeThreePlaceException,
			FourFourPlaceException, SixStonePlaceException,
			InvalidTurnException, GeneralFiveStoneException {
		for(FiveStoneRuleChecker ruleChecker: checkersBeforePutStone) {
			ruleChecker.isValidMove(gameInfo, x, y, stoneType);
		}
		return true;
	}
	
	//TODO 나중에 지울것
	public boolean checkRule(int x, int y, StoneType stoneType)
			throws DuplicatePlaceException, OutOfBoundPositionException,
			NoMoreGameException, ThreeThreePlaceException,
			FourFourPlaceException, SixStonePlaceException,
			InvalidTurnException, GeneralFiveStoneException {
		for(FiveStoneRuleChecker ruleChecker: ruleCheckers) {
			ruleChecker.isValidMove(gameInfo, x, y, stoneType);
		}
		return true;			
	}
}
