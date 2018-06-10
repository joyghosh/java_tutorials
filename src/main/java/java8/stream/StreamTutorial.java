package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 */
public class StreamTutorial {

    public static void main(String[] args){
//        forEachUsage();
        mapUsage();
    }

    public static List<String> filterStream(String[] input){
        List<String> source = Arrays.asList(input);
        List<String> result = source.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        return  result;
    }

    public static void forEachUsage(){
        Random r = new Random();
        r.ints().limit(15).forEach(System.out::println);
    }

    public static void mapUsage(){
        List<Integer> source = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        System.out.println(source);

        List<Integer> squares = source.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squares);
    }
}
