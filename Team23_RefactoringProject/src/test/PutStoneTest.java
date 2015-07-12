package test;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.DuplicatePlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.type.StoneType;

public class PutStoneTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	// �ߺ����� ������ ���
	@Test(expected = DuplicatePlaceException.class)
	public void putStoneTest1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 8, StoneType.BLACK);
	}

	// NULL �Է�
	@Test(expected = GeneralFiveStoneException.class)
	public void putStoneTest2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, null);
	}
	
	// x �� �뱹�� ��ġ ���  ( �뱹�� ��� �ּҰ����� ���� ��� )
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest3_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(-1, 5, StoneType.WHITE);
	}
	// y �� �뱹�� ��ġ ���  ( �뱹�� ��� �ּҰ����� ���� ��� )
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest3_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(5, -1, StoneType.WHITE);
	}
	// x,y �� �뱹�� ��ġ ��� ( �뱹�� ��� �ּҰ����� ���� ��� )
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest3_3() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(-1, -1, StoneType.WHITE);
	}
	
	// x,y �뱹�� ��ġ ���  ( �뱹�� ��� �ִ밪 ���� ���� ��� )
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest4_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(16, 16, StoneType.WHITE);
	}
	// x �뱹�� ��ġ ��� ( �뱹�� ��� �ִ밪 ���� ���� ��� )
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest4_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(16, 14, StoneType.WHITE);
	}
	// y �뱹�� ��ġ ��� 
	@Test(expected = OutOfBoundPositionException.class)
	public void putStoneTest4_3() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(6, 6, StoneType.BLACK);
		fiveStone.putStone(14, 16, StoneType.WHITE);
	}
	
	// ���� �ߺ����� �ξ������
	@Test(expected = InvalidTurnException.class)
	public void putStoneTest5_1() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.BLACK);
	}
	// ���� �ߺ����� �ξ������
	@Test(expected = InvalidTurnException.class)
	public void putStoneTest5_2() throws Exception {
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.WHITE);
	}

	// ������ ������ ������ ���

		@Test(expected = NoMoreGameException.class )
		public void putStoneTest6() throws Exception {
			int base = 8;
			for(int i = 0 ; i < 4; i ++){
				fiveStone.putStone(base + i, base,StoneType.BLACK);
				fiveStone.putStone(base + i , base + 1, StoneType.WHITE);
			}
			fiveStone.putStone(base + 4, base, StoneType.BLACK);
			fiveStone.putStone(base + 5, base + 1, StoneType.WHITE);
		}
	
}
