package threads.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(7,3,1,6,4,2,5,8,10,9);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(list, executorService);

        Future<List<Integer>> sortedArrayFuture = executorService.submit(mergeSorter);

        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);


    }
}
