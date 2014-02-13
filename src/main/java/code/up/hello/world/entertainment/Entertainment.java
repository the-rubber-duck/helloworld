package code.up.hello.world.entertainment;

/**
 *
 * @author Peter C
 */
public class Entertainment {
    private int length;
    private Genre genre;
    private String name;
    
    public Entertainment(int length, Genre genre, String name){
        this.length = length;
        this.genre = genre;
        this.name = name;
     
    }

    public int getLength() {
        return length;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }
}
