/**
 * Class with 5 fields, that is used further in Lab3.
 */

public class Furniture {
	public String name;
	public int width;
	public int length;
	public int height;
	public String material;

	/**
	 * Creates Furniture object
	 *
	 * @param  name      name of given furniture piece
	 * @param  length    length, in millimeters, of given furniture piece
	 * @param  width     width, in mililmeters, of given furniture piece
	 * @param  height    height, in millimeters, of given furniture piece
	 * @param  material  material of which furniture is made
	 */
	public Furniture(String name, int width, int length, int height, String material) {
		this.name = name;
		this.width = width;
		this.length = length;
		this.height = height;
		this.material = material;
	}
	
	@Override
    public String toString() {
		return this.name + " (" + this.width + "(ш) x " + this.length + "(д) x " + this.height + "(в) мм | виготовлено з: " + this.material + ")";
	}
}