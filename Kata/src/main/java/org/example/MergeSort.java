package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort implements SortingInterface{

    @Override
    public List<Integer> sort(List<Integer> list) {
        return null;
    }

    public static List<Integer> mergeSort(List<Integer> list){

        if (list.size() <= 1) {
            return list;
        }

        List<List<Integer>> divided = breakList(list);

        List <Integer> firstList = mergeSort(divided.get(0));
        List<Integer> secondList = mergeSort(divided.get(1));

        return merge(firstList, secondList);

    }

    public static int stillDividing(List<List<Integer>> listOfLists){
        for(int i = 0; i < listOfLists.size(); i++){
            if (listOfLists.get(i).size() > 1)
                return i;

        }
        return -1;
    }

    public static List<List<Integer>> breakList(List<Integer> list){
        int middle = list.size()/2;
        List<Integer> first = list.subList(0, middle+1);
        List<Integer> second = list.subList(middle+1, list.size());

//        while(stillDividing())

        return new ArrayList<>(Arrays.asList(first, second));
    }

    public static List<Integer> merge(List<Integer> listOne, List<Integer> listTwo){

        List<Integer> combinedList = new ArrayList<>();
//        int i = 0;
//        int j = 0;

        while(!listOne.isEmpty() && !listTwo.isEmpty()){
            if(listOne.getFirst() < listTwo.getFirst()){
                combinedList.add(listOne.getFirst());
                listOne.remove(0);

            } else {
                combinedList.add(listTwo.getFirst());
                listTwo.remove(0);
            }
            if(listOne.isEmpty()){
                combinedList.addAll(listTwo);
                listTwo.clear();
            }
            if(listTwo.isEmpty()){
                combinedList.addAll(listOne);
                listOne.clear();
            }
        }

//        while(i < listOne.size() && j < listTwo.size() ){
//            if(listOne.get(i) < listTwo.get(j)){
//                combinedList.add(listOne.get(i));
//                i++;
//            } else {
//                combinedList.add(listTwo.get(j));
//                j++;
//            }
//
//        }
//
//        while(i < listOne.size()){
//            combinedList.add(listOne.get(i));
//            i++;
//        }
//
//        while(j < listTwo.size()){
//            combinedList.add(listTwo.get(j));
//            j++;
//        }


        return combinedList;
    }


}
