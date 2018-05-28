package java8.lambdas;

/**
 * Created by joyghosh on 27/05/18.
 */
public class LambdaMainApp {
    public static void main(String[] args){
//        lambdaTutorial1();
//        functionalInterfaceWithDefaultAndStatic();
        extendsFunctionalInterface();
    }

    /**
     * Functional interface.
     */
    public static void lambdaTutorial1(){
        MyFuncInterface mfi;
        mfi = () -> 123454.889;
        System.out.println(mfi.getValue());
    }

    public static void functionalInterfaceWithDefaultAndStatic(){
        FunctionalInterface2 f = (s) -> System.out.println("Hello! "+s);
        f.printValue("Thomas Watson");
        f.printDefault("Watson says Hi!");
        FunctionalInterface2.printStatic("Tom Cruise says Hello!");
    }

    public static void extendsFunctionalInterface(){

        FunctionalInterface3 f = (s) -> System.out.println("Hello! "+s);
        f.printValue("Gill");
        f.printDefault("Gill says Hello!");
        FunctionalInterface3.printStatic("Gill says Hi!");
    }
}
