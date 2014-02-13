package code.up.hello.world.animals.carnivore;

import code.up.hello.world.animals.Animal;
import code.up.hello.world.animals.Order;

/**
 *
 * @author Peter C
 */
public abstract class Carnivore extends Animal {

    public Carnivore() {
        super();
        this.carnivorous = true;
        this.order = Order.CARNIVORA;
    }
}
