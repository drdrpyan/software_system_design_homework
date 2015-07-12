package fs.aoracle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.type.StoneType;

public class FiveStoneTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}
	
	@Test
	//       X
	//      X
	// XXXXX
	//     X
	//     X
	//
	// 占쏙옙 占쏙옙占승뤄옙 占쏙옙占쏙옙占쏙옙 占쌨쇽옙占쏙옙 占썸돌占쏙옙 占승몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FiveStoneIgnoreBlackStoneThreeThree_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(12, 7, StoneType.BLACK);
		fiveStone.putStone(8, 4, StoneType.WHITE);
		fiveStone.putStone(12, 6, StoneType.BLACK);
		fiveStone.putStone(9, 4, StoneType.WHITE);
		fiveStone.putStone(13, 9, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(14, 10, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		assertEquals(true, fiveStone.isGameOver());
	}
	
	@Test
	// X X X
	//  XXX
	//   X
	//   X
	//   X
	//
	// 占쏙옙 占쏙옙占승뤄옙 占쏙옙占쏙옙占쏙옙 占쌨쇽옙占쏙옙 占썸돌占쏙옙 占승몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FiveStoneIgnoreBlackStoneThreeThree_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(7, 10, StoneType.BLACK);
		fiveStone.putStone(8, 4, StoneType.WHITE);
		fiveStone.putStone(6, 11, StoneType.BLACK);
		fiveStone.putStone(9, 4, StoneType.WHITE);
		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(10, 11, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		assertEquals(true, fiveStone.isGameOver());
	}
	
	@Test
	//        X
	//       X
	//      X
	// XXXXX
	//     X
	//     X
	//     X
	//
	// 占쏙옙 占쏙옙占승뤄옙 占쏙옙占쏙옙占쏙옙 占쌨쇽옙占쏙옙 占썸돌占쏙옙 占승몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FiveStoneIgnoreBlackStoneFourFour_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(6, 4, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(5, 4, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(4, 4, StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(4, 2, StoneType.WHITE);
		fiveStone.putStone(12, 11, StoneType.BLACK);
		fiveStone.putStone(4, 1, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(9, 8, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test
	// X     X
	//  X X X
	//   XXX
	//    X
	//    X
	//    X
	//
	// 占쏙옙 占쏙옙占승뤄옙 占쏙옙占쏙옙占쏙옙 占쌨쇽옙占쏙옙 占썸돌占쏙옙 占승몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FiveStoneIgnoreBlackStoneFourFour_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(6, 4, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(5, 4, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(4, 4, StoneType.WHITE);
		fiveStone.putStone(9, 11, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(10, 12, StoneType.BLACK);
		fiveStone.putStone(4, 2, StoneType.WHITE);
		fiveStone.putStone(11, 13, StoneType.BLACK);
		fiveStone.putStone(4, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
	}
}
