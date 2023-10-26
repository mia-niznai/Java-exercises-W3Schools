package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List <SortingInterface> sorters = Arrays.asList(new BubbleSort(), new SelectionSort(), new InsertionSort(), new MergeSort2());
        List<Integer> elements = generateList(10000);

        for(SortingInterface sorter : sorters){
            long t1 = System.currentTimeMillis();
         //  System.out.println(sorter.sort(cloneList(elements)));
            sorter.sort(cloneList(elements));
            long t2 = System.currentTimeMillis();
            System.out.println(sorter.getClass().getSimpleName() + " " + String.valueOf(t2-t1));
        }

    }

    public static List<Integer> cloneList(List<Integer> list) {
        List<Integer> clonedList = new ArrayList<Integer>(list.size());
        clonedList.addAll(list);
        return clonedList;
    }

    public static List<Integer> generateList(int count){
        Random random = new Random();
        List<Integer> listOfElements = new ArrayList<>();

        while(listOfElements.size() < count){
            listOfElements.add(random.nextInt());
        }
    return listOfElements;

    }

//    public static List<Integer> sort(List<Integer> list) {
//
//        List<Integer> sorted = new ArrayList<>();
//
//        while(!list.isEmpty()){
//            Integer minimum = Collections.min(list);
//            sorted.add(minimum);
//            list.remove(minimum);
//        }
//
//        return sorted;
//
//    }

//    public static List<Integer> sort(List<Integer> list){
//
//        for(int i=1; i<list.size(); i++){
//
//           if(list.get(i) < list.get(i-1)){
//               for(int j=0; j< i; j++){
//                  if(list.get(i) < list.get(j)) {
//                      int temp = list.get(i);
//                      list.remove(i);
//                      list.add(j, temp);
//                  }
//               }
//
//
//
//           }
//        }
//
//        return list;
//    }



}