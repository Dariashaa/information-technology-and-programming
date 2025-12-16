package Lab7;

import java.util.*;
import java.util.concurrent.*;

public class Lab7Task2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int lines = 3;
        int columns = 3;
        Random random = new Random();

        int[][] matrix = new int[lines][columns];
        for (int i = 0; i<lines; i++){
            for (int j = 0; j<columns;j++){
                matrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        ExecutorService  matrixExecutor = Executors.newFixedThreadPool(lines);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i<lines;i++){
            final int rowIndex = i;

            Callable<Integer> task = () -> {
                int[] row = matrix[rowIndex];
                int maxInRow = row[0];
                for (int element : row) {
                    if (element > maxInRow) {
                        maxInRow = element;
                    }
                }
                return maxInRow;
            };

        futures.add(matrixExecutor.submit(task));
        }
        
        int globalMax = 0;
        for (Future<Integer> future: futures){
            int maxLine = future.get(); 
            if (maxLine>globalMax){
                globalMax = maxLine;
            }
        }
        
        matrixExecutor.shutdown();
        System.out.println(globalMax);
    }   
}
