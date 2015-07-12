package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.ThreeThreePlaceException;
import fs.type.StoneType;

/* X:흑돌이 놓인 위치
 * *:흑돌을 놓을 위치
 * 33이 되는 경우를 보면
 * *XX, X*X 흑돌 세개가 붙어 있는 경우 흑돌이 마지막에 놓일 수 있는 경우는 동형을 제외하면 왼쪽과 같이 2가지입니다
 * *X X, X* X, XX * 흑돌 세개가 떨어진 경우는 흑돌이 마지막에 놓일 수 있는 경우는 동형을 제외하면 왼쪽같이 3가지입니다. 
 * 오목판에서 흑돌 세개가 놓일수 있는 방향은 가로, 세로, 대각선 두가지 모양이 있으므로 총 4가지 입니다. 
 * 33 이 발생할 때 총 흑색 돌 두줄이 세개가 되어 발생하는 경우이므로  4가지 모양을 다 표현하기 위해서는 2가지 테스트 케이스가 있으면 됩니다.
 * 위에서 흑돌의 마지막 위치의 종류가 5개이므로  흑색돌 줄 모양의 종류와 함께 다 표현하기 위해서는  5 * 2 = 10 가지 테스트케이스가 있으면 됩니다.
 * 추가로  흑색돌 뒤에 백색돌이 있을 경우, 33이 아니므로  각각의 경우에 백색돌이 놓인 경우를 테스트하기 위해서 10가지 테스트 케이스를 더 작성하였습니다.
 */

public class ThreeThreePlaceTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	// 삼삼 테스트1
	/*         X
	 *         X
	 *     1 X *
	 * O O
	 * O O 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest1_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
	}

	// 백돌의 경우는 금수가 없기에 33에 걸리지 않는다.
	/*           O
	 *           O
	 * X     1 O *
	 *   X X
	 *   X X 
	 */
	@Test
	public void threeThreePlaceTest1_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(7, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(11, 10, StoneType.WHITE);

		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(11, 11, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
	}

	// 33을 백이 막는 경우 Exception 발생하지 않음
	/*         X
	 *         X
	 *     1 X *
	 * O O
	 *   O 
	 */
	@Test
	public void threeThreePlaceTest1_3() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
	}

	// 삼삼 테스트2
	/*       X
	 *     1 * X
	 * O O   X
	 * O O 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
	}

	// 삼삼 테스트3 : 1번과 다른점은 대각선으로도 가능한가?
	/*     1
	 *   X O O
	 * *   O O
	 *   X
	 *     X
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest3() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);

		fiveStone.putStone(8, 4, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(6, 6, StoneType.BLACK);
	}

	// 삼삼 테스트3 : 1번과 다른점은 대각선으로도 가능한가?
	/* X   1 O O
	 *   *   O O
	 * X   X  
	 *   
	 *     
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest4() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// 삼삼 테스트5
	/*           X
	 *           X
	 *           
	 *     1 X   *
	 * O O
	 * O O 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest5() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(11, 11, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// 삼삼 테스트6
	/*       X
	 *    
	 *     1 *   X
	 * O O   X      
	 * O O 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest6() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
	}

	// 33Exception 발생 안함

	// 삼삼 테스트7
	/*     * X  X
	 *     1    
	 * O O         
	 * O O X
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest7() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(11, 9, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(8, 9, StoneType.BLACK);
	}

	// 삼삼 테스트8 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/*       1
	 *     X O O
	 *       O O
	 * *     
	 *       
	 *     X
	 *       X
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest8() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(7, 3, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);

		fiveStone.putStone(8, 2, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(5, 5, StoneType.BLACK);
	}


	// 삼삼 테스트9 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/* X
	 *       1 O O
	 *     * O O
	 *       X 
	 * X 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest9() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// 33Exception 발생 안함

	// 삼삼 테스트10 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/*       X
	 * 
	 *   1 O O
	 * * O O
	 *   X  
	 *     
	 *       X 
	 */
	@Test(expected = ThreeThreePlaceException.class)
	public void threeThreePlaceTest10() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// 삼삼 테스트11
	/*         O
	 *         X
	 *         X
	 *   O 1 X *
	 * O O 
	 */
	@Test
	public void threeThreePlaceTest11() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
	}

	// 삼삼 테스트12
	/*       O
	 *       X 
	 *   O 1 * X
	 * O O   X
	 */
	@Test
	public void threeThreePlaceTest12() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(9, 10, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
	}

	// 삼삼 테스트13 
	/*       O
	 *     1
	 *   X O 
	 * *   O 
	 *   X
	 *     X
	 *       O
	 */
	@Test
	public void threeThreePlaceTest13() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(7, 5, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(8, 4, StoneType.BLACK);
		fiveStone.putStone(9, 3, StoneType.WHITE);

		fiveStone.putStone(6, 6, StoneType.BLACK);
	}

	// 삼삼 테스트14 
	/*       O
	 * X   1 O O
	 *   *     
	 * X   X  
	 *       O
	 */
	@Test
	public void threeThreePlaceTest14() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 5, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}


	// 삼삼 테스트15
	/*           O
	 *           X
	 *           X
	 *           
	 *   O 1 X   *
	 * O O
	 */
	@Test
	public void threeThreePlaceTest15() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(11, 11, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(11, 12, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// 33Exception 발생

	// 삼삼 테스트16
	/*       X
	 *    
	 *   O 1 *   X
	 * O     X      
	 * O     O 
	 */
	@Test
	public void threeThreePlaceTest16() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
	}

	// 삼삼 테스트17
	/* O
	 *   O O
	 *   O * 1  X
	 *     X    
	 *           
	 *     X  
	 */
	@Test
	public void threeThreePlaceTest17() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);

		fiveStone.putStone(11, 9, StoneType.BLACK);
		fiveStone.putStone(6, 11, StoneType.WHITE);

		fiveStone.putStone(8, 9, StoneType.BLACK);
	}

	// 삼삼 테스트18 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/*         1
	 *       X O
	 * O       O
	 *   *     
	 * O     
	 *       X
	 *         X
	 */
	@Test
	public void threeThreePlaceTest18() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(7, 3, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);

		fiveStone.putStone(8, 2, StoneType.BLACK);
		fiveStone.putStone(4, 4, StoneType.WHITE);

		fiveStone.putStone(5, 5, StoneType.BLACK);
	}


	// 삼삼 테스트19 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/* X       O
	 *       1   O
	 *     * O O
	 *       X 
	 * X 
	 */
	@Test
	public void threeThreePlaceTest19() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(5, 5, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(5, 9, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// 삼삼 테스트20 : 한 쪽을 막고 있기 때문에 이경우는 빠지면 안됨
	/*         X
	 * 
	 * O   1 O
	 *   * O O
	 *     X  
	 *     
	 *         X 
	 */
	@Test
	public void threeThreePlaceTest20() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// 삼삼 테스트1
	/*         X
	 *         X
	 * X O 1 X *
	 * O O
	 * O O 
	 */
	@Test
	public void threeThreePlaceTest21() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
	}

	// 삼삼 테스트22
	/*       X
	 * X O 1 * X
	 * O O   X
	 * O O 
	 */
	@Test
	public void threeThreePlaceTest22() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(9, 7, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
	}

	// 삼삼 테스트1
	/*         
	 *     1 X * X X
	 * O O
	 * O O 
	 */
	@Test
	public void threeThreePlaceTest23() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		
		assertTrue(fiveStone.isGameOver());
	}
}
