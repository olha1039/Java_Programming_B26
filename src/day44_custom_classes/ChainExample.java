package day44_custom_classes;

public class ChainExample {

    public ChainExample(){ // no parameter here, so it will be printed each time under TestChainExample
        System.out.println("First");
    }

    public ChainExample(int i ){ // parameter int
        this(); // calls parameter int and will print no parameter
        System.out.println("Second");
    }
    public ChainExample(String s){ // parameter String
        this(); // calls parameter String and will print no parameter
        System.out.println("Third");
    }

    public ChainExample(double d){
        this(0); // calls parameter int and parameter double line 18 and first one
        System.out.println("Fourth");
    }
}
