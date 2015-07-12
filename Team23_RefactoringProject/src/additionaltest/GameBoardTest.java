package additionaltest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fs.excep.OutOfBoundPositionException;
import fs.type.CellState;
import fs.type.GameBoard;

public class GameBoardTest {
	private GameBoard gameBoard;
	@Before
	public void setUp() throws Exception {
		gameBoard = new GameBoard();
		gameBoard.initBoard(15, 15);
	}

	@Test
	public void testGameBoardBoundary() {
		assertEquals(gameBoard.getMinX(), 1);
		assertEquals(gameBoard.getMaxX(), 15);
		assertEquals(gameBoard.getMinY(), 1);
		assertEquals(gameBoard.getMaxY(), 15);
	}
	
	@Test
	public void testAfterInitState() {
		for(int i=gameBoard.getMinX(); i<gameBoard.getMaxX(); i++)
			for(int j=gameBoard.getMinY(); j<gameBoard.getMaxY(); j++)
				try {
					assertEquals(gameBoard.getCell(i,j), CellState.EMPTY);
				} catch (OutOfBoundPositionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
