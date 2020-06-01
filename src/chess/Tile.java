package chess;

/*
 * 64 Tile instances (32 White, 32 Black) on an 8x8 grid
 * Tile coords [row][column]
 */

public class Tile {
	private String colour; // white or black
	private boolean isOccupied;
	private int[] coordinates = new int[2];
	private Piece occupyingPiece = null;
	
	/**
	 * Constructor for Tile class.
	 * @param colour String
	 * @param isOccupied boolean
	 * @param coordinates int[]
	 */
	public Tile(String colour, int[] coordinates) {
		this.colour = colour;
		this.isOccupied = false;
		this.coordinates[0] = coordinates[0];
		this.coordinates[1] = coordinates[1];
	}
	
	/**
	 * Constructor for Tile class.
	 * @param colour String
	 * @param isOccupied boolean
	 * @param coordinates int[]
	 * @param piece Piece
	 */
	public Tile(boolean isOccupied, int[] coordinates, Piece piece) {
		this.colour = null;
		this.isOccupied = isOccupied;
		this.coordinates = coordinates;
		this.occupyingPiece = piece;
	}
	
	/**
	 * Sets the colour of the tile to black or white.
	 * @param colour String WHITE/BLACK
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	/**
	 * Sets the isOccupied instance variable to a boolean value.
	 * @param isOccupied boolean true/false
	 */
	public void setIsOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	/**
	 * Sets the occupyingPiece instance variable to reference the piece.
	 * When unoccupied, occupyingPiece is null.
	 * @param piece null/Piece
	 */
	public void setPiece(Piece piece) {
		this.occupyingPiece = piece;
	}
	
	public int[] getCoords() {
		// override .toString() otherwise weird output is returned
		return this.coordinates;
	}
	
	/**
	 * Returns a boolean indicating whether the current tile is occupied or not.
	 * @return boolean true/false
	 */
	public boolean getIsOccupied() {
		return this.isOccupied;
	}
	
	/**
	 * Tests if the current tile is occupied or not, then returns either the piece
	 * or null.
	 * @return null/Piece
	 */
	public Piece getOccupyingPiece() {
		/*
		 * Returns the Piece if the tile is occupied, else returns null
		 */
		if (this.isOccupied) {
			return this.occupyingPiece;
		}
		else {
			this.occupyingPiece = null;
			return this.occupyingPiece;
		}
	}
}
