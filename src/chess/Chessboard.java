package chess;

import java.util.Arrays;

public class Chessboard {
	private Tile[][] board;
	private Piece[] whitePieces;
	private Piece[] blackPieces;
	private Boolean blacksTurn;
	
	public Chessboard() {
		whitePieces = createPieces("WHITE");
		blackPieces = createPieces("BLACK");
		board = createBoard(whitePieces, blackPieces);
	}
	
	/**
	 * Overriding of toString() method.
	 * @return Board objects as a string.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board: ");
		
		for (Tile[] arr : board) {
			builder.append(Arrays.toString(arr));
			builder.append("\n");
		}
		
		String builtString = builder.toString();
		return builtString;
	}
	
	/**
	 * Creates a players chess pieces, returning them as a Piece array.
	 * @param colour
	 * @return pieces
	 */
	private Piece[] createPieces(String colour) {
		// Declare pieces array
		Piece[] pieces = new Piece[16];
		
		// Create 8 pawns and append to pieces
		for (int i = 0; i < 8; i++) {
			pieces[i] = new Piece("Pawn", colour);
		}
		
		return pieces;
	}
	
	/**
	 * Creates the chessboard, including Tile objects and stores them in a
	 * 2-dimensional Tile array. This array is returned.
	 * @param whitePieces
	 * @param blackPieces
	 * @return tileStore
	 */
	private Tile[][] createBoard(Piece[] whitePieces, Piece[]blackPieces) {
		Tile[][] tileStore = new Tile[8][8]; // creates 8 rows and columns to store tile instances
		int coordBuffer[] = new int[2];
		
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				coordBuffer[0] = x;
				coordBuffer[1] = y;
				
				tileStore[x][y] = new Tile(false, coordBuffer, null);
			}
		}
		
		return tileStore;
	}
	
	/**
	 * Returns a String built with StringBuilder containing:
	 * 	White: pieces....
	 * 	Black: pieces....
	 * @return piecesString
	 */
	public String getPieces() {
		StringBuilder builder = new StringBuilder();
		builder.append("White: ");
		builder.append(Arrays.toString(this.whitePieces));
		builder.append("\n");
		builder.append("Black: ");
		builder.append(Arrays.deepToString(this.blackPieces));
		
		String piecesString = builder.toString();
		return piecesString;
	}
}
