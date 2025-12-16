package Lab7.bigTask;
import java.util.concurrent.CountDownLatch;

class Loader implements Runnable {

    private final String name;
    private final SharedWarehouse warehouse;
    private final CountDownLatch startLatch;
    private final CountDownLatch finishLatch;

    public Loader(String name,
                  SharedWarehouse warehouse,
                  CountDownLatch startLatch,
                  CountDownLatch finishLatch) {
        this.name = name;
        this.warehouse = warehouse;
        this.startLatch = startLatch;
        this.finishLatch = finishLatch;
    }

    @Override
    public void run() {
        try {
            startLatch.await();

            while (warehouse.takeGood(name)) {
                Thread.sleep(200); 
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            finishLatch.countDown();
        }
    }
}
