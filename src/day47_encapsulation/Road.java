package day47_encapsulation;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("grey");
//        System.out.println(light.color);

//        light.color = "pink";

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColor());

        light2.setColor("green");
        System.out.println(light2.getColor());

        light2.setColor("grey"); //switch preventing from changing the color to grey
        System.out.println(light2.getColor());

        TrafficLight light3 = new TrafficLight("Black");
        System.out.println(light3.getColor());
    }
}
