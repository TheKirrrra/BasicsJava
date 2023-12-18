package homeworks.homework49_.homework_67;

import lessons.lesson49_.lesson_67.WaitAndNotify;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task1 {
    private static final int TOTAL_RUNS = 20;
    private static volatile char nextChar = 'A';

    public static void main(String[] args) {
        Task1 printer = new Task1();

        Thread threadA = new Thread(() -> printer.printChar('A'));
        Thread threadB = new Thread(() -> printer.printChar('B'));
        Thread threadC = new Thread(() -> printer.printChar('C'));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private synchronized void printChar(char charToPrint) {
        for (int i = 0; i < TOTAL_RUNS; i++) {
            while (charToPrint != nextChar) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print(charToPrint + " ");

            switch (nextChar) {
                case 'A':
                    nextChar = 'B';
                    break;
                case 'B':
                    nextChar = 'C';
                    break;
                case 'C':
                    nextChar = 'A';
                    break;
            }

            notifyAll();
        }
    }
}
