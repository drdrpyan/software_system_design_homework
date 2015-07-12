package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.NoMoreGameException;
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

	/*
	// ���� �׽�Ʈ1 : ����
	@Test(expected = NoMoreGameException.class)
	public void FiveStoneTest1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.BLACK);
		// ... //
		
		assertTrue( fiveStone.isGameOver() );
		
	}
	*/
	//������ �������� ���� �η��� �Ѱ��
	@Test(expected = NoMoreGameException.class)
	public void isGameOver1() throws Exception {
		
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);

		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(13, 9, StoneType.WHITE);

	}

	//������ �������� ���� �η��� �Ѱ��
	@Test(expected = NoMoreGameException.class)
	public void isGameOver2() throws Exception {

		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);

		fiveStone.putStone(13, 8, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);

		fiveStone.putStone(12, 8, StoneType.BLACK);

	}

	// ���� ���η� 5���� �ξ �̱� ���
	@Test
	public void isGameDone1() throws Exception {

		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);

		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);

		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);

		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);

		fiveStone.putStone(13, 8, StoneType.BLACK);

	}

	// ���� ���η� 5���� �ξ �̱� ���
		@Test
		public void isGameDone2() throws Exception {

			fiveStone.putStone(8, 8, StoneType.BLACK);
			fiveStone.putStone(9, 8, StoneType.WHITE);

			fiveStone.putStone(8, 9, StoneType.BLACK);
			fiveStone.putStone(9, 9, StoneType.WHITE);
			
			fiveStone.putStone(8, 10, StoneType.BLACK);
			fiveStone.putStone(9, 10, StoneType.WHITE);
			
			fiveStone.putStone(8, 11, StoneType.BLACK);
			fiveStone.putStone(9, 11, StoneType.WHITE);
			
			fiveStone.putStone(8, 12, StoneType.BLACK);
		

		}
}
