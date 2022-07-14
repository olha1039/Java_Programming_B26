package day44_custom_classes;

import com.sun.net.httpserver.Filter;

public class TestChainExample {
    public static void main(String[] args) {

        new ChainExample(10);
        System.out.println("=================");
        new ChainExample("hello");
        System.out.println("=================");
        new ChainExample(6.2);
    }
}
