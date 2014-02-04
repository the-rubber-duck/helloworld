package code.up.hello.world.fruit;

/**
 *
 * @author Peter C
 */
public class Apple {
    private final String colour;
    private final int size;
    private int mass = 100;
    private boolean edible;

    public Apple(String colour, int size, boolean edible) {
        this.colour = colour;
        this.size = size;
        this.edible = edible;
    }
    
    public void bite(int amountToBite){
        this.mass = this.mass - amountToBite;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public int getMass() {
        return mass;
    }

    public boolean isEdible() {
        return edible;
    }
}
