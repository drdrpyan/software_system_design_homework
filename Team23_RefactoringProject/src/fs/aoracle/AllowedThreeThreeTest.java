package fs.aoracle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.type.StoneType;

public class AllowedThreeThreeTest {
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
	// XXXO
	// X
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(10, 6, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
	}
	
	@Test
	//    X
	//   X X
	//  X   X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(4, 7, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
	}
	
	@Test
	// X
	// XX
	// X X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(6, 9, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
	}
	
	@Test
	// XXX
	//  X
	//   X
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 6, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(10, 5, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
	}
	
	@Test
	//   X
	//  X
	// X
	// X
	// X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(9, 11, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(10, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
	}
	
	@Test
	//    XXX
	//   X
	//  X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(12, 10, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(10, 10, StoneType.BLACK);
	}
	
	@Test
	//  X
	// XXXO
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
	}
	
	@Test
	//  X X
	//   X
	//  X X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
	}
	
	@Test
	// XX
	//  X
	//  XX
	//  O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(7, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
	}
	
	@Test
	// XXX--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// X
	// X
	// 
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(3, 14, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(4, 15, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(5, 15, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(3, 15, StoneType.BLACK);
	}
	
	@Test
	// | X
	// |X
	// X
	// |X
	// | X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 
	public void BlackStoneCanMakeAllowedThreeThree_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(2, 10, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(1, 11, StoneType.BLACK);
	}
	
	@Test
	// X
	// XX
	// X-X--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(3, 1, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(3, 2, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(4, 2, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
		fiveStone.putStone(5, 1, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(3, 3, StoneType.BLACK);
	}
	
	@Test
	//  XXX
	//   X|
	//  X |
	//    | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 
	public void BlackStoneCanMakeAllowedThreeThree_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(14, 10, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(13, 10, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(13, 8, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(14, 9, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(15, 10, StoneType.BLACK);
	}
	
	@Test
	// --XXX- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |X
	// X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(5, 15, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(4, 15, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(2, 14, StoneType.BLACK);
		fiveStone.putStone(6, 5, StoneType.WHITE);
		fiveStone.putStone(1, 13, StoneType.BLACK);
		fiveStone.putStone(5, 5, StoneType.WHITE);
		fiveStone.putStone(3, 15, StoneType.BLACK);
	}
	
	@Test
	// ---X-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     X|
	//      X
	//      X
	//      X
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(13, 15, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(14, 14, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(15, 11, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(15, 12, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(15, 13, StoneType.BLACK);
	}
	
	@Test
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍� 
	// |X
	// XXX   
	// -X---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(1, 2, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(2, 3, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(2, 1, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(3, 2, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(2, 2, StoneType.BLACK);
	}
	
	@Test
    //   | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// X X
	//  X| 
	// X-X => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test17() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(13, 3, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(13, 1, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(15, 1, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(15, 3, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(14, 2, StoneType.BLACK);
	}
	
	@Test
    // |----- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  X
	// | X X
	// |X   X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test18() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(2, 12, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
	}
	
	@Test
    // ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//   X  |
	//    X |
	//     X|
	//    X |
	//   X  |
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test19() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(12, 14, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(12, 10, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(13, 13, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(13, 11, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(14, 12, StoneType.BLACK);
	}
	
	@Test
    // | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  X
	// | X
	// |X  
	// | X  
	// |  X
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test20() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(4, 2, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(3, 5, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(3, 3, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(2, 4, StoneType.BLACK);
	}
	
	@Test
    //      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// X   X|
	//  X X |
	//   X  |
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test21() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(14, 4, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(11, 3, StoneType.BLACK);
		fiveStone.putStone(6, 5, StoneType.WHITE);
		fiveStone.putStone(13, 3, StoneType.BLACK);
		fiveStone.putStone(5, 5, StoneType.WHITE);
		fiveStone.putStone(12, 2, StoneType.BLACK);
	}
	
	@Test
	//    O
	// X X
	// XX
	// XXXO
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test22() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10,StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 11,StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 12,StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(11, 10,StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(11, 7,StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
	}
	
	@Test
	// O  O
	// X X
	// XX
	// XXXO
	//  X
	//   X
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test23() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10,StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 11,StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 12,StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(11, 10,StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(11, 7,StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(11, 4,StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
	}
	
	@Test
	// --O-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// XXX
	//   X
	//   X
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test24() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(6, 15,StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(5, 14, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(6, 13, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(6, 14, StoneType.BLACK);
	}
	
	@Test
	// |
	// OXXX
	// | X
	// |  X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test25() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 9,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(3, 8, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(2, 9, StoneType.BLACK);
	}
	
	@Test
	//    X
	//   X
	//  X
	//  X
	//  X
	// -O---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test26() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 1,StoneType.WHITE);
		fiveStone.putStone(9, 2, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(9, 3, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
	}
	
	@Test
	// XXX  |
	//    X |
	//     X|
	//      O
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test27() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 7,StoneType.WHITE);
		fiveStone.putStone(14, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(13, 9, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(12, 10, StoneType.BLACK);
	}
	
	@Test
	// -OXXX- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |X
	// X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test28() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(2, 15, StoneType.WHITE);
		fiveStone.putStone(5, 15, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(4, 15, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(2, 14, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(1, 13, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(3, 15, StoneType.BLACK);
	}
	
	@Test
	// ---X-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     XO
	//      X
	//      X
	//      X
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test29() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 14, StoneType.WHITE);
		fiveStone.putStone(13, 15, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(14, 14, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(15, 11, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(15, 12, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(15, 13, StoneType.BLACK);
	}
	
	@Test
	// O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍� 
	// X
	// XX  
	// X-X--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test30() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 5, StoneType.WHITE);
		fiveStone.putStone(1, 1, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(1, 2, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(2, 2, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(3, 1, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(1, 3, StoneType.BLACK);
	}
	
	@Test
	//     O
    //     | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     X
	//    XX 
	// --X-X => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test31() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 5, StoneType.WHITE);
		fiveStone.putStone(15, 1, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(15, 2, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(14, 2, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(13, 1, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(15, 3, StoneType.BLACK);
	}
	
	@Test
    // |-O--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  X
	// | X X
	// |X   X
	// |     
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test32() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
		fiveStone.putStone(2, 12, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
	}
	
	@Test
    // ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//   X  |
	//    X O
	//     X|
	//    X |
	//   X  |
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test33() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 13, StoneType.WHITE);
		fiveStone.putStone(12, 14, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(12, 10, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(13, 13, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(13, 11, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(14, 12, StoneType.BLACK);
	}
	
	@Test
    // | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  X
	// | X
	// |X  
	// O X  
	// |  X
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test34() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 3, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(4, 2, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(3, 5, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(3, 3, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(2, 4, StoneType.BLACK);
	}
	
	@Test
    //      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// X   X|
	//  X X |
	//   X  |
	// ---O-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test35() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(14, 4, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(11, 3, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(13, 3, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(12, 2, StoneType.BLACK);
	}
	
	@Test
	// XX XXX
	//    X
	//    X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test36() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(13, 8, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(11, 8, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test
	//  X
	//  X
	// 
	//  X
	// XXX
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test37() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(8, 11, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
		fiveStone.putStone(8, 4, StoneType.BLACK);
	}
	
	@Test
	// X
	//  X
	// 
	//    X
	//     X
	//      X
	//     X
	//    X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test38() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(5, 6, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
	}
	
	@Test
	//      X
	//     X
	// 
	// X X
	//  X
	// X X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test39() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		fiveStone.putStone(11, 11, StoneType.BLACK);
		fiveStone.putStone(11, 5, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
	}
	
	@Test
	//    X
	// OX XX
	//    X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test40() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
	}
	
	@Test
	//   X
	//  X
	// X
	// X
	//
	// X
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test41() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(10, 11, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
	}
	
	@Test
	//   X X
	//    X
	//     X
	//  X
	// O
	//
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test42() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(9, 11, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(11, 11, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(11, 9, StoneType.BLACK);
		fiveStone.putStone(8, 4, StoneType.WHITE);
		fiveStone.putStone(10, 10, StoneType.BLACK);
	}
	
	@Test
	//   X
	//  X
	// X
	//  X
	//
	//    X
	//     O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test43() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(9, 11, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(10, 6, StoneType.BLACK);
		fiveStone.putStone(11, 5, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
	}
	
	@Test
	// --O-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// XXX
	//
	//   X
	//   X
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙 
	public void BlackStoneCanMakeAllowedThreeThree_Test44() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(5, 15,StoneType.WHITE);
		fiveStone.putStone(3, 14, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(5, 14, StoneType.BLACK);
	}
	
	@Test
	// |
	// OX XX
	// | X
	// |  X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: ThreeThreePlaceException 占쌩삼옙
	public void BlackStoneCanMakeAllowedThreeThree_Test45() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 9,StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(3, 8, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(2, 9, StoneType.BLACK);
	}
	
	@Test
	//    XXX
	//     X
	//
	//   X
	// -O---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test46() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 1,StoneType.WHITE);
		fiveStone.putStone(10, 2, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(12, 5, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(12, 4, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(13, 5, StoneType.BLACK);
	}
	
	@Test
	// XXX   |
	//    X  |
	//
	//      X|
	//       O
	//       | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedThreeThree_Test47() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 7,StoneType.WHITE);
		fiveStone.putStone(14, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7,StoneType.WHITE);
		fiveStone.putStone(12, 10, StoneType.BLACK);
		fiveStone.putStone(7, 6,StoneType.WHITE);
		fiveStone.putStone(9, 11, StoneType.BLACK);
		fiveStone.putStone(7, 5,StoneType.WHITE);
		fiveStone.putStone(10, 11, StoneType.BLACK);
		fiveStone.putStone(8, 5,StoneType.WHITE);
		fiveStone.putStone(11, 11, StoneType.BLACK);
	}
	
	@Test
	// OOO
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O O
	// O   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(11, 8, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
	}
	
	@Test
	// O
	// OO
	// O O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
	}
	
	@Test
	// OOO
	//  O
	//   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//   OOO
	//  O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	//  O
	// OOO
	//  O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// O O
	//  O
	// O O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 11, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
	}
	
	@Test
	// OO
	//  O
	//  OO
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
	}
	
	@Test
	//  O
	// OO-O
	//  O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	// O-OO
	//   -
	//   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(6, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
	}
	
	@Test
	//    O
	// O -
	//  O
	// O O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
	}
	
	@Test
	//  O O
	//   O
	//  - -
	// O   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
	}
	
	@Test
	// O-OO
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// OO-O
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// O-OO
	// -
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// OO-O
	// O
	// -
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test17() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6	, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// OO-O
	// -
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test18() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6	, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	//  O
	//   -
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test19() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	//  -
	//   O
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test20() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 13, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
	}
	
	@Test
	//    O
	//   O
	//  -
	// O
	//  -
	//   O
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test21() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(8, 13, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
	}
	
	@Test
	//    O
	//   -
	//  O
	// O
	//  -
	//   O
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test22() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
	}
	
	@Test
	//    O
	//   -
	//  O
	// O
	//  O
	//   -
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test23() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 14, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
	}
	
	@Test
	// O O
	// OO
	// OOO
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test24() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// O O
	// OO
	// OOO
	//  O
	//   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test25() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 13, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(11, 10, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(11, 12, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(11, 14, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(9, 14, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(9, 13, StoneType.WHITE);
		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(9, 12, StoneType.WHITE);
	}
	
	@Test
	// OOOX
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test26() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//    O
	//   O O
	//  O   O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test27() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(11, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
	}
	
	@Test
	// O
	// OO
	// O O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test28() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
	}
	
	@Test
	// OOO
	//  O
	//   O
	//    X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test29() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	// O
	// O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test30() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//    OOO
	//   O
	//  O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test31() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	//  O
	// OOOX
	//  O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test32() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	//  O O
	//   O
	//  O O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test33() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 11, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
	}
	
	@Test
	// OO
	//  O
	//  OO
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test34() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
	}
	
	@Test
	// OOO--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test35() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 15, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 15, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(3, 14, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(3, 13, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
	}
	
	@Test
	// | O
	// |O
	// O
	// |O
	// | O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test36() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(2, 7, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(2, 9, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(1, 8, StoneType.WHITE);
	}
	
	@Test
	// O
	// OO
	// O-O--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test37() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 1, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(5, 2, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 1, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
	}
	
	@Test
	//  OOO
	//   O|
	//  O |
	//    | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test38() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(14, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(13, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(13, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(14, 9, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(15, 10, StoneType.WHITE);
	}
	
	@Test
	// --OOO- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |O
	// O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test39() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 13, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(2, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 15, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(5, 15, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
	}
	
	@Test
	// ---O-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     O|
	//      O
	//      O
	//      O
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test40() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 15, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(15, 11, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 12, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(15, 13, StoneType.WHITE);
	}
	
	@Test
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍� 
	// |O
	// OOO   
	// -O---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test41() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(2, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(2, 1, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(3, 2, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(2, 2, StoneType.WHITE);
	}
	
	@Test
    //   | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// O O
	//  O| 
	// O-O => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test42() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
	}
	
	@Test
    // |----- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  O
	// | O O
	// |O   O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test43() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(2, 12, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(3, 13, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(5, 13, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 12, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
	}
	
	@Test
    // ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//   O  |
	//    O |
	//     O|
	//    O |
	//   O  |
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test44() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(12, 14, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(13, 13, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(13, 11, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(12, 10, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(14, 12, StoneType.WHITE);
	}
	
	@Test
    // | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  O
	// | O
	// |O  
	// | O  
	// |  O
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test45() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 5, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(3, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(4, 2, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(2, 4, StoneType.WHITE);
	}
	
	@Test
    //      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// O   O|
	//  O O |
	//   O  |
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test46() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(13, 3, StoneType.WHITE);
		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(11, 3, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(6, 11, StoneType.BLACK);
		fiveStone.putStone(12, 2, StoneType.WHITE);
	}
	
	@Test
	// --X-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// OOO
	//   O
	//   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test47() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(5, 14, StoneType.WHITE);
		fiveStone.putStone(7, 15, StoneType.BLACK);
		fiveStone.putStone(6, 14, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 13, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 14, StoneType.WHITE);
	}
	
	@Test
	// |
	// XOOO
	// | O
	// |  O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test48() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(1, 9, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(2, 9, StoneType.WHITE);
	}
	
	@Test
	//    O
	//   O
	//  O
	//  O
	//  O
	// -X---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test49() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 2, StoneType.WHITE);
		fiveStone.putStone(10, 1, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(11, 5, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(12, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
	}
	
	@Test
	// OOO  |
	//    O |
	//     O|
	//      X
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test50() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(14, 7, StoneType.WHITE);
		fiveStone.putStone(15, 6, StoneType.BLACK);
		fiveStone.putStone(13, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);
	}
	
	@Test
	// -XOOO- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |O
	// O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test51() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 13, StoneType.WHITE);
		fiveStone.putStone(2, 15, StoneType.BLACK);
		fiveStone.putStone(2, 14, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 15, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(5, 15, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
	}
	
	@Test
	// ---O-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     OX
	//      O
	//      O
	//      O
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test52() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 11, StoneType.WHITE);
		fiveStone.putStone(15, 14, StoneType.BLACK);
		fiveStone.putStone(15, 12, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(13, 15, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 13, StoneType.WHITE);
	}
	
	@Test
	// X
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍� 
	// O
	// OO  
	// O-O--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test53() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(1, 1, StoneType.WHITE);
		fiveStone.putStone(1, 5, StoneType.BLACK);
		fiveStone.putStone(1, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(2, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(3, 1, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(1, 3, StoneType.WHITE);
	}
	
	@Test
	//     X
    //     | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     O
	//    OO 
	// --O-O => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test54() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(15, 5, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
	}
	
	@Test
    // |-X--- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  O
	// | O O
	// |O   O
	// |     
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test55() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(2, 12, StoneType.WHITE);
		fiveStone.putStone(3, 15, StoneType.BLACK);
		fiveStone.putStone(3, 13, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 13, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
	}
	
	@Test
    // ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//   O  |
	//    O X
	//     O|
	//    O |
	//   O  |
	//      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test56() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(12, 14, StoneType.WHITE);
		fiveStone.putStone(15, 13, StoneType.BLACK);
		fiveStone.putStone(13, 13, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(13, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(12, 10, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(14, 12, StoneType.WHITE);
	}
	
	@Test
    // | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// |  O
	// | O
	// |O  
	// X O  
	// |  O
	// ------ => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test57() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(1, 3, StoneType.BLACK);
		fiveStone.putStone(3, 5, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(3, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 2, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(2, 4, StoneType.WHITE);
	}
	
	@Test
    //      | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// O   O|
	//  O O |
	//   O  |
	// ---X-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test58() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(13, 1, StoneType.BLACK);
		fiveStone.putStone(13, 3, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(11, 3, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(12, 2, StoneType.WHITE);
	}
	
	@Test
	// OO OOO
	//    O
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test59() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
	}
	
	@Test
	//  O
	//  O
	// 
	//  O
	// OOO
	//  O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test60() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 13, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
	}
	
	@Test
	// O
	//  O
	// 
	//    O
	//     O
	//      O
	//     O
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test61() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 12, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
	}
	
	@Test
	//      O
	//     O
	// 
	// O O
	//  O
	// O O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test62() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(11, 12, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
	}
	
	@Test
	//    O
	// XO OO
	//    O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test63() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(6, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	// O
	//
	// O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test64() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 13, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
	}
	
	@Test
	//   O O
	//    O
	//     O
	//  O
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test65() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 12, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(12, 12, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(12, 10, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(11, 11, StoneType.WHITE);
	}
	
	@Test
	//   O
	//  O
	// O
	//  O
	//
	//    O
	//     X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test66() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
	}
	
	@Test
	// --X-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	// OOO
	//
	//   O
	//   O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test67() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 14, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 12, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(6, 15, StoneType.BLACK);
		fiveStone.putStone(6, 14, StoneType.WHITE);
	}
	
	@Test
	// |
	// XO OO
	// | O
	// |  O
	// | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test68() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(1, 8, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
	}
	
	@Test
	//    OOO
	//     O
	//
	//   O
	// -X---- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test69() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(11, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(12, 5, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(13, 5, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(13, 4, StoneType.WHITE);
		fiveStone.putStone(10, 1, StoneType.BLACK);
		fiveStone.putStone(14, 5, StoneType.WHITE);
	}
	
	@Test
	// OOO   |
	//    O  |
	//
	//      O|
	//       X
	//       | => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedThreeThree_Test70() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(12, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(14, 6, StoneType.WHITE);
		fiveStone.putStone(15, 5, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
	}
}
