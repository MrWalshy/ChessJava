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
