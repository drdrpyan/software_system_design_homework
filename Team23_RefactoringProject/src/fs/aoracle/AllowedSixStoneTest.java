package fs.aoracle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fs.FiveStone;
import fs.FiveStoneGame;
import fs.excep.NoMoreGameException;
import fs.type.StoneType;

public class AllowedSixStoneTest {
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
	// OOOOOO
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test1() throws Exception	{
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
	}
	
	@Test
	// O
	// O
	// O
	// O
	// O
	// O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test2() throws Exception	{
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
		fiveStone.putStone(7, 5, StoneType.WHITE);
	}
	
	@Test
	// O
	//  O
	//   O
	//    O
	//     O
	//      O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test3() throws Exception	{
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
		fiveStone.putStone(13, 5, StoneType.WHITE);
	}
	
	@Test
	//      O
	//     O
	//    O
	//   O
	//  O
	// O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test4() throws Exception	{
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
	}
	
	@Test
	// OOOOOOO
	//
	// �� ������ ĥ���� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test5() throws Exception	{
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
		fiveStone.putStone(6, 9, StoneType.WHITE);
	}
	
	@Test
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	//
	// �� ������ ĥ���� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test6() throws Exception	{
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
	}
	
	@Test
	// O
	//  O
	//   O
	//    O
	//     O
	//      O
	//       O
	//
	// �� ������ ĥ���� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test7() throws Exception	{
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
	}
	
	@Test
	//       O
	//      O
	//     O
	//    O
	//   O
	//  O
	// O
	//
	// �� ������ ĥ���� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test8() throws Exception	{
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
		fiveStone.putStone(1, 3, StoneType.WHITE);
		fiveStone.putStone(11, 5, StoneType.BLACK);
		fiveStone.putStone(3, 5, StoneType.WHITE);
	}
	
	@Test
	// OOOOOOOO
	//
	// �� ������ �ȸ��� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test9() throws Exception	{
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
		fiveStone.putStone(6, 9, StoneType.WHITE);
	}
	
	@Test
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	//
	// �� ������ �ȸ��� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test10() throws Exception	{
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
	}
	
	@Test
	// O
	//  O
	//   O
	//    O
	//     O
	//      O
	//       O
	//        O
	//
	// �� ������ �ȸ��� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test11() throws Exception	{
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
	}
	
	@Test
	//        O
	//       O
	//      O
	//     O
	//    O
	//   O
	//  O
	// O
	//
	// �� ������ �ȸ��� ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test12() throws Exception	{
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
		fiveStone.putStone(5, 7, StoneType.WHITE);
	}
	
	@Test
	// OOOOOOOOO
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test13() throws Exception	{
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
	}
	
	@Test
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	// O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test14() throws Exception	{
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
		fiveStone.putStone(7, 1, StoneType.WHITE);
		fiveStone.putStone(12, 4, StoneType.BLACK);
		fiveStone.putStone(7, 5, StoneType.WHITE);
	}
	
	@Test
	// O
	//  O
	//   O
	//    O
	//     O
	//      O
	//       O
	//        O
	//         O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test15() throws Exception	{
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
		fiveStone.putStone(15, 3, StoneType.WHITE);
		fiveStone.putStone(12, 4, StoneType.BLACK);
		fiveStone.putStone(11, 7, StoneType.WHITE);
	}
	
	@Test
	//         O
	//        O
	//       O
	//      O
	//     O
	//    O
	//   O
	//  O
	// O
	//
	// �� ������ ������ ������ ��
	// SixStonePlaceException�� �߻� �� �ϴ��� Ȯ��
	// ���: ���� ����
	public void WhiteStoneCanMakeAllowedSixStone_Test16() throws Exception	{
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
	}
}
