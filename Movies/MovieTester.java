package Movies;

/**
 * this program wil include at least three movie objects
 * based on each constructor you will create.
 * test getters and setters
 * display all information of three movies nicely
 */
public class MovieTester {
    public static void main(String[] args) {
        Movies IronMan = new Movies("IronMan", 2008, "Jon Favreau", "Robert Downey Jr.");
        System.out.println(IronMan);
        Movies JohnWick = new Movies("John Wick", 2014, "Chad Stahelski", "Keanu Reeves");
        System.out.println(JohnWick);
        Movies Goal = new Movies("Goal!", 2005, "Danny Cannon", "Kuno Becker");
        System.out.println(Goal);
    }
}
