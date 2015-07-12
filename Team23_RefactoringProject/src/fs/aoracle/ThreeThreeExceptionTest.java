package fs.aoracle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.ThreeThreePlaceException;
import fs.type.StoneType;

public class ThreeThreeExceptionTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}
		
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *       X
	 *     X X X
	 *       X  
	 *          
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *       X
	 *     X X - X
	 *       X  
	 *          
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: ThreeThreePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
	}
	
	@Test
	(expected = ThreeThreePlaceException.class)
	/*
	 *       X
	 *   X - X X
	 *       -
	 *       X  
	 *          
	 *   占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *   ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *   占쏙옙占�: ThreeThreePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(2, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 12, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}

	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X   X
	 *       X 
	 *     X   X 
	 *          
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*           
	 * 			 X
	 *     X   -
	 *       X 
	 *     X   X 
	 *          
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: ThreeThreePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(6, 14, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 12, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *       X   X
	 *         X 
	 *       -   - 
	 *     X       X
	 *   
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: ThreeThreePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(2, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(4, 10, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X X X  
	 *     X    
	 *     X     
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X - X X  
	 *     X    
	 *     X
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X X - X  
	 *     X    
	 *     X     
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X - X X  
	 *     -
	 *     X    
	 *     X     
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X X - X  
	 *     X
	 *     -    
	 *     X     
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*
	 *     X X - X  
	 *     -
	 *     X    
	 *     X     
	 *     
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*         X
	 *       X
	 *     X
	 *       X
	 *         X
	 *         
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*         X
	 *       X
	 *     X
	 *       X
	 *         -
	 *           X
	 *             
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙  
	 */
	public void ThreeThreeWillGenerateException_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*         X
	 *       X
	 *     X
	 *       -
	 *         X
	 *           X
	 *         
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(5, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(6, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 10, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*           X
	 * 		   X
	 *       -
	 *     X
	 *       -
	 *         X
	 *           X
	 *         
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(5, 13, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(2, 10, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*           X
	 * 		   -
	 *       X
	 *     X
	 *       -
	 *         X
	 *           X
	 *         
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test17() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	/*           X
	 * 		   -
	 *       X
	 *     X
	 *       X
	 *         -
	 *           X
	 *         
	 *     占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *     ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *     占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void ThreeThreeWillGenerateException_Test18() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9,StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9,StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 9,StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 10,StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 10,StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	// X X
	// XX
	// XXX
	//  
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void ThreeThreeWillGenerateException_Test19() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);		
		fiveStone.putStone(7, 10,StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 11,StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 12,StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 12,StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(5, 12,StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
	}
	
	@Test(expected = ThreeThreePlaceException.class)
	// X X
	// XX
	// XXX
	//  X
	//   X
	//
	// 占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙
	// ThreeThreePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	// 占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	public void ThreeThreeWillGenerateException_Test20() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 12, StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(5, 12, StoneType.WHITE);
		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(4, 12, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
	}
}
