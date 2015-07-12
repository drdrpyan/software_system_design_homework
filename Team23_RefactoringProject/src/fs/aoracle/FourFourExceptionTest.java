package fs.aoracle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.FourFourPlaceException;
import fs.type.StoneType;

public class FourFourExceptionTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	@Test(expected = FourFourPlaceException.class)
	// XXXX
	// X
	// X
	// X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FourFourWillGenerateException_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	//  X
	// XX-XX
	//  X
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FourFourWillGenerateException_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(5, 11, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	//  X
	// XX-XX
	//  X
	//  -
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FourFourWillGenerateException_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(5, 11, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	// X
	//  X   X
	//   - X
	//	  X
	//   X X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FourFourWillGenerateException_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(10, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	// X     X
	//  X   -
	//   - X
	//	  X
	//   X X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void FourFourWillGenerateException_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(7, 9, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		fiveStone.putStone(13, 9, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(10, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X
	 *   X
	 *     X
	 *       X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       X    
	 *     X   X
	 *   X       X
	 * X           X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X - X X X
	 * X
	 * X
	 * X
	 *   
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X - X X
	 * X
	 * X
	 * X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X _ X
	 * X
	 * X
	 * X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 7, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
		
		
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X
	 *   -
	 *     X
	 *       X
	 *         X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 7, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X
	 *   X
	 *     -
	 *       X
	 *         X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X
	 *   X
	 *     X
	 *       -
	 *         X
	 * 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X    
	 *       X   -
	 *     X       X
	 *   X           X
	 *                 X
	 *                 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X    
	 *       X   X
	 *     X       -
	 *   X           X
	 *                 X
	 *                 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X    
	 *       X   X
	 *     X       X
	 *   X           -
	 *                 X
	 *                 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X
	 *   X
	 *   X
	 *   X
	 *                 
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test17() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X
	 * X X X X
	 *   X
	 *   X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test18() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       X 
	 *     X
	 *   X   
	 * X   X    
 	 *       X  
 	 *         X   
 	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test19() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         X   X
	 *       X       X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test20() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X - X X
	 *     X
	 *     X
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test21() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X X - X
	 *     X
	 *     X
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test22() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X - X X X
	 *       X
	 *       X
	 *       X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test23() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   -
	 *       X       X
 	 *                 X
 	 *                   X 
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test24() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   X
	 *       X       -
 	 *                 X
 	 *                   X 
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test25() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   X
	 *       X       X
 	 *                 -
 	 *                   X 
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test26() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               X
	 *             - 
	 *           X
	 *         X   X
	 *       X       X
 	 *                 X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test27() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               X
	 *          X  -  
	 *           X
	 *         X   X
	 *       X       X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test28() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               
	 *         X   X  
	 *           X
	 *         -   X
	 *       X       X
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test29() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               
	 *         X   X  
	 *           X
	 *         X   X
	 *       -       X
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test30() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     X
	 *   X X - X X
	 *     -
	 *     X
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test31() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     X
	 *   X X X - X
	 *     X
	 *     -
	 *     X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test32() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* 
	 *       X
	 *       -
	 *   X - X X X
	 *       X
	 *       X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test33() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         -   -
	 *       X       X
	 *     X           X
	 *         
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test34() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         X   X
	 *		 -		 -
	 *     X           X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test35() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test
	(expected = FourFourPlaceException.class)
	/*       X       X 
	 *         -   -
	 *           X
	 *         X   X
	 *       X       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test36() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *   X X X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test37() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*	       
	 *     O 
	 *   O X X X X 
	 *     X
	 *     X
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test38() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X X X O
	 *     X
	 *       X
	 *         X 
	 *           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test39() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(8, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   O 
	 *   O X X X X 
	 *       X
	 *         X
	 *           X 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test40() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *         X    
	 *       X   X
	 *     X       X
	 *   X           X
	 * O               O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test41() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 4, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *       O   O
	 *         X    
	 *       X   X
	 *     X       X
	 *   X           X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test42() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *   X - X X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test43() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *    O
	 *  O X - X X X
	 *    X
	 *    X
	 *    X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test44() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* 
	 *   X X - X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test45() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   O
 	 * O X X - X X 
	 *   X
	 *   X
	 *   X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test46() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *   
	 *   X X X _ X O
	 *   X
	 *   X
	 *   X
	 *   O 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test47() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *   O
	 * O X X X _ X 
	 *   X
	 *   X
	 *   X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test48() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X O
	 *   -
	 *     X
	 *       X
	 *         X
	 *           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test49() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O
	 * O X X X X 
	 *    -
	 *      X
	 *        X
	 *          X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test50() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* X X X X O
	 *   X
	 *     -
	 *       X
	 *         X
	 *           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test51() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*O
	 *O X X X X
	 *    X
	 *      -
	 *        X
	 *          X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test52() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *  X X X X O
	 *    X
	 *      X
	 *        -
	 *          X
	 *            O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test53() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O
	 * O X X X X 
	 *     X
	 *       X
	 *         -
	 *           X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test54() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *         X    
	 *       X   -
	 *     X       X
	 *   X           X
	 * O               X
	 *                   O             
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test55() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O   O
	 *         X    
	 *       X   -
	 *     X       X
	 *   X           X
	 *                 X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test56() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X    
	 *       X   X
	 *     X       -
	 *   X           X
	 * O               X
	 *                   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test57() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O   O
	 *         X    
	 *       X   X
	 *     X       -
	 *   X           X
	 *                 X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test58() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X    
	 *       X   X
	 *     X       X
	 *   X           -
	 * O               X
	 *                   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test59() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O   O
 	 *         X    
	 *       X   X
	 *     X       X
	 *   X           -
	 *                 X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test60() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X X X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test61() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 * O X X X X 
	 *     X
	 *     X
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test62() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     X
	 *   X X X X O
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test63() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 *     X
	 * O X X X X
	 *     X
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test64() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   
	 *       X   X    
 	 *     O       X  
 	 *               X
 	 *                 O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test65() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(8, 4, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               O
	 *             X 
	 *       O   X
	 *         X   
	 *       X   X    
 	 *             X  
 	 *               X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test66() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test67() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X 
	 *           X
	 *         X   X
	 *       X       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test68() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X - X X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test69() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 * O X X - X X 
	 *     X
	 *     X
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test70() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X X X - X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test71() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O
	 *   O X X X - X
	 *       X
	 *       X
	 *       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test72() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*   X - X X X O
	 *       X
	 *       X
	 *       X
	 *       O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test73() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*        O
	 *  O X - X X X
	 *        X
	 *        X
	 *        X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test74() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(2, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   -
	 *       X       X
 	 *     O           X
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test75() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               O
	 *         O   X 
	 *           X
	 *         X   -
	 *       X       X
 	 *                 X
 	 *                   X 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test76() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   X
	 *       X       -
 	 *     O           X
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test77() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               O
	 *         O   X 
	 *           X
	 *         X   X
	 *       X       -
 	 *                 X
 	 *                   X 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test78() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*             X 
	 *           X
	 *         X   X
	 *       X       X
 	 *     O           -
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test79() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
 	/*               O 
	 *         O   X 
	 *           X
	 *         X   X
	 *       X       X
 	 *                 -
 	 *                   X 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test80() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test
	(expected = FourFourPlaceException.class)
	/*               X
	 *             - 
	 *           X
	 *         X   X
	 *       X       X
 	 *     O           X
 	 *                   O 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test81() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *                 O
	 *               X
	 *         O   - 
	 *           X
	 *         X   X
	 *       X       X
 	 *                 X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test82() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *               X
	 *         X   -  
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test83() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*                 O	
	 *       O       X
	 *         X   -  
	 *           X
	 *         X   X
	 *       X       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test84() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 15, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               
	 *         X   X  
	 *           X
	 *         -   X
	 *       X       X
	 *     X           O
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test85() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O     
	 *         X   X  
	 *           X
	 *         -   X
	 *       X       X
	 *     X           
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test86() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               
	 *         X   X  
	 *           X
	 *         X   X
	 *       -       X
	 *     X           O
	 *   O  
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test87() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X  
	 *           X
	 *         X   X
	 *       -       X
	 *     X           
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test88() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     X
	 *   X X - X X O
	 *     -
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test89() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 *     X
	 * O X X - X X 
	 *     -
	 *     X
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test90() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     X
	 *   X X X - X O
	 *     X
	 *     -
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test91() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 *     X
	 * O X X X - X 
	 *     X
	 *     -
	 *     X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test92() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* 
	 *       X
	 *       -
	 *   X - X X X O
	 *       X
	 *       X
	 *       O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test93() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O
	 *       X
	 *       -
	 * O X - X X X 
	 *       X
	 *       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test94() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         -   -
	 *       X       X
	 *     X           X
	 *   O               O  
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test95() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X 
	 *           X
	 *         -   -
	 *       X       X
	 *     X           X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test96() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         X   X 
	 *           X
	 *         X   X
	 *		 -		 -
	 *     X           X
	 *   O               O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test97() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X 
	 *           X
	 *         X   X
	 *		 -		 -
	 *     X           X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test98() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       X       X 
	 *         -   -
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O     
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test99() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*      O          O
	 *        X      X 
	 *         -   -
	 *           X
	 *         X   X
	 *       X       X
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test100() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 15, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 * O X - X X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test101() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* 
	 * O X X - X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test102() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*
	 *   
	 * O X X X _ X O
	 *   X
	 *   X
	 *   X
	 *   O 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test103() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(4, 3, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*O
	 *  X X X X O
	 *    -
	 *      X
	 *        X
	 *          X
	 *            O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test104() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O
	 *   X X X X O
	 *     X
	 *       -
	 *         X
	 *           X
	 *             O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test105() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*O
	 *O X X X X
	 *    X
	 *      -
	 *        X
	 *          X
	 *            O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test106() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*O
	 *  X X X X O
	 *    X
	 *      X
	 *        -
	 *          X
	 *            O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test107() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(6, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(8, 3, StoneType.BLACK);
		fiveStone.putStone(9, 2, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O  
	 *         X    
	 *       X   -
	 *     X       X
	 *   X           X
	 * O               X
	 *                   O             
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test108() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O
	 *         X    
	 *       X   X
	 *     X       -
	 *   X           X
	 * O               X
	 *                   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test109() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O 
	 *         X    
	 *       X   X
	 *     X       X
	 *   X           -
	 * O               X
	 *                   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test110() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(1, 4, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 4, StoneType.BLACK);
		fiveStone.putStone(10, 3, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O X X - X X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test111() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O X X X - X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test112() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/* O X - X X X O
	 *       X
	 *       X
	 *       X
	 *       O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test113() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(2, 7, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         O   X 
	 *           X
	 *         X   -
	 *       X       X
 	 *     O           X
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test114() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         O   X 
	 *           X
	 *         X   X
	 *       X       -
 	 *     O           X
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test115() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*         O   X 
	 *           X
	 *         X   X
	 *       X       X
 	 *     O           -
 	 *                   X 
 	 *                     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test116() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 10, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(10, 4, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*                 O
	 *               X
	 *             - 
	 *           X
	 *         X   X
	 *       X       X
 	 *     O           X
 	 *                   O 
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test117() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(5, 9, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*                 O
	 *               X
	 *         X   -  
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test118() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 15, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               O
	 *         X   X  
	 *           X
	 *         -   X
	 *       X       X
	 *     X           O
	 *   O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test119() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*               O
	 *         X   X  
	 *           X
	 *         X   X
	 *       -       X
	 *     X           O
	 *   O  
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test120() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 *     X
	 * O X X - X X O
	 *     -
	 *     X
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test121() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O
	 *     X
	 * O X X X - X O
	 *     X
	 *     -
	 *     X
	 *     O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test122() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 2, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O
	 *       X
	 *       -
	 * O X - X X X O
	 *       X
	 *       X
	 *       O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test123() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(2, 6, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(3, 6, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X 
	 *           X
	 *         -   -
	 *       X       X
	 *     X           X
	 *   O               O  
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test124() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*       O       O
	 *         X   X 
	 *           X
	 *         X   X
	 *		 -		 -
	 *     X           X
	 *   O               O
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test125() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(2, 8, StoneType.WHITE);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
	
	@Test(expected = FourFourPlaceException.class)
	/*     O           O 
	 *       X       X 
	 *         -   -
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O     
	 *     
	 * 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 * FourFourPlaceExcetpion占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 * 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void FourFourWillGenerateException_Test126() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(3, 15, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(9, 15, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(4, 14, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
	}
}
