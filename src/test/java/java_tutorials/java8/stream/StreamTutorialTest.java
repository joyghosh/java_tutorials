package java_tutorials.java8.stream;

import java8.stream.StreamTutorial;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 *
 */
public class StreamTutorialTest {

    @Test
    public void testStreamFilter(){

        String[] input = {"Jack", "Daniels", "", "Will", "", "Smith"};
        List<String> result = StreamTutorial.filterStream(input);

        Assert.assertFalse(result.contains(""));
    }
}
