package code.up.hello.world.entertainment;

/**
 *
 * @author Peter C
 */
public class Movies extends Entertainment {
   
    private String cinemaRelease;
    
    public Movies(int length, Genre genre, String name){
        super(length, genre, name);
    }
    
    public String getCinemaRelease() {
        return cinemaRelease;
    }
    
    public void setCinemaRelease(String cinemaRelease){
        this.cinemaRelease = cinemaRelease;
    }
}
