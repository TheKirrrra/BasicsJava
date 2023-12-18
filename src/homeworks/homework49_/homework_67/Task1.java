package homeworks.homework49_.homework_67;


public class Task1 {
    private static final int TOTAL_RUNS = 20;
    private static volatile char nextChar = 'A';
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Task1 printer = new Task1();

        Thread threadA = new Thread(printer::printA);
        Thread threadB = new Thread(printer::printB);
        Thread threadC = new Thread(printer::printC);

        threadA.start();
        threadB.start();
        threadC.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printA() {
        printChar('A', 'B');
    }

    public void printB() {
        printChar('B', 'C');
    }

    public void printC() {
        printChar('C', 'A');
    }

    private void printChar(char charToPrint, char nextCharExpected) {
        for (int i = 0; i < TOTAL_RUNS; i++) {
            synchronized (lock) {
                while (charToPrint != nextChar) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(charToPrint);

                nextChar = nextCharExpected;

                lock.notifyAll();
            }
        }
    }


}
