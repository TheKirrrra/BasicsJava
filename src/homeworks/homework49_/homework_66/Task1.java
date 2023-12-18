package homeworks.homework49_.homework_66;

public class Task1 {
    public static void main(String[] args) {
        int counter = 0;
        MyThread thread = new MyThread();
        MyThread1 thread1 = new MyThread1();

        thread.start();
        thread1.start();

        System.out.println(counter);

    }



    static class MyThread extends Thread {
        @Override
        public void run() {
            int counter = 0;
            for (int i = 0; i < 1000; i++) {
                counter++;
                System.out.println(counter);
            }
        }
    }
    static class MyThread1 extends Thread {
        @Override
        public void run() {
            int counter = 0;
            for (int i = 0; i < 1000; i++) {
                counter--;
                System.out.println(counter);
            }
        }
    }
}
