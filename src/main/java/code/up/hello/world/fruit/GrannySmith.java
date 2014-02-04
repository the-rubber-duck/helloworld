/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
