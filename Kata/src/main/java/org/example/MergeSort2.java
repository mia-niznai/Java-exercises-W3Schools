package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort2 implements SortingInterface {

    @Override
    public List<Integer> sort(List<Integer> list) {
        divide(list,0, list.size()-1);
        return list;
    }


    public void divide(List<Integer> list, int startIndex, int endIndex){

        //Divide till you breakdown your list to single element
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(list, startIndex, mid);
            divide(list,mid+1, endIndex);

            //merging Sorted array produce above into one sorted array
            merger(list, startIndex,mid,endIndex);
        }
    }

    public void merger(List<Integer> list, int startIndex,int midIndex,int endIndex){


        ArrayList<Integer> mergedSortedArray = new ArrayList<Integer>();

        int leftIndex = startIndex;
        int rightIndex = midIndex+1;

        while(leftIndex<=midIndex && rightIndex<=endIndex){
            if(list.get(leftIndex)<=list.get(rightIndex)){
                mergedSortedArray.add(list.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(list.get(rightIndex));
                rightIndex++;
            }
        }

        //Either of below while loop will execute
        while(leftIndex<=midIndex){
            mergedSortedArray.add(list.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex<=endIndex){
            mergedSortedArray.add(list.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = startIndex;
        //Setting sorted array to original one
        while(i<mergedSortedArray.size()){
            list.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }


}