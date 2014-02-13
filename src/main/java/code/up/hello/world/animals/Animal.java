package code.up.hello.world.animals;

/**
 *
 * @author Peter C
 */
public abstract class Animal {
    protected Kingdom kingdom = Kingdom.ANIMALIA;
    protected Classification classification;
    protected Order order;
    protected String family, genus, species, scientificName, commonName;
    protected boolean carnivorous, vegetarian;
    protected int legs, arms, heads, eyes, ears;

    public Kingdom getKingdom() {
        return kingdom;
    }

    public Classification getClassification() {
        return classification;
    }

    public Order getOrder() {
        return order;
    }

    public String getFamily() {
        return family;
    }

    public String getGenus() {
        return genus;
    }

    public String getSpecies() {
        return species;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getLegs() {
        return legs;
    }

    public int getArms() {
        return arms;
    }

    public int getHeads() {
        return heads;
    }

    public int getEyes() {
        return eyes;
    }

    public int getEars() {
        return ears;
    }
    
    
}
