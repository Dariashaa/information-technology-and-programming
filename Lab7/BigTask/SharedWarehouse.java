package Lab7.bigTask;
import java.util.*;

class SharedWarehouse {

    private final List<Integer> goods;
    private int index = 0;
    private int currentWeight = 0;

    public SharedWarehouse(List<Integer> goods) {
        this.goods = goods;
    }

    public synchronized boolean takeGood(String loaderName)
            throws InterruptedException {

        if (index >= goods.size()) {
            if (currentWeight > 0) {
                deliver();
            }
            return false; 
        }

        int weight = goods.get(index);

        if (currentWeight + weight > Warehouse.MAX_WEIGHT) {
            deliver();
        }

        index++;
        currentWeight += weight;

        System.out.println(loaderName +
                " взял товар " + weight +
                " кг (в машине: " + currentWeight + " кг)");

        if (currentWeight == Warehouse.MAX_WEIGHT) {
            deliver();
        }

        return true; 
    }

    private void deliver() throws InterruptedException {
        System.out.println("\n>>> Машина уехала с "
                + currentWeight + " кг...");
        Thread.sleep(800); 
        System.out.println("<<< Машина разгружена\n");

        currentWeight = 0;
    }
}
