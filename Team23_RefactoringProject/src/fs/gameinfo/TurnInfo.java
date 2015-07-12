package fs.gameinfo;

import fs.type.StoneType;

/**
 * ������ ���� ������ ������ �����ϴ� �������̽�
 */
public interface TurnInfo extends FiveStoneGameInfo {
	/**
	 * @return ���� ���° �������� ��ȯ, 1���� �����Ѵ�.
	 */
	public int getTurnCount();
	
	/**
	 * @return ���� ������ ���������� ��ȯ
	 */
	public StoneType whosTurn();
}
