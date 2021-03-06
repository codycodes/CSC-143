import java.awt.Color;

public class BarShape extends AbstractPiece implements Piece {
	/**
	 * A Square-Shaped piece in the Tetris Game.
	 * 
	 * This piece is made up of 4 squares in the following configuration:
	 * 
	 *    
	 * Sq Sq Sq Sq <br>
	 * 
	 * The game piece "floats above" the Grid. The (row, col) coordinates are the
	 * location of the middle Square on the side within the Grid
	 * 
	 * @author CSC 143
	 */
	public BarShape(int r, int c, Grid g) {
		/**
		 * Creates an L-Shape piece. See class description for actual location of r
		 * and c
		 * 
		 * @param r
		 *            row location for this piece
		 * @param c
		 *            column location for this piece
		 * @param g
		 *            the grid for this game piece
		 * 
		 */
		super(g);

		// Create the squares
		square[0] = new Square(g, r - 1, c - 1, Color.CYAN, true);
		square[1] = new Square(g, r - 1, c, Color.CYAN, true);
		square[2] = new Square(g, r - 1, c + 1, Color.CYAN, true);
		square[3] = new Square(g, r - 1, c + 2, Color.CYAN, true);
	}
	

}
