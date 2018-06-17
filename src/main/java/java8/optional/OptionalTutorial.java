package java8.optional;

import java.util.Optional;

/**
 * Created by joyghosh on 15/06/18.
 */
public class OptionalTutorial {

    public static void main(String[] args){
        optionalUsage();
    }

    public static void optionalUsage(){
        Optional<String> name = Optional.of("Mary Jane");
        System.out.println(name.get());
    }
}
