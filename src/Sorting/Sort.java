package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    private static final List<Long> testList = Arrays.asList(new Long(10), new Long(0),new Long(15), new Long(56), new Long(99), new Long(4), new Long(13), new Long(66), new Long(77));

    public static List<Long> bubbleSort (List<Long> list){
//        System.out.println("result list size:" + resultList.size());
        for (int i = 0; i<list.size()-1; i++){
            for (int j = 0; j<list.size()-1 -i; j++){
                if (list.get(j) > list.get(j+1)){
//                    System.out.println("j: " + resultList.get(j).longValue());
//                    System.out.println("j+1: " + resultList.get(j+1).longValue());
                    Long temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<Long> selectionSort(List<Long> list){
        for (int i = 0; i < list.size()-1; i++){
            int least = i;
            for (int j =i+1 ; j<list.size(); j++){
                if (list.get(least) > list.get(j)){
                    least = j;
                }
            }
            Long temp = list.get(least);
            list.set(least, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

    public static List<Long> insertionSort(List<Long> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = i; j > 0; j--){
                if (list.get(j) < list.get(j-1)){
                    Long temp = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, temp);
                }
                else {
                    break;
                }
            }
        }
        return list;
    }

    public static List<Long> shellSort(List<Long> list){
        for (int k = list.size()/2; k > 0; k = k/2 ){

            for (int i=0; i<list.size(); i=i+1){

                for (int j = i; j >k; j=j+k){

                    if (list.get(j) < list.get(j-k)){
                        Long temp = list.get(j-k);
                        list.set(j-k, list.get(j));
                        list.set(j, temp);
                    }
                    else {
                        break;
                    }
                }

            }
        }
        return list;
    }

    public static List<Long> fastSort(List<Long> list){return list;}

    public static void main(String[] args) {
        List<Long> sortedList = bubbleSort(testList);
        System.out.println("bubble sort:" + Arrays.toString(sortedList.toArray()));

        Collections.shuffle(sortedList);
        System.out.println("shuffled list:" + Arrays.toString(sortedList.toArray()));

        selectionSort(sortedList);
        System.out.println("selection sort:" + Arrays.toString(sortedList.toArray()));

        Collections.shuffle(sortedList);
        System.out.println("shuffled list:" + Arrays.toString(sortedList.toArray()));

        insertionSort(sortedList);
        System.out.println("insertion sort:" + Arrays.toString(sortedList.toArray()));

        Collections.shuffle(sortedList);
        System.out.println("shuffled list:" + Arrays.toString(sortedList.toArray()));

        shellSort(sortedList);
        System.out.println("shell sort:" + Arrays.toString(sortedList.toArray()));
    }
}
