package Chapter1;

/**
 * Class:Person
 * Date: 09/13/2022
 * Author: Cristian Cortez
 * Course: ITEC 2150 section 03
 * Instructions: Create a program that display a persons name, age, and eye color
 * using a no argument constructor.
 */
public class Person {
     private String name;
     private int age;
     private String eyeColor;

     //no-argue constructor
     public Person(){
    name = "Bob";
    age = 25;
    eyeColor = "Blue";
}
//parameter constructor
public Person(String name, int age, String eyeColor){
    this.name = name;
    this.age = age;
    this.eyeColor = eyeColor;
}
//setters and getters
    public String getName() {

         return name;
    }

    public void setName(String name) {

         this.name = name;
    }

    public int getAge() {

         return age;
    }

    public void setAge(int age) {

         this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //toString method
    public String toString(){

         return "Name: " + name + "\n" + "Age: " + age + "\n" + "Eye Color: " + eyeColor + "\n";
    }
}
