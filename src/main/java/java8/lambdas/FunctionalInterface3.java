package java8.lambdas;

/**
 * Functional interface extends another Functional interface.
 */
public interface FunctionalInterface3
        extends FunctionalInterface2 {

    /**
     * Overriden single abstract method.
     * @param text
     */
    @Override
    void printValue(String text);

    /**
     * Overriden default method.
     * @param text
     */
    @Override
    default void printDefault(String text) {
        System.out.println("[FI3] default: "+text);
    }

    /**
     * static method.
     * @param text
     */
    static void printStatic(String text){
        System.out.println("[FI3] static: "+text);
    }
}
