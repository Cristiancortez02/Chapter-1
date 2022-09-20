package Chapter1;
import java.util.*;
/**
 * Class:Bike
 * Date: 09/13/2022
 * Author: Cristian Cortez
 * Course: ITEC 2150 section 03
 * Instructions: Create a Bike program that display the number of wheels, the manufacturer and
 * the year the bike is made.
 */
public class Bike {
    private int numOfWheels;
    private String make;
    private int yearMade;

    //no-argue constructor
    public Bike(){
        numOfWheels = 2;
        make = "Schwinn";
        yearMade = 2014;
    }
//constructor
    public Bike(int numOfWheels, String make, int yearMade){
        this.numOfWheels = numOfWheels;
        this.make = make;
        this.yearMade = yearMade;
    }
//getters and setters
    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }
//toString method
    public String toString(){
       return "Wheel(s): " + numOfWheels + "\n" + "Make: " + make + "\n" + "Year: " + yearMade + "\n";
    }
}
