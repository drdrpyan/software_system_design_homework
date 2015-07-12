package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.*;
import fs.type.StoneType;

public class LenjuRuleTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}


	// ���� ���� �� �浹�� 8.8�� ������ ��
	@Test	
	public void lenjuRuleTest1_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);	
	}

	// ���� ���� �� �浹�� 8.8�� �ƴ� ���� ������ ��
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest1_2() throws Exception {
		fiveStone.putStone(8, 7, StoneType.BLACK);	
	}

	// ���� ù �� �� ���� 8.8�� �߽����� �� 3*3 ���簢�� ���� ��ġ���� ��
	@Test
	public void lenjuRuleTest2_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
	}
	
	// ���� ù �� �� ���� 8.8�� �߽����� �� 3*3 ���簢���� �ƴ� ���� ��ġ���� ��
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest2_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
	}
	// ���� ���� : Exception ó���� �Ǿ����� ����
	
	// ���� �ι�° ���ʿ��� ���� 5*5 ���簢�� ���� ��ġ�� ��
	@Test
	public void lenjuRuleTest3_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
	}
	
	// ���� �ι�° ���ʿ��� ���� 5*5 ���簢���� �ƴ� ���� ��ġ�� ��
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest3_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(1, 1, StoneType.BLACK);
	}
	// ���� ���� : Exception ó���� �Ǿ����� ����
	
	
	
	

}
