package fs.aoracle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.type.CellState;
import fs.type.StoneType;

public class FiveStoneMethodTest {
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
	// ���忡 ���� ���� �� getState �޼ҵ尡 EMPTY�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testGetStateReturnEmptyCorrectly() throws Exception	{
		assertEquals(CellState.EMPTY, fiveStone.getState(8, 8));
	}
	
	@Test
	// ���忡 ��� ���� ���� �� getState �޼ҵ尡 BLACK�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testGetStateReturnBlackCorrectly() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		assertEquals(CellState.BLACK, fiveStone.getState(8, 8));
	}
	
	@Test
	// ���忡 ��� ���� ���� ��, getState �޼ҵ尡 WHITE�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testGetStateReturnWhiteCorrectly() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 8, StoneType.WHITE);
		assertEquals(CellState.WHITE, fiveStone.getState(9, 8));
	}
	
	@Test
	// ������ ������ �ʾ��� �� isGameOver �޼ҵ尡 false�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testIsGameOverReturnFalseWhenGameIsNotOver() throws Exception	{
		assertTrue(fiveStone.isGameOver() == false);
	}
	
	@Test
	// ������ �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testIsGameOverReturnTrueWhenBlackIsWinWithFiveStone() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		assertTrue(fiveStone.isGameOver() == true);
	}

	@Test
	// ������ �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testIsGameOverReturnTrueWhenWhiteIsWinWithFiveStone() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 9, StoneType.BLACK);
		fiveStone.putStone(10, 9, StoneType.WHITE);
		fiveStone.putStone(10, 8, StoneType.BLACK);
		fiveStone.putStone(11, 9, StoneType.WHITE);
		fiveStone.putStone(11, 8, StoneType.BLACK);
		fiveStone.putStone(12, 9, StoneType.WHITE);
		fiveStone.putStone(12, 8, StoneType.BLACK);
		fiveStone.putStone(13, 9, StoneType.WHITE);
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// ������ �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: true�� �ƴ� false�� ��ȯ -> ���� ����
	public void testIsGameOverReturnTrueWhenWhiteIsWinWithSixStone1() throws Exception	{
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
		fiveStone.putStone(6, 9, StoneType.WHITE);
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// ĥ���� �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: true�� �ƴ� false�� ��ȯ -> ���� ����
	public void testIsGameOverReturnTrueWhenWhiteIsWinWithSixStone2() throws Exception	{
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
		fiveStone.putStone(7, 5, StoneType.WHITE);
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// �ȸ��� �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: true�� �ƴ� false�� ��ȯ -> ���� ����
	public void testIsGameOverReturnTrueWhenWhiteIsWinWithSixStone3() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(7, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(10, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(12, 6, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(13, 5, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(14, 4, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// ������ �޼��� ��� ���� �¸��� ������ ������ ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: true�� �ƴ� false�� ��ȯ -> ���� ����
	public void testIsGameOverReturnTrueWhenWhiteIsWinWithSixStone4() throws Exception	{
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(7, 9, StoneType.WHITE);
		fiveStone.putStone(8, 7, StoneType.BLACK);
		fiveStone.putStone(8, 10, StoneType.WHITE);
		fiveStone.putStone(8, 6, StoneType.BLACK);
		fiveStone.putStone(9, 11, StoneType.WHITE);
		fiveStone.putStone(8, 5, StoneType.BLACK);
		fiveStone.putStone(6, 8, StoneType.WHITE);
		fiveStone.putStone(9, 5, StoneType.BLACK);
		fiveStone.putStone(4, 6, StoneType.WHITE);
		fiveStone.putStone(10, 5, StoneType.BLACK);
		fiveStone.putStone(3, 5, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(2, 4, StoneType.WHITE);
		fiveStone.putStone(11, 4, StoneType.BLACK);
		fiveStone.putStone(1, 3, StoneType.WHITE);
		fiveStone.putStone(12, 4, StoneType.BLACK);
		fiveStone.putStone(5, 7, StoneType.WHITE);
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// �������� �� á�� ��
	// isGameOver �޼ҵ尡 true�� ��ȯ�ϴ��� Ȯ��
	// ���: true�� �ƴ� false�� ��ȯ -> ���� ����
	public void testIsGameOverReturnTrueWhenBoardIsFull() throws Exception	{
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
		assertTrue(fiveStone.isGameOver() == true);
	}
	
	@Test
	// �������� ����� ��
	// getCurrentBoard �޼ҵ尡 �������� ����� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testGetCurrentBoardReturnCorrectBoard1() throws Exception	{
		StringBuffer board = new StringBuffer("");
		for (int i = 14; i >= 0; i--)	{
			for (int j = 0; j < 15; j++)	{
				board.append(CellState.EMPTY);
			}
			board.append("\n");
		}
		assertEquals(board.toString(), fiveStone.getCurrentBoard());
	}
	
	@Test
	// ù ���� õ���� �浹�� ���� ��
	// getCurrentBoard �޼ҵ尡 �������� ����� ��ȯ�ϴ��� Ȯ��
	// ���: ���� ����
	public void testGetCurrentBoardReturnCorrectBoard2() throws Exception	{
		StringBuffer board = new StringBuffer("");
		for (int i = 14; i >= 0; i--)	{
			for (int j = 0; j < 15; j++)	{
				if (i == 7 && j == 7)
					board.append(CellState.BLACK);
				
				else
					board.append(CellState.EMPTY);
			}
			board.append("\n");
		}
		fiveStone.putStone(8, 8, StoneType.BLACK);
		assertEquals(board.toString(), fiveStone.getCurrentBoard());
	}
	
	@Test
	// ù ���� õ���� �浹�� �ΰ�
	// ��° ���� �鵹�� õ���� �߽����� �� 3*3 �簢�� ���� ���� ��
	// getCurrentBoard �޼ҵ尡 �������� ����� ��ȯ�ϴ��� Ȯ��
	// ���: ���������� 90�� ���ư� ���·� �������� ��ȯ�� -> ���� ����
	public void testGetCurrentBoardReturnCorrectBoard3() throws Exception	{
		StringBuffer board = new StringBuffer("");
		for (int i = 14; i >= 0; i--)	{
			for (int j = 0; j < 15; j++)	{
				if (i == 7 && j == 7)
					board.append(CellState.BLACK);
				
				else if (i == 8 && j == 7)
					board.append(CellState.WHITE);
				
				else
					board.append(CellState.EMPTY);
			}
			board.append("\n");
		}
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		assertEquals(board.toString(), fiveStone.getCurrentBoard());
	}
	
	@Test
	// ù ���� õ���� �浹�� �ΰ�
	// ��° ���� �鵹�� õ���� �߽����� �� 3*3 �簢�� ���� �θ�
	// ��° ���� �浹�� õ���� �߽����� �� 5*5 �簢�� ���� ���� ��
	// getCurrentBoard �޼ҵ尡 �������� ����� ��ȯ�ϴ��� Ȯ��
	// ���: ���������� 90�� ���ư� ���·� �������� ��ȯ�� -> ���� ����
	public void testGetCurrentBoardReturnCorrectBoard4() throws Exception	{
		StringBuffer board = new StringBuffer("");
		for (int i = 14; i >= 0; i--)	{
			for (int j = 0; j < 15; j++)	{
				if ((i == 7 && j == 7) || (i == 7 && j == 8))
					board.append(CellState.BLACK);
				
				else if (i == 8 && j == 7)
					board.append(CellState.WHITE);
				
				else
					board.append(CellState.EMPTY);
			}
			board.append("\n");
		}
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		assertEquals(board.toString(), fiveStone.getCurrentBoard());
	}
	
	@Test
	// ù ���� õ���� �浹�� �ΰ�
	// ��° ���� �鵹�� õ���� �߽����� �� 3*3 �簢�� ���� �θ�
	// ��° ���� �浹�� õ���� �߽����� �� 5*5 �簢�� ���� �� �Ŀ�
	// ��° ���� �鵹�� ������ ���� ���� ��
	// getCurrentBoard �޼ҵ尡 �������� ����� ��ȯ�ϴ��� Ȯ��
	// ���: ���������� 90�� ���ư� ���·� �������� ��ȯ�� -> ���� ����
	public void testGetCurrentBoardReturnCorrectBoard5() throws Exception	{
		StringBuffer board = new StringBuffer("");
		for (int i = 14; i >= 0; i--)	{
			for (int j = 0; j < 15; j++)	{
				if ((i == 7 && j == 7) || (i == 7 && j == 8))
					board.append(CellState.BLACK);
				
				else if ((i == 8 && j == 7) || (i == 8 && j == 8))
					board.append(CellState.WHITE);
				
				else
					board.append(CellState.EMPTY);
			}
			board.append("\n");
		}
		fiveStone.putStone(8, 8, StoneType.BLACK);
		fiveStone.putStone(8, 9, StoneType.WHITE);
		fiveStone.putStone(9, 8, StoneType.BLACK);
		fiveStone.putStone(9, 9, StoneType.WHITE);
		assertEquals(board.toString(), fiveStone.getCurrentBoard());
	}
}
