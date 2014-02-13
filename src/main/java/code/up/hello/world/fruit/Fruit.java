package code.up.hello.world.fruit;

/**
 *
 * @author Peter C
 */
public class Fruit {
    
    private final String colour;
    private final int size;
    private final boolean edible;
    
    private int mass = 100;
    
    public Fruit(String colour, int size, boolean edible) {
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
