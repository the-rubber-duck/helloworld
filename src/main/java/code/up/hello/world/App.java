package code.up.hello.world;

import code.up.hello.world.entertainment.Entertainment;
import code.up.hello.world.entertainment.Genre;
import code.up.hello.world.entertainment.Movies;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Entertainment titanic = new Movies(184, Genre.ROMANCE, "Titanic");
        // titanic.setCinemaRelease("11th November 1999");
        movieData(titanic);
        
        Movies lionKing = new Movies(90, Genre.DOCUMENTARY, "Lion King");
        movieData(lionKing);
    }
    
    public static void movieData(Entertainment film){
        System.out.println("Entertainment!!!!");
        System.out.println("Name: " + film.getName());
        System.out.println("Length: " + film.getLength());
        System.out.println("Genre: " + film.getGenre());
        //System.out.println("Cinema Release Date: " + film.getCinemaRelease());
        
    }
    
    public static int multiply(int x, int y){
        return x * y;
    }
    
    public static int square(int x){
        return x * x;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }
}
