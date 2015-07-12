package fs.aoracle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.SixStonePlaceException;
import fs.type.StoneType;

public class SixStoneExceptionTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	@Test(expected = SixStonePlaceException.class)
	/*  
	 * 
	 *  X X X X X X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(7, 12, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/*  
	 *    
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/*
	 *    
	 *  X
	 *    X
	 *      X
	 *        X
	 *          X
	 *            X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 15, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 14, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 13, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 10, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(5, 11, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *            X
	 *          X  
	 *        X     
	 *      X        
	 *    X           
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 10, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 12, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 13, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 15, StoneType.BLACK);
		
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(5, 14, StoneType.BLACK);
		System.out.println(fiveStone.getCurrentBoard());
	}
	
	@Test(expected = SixStonePlaceException.class)
	/*  
	 * 
	 *  X X X X X X X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 칠占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(7, 12, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(10, 12, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 칠占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);		
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/*
	 *    
	 *  X
	 *    X
	 *      X
	 *        X
	 *          X
	 *            X
	 *              X
	 *   
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 칠占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test7() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 11, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 10, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *              X 
	 *            X
	 *          X  
	 *        X     
	 *      X        
	 *    X           
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 칠占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test8() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 11, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 * 
	 *  X X X X X X X X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占싫몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test9() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(7, 12, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(10, 12, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(11, 12, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占싫몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test10() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *  X
	 *    X
	 *      X
	 *        X
	 *          X
	 *            X
	 *              X
	 *                X
	 *                
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占싫몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test11() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 11, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 10, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 4, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
	
	@Test(expected = SixStonePlaceException.class)
	/* 
	 *                X
	 *              X 
	 *            X
	 *          X  
	 *        X     
	 *      X        
	 *    X           
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占싫몌옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test12() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 11, StoneType.BLACK);
	}

	@Test(expected = SixStonePlaceException.class)
	/*
	 * 
	 *  X X X X X X X X X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test13() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(5, 12, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(7, 12, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(9, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(10, 12, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(11, 12, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(12, 12, StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
	}

	@Test(expected = SixStonePlaceException.class)
	/* 
	 *    
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 *  X
	 * 
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test14() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);	
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(4, 12, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(4, 11, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 9, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(4, 7, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(4, 6, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(4, 5, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(4, 4, StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
	}
                
	@Test(expected = SixStonePlaceException.class)
	/*
	 *    
	 *  X
	 *    X
	 *      X
	 *        X
	 *          X
	 *            X
	 *              X
	 *                X
	 *                  X
	 *                  
	 *  占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */   
	public void SixStoneWillGenerateException_Test15() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 11, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 10, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 8, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 4, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(9, 3,StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		fiveStone.putStone(5, 7, StoneType.BLACK);
	}
		
	@Test(expected = SixStonePlaceException.class)
	/*  
	 *                  X
	 *                X 
	 *              X
	 *            X  
	 *          X     
	 *        X        
	 *      X           
	 *    X
	 *  X
	 * 
	 * 	占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	 *  SixStonePlaceException占쏙옙 占쌩삼옙占싹댐옙占쏙옙 확占쏙옙
	 *  占쏙옙占�: SixStonePlaceException占쏙옙 占쌩삼옙占쏙옙占쏙옙 占쏙옙占쏙옙 -> 占쏙옙占쏙옙 占쏙옙占쏙옙
	 */
	public void SixStoneWillGenerateException_Test16() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 7, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(2, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(3, 9, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(4, 10, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);
		fiveStone.putStone(6, 12, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);
		fiveStone.putStone(7, 13, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 14, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);
		fiveStone.putStone(9, 15, StoneType.BLACK);
		fiveStone.putStone(11, 6, StoneType.WHITE);
		System.out.println(fiveStone.getCurrentBoard());
		fiveStone.putStone(5, 11, StoneType.BLACK);
	}
}
