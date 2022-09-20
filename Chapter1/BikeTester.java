package Chapter1;
import  java.util.*;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1);
        Bike bike2 = new Bike();
        bike2.setNumOfWheels(3);
        bike2.setMake("Cortez");
        bike2.setYearMade(2023);
        System.out.println(bike2);
        //arraylist for bikes
        //int totalNumOfWheels;
        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(bike1);
        bikes.add(bike2);
        System.out.println(bikes);


    }
}
