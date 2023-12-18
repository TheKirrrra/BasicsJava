package lessons.lesson49_.lesson_67;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {
    private static BlockingQueue<Integer> qeque = new ArrayBlockingQueue<>(10);

    private static void producer() {
        Random random = new Random();
        while (true) {
            try {
                qeque.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer () {

        while (true) {
            try {
                Thread.sleep(100);
                System.out.println(qeque.take());
                System.out.println("Queue size: " + qeque.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                producer();
            }
        });

        Thread consumerThread = new Thread(() -> {
            consumer();
        });

        producerThread.start();
        consumerThread.start();

        try {
           producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
