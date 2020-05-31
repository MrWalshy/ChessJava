package chess;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece newPiece = new Piece("Rook", "black");
		System.out.println("Name: " + newPiece.getName() + ", Colour: " + newPiece.getColour());
		
		int[] coordBuffer = {0, 0};
		Tile t0 = new Tile("white", coordBuffer);
		System.out.println("Tile 0 Coords: " + Arrays.toString(t0.getCoords()));
		
		Chessboard chess = new Chessboard();
		System.out.println(chess.getPieces());
		System.out.println(chess.toString());
	}

}
