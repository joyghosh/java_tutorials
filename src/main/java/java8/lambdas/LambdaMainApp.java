package java8.lambdas;

/**
 * Created by joyghosh on 27/05/18.
 */
public class LambdaMainApp {
    public static void main(String[] args){
        lambdaTutorial1();
    }

    /**
     * Functional interface.
     */
    public static void lambdaTutorial1(){
        MyFuncInterface mfi;
        mfi = () -> 123454.889;
        System.out.println(mfi.getValue());
    }
}
