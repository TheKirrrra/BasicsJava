package lessons.lesson49_.lesson_67;

public class Hm_task1 {
    private static int counter;

    private synchronized void increment() {
        counter++;
    }
    private synchronized void dicrement() {
        counter--;
    }
    public static void main(String[] args) {
        Hm_task1 task = new Hm_task1();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000; i++) {
                    task.increment();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000; i++) {
                    task.dicrement();
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println(counter);

    }
}
