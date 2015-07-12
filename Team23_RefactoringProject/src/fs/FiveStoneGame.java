package fs;

import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.gameinfo.GameBoardInfo;
import fs.gameinfo.TurnInfo;
import fs.rule.*;
import fs.type.CellState;
import fs.type.GameBoard;
import fs.type.Point;
import fs.type.StoneType;

public class FiveStoneGame implements FiveStone, GameBoardInfo, TurnInfo {
	private GameBoard board = new GameBoard();
	//private CellState board[][] = new CellState[15][15];
	private StoneType currentTurnPlayer = StoneType.BLACK;
	private boolean isOver = false;
	private boolean firstTurn = false;
	private boolean secondTurn = false;
	private boolean thirdTurn = false;
	private int turnCount = 1;
	private boolean drawGame = false;
	private FiveStoneRule gameRule = new RenjuRule(this);
	private FiveStoneRule StartRule;
	private FiveStoneRule EndRule;
	private FiveStoneRule IlegalRule;


	public FiveStoneGame() {
		this.gameStart();
	}
	private void setRule(){
		//TODO 나중에 지울것
		StartRule = new RenjuStartRule(this);
		EndRule = new RenjuEndRule(this);
		IlegalRule = new RenjuIlegalRule(this);
	}
	public void gameStart() {
		this.initboard();
		setCurrentTurnPlayer(StoneType.BLACK);
		this.isOver = false;
		this.firstTurn = true;
		setRule();
	}

	//GameBoardInfo
	@Override
	public int getMaxX() {
		return board.getMaxX();
	}

	@Override
	public int getMinX() {
		return board.getMinX();
	}

	@Override
	public int getMaxY() {
		return board.getMaxY();
	}

	@Override
	public int getMinY() {
		return board.getMinY();
	}
	
	@Override
	public CellState getCellState(int x, int y)
			throws OutOfBoundPositionException {
		return board.getCell(x, y);
	}
	
	@Override
	public CellState getCellState(Point point)
			throws OutOfBoundPositionException {
		return getCellState(point.getX(), point.getY());
	}

	@Override
	public boolean isInBound(int x, int y) {
		return isXInBound(x)&&isYInBound(y);
	}
	
	@Override
	public boolean isInBound(Point point) {
		return isInBound(point.getX(), point.getY());
	}
	
	@Override
	public boolean isXInBound(int x) {
		return x <= getMaxX() && x >= getMinX();
	}
	@Override
	public boolean isYInBound(int y) {
		return y <= getMaxY() && y >= getMinY();
	}

	//TurnInfo
	@Override
	public StoneType whosTurn() {
		return getCurrentTurnPlayer();
	}
	
	@Override
	public int getTurnCount() {
		return this.turnCount;
	}
	

	/**
	 * @param stoneType 이번 차례가 될 플레이어의 돌
	 */
	private void setCurrentTurnPlayer(StoneType stoneType) {
		this.currentTurnPlayer = stoneType;
	}
	
	/**
	 * @return 현재 차례인 플레이어의 돌
	 */
	private StoneType getCurrentTurnPlayer() {
		return this.currentTurnPlayer;
	}

	/**
	 * @param turnCount 새로 적용될 턴 수의 값
	 */
	private void setTurnCount(int turnCount) {
		this.turnCount = turnCount;
	}
	
	/**
	 * 턴 수를 1 증가시킨다.
	 */
	private void increaseTurnCount() {
		setTurnCount(getTurnCount()+1);
	}
	
	
	private void initboard() {// 오목판 초기화
		try {
			board.initBoard(gameRule.getBoardSizeX(), gameRule.getBoardSizeY());
		} catch (OutOfBoundPositionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void checkValid(int x, int y, StoneType stone) 
			   throws GeneralFiveStoneException, NoMoreGameException, 
			   OutOfBoundPositionException, InvalidTurnException, 
			   DuplicatePlaceException{
			  if (stone == null) throw new GeneralFiveStoneException("착수할 돌이 결정되지 않음!!");
			  
			  if (!isInBound(x, y))
			   throw new OutOfBoundPositionException(x, y);
			  
			  if (isOver) throw new NoMoreGameException();
			  

			  if (stone != getCurrentTurnPlayer()) throw new InvalidTurnException(x, y, stone);
			  
			  if (getState(x, y) != CellState.EMPTY) {
			   throw new DuplicatePlaceException(x, y);
			  }

			  
			 }
	/**
	 * 
	 * @param 돌을 놓을 좌표 x값
	 * @param 돌을 놓을 좌표 y값
	 * @param 돌의 종류
	 * 
	 */
	private void changeTurn(StoneType stonetype) throws OutOfBoundPositionException{
		if (stonetype == StoneType.BLACK) {
			setCurrentTurnPlayer(StoneType.WHITE);
			if (firstTurn)	{
				firstTurn = false;
				secondTurn = true;
			}

			if (thirdTurn) 
				thirdTurn = false;
		} else {
			setCurrentTurnPlayer(StoneType.BLACK);
			if (secondTurn)	{
				secondTurn = false;
				thirdTurn = true;
			}
		}
	}
	private boolean isTurnFull(){
		return getTurnCount()==225;
	}
	public void putStone(int xx, int yy, StoneType stone) 
			throws DuplicatePlaceException, OutOfBoundPositionException,
			NoMoreGameException, ThreeThreePlaceException,
			FourFourPlaceException, SixStonePlaceException,
			InvalidTurnException, GeneralFiveStoneException {
		checkValid(xx,yy,stone);
		//StartRule.checkRule(xx, yy, stone);
		gameRule.checkRuleBeforePutStone(xx, yy, stone);
		
		int x=xx-1;
		int y=yy-1;
		if(stone==StoneType.BLACK){
			board.setCell(xx, yy,CellState.BLACK);
		}
		else{
			board.setCell(xx, yy, CellState.WHITE);
		}
		changeTurn(stone);
		
		if (EndRule.checkRule(x, y, stone)) {
			isOver = true;
		} else {
			if (isTurnFull())	{
				isOver = true;
				drawGame = true;
			}
			increaseTurnCount();
		}
		
		if(!isOver){
			IlegalRule.checkRule(x, y, stone);
		}


	}

	public CellState getState(int x, int y) throws GeneralFiveStoneException {
		CellState cellState = null;
		try {
			cellState = board.getCell(x, y);
		} catch (OutOfBoundPositionException e) {
			throw new GeneralFiveStoneException(e.toString());
		}
		return cellState;
	}

	public String getCurrentBoard() throws GeneralFiveStoneException {
		StringBuffer curBoard = new StringBuffer("");

		// String curBoard="";	//여기 for문안 수정딤	
		for (int i = 15; i >= 1; i--)	{

			for (int j = 1; j < 16; j++)	{
				curBoard.append(getState(j,i).toString());
			}
			curBoard.append("\n");
		}
		// System.out.println(curBoard);


		return curBoard.toString();
	}

	public boolean isGameOver() throws GeneralFiveStoneException {
		return isOver;
	}



}



