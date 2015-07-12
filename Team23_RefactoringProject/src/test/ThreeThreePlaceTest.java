package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.ThreeThreePlaceException;
import fs.type.StoneType;

/* X:�浹�� ���� ��ġ
 * *:�浹�� ���� ��ġ
 * 33�� �Ǵ� ��츦 ����
 * *XX, X*X �浹 ������ �پ� �ִ� ��� �浹�� �������� ���� �� �ִ� ���� ������ �����ϸ� ���ʰ� ���� 2�����Դϴ�
 * *X X, X* X, XX * �浹 ������ ������ ���� �浹�� �������� ���� �� �ִ� ���� ������ �����ϸ� ���ʰ��� 3�����Դϴ�. 
 * �����ǿ��� �浹 ������ ���ϼ� �ִ� ������ ����, ����, �밢�� �ΰ��� ����� �����Ƿ� �� 4���� �Դϴ�. 
 * 33 �� �߻��� �� �� ��� �� ������ ������ �Ǿ� �߻��ϴ� ����̹Ƿ�  4���� ����� �� ǥ���ϱ� ���ؼ��� 2���� �׽�Ʈ ���̽��� ������ �˴ϴ�.
 * ������ �浹�� ������ ��ġ�� ������ 5���̹Ƿ�  ����� �� ����� ������ �Բ� �� ǥ���ϱ� ���ؼ���  5 * 2 = 10 ���� �׽�Ʈ���̽��� ������ �˴ϴ�.
 * �߰���  ����� �ڿ� ������� ���� ���, 33�� �ƴϹǷ�  ������ ��쿡 ������� ���� ��츦 �׽�Ʈ�ϱ� ���ؼ� 10���� �׽�Ʈ ���̽��� �� �ۼ��Ͽ����ϴ�.
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

	// ��� �׽�Ʈ1
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

	// �鵹�� ���� �ݼ��� ���⿡ 33�� �ɸ��� �ʴ´�.
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

	// 33�� ���� ���� ��� Exception �߻����� ����
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

	// ��� �׽�Ʈ2
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

	// ��� �׽�Ʈ3 : 1���� �ٸ����� �밢�����ε� �����Ѱ�?
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

	// ��� �׽�Ʈ3 : 1���� �ٸ����� �밢�����ε� �����Ѱ�?
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

	// ��� �׽�Ʈ5
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

	// ��� �׽�Ʈ6
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

	// 33Exception �߻� ����

	// ��� �׽�Ʈ7
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

	// ��� �׽�Ʈ8 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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


	// ��� �׽�Ʈ9 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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

	// 33Exception �߻� ����

	// ��� �׽�Ʈ10 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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

	// ��� �׽�Ʈ11
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

	// ��� �׽�Ʈ12
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

	// ��� �׽�Ʈ13 
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

	// ��� �׽�Ʈ14 
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


	// ��� �׽�Ʈ15
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

	// 33Exception �߻�

	// ��� �׽�Ʈ16
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

	// ��� �׽�Ʈ17
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

	// ��� �׽�Ʈ18 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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


	// ��� �׽�Ʈ19 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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

	// ��� �׽�Ʈ20 : �� ���� ���� �ֱ� ������ �̰��� ������ �ȵ�
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

	// ��� �׽�Ʈ1
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

	// ��� �׽�Ʈ22
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

	// ��� �׽�Ʈ1
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
