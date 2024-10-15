import org.example.second_test.ElementFrequencyCounter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTwoTest {

    @Test
    void countAllUnique(){
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7);

        Map<Integer,Integer>expectedCountFrequency = Map.of(1,1,2,1,3,1,4,1,5,1,6,1,7,1);

        assertEquals(expectedCountFrequency, elementFrequencyCounter.countFrequencies(numbers));
    }

    @Test
    void countSomeUnique(){
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer>numbers = Arrays.asList(1,2,2,3,4,4,5);

        Map<Integer,Integer>expectedCountFrequency = Map.of(1,1,2,2,3,1,4,2,5,1);

        assertEquals(expectedCountFrequency, elementFrequencyCounter.countFrequencies(numbers));
    }

    @Test
    void countAllOne(){
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer>numbers = Arrays.asList(1,1,1,1,1,1,1);

        Map<Integer,Integer>expectedCountFrequency = Map.of(1,7);

        assertEquals(expectedCountFrequency, elementFrequencyCounter.countFrequencies(numbers));
    }

    @Test
    void countNegativeAllUnique(){
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer>numbers = Arrays.asList(-1,-2,-3,-4,-5,-6,-7);

        Map<Integer,Integer>expectedCountFrequency = Map.of(-1,1,-2,1,-3,1,-4,1,-5,1,-6,1,-7,1);

        assertEquals(expectedCountFrequency, elementFrequencyCounter.countFrequencies(numbers));
    }

    @Test
    void countNegativeSomeUnique(){
        ElementFrequencyCounter elementFrequencyCounter = new ElementFrequencyCounter();
        List<Integer>numbers = Arrays.asList(-1,-2,-2,-3,-4,-4,-5);

        Map<Integer,Integer>expectedCountFrequency = Map.of(-1,1,-2,2,-3,1,-4,2,-5,1);

        assertEquals(expectedCountFrequency, elementFrequencyCounter.countFrequencies(numbers));
    }
}
