package fs.aoracle;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.type.CellState;
import fs.type.StoneType;

public class AllowedFourFourTest {
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
	// OXXXXO
	//  X
	//  X
	//  X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedFourFour_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 8, StoneType.BLACK);
		
	}
	
	@Test
	// O
	//  X   X
	//   X X
	//    X
	//   X X
	//      O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void BlackStoneCanMakeAllowedFourFour_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(12, 5, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(12, 4, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(10, 6, StoneType.BLACK);
	}
	
	@Test
	/*   O
	 * O X X X X O
	 *   X
	 *   X
	 *   X
	 *   O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(4, 8, StoneType.WHITE);
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
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test
	/* O
	 * O X X X X O
	 *     X
	 *       X
	 *         X 
	 *           O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 6, StoneType.BLACK);
		fiveStone.putStone(3, 8, StoneType.WHITE);
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
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 7, StoneType.BLACK);
	}
	
	@Test
	/*       O   O 
	 *         X    
	 *       X   X
	 *     X       X
	 *   X           X
	 * O               O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(2, 5, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
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
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 8, StoneType.BLACK);
	}
	
	@Test
	/*     O
	 * O X X X X O
	 *     X
	 *     X
	 *     X
	 *     O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 7, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
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
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test
	/*     O
	 *     X
	 * O X X X X O
	 *     X
	 *     X
	 *     O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(5, 8, StoneType.WHITE);
		fiveStone.putStone(5, 4, StoneType.BLACK);
		fiveStone.putStone(3, 6, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(5, 3, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 6, StoneType.BLACK);
	}
	
	@Test
	/*               O
	 *             X 
	 *       O   X
	 *         X   
	 *       X   X    
	 *     O       X  
	 *               X
	 *                 O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(3, 7, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
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
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test
	/*       O       O
	 *         X   X 
	 *           X
	 *         X   X
	 *       X       X
	 *     O           O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
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
	
	@Test
	/*          X      
	 *          -
	 *          X
	 *          X
	 *  O X X X X    
	 *          X 
	 *          -
	 *          X
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 2, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		fiveStone.putStone(6, 4, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(6, 9, StoneType.BLACK);
		fiveStone.putStone(2, 5, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(6, 5, StoneType.BLACK);
	}
	
	@Test
	/*          X      
	 *          -
	 *          X
	 *          X
	 *  O X X X X    
	 *          X 
	 *          O
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 5, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 4, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(6, 3, StoneType.WHITE);
		fiveStone.putStone(6, 9, StoneType.BLACK);
		fiveStone.putStone(2, 5, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(6, 5, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test                     
	/*        O   X          
	 *          X
	 *        X   X
	 *      X       X    
	 *    O           X 
	 *                  -
	 *                    X
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(2, 10, StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 14, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 13, StoneType.BLACK);
	}
	
	@Test
	/*      X               
	 *        -   X          
	 *          X
	 *        X   X
	 *      X       X    
	 *    O           X 
	 *                  -
	 *                    X
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(2, 10, StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(6, 14, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(3, 15, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(7, 11, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(15, 2, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 13, StoneType.BLACK);
	}
	
	@Test
	/*          X      
	 *          -
	 *          X
	 *  O X X X X
	 *          X    
	 *  ------- X ----- <= 占쏙옙雍�
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(3, 3, StoneType.BLACK);
		fiveStone.putStone(14, 1, StoneType.WHITE);
		fiveStone.putStone(4, 3, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(5, 3, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(6, 1, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 2, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(6, 4, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(2, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(6, 3, StoneType.BLACK);
	}
	
	@Test              
	/*            O   O
	 *              X
	 *            X   X
	 *          X       X
	 *    ----X-----------X---
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 5, StoneType.WHITE);
		fiveStone.putStone(2, 1, StoneType.BLACK);
		fiveStone.putStone(6, 5, StoneType.WHITE);
		fiveStone.putStone(3, 2, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 3, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(8, 1, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(7, 2, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 3, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 4, StoneType.BLACK);
	}
	
	@Test
	/* 
	 *     ------X----------              
	 *     |   X       
	 *     | X   X
	 *     X       X
	 *     |         X
	 *     |           
	 *     |     
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(13, 2, StoneType.WHITE);
		fiveStone.putStone(1, 12, StoneType.BLACK);
		fiveStone.putStone(13, 4, StoneType.WHITE);
		fiveStone.putStone(2, 13, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(4, 15, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(6, 11, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(3, 14, StoneType.BLACK);
	}
	
	@Test
	/* 
	 *     ------------XXXX              
	 *                    X          
	 *                    X    
	 *                    X       
	 *                    O         
	 *                    |           
	 *                    |     
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test17() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(15, 11, StoneType.WHITE);
		fiveStone.putStone(12, 15, StoneType.BLACK);
		fiveStone.putStone(13, 4, StoneType.WHITE);
		fiveStone.putStone(13, 15, StoneType.BLACK);
		fiveStone.putStone(15, 1, StoneType.WHITE);
		fiveStone.putStone(14, 15, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(15, 14, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(15, 13, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(15, 12, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(15, 15, StoneType.BLACK);
	}
	
	@Test
	/* 
	 *     |          
	 *     |     O             
	 *     |     X         
	 *     |     X            
	 *     X - X X X O                    
	 *     |     X                 
	 *     |     O               
	 *   
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   FourFourPlaceException占쏙옙 占쌩삼옙 占쏙옙 占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: FourFourPlaceException 占쌩삼옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void BlackStoneCanMakeAllowedFourFour_Test18() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(1, 11, StoneType.BLACK);
		fiveStone.putStone(4, 14, StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(14, 2, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(13, 1, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(14, 3, StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 11, StoneType.BLACK);
	}
	
	@Test
	// OOOO
	// O
	// O
	// O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedFourFour_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(7, 9, StoneType.WHITE);
	}
	
	@Test
	// O   O
	//  O O
	//   O
	//  O O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedFourFour_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}
	
	@Test
	// --OOOO-- => 占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙雍�
	//     O
	//     O
	//     O
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙怜� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// FourFourPlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void WhiteStoneCanMakeAllowedFourFour_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(6, 15, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 15, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(9, 15, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(8, 14, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(8, 13, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(8, 12, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(8, 15, StoneType.WHITE);
	}
}
