package fs;
import fs.excep.DuplicatePlaceException;
import fs.excep.FourFourPlaceException;
import fs.excep.GeneralFiveStoneException;
import fs.excep.InvalidTurnException;
import fs.excep.NoMoreGameException;
import fs.excep.OutOfBoundPositionException;
import fs.excep.SixStonePlaceException;
import fs.excep.ThreeThreePlaceException;
import fs.type.CellState;
import fs.type.StoneType;

public interface FiveStone {
	public void putStone(int x, int y, StoneType stone)
			throws DuplicatePlaceException, OutOfBoundPositionException,
			NoMoreGameException, ThreeThreePlaceException,
			FourFourPlaceException, SixStonePlaceException,
			InvalidTurnException, GeneralFiveStoneException;

	public CellState getState(int x, int y) throws GeneralFiveStoneException;

	public String getCurrentBoard() throws GeneralFiveStoneException;

	public boolean isGameOver() throws GeneralFiveStoneException;
}
