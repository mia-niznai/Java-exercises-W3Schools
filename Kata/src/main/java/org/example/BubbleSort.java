package org.example;

import java.util.List;

public class BubbleSort implements SortingInterface{
    @Override
    public List<Integer> sort(List<Integer> list) {
        boolean switched = true;

        while (switched) {
            switched = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i,list.get(i + 1));
                    list.set(i + 1, temp);
                    switched = true;
                }
            }
        }
        return list;

    }
}
