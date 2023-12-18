package lessons.lesson49_.lesson_67;

import java.util.Scanner;

public class WaitAndNotify {

    public void producer() {
        synchronized (this) {
            System.out.println("Producer thread started");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer was resumed");
        }
    }
    public void waiter() {
        System.out.println("Waiter Start!");
        synchronized (this) {
            try {
                System.out.println("Waiter was resumed");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                notify();
            }

        }
    }

    public void consumer() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this) {
            try {
                System.out.println("Waiting for Enter pressed");
                scanner.nextLine();
            } finally {
                this.notify();
            }
        }
    }




    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotify.producer();
            }
        });

        Thread thread2 = new Thread(waitAndNotify::consumer);

        Thread thread3 = new Thread(waitAndNotify::waiter);


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
