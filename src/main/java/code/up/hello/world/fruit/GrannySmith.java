package code.up.hello.world.fruit;

/**
 *
 * @author Peter C
 */
public class GrannySmith extends Apple {
    private boolean sour;

    public GrannySmith() {
        super("Green", 9, true);
    }

    public boolean isSour() {
        return sour;
    }
}
