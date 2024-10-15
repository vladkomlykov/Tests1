package org.example.second_test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFrequencyCounter {

    public Map<Integer, Integer> countFrequencies(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        return frequencyMap;
    }

}
