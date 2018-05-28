package java8.lambdas;

/**
 * Functional interface with default and static methods.
 */
public interface FunctionalInterface2 {

    //Single Abstract method.
    void printValue(String message);

    //default method.
    default void printDefault(String text){
        System.out.println("[FI2]: default "+text);
    }

    //static method.
    static void printStatic(String text){
        System.out.println("[FI2]: static "+text);
    }
}
