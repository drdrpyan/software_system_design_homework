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


	// 게임 시작 후 흑돌을 8.8에 놓았을 때
	@Test	
	public void lenjuRuleTest1_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);	
	}

	// 게임 시작 후 흑돌을 8.8이 아닌 곳에 놓았을 때
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest1_2() throws Exception {
		fiveStone.putStone(8, 7, StoneType.BLACK);	
	}

	// 흑의 첫 수 후 백이 8.8을 중심으로 한 3*3 정사각형 내에 배치했을 때
	@Test
	public void lenjuRuleTest2_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
	}
	
	// 흑의 첫 수 후 백이 8.8을 중심으로 한 3*3 정사각형이 아닌 곳에 배치했을 때
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest2_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
	}
	// 버그 존재 : Exception 처리가 되어있지 않음
	
	// 흑의 두번째 차례에서 흑이 5*5 정사각형 내에 배치할 때
	@Test
	public void lenjuRuleTest3_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
	}
	
	// 흑의 두번째 차례에서 흑이 5*5 정사각형이 아닌 곳에 배치할 때
	@Test(expected = GeneralFiveStoneException.class)
	public void lenjuRuleTest3_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(1, 1, StoneType.BLACK);
	}
	// 버그 존재 : Exception 처리가 되어있지 않음
	
	
	
	

}
