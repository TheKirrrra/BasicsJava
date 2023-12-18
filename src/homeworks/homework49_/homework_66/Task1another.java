package homeworks.homework49_.homework_66;

public class Task1another {
    private static int counter = 0;

    public static void main(String[] args) {
        Object lock = new Object();

        Thread increaseThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        });

        Thread decreaseThread = new Thread(() -> {
            for (int i = 0; i < 993; i++) {
                synchronized (lock) {
                    counter--;
                }
            }
        });

        increaseThread.start();
        decreaseThread.start();



        System.out.println("Final counter value: " + counter);
    }
}


