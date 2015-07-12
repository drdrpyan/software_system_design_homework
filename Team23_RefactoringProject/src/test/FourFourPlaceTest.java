package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.FourFourPlaceException;
import fs.type.StoneType;

// ���ľ� �� �͵� : 8, 9_1, 9_2

public class FourFourPlaceTest {
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
	//       O O X
	//           X
	//           X
	//     X X X *
	// O O
	// O O 
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest1_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(11, 11, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(11, 10, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);

		fiveStone.putStone(11, 9, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// �鵹�� ���� �ݼ��� ���⿡ 44�� �ɸ��� �ʴ´�.
	@Test
	public void FourFourPlaceTest1_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);

		fiveStone.putStone(7, 6, StoneType.BLACK);
		fiveStone.putStone(12, 10, StoneType.WHITE);

		fiveStone.putStone(9, 6, StoneType.BLACK);
		fiveStone.putStone(12, 11, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(12, 12, StoneType.WHITE);

		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);
	}

	// ��� �׽�Ʈ2
	//           O
	//           X
	//   O X X X *
	// O O       X
	// O O       X
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(11, 9, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(11, 7, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(11, 10, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// ��� �׽�Ʈ3 : 1���� �ٸ����� �밢�����ε� �����Ѱ�?

	//       X
	//     X
	//   X O O
	// * O O O
	//   X O 
	//     X 
	//       X
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest3() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(10, 7, StoneType.WHITE);

		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);

		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}

	// ��� �׽�Ʈ4

	//             O 
	//             X
	//             X
	//             X
	//   O X X X   *
	// O O
	// O O 
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest4() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(12, 11, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(12, 10, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);

		fiveStone.putStone(12, 9, StoneType.BLACK);
		fiveStone.putStone(12, 12, StoneType.WHITE);

		fiveStone.putStone(12, 8, StoneType.BLACK);
	}

	// ��� �׽�Ʈ5
	//   O
	//     X
	//       X
	//         X
	//   O X X X *
	// O O
	// O O 
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest5() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// ��� �׽�Ʈ6
	//     O
	//       X
	//         X
	//   O X X   * X
	// O O          
	// O O           X
	 
	@Test(expected = FourFourPlaceException.class)
	public void FourFourPlaceTest6() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);

		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(8, 6, StoneType.WHITE);

		fiveStone.putStone(13, 6, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 10, StoneType.BLACK);
		fiveStone.putStone(10, 11, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(8, 11, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
	}

	// ��� �׽�Ʈ7 : ������ ���� �ֱ� �빮�� �̰��� ������ �ȵ�
	// l--------
	// l     X
	// l   X
	// l *
	// l X
	// l X
	 
	/*@Test
		public void FourFourPlaceTest7() throws Exception {
			fiveStone.putStone(8, 8, StoneType.BLACK);
			fiveStone.putStone(7, 7, StoneType.WHITE);

			fiveStone.putStone(8, 7, StoneType.BLACK);
			fiveStone.putStone(7, 6, StoneType.WHITE);

			fiveStone.putStone(3, 15, StoneType.BLACK);
			fiveStone.putStone(8, 6, StoneType.WHITE);

			fiveStone.putStone(2, 14, StoneType.BLACK);
			fiveStone.putStone(9, 7, StoneType.WHITE);

			fiveStone.putStone(1, 12, StoneType.BLACK);
			fiveStone.putStone(9, 8, StoneType.WHITE);

			fiveStone.putStone(1, 11, StoneType.BLACK);
			fiveStone.putStone(8, 9, StoneType.WHITE);

			fiveStone.putStone(1, 13, StoneType.BLACK);
		}*/

	// ��� �׽�Ʈ8 : �� ���� ���� �ִ� 44�̱� ������ �̰��� ������ �ȵ�
	//         X
	//         X   
	// O O X X * X O
	// O O     X   O
	 

	@Test
	public void FourFourPlaceTest8() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);

		fiveStone.putStone(10, 9, StoneType.BLACK);
		fiveStone.putStone(6, 7, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(12, 8, StoneType.WHITE);

		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(12, 7, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
	}

	// ������ ������ ����ؾ��ϳ� 44exception���� ����
	

	// ��� �׽�Ʈ10 : �밢���� ���� ����

	//           O
	//         X
	//       X
	// X   X O O
	//   * O O 
	// O   X  
	//       
	//         X
	//           
	 
	@Test
	public void FourFourPlaceTest9_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(11, 11, StoneType.WHITE);

		fiveStone.putStone(6, 8, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(11, 3, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}
	// ������ ������ ����ؾ��ϳ� 44exception���� ����

	// ��� �׽�Ʈ10 : �밢���� ���� ���� 2��°

	//           O
	//         X
	//       X
	//     X O O
	//   * O  
	// O   X  
	//       X 
	//         X
	//           O
	 
	@Test
	public void FourFourPlaceTest9_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);

		fiveStone.putStone(9, 9, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);

		fiveStone.putStone(10, 10, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);

		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(11, 11, StoneType.WHITE);

		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(6, 6, StoneType.WHITE);

		fiveStone.putStone(10, 4, StoneType.BLACK);
		fiveStone.putStone(11, 3, StoneType.WHITE);

		fiveStone.putStone(7, 7, StoneType.BLACK);
	}
	// ������ ������ ����ؾ��ϳ� 44exception���� ����
	

}
