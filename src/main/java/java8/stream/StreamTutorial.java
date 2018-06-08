package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class StreamTutorial {

    public static List<String> filterStream(String[] input){
        List<String> source = Arrays.asList(input);
        List<String> result = source.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        return  result;
    }

//    public static List<Integer> incrementBy10UsingForEach(List<Integer> input){
//        List<Integer> result = input.stream().forEach( );
//    }
}
