package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.SixStonePlaceException;
import fs.type.StoneType;

public class SixStoneTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	// 육목 테스트1 : 대각
	@Test(expected = SixStonePlaceException.class)
	public void sixStoneTest1() throws Exception {
		int base = 7;
		
		for(int i = 1 ; i < 5; i++){
			fiveStone.putStone(base + i, base + i, StoneType.BLACK);
			fiveStone.putStone(base + i, base + i + 1,StoneType.WHITE);
		}
		fiveStone.putStone(base + 6, base + 6, StoneType.BLACK);
		fiveStone.putStone(base + 6, 1,StoneType.WHITE);
		fiveStone.putStone(base + 5, base + 5, StoneType.BLACK);
	}
	
	// 육목 테스트2 : 가로
		@Test(expected = SixStonePlaceException.class)
		public void sixStoneTest2() throws Exception {
			int base = 8;
			
			fiveStone.putStone(base , base , StoneType.BLACK);
			fiveStone.putStone(base + 1 , base + 1,StoneType.WHITE);
			
			fiveStone.putStone(base + 1, base, StoneType.BLACK);
			fiveStone.putStone(base + 1 , base + 2,StoneType.WHITE);
			
			fiveStone.putStone(base + 2, base, StoneType.BLACK);
			fiveStone.putStone(base + 5 , base + 5,StoneType.WHITE);
			
			fiveStone.putStone(base + 3, base, StoneType.BLACK);
			fiveStone.putStone(1 , 1,StoneType.WHITE);
			
			fiveStone.putStone(base + 5, base, StoneType.BLACK);
			fiveStone.putStone(3 , 3,StoneType.WHITE);
			
			fiveStone.putStone(base + 4, base, StoneType.BLACK);
			fiveStone.putStone(4 , 4,StoneType.WHITE);
			
	
	
		}
		// 흑돌이 세로로 6 목이 된 경우
		@Test(expected = SixStonePlaceException.class)
		public void SixStoneTest3() throws Exception {
			fiveStone.putStone(8 , 8 , StoneType.BLACK);
					fiveStone.putStone(9 , 8 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 7 , StoneType.BLACK);
					fiveStone.putStone(9 , 7 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 6 , StoneType.BLACK);
					fiveStone.putStone(9 , 6 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 4 , StoneType.BLACK);
					fiveStone.putStone(9 , 4 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 3 , StoneType.BLACK);
					fiveStone.putStone(9 , 3 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 2 , StoneType.BLACK);
					fiveStone.putStone(9 , 2 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 5 , StoneType.BLACK);
		}
		

		//백이 6목으로 이긴 경우
		@Test
		public void SixStoneTest4() throws Exception {
			fiveStone.putStone(8 , 8 , StoneType.BLACK);
			fiveStone.putStone(9 , 8 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 7 , StoneType.BLACK);
			fiveStone.putStone(9 , 7 , StoneType.WHITE);
			
			fiveStone.putStone(8 , 6 , StoneType.BLACK);
			fiveStone.putStone(9 , 6 , StoneType.WHITE);
			
			fiveStone.putStone(1 , 1 , StoneType.BLACK);
			fiveStone.putStone(9 , 4 , StoneType.WHITE);
			
			fiveStone.putStone(1 , 2 , StoneType.BLACK);
			fiveStone.putStone(9 , 3 , StoneType.WHITE);
			
			fiveStone.putStone(1 , 3 , StoneType.BLACK);
			fiveStone.putStone(9 , 5 , StoneType.WHITE);
			
			assertTrue(fiveStone.isGameOver());
		}
}
