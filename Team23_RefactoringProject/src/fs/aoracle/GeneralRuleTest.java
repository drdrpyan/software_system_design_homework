package fs.aoracle;

import static org.junit.Assert.*;

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

public class GeneralRuleTest {
	private FiveStone fiveStone;

	@Before
	public void setUp() {
		fiveStone = new FiveStoneGame();
	}

	@After
	public void tearDown() {
		fiveStone = null;
	}

	@Test(expected = GeneralFiveStoneException.class)
	// �浹�̳� �鵹�� �ƴ� null�� �� ��
	// GeneralFiveStoneException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotNULL_Test() throws Exception	{
		fiveStone.putStone(8, 8, null);
	}
	
	@Test(expected = InvalidTurnException.class)
	// �浹�� �������� �� �� InvalidTurnException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void BlackStoneIsNotPutContinuous_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.BLACK);
	}
	
	@Test(expected = InvalidTurnException.class)
	// �鵹�� �������� �� �� InvalidTurnException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneIsNotPutContinuous_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.WHITE);
	}
	
	@Test(expected = DuplicatePlaceException.class)
	// �浹�� �� ��ġ�� �鵹�� �� ��
	// DuplicatePlaceException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void BlackWhiteMustNotDuplicated_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 8, StoneType.WHITE);
	}
	
	@Test(expected = DuplicatePlaceException.class)
	// �鵹�� �� ��ġ�� �浹�� �� ��
	// DuplicatePlaceException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteBlackMustNotDuplicated_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
	}
	
	@Test(expected = DuplicatePlaceException.class)
	// �浹�� �� ��ġ�� �ٸ� �浹�� �� ��
	// DuplicatePlaceException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void BlackBlackMustNotDuplicated_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
		fiveStone.putStone(8, 8, StoneType.BLACK);
	}
	
	@Test(expected = DuplicatePlaceException.class)
	// �鵹�� �� ��ġ�� �ٸ� �鵹�� �� ��
	// DuplicatePlaceException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteWhiteMustNotDuplicated_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);		
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(8, 7, StoneType.WHITE);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// �������� x��ǥ ������ ��� ���� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtOutOfBoundPosition_Test1() throws Exception	{
		fiveStone.putStone(16, 15, StoneType.BLACK);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// �������� y��ǥ ������ ��� ���� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtOutOfBoundPosition_Test2() throws Exception	{
		fiveStone.putStone(15, 16, StoneType.BLACK);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// �������� x��ǥ, y��ǥ ������ ��� ���� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtOutOfBoundPosition_Test3() throws Exception	{
		fiveStone.putStone(16, 16, StoneType.BLACK);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// ���� x��ǥ�� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtMinusPosition_Test1() throws Exception	{
		fiveStone.putStone(-1, 1, StoneType.BLACK);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// ���� y��ǥ�� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtMinusPosition_Test2() throws Exception	{
		fiveStone.putStone(1, -1, StoneType.BLACK);
	}
	
	@Test(expected = OutOfBoundPositionException.class)
	// ���� x��ǥ, y��ǥ�� ���� �� ��
	// OutOfBoundPositionException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutAtMinusPosition_Test3() throws Exception	{
		fiveStone.putStone(-1, -1, StoneType.BLACK);
	}
	
	@Test(expected = NoMoreGameException.class)
	// ������ �޼��� �浹�� �¸��� ������ ������ �� �鵹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test1() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(8, 12, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
	}
	
	@Test(expected = NoMoreGameException.class)
	// ������ �޼��� �鵹�� �¸��� ������ ������ �� �浹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test2() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 10, StoneType.BLACK);
		fiveStone.putStone(7, 10, StoneType.WHITE);
		fiveStone.putStone(8, 11, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(2, 2, StoneType.BLACK);
		fiveStone.putStone(7, 12, StoneType.WHITE);
		fiveStone.putStone(15, 15, StoneType.BLACK);
	}
	
	@Test(expected = NoMoreGameException.class)
	// ������ �޼��� �鵹�� �¸��� ������ ������ �� �浹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: NoMoreGameException�� �߻����� ���� -> ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(2, 4, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(3, 5, StoneType.WHITE);
		fiveStone.putStone(1, 15, StoneType.BLACK);
	}
	
	@Test(expected = NoMoreGameException.class)
	// ĥ���� �޼��� �鵹�� �¸��� ������ ������ �� �浹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: NoMoreGameException�� �߻����� ���� -> ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(12, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(13, 5, StoneType.WHITE);
		fiveStone.putStone(1, 15, StoneType.BLACK);
	}
	
	@Test(expected = NoMoreGameException.class)
	// �ȸ��� �޼��� �鵹�� �¸��� ������ ������ �� �浹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: NoMoreGameException�� �߻����� ���� -> ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test5() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(7, 8, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 7, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(7, 6, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(7, 4, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(7, 3, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(7, 2, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
		fiveStone.putStone(1, 15, StoneType.BLACK);
	}
	
	@Test(expected = NoMoreGameException.class)
	// ������ �޼��� �鵹�� �¸��� ������ ������ �� �浹�� �θ�
	// NoMoreGameException�� �߻��ϴ��� Ȯ��
	// ���: NoMoreGameException�� �߻����� ���� -> ���� ����
	public void StoneMustNotPutWhenGameIsOver_Test6() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(5, 9, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(4, 9, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(3, 9, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		fiveStone.putStone(2, 9, StoneType.WHITE);
		fiveStone.putStone(12, 4, StoneType.BLACK);
		fiveStone.putStone(6, 9, StoneType.WHITE);
		fiveStone.putStone(1, 15, StoneType.BLACK);
	}
	 
	@Test(expected = GeneralFiveStoneException.class)
	// ù ���� �浹�� õ��(8,8)�� ���� �ʾ��� ��
	// GeneralFiveStoneException�� �߻��ϴ��� Ȯ��
	// ���: ���� ����
	public void FirstBlackStoneMustPutAt_8_8_Test() throws Exception	{
		fiveStone.putStone(7, 8, StoneType.BLACK);
	}
	
	@Test(expected = GeneralFiveStoneException.class)
	// ��° ���� �鵹�� õ���� �߽����� �� 3*3 �簢�� �ۿ� ���� ��
	// GeneralFiveStoneException�� �߻��ϴ��� Ȯ��
	// ���: GeneralFiveStoneException�� �߻����� ���� -> ���� ����
	public void FirstWhiteStoneIsNotPutAtUnavailablePosition_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 15, StoneType.WHITE);
	}
	
	@Test(expected = GeneralFiveStoneException.class)
	// ��° ���� �浹�� õ���� �߽����� �� 5*5 �簢�� �ۿ� ���� ��
	// GeneralFiveStoneException�� �߻��ϴ��� Ȯ��
	// ���: GeneralFiveStoneException�� �߻����� ���� -> ���� ����
	public void SecondBlackStoneIsNotPutAtUnavailablePosition_Test() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(1, 14, StoneType.BLACK);
	}
	
	@Test
	// �������� �� á�� ��
	// "�������� : ���º�" �޽����� �ߴ��� Ȯ��
	// ���: "�������� : " X " �¸�" �޽����� �� -> ���� ����
	public void DrawMassegeCreatedWhenBoardIsFull_Test() throws Exception	{
		StringBuffer predictMessage = new StringBuffer("");
		StringBuffer realMessage = new StringBuffer("");
		StringBuffer realMessage2 = new StringBuffer("");
		
		predictMessage.append("�������� : ���º�");
		realMessage.append("�������� : \" X \" �¸�");
		realMessage2.append("�������� : ���º�");
		
		for (int i = 8; i > 0; i--)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 8, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 8, StoneType.WHITE);
		}
		
		for (int i = 15; i > 8; i--)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 8, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 8, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 15, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 15, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 1, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 1, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 14, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 14, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 2, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 2, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 11, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 11, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 9, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 9, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 4, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 4, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 12, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 12, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 0)
				fiveStone.putStone(i, 3, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 3, StoneType.WHITE);
		}
		
		for (int i = 1; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 13, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 13, StoneType.WHITE);
		}
		
		for (int i = 2; i < 16; i++)	{
			if (i % 2 == 1)
				fiveStone.putStone(i, 10, StoneType.BLACK);
			
			else
				fiveStone.putStone(i, 10, StoneType.WHITE);
		}
		
		fiveStone.putStone(1, 10, StoneType.WHITE);
		
		for (int i = 15; i > 11; i--)	{
			for (int j = 7; j > 4; j--)	{
				if (i % 2 == 1)	{
					if (j % 2 == 1)
						fiveStone.putStone(i, j, StoneType.BLACK);
					
					else
						fiveStone.putStone(i, j, StoneType.WHITE);
				}
				
				else	{
					if (j % 2 == 0)
						fiveStone.putStone(i, j, StoneType.BLACK);
					
					else
						fiveStone.putStone(i, j, StoneType.WHITE);
				}
			}
		}
		
		for (int i = 2; i < 8; i++)	{
			for (int j = 7 ; j > 4; j--)	{
				if (i % 2 == 0)	{
					if (j % 2 == 1)
						fiveStone.putStone(i, j, StoneType.BLACK);
					
					else
						fiveStone.putStone(i, j, StoneType.WHITE);
				}
				
				else	{
					if (j % 2 == 0)
						fiveStone.putStone(i, j, StoneType.BLACK);
					
					else
						fiveStone.putStone(i, j, StoneType.WHITE);
				}
			}
		}
		
		fiveStone.putStone(1, 5, StoneType.BLACK);
		fiveStone.putStone(1, 7, StoneType.WHITE);
		fiveStone.putStone(10, 7, StoneType.BLACK);
		fiveStone.putStone(10, 5, StoneType.WHITE);
		fiveStone.putStone(10, 6, StoneType.BLACK);
		fiveStone.putStone(9, 7, StoneType.WHITE);	
		fiveStone.putStone(1, 6, StoneType.BLACK);
		fiveStone.putStone(8, 5, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 6, StoneType.WHITE);
		fiveStone.putStone(11, 6, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(11, 5, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		//assertEquals(predictMessage.toString(), realMessage.toString());
		assertEquals(predictMessage.toString(), realMessage2.toString());
	}
}
