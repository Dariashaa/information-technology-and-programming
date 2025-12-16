package Lab7;

import java.util.*;
import java.util.concurrent.*;

public class Lab7Task1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException{
        int[] array = new int[100];
        for (var i =0;i < array.length; i++){
            array[i] = i+1;
        }

        int numbOfThreads = 4;

        ExecutorService fixedPool = Executors.newFixedThreadPool(numbOfThreads);
        int partSize = array.length/numbOfThreads;
        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 0; i<numbOfThreads; i++){
            int start = i*partSize;
            int end = Math.min(start + partSize, array.length);

            Callable<Integer> task = () ->{
                int sum = 0;
                for (int j = start; j<end;j++){
                    sum+=array[j];
                }
                return sum;
            };
           results.add(fixedPool.submit(task));
        }

        int allSum = 0;
        for(Future<Integer> future : results){
            allSum+=future.get();
        }

        fixedPool.shutdown();
        System.out.println("Сумма элементов массива: " + allSum);
    }
}
