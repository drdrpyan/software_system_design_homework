package fs.gameinfo;

import fs.type.StoneType;

/**
 * 게임의 차례 상태의 정보를 제공하는 인터페이스
 */
public interface TurnInfo extends FiveStoneGameInfo {
	/**
	 * @return 현재 몇번째 턴인지를 반환, 1부터 시작한다.
	 */
	public int getTurnCount();
	
	/**
	 * @return 현재 누구의 차례인지를 반환
	 */
	public StoneType whosTurn();
}
