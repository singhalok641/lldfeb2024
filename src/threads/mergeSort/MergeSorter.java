package threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService){
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        // implement our logic
        // Base condition
        if(arrayToSort.size() <= 1) return arrayToSort;

        // Main logic
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0; i < mid ;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

//        ExecutorService executorService = Executors.newCachedThreadPool();

        // Left part of array sorted by T1
        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);

        // Right part of array sorted by T2
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);


        // You keep waiting here until the future is filled with your exact data
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        // Merge the two sorted arrays
        List<Integer> sortedArray = new ArrayList<>();

        int i=0, j = 0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        // Pick the remaining elements
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
