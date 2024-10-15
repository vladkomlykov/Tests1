import org.example.third_task.StringSorted;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskThreeTest {

    @Test
    void someStringsForSortingAlphabetRus(){
        StringSorted stringSorted = new StringSorted();
        List<String> strings = Arrays.asList("Владислав", "Родион", "Денис");

        List<String> expectedArray = new ArrayList<>(Arrays.asList("Владислав", "Денис", "Родион"));
        List<String> actualArray = stringSorted.sortStringsAlphabetically(strings);

        assertEquals(expectedArray,actualArray);

    }

    @Test
    void someStringsForSortingAlphabetEng(){
        StringSorted stringSorted = new StringSorted();
        List<String> strings = Arrays.asList("Vladislav", "Rodion", "Denis");

        List<String> expectedArray = new ArrayList<>(Arrays.asList("Denis", "Rodion", "Vladislav"));
        List<String> actualArray = stringSorted.sortStringsAlphabetically(strings);

        assertEquals(expectedArray,actualArray);

    }

    @Test
    void someStringsForSortingSize(){

        StringSorted stringSorted = new StringSorted();
        List<String> strings = Arrays.asList("Cat", "Chicken", "Jaguar");

        List<String> expectedArray = new ArrayList<>(Arrays.asList("Cat", "Jaguar", "Chicken"));
        List<String> actualArray = stringSorted.sortStringsByLength(strings);

        assertEquals(expectedArray,actualArray);
    }

    @Test
    void emptyStringForAlphabetSorting(){

        StringSorted stringSorted = new StringSorted();
        List<String> strings = Arrays.asList("");

        List<String> expectedArray = new ArrayList<>(Arrays.asList(""));
        List<String> actualArray = stringSorted.sortStringsAlphabetically(strings);

        assertEquals(expectedArray, actualArray);
    }

    @Test
    void emptyStringForSizeSorting(){

        StringSorted stringSorted = new StringSorted();
        List<String> strings = Arrays.asList("");

        List<String> expectedArray = new ArrayList<>(Arrays.asList(""));
        List<String> actualArray = stringSorted.sortStringsByLength(Arrays.asList(""));

        assertEquals(expectedArray, actualArray);
    }
}
