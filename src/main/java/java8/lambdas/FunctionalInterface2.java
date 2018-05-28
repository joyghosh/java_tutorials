package java8.lambdas;

public interface FunctionalInterface2 {
    void printValue(String message);

    default void printDefault(String text){
        System.out.println("Inside default method: "+text);
    }

    static void printStatic(String text){
        System.out.println("Inside static method: "+text);
    }
}
