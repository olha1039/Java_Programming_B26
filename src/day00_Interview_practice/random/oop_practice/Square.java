package day00_Interview_practice.random.oop_practice;

public class Square {

/*
create a class called Square
- data:
side
- constructor
- create a constructor that creates a Square object with the
side
call setter here
- encapsulate the Square class
- setter condition: side must be a positive number
otherwise it will not be assigned to the instance variable
- other methods methods:
- calculateArea()
calculate and return the area of a
Square
- calculatePerimeter()
calculate and return the perimeter
of a Square
- toString()
print the side, area, and perimeter of the Square object
Create a separate class to create and test the Square objects
 */

   private double side;

    public Square(double side){
        this.side = side;
    }

    public void setSide(double side) {
        if(side > 0){
        this.side = side;
    }}

    public double calculateArea(){
       return side * side;
    }
    public double calculatePerimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Side of Square: " + side + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter();
    }
}
