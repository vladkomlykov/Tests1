package org.example.third_task;

import java.util.*;

public class StringSorted {

    public List<String> sortStringsAlphabetically(List<String> strings) {
        List<String> sortedArray = new ArrayList<>(strings);

        Collections.sort(sortedArray);

        return sortedArray;
    }

    public List<String> sortStringsByLength(List<String> strings) {
        ArrayList<String> sortedArray = new ArrayList<>(strings);

        for (int i = 0; i < sortedArray.size() - 1; i++) {
            for (int j = 0; j < sortedArray.size() - i - 1; j++) {
                if (sortedArray.get(j).length() > sortedArray.get(j + 1).length()) {
                    String swap = sortedArray.get(j);
                    sortedArray.set(j, sortedArray.get(j + 1));
                    sortedArray.set(j + 1, swap);
                }
            }
        }

        return sortedArray;
    }
}
