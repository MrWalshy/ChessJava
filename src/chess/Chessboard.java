package chess;

import java.util.Arrays;

public class Chessboard {
	private Tile[][] board;
	private Piece[] pieces;
	private Boolean blacksTurn;
	
	public Chessboard() {
		pieces = createPieces("WHITE");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board: ");
		builder.append(Arrays.toString(board));
		
		String builtString = builder.toString();
		return builtString;
	}
	
	private Piece[] createPieces(String colour) {
		// Declare pieces array
		Piece[] pieces = new Piece[16];
		
		// Create 8 pawns and append to pieces
		for (int i = 0; i < 8; i++) {
			pieces[i] = new Piece("Pawn", colour);
		}
		
		return pieces;
	}
	
	public String getPieces() {
		return Arrays.toString(this.pieces);
	}
}
