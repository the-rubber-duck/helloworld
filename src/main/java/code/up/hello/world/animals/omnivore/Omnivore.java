package code.up.hello.world.animals.omnivore;

import code.up.hello.world.animals.Animal;

/**
 *
 * @author Peter C
 */
public abstract class Omnivore extends Animal {

    public Omnivore() {
        super();
        this.carnivorous = true;
        this.vegetarian = true;
    }
}
