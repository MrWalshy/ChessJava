/**
 * 
 */
package chess;

/**
 * @author morgan
 *
 */
// Abstract classes can not be instantiated
public abstract class Piece {
	public String name;
	public String colour; // white or black
	
	/**
	 * Constructor for Piece class
	 * @param name String
	 * @param colour String BLACK/WHITE
	 */
	public Piece(String name, String colour) {
		this.name = name.toLowerCase();
		this.colour = colour.toLowerCase();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColour() {
		return this.colour;
	}
}
