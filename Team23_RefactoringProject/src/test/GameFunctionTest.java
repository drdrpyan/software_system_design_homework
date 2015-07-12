package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.GeneralFiveStoneException;
import fs.type.StoneType;

public class GameFunctionTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	// 흑이 천원(오목판의 중앙)에 놓지 않은 경우
	@Test(expected = GeneralFiveStoneException.class)
	public void firstStoneTest1() throws Exception {
		fiveStone.putStone(5, 5, StoneType.BLACK);
	}
	
	// 게임이 끝난 경우 isGameOver() true 반환
	@Test
	public void firstStoneTest2() throws Exception {
		for(int i = 8; i < 12 ; i++){
		fiveStone.putStone(i, i, StoneType.BLACK);
		fiveStone.putStone(i, i+1, StoneType.WHITE);
		}
		fiveStone.putStone(12, 12, StoneType.BLACK);
		
		assertTrue(fiveStone.isGameOver() );
	}
	
	
}
