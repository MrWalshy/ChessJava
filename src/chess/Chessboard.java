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
	
	private Piece[] createPieces(String colour) {
		// Declare pieces array
		Piece[] pieces = new Piece[16];
		
		// Create 8 pawns and append to pieces
		for (int i = 0; i < 8; i++) {
			pieces[i] = new Piece("Pawn", colour);
		}
		
		return pieces;
	}
	
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
