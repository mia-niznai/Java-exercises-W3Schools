package org.example;

import java.util.List;

public class InsertionSort implements SortingInterface {
    @Override
    public List<Integer> sort(List<Integer> list) {
        for(int i=1; i<list.size(); i++){

            if(list.get(i) < list.get(i-1)){
                for(int j=0; j< i; j++){
                    if(list.get(i) < list.get(j)) {
                        int temp = list.get(i);
                        list.remove(i);
                        list.add(j, temp);
                    }
                }
            }
        }
        return list;
    }
}
