package day63_functional_interface;

@FunctionalInterface
public interface DynamicInterface <T> { // capital T is generic type, lowercase t is parameter name;

    void test(T t);



}
