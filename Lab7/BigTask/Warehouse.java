package Lab7.bigTask;

import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Warehouse {

    static final int MAX_WEIGHT = 150;

    public static void main(String[] args) throws InterruptedException {

        List<Integer> goods = Arrays.asList(
                30, 40, 20, 50, 10, 25, 35, 45
        );

        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch finishLatch = new CountDownLatch(3);
        SharedWarehouse warehouse = new SharedWarehouse(goods);

        for (int i = 1; i <= 3; i++) {
            new Thread(new Loader(
                    "Грузчик-" + i,
                    warehouse,
                    startLatch,
                    finishLatch
            )).start();
        }

        System.out.println("Все грузчики готовы. Начало\n");

        startLatch.countDown();
        finishLatch.await();

        System.out.println("\nВсе товары перенесены.");
    }
}