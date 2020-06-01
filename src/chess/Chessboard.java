package chess;

import java.util.Arrays;

import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Chessboard {
	private Tile[][] board;
	private Piece[] whitePieces;
	private Piece[] blackPieces;
	private Boolean blacksTurn;
	
	public Chessboard() {
		whitePieces = createPieces("WHITE");
		blackPieces = createPieces("BLACK");
		board = createBoard(whitePieces, blackPieces);
		whoGoesFirst();
		
		if (blacksTurn) {
			System.out.println("Black goes first");
		}
		else {
			System.out.println("White goes first");
		}
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
			pieces[i] = new Pawn("Pawn", colour);
		}
		
		pieces[8] = new Rook("Rook", colour);
		pieces[9] = new Knight("Knight", colour);
		pieces[10] = new Bishop("Bishop", colour);
		pieces[11] = new Queen("Queen", colour);
		pieces[12] = new King("King", colour);
		pieces[13] = new Bishop("Bishop", colour);
		pieces[14] = new Knight("Knight", colour);
		pieces[15] = new Rook("Rook", colour);
		
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
		
		// 2d array iterator + tile generator
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
	
	public Boolean whoGoesFirst() {
		// Get random num in range 0 to 1
		double randNum = Math.random();
		// If num is above 0.5, it is blacks first else white first
		if (randNum > 0.5) {
			this.blacksTurn = true;
		}
		else {
			this.blacksTurn = false;
		}
		return this.blacksTurn;
	}
}
