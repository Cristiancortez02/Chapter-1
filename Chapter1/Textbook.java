package Chapter1;
import java.util.*;
/**
 * Class:Bike
 * Date: 09/13/2022
 * Author: Cristian Cortez
 * Course: ITEC 2150 section 03
 * Instructions: Create a Textbook program that display three attributes of your choice.
 */
public class Textbook {
    private String title;
    private String author;
    private int numOfPages;

    //no-argue constructor
    public Textbook(){
        title = "Physics";
        author = "Cristian Cortez";
        numOfPages = 356;
    }
    //constructor
    public Textbook(String title, String author, int numOfPages){
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }
    //setters and getters for each variable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    //toString method
    public String toString(){
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "Number Of Pages: " + numOfPages + "\n";
    }
}
