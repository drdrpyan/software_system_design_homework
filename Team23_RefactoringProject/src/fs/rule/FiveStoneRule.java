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
	//TODO ���� ���� ã�� private�� �ǵ�����
	protected FiveStoneGameInfo gameInfo;
	protected List<FiveStoneRuleChecker> ruleCheckers = new ArrayList<FiveStoneRuleChecker>();
	
	private List<FiveStoneRuleChecker> checkersBeforePutStone = new ArrayList<FiveStoneRuleChecker>();
	private List<FiveStoneRuleChecker> checkersAfterPutStone = new ArrayList<FiveStoneRuleChecker>();
	
	
	public FiveStoneRule(FiveStoneGameInfo fiveStoneGame) {
		this.gameInfo = fiveStoneGame;
		initRule();
	}
	
	//TODO ��Ģ Ŭ���� ��ü�� �ʱ�ȭ (üĿ �߰�)�ڵ带 ������ ��
	abstract public void initRule();
	
	//abstract public void initGame();
	
	/**
	 * �� ���� ��Ģ�� �����ϴ� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * FiveStone�� �������� �ʱ�ȭ�ϴµ� ����Ѵ�.
	 * @return �������� X�� ũ��
	 */
	abstract public int getBoardSizeX();
	
	/**
	 * �� ���� ��Ģ�� �����ϴ� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * FiveStone�� �������� �ʱ�ȭ�ϴµ� ����Ѵ�.
	 * @return �������� Y�� ũ��
	 */
	abstract public int getBoardSizeY();
	
	//TODO ���߿� ����������
	public void addRuleChecker(FiveStoneRuleChecker... ruleCheckers) {
		for(int i=0; i<ruleCheckers.length; i++)
			this.ruleCheckers.add(ruleCheckers[i]);			
	}
	
	/**
	 * ���� �����ϱ� �� üũ�ϴ� ��ҵ��� �꿡 �߰��Ѵ�.
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
	
	//TODO ���߿� �����
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
