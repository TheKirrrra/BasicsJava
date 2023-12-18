package lessons.lesson49_.lesson_67;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class lesson_67 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 7; i++) {
            executorService.submit(new Task(i));
        }
        System.out.println("Main the main");

        executorService.shutdown();
        System.out.println("All tasks submitted");

        boolean isFinished = false;

        try {
            isFinished = executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
    class Task implements Runnable {
        private final int taskId;

        Task(int threadId) {
            this.taskId = threadId;
        }


        @Override
        public void run() {
            System.out.println("Task " + taskId + " was started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskId + " was completed");

        }
    }


