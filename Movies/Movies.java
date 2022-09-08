package Movies;

/**
 * class: Movies
 * date: september 08, 2022
 * instruction of program:
 * (1) attributes - title, release date, director, leading role
 * (2) constructors - no argument constructor which takes from constructor
 * with four parameters
 * (3) getters and setters
 * (4)
 */
public class Movies {
    private String title;
    private int releaseDate;
    private String director;
    private String leadingRole;

    public Movies(String title, int releaseDate, String director, String leadingRole){
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.leadingRole = leadingRole;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(){
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(){
        this.releaseDate = releaseDate;
    }

    public String getDirector(){
        return director;
    }
    public void setDirector(){
        this.director = director;
    }

    public String getLeadingRole(){
        return leadingRole;
    }

    public void setLeadingRole(){
        this.leadingRole = leadingRole;
    }

    public String toString(){
        return "Title: " + title  + "\n" + "Release Date: " + releaseDate  + "\n" + "Director: " + director  + "\n" +
                "Leading Role: " + leadingRole + "\n";
    }

}
