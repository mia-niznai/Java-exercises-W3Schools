package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort implements SortingInterface {
    @Override
    public List<Integer> sort(List<Integer> list) {
        List<Integer> sorted = new ArrayList<>();
        while (!list.isEmpty()) {
            Integer minimum = Collections.min(list);
            sorted.add(minimum);
            list.remove(minimum);

        }
        return sorted;
    }
}
