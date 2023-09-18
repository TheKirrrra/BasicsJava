package lesson_09;

import java.util.Scanner;

public class lesson_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Банкомат");

        int maxBanknotesCount = 40;

        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int count200 = 0;

        int newBanknotes;

        int sum = 0;

        while (true) {
            System.out.println("Меню:");

            System.out.println("1. Получить деньги");
            System.out.println("2. Внести деньги");
            System.out.println("3. Проверить баланс");
            System.out.println("0. Завершить работу");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Получение денег");

                    int currentBanknotesCount;

                    int requestSum = scanner.nextInt();

                    if (requestSum > sum) {
                        System.err.println("Недостаточно денег на счету");
                    } else {
                        if (requestSum % 5 == 0) {

                            int candidate200 = requestSum / 200;

                            int requestSum200;

                            if (count200 < candidate200) {
                                requestSum200 = count200 * 200;
                                count200 = 0;
                            } else {
                                requestSum200 = candidate200 * 200;
                                count200 = count200 - candidate200;

                            } requestSum = requestSum - requestSum200;
                            System.out.println("Выдаем 200-ками " + requestSum200 + " осталось выдать - " + requestSum);

                            int candidate100 = requestSum / 100;

                            int requestSum100;

                            if (count100 < candidate100) {
                                requestSum100 = count100 * 100;
                                count200 = 0;
                            } else {
                                requestSum100 = candidate100 * 100;
                                count100 = count100 - candidate100;

                            } requestSum = requestSum - requestSum100;
                            System.out.println("Выдаем 100-ками " + requestSum100 + " осталось выдать - " + requestSum);

                            int candidate50 = requestSum / 50;

                            int requestSum50;

                            if (count50 < candidate50) {
                                requestSum50 = count50 * 50;
                                count50 = 0;
                            } else {
                                requestSum50 = candidate50 * 50;
                                count50 = count50 - candidate50;

                            } requestSum = requestSum - requestSum50;
                            System.out.println("Выдаем 50-ками " + requestSum50 + " осталось выдать - " + requestSum);

                            int candidate20 = requestSum / 20;

                            int requestSum20;

                            if (count20 < candidate20) {
                                requestSum20 = count20 * 20;
                                count20 = 0;
                            } else {
                                requestSum20 = candidate20 * 20;
                                count20 = count20 - candidate20;

                            } requestSum = requestSum - requestSum20;
                            System.out.println("Выдаем 20-ками " + requestSum20 + " осталось выдать - " + requestSum);

                            int candidate10 = requestSum / 10;

                            int requestSum10;

                            if (count10 < candidate10) {
                                requestSum10 = count10 * 10;
                                count10 = 0;
                            } else {
                                requestSum10 = candidate10 * 10;
                                count10 = count10 - candidate10;

                            } requestSum = requestSum - requestSum10;
                            System.out.println("Выдаем 10-ками " + requestSum10 + " осталось выдать - " + requestSum);

                            int candidate5 = requestSum / 5;

                            int requestSum5;

                            if (count5 < candidate5) {
                                requestSum5 = count5 * 5;
                                count5 = 0;
                            } else {
                                requestSum5 = candidate5 * 5;
                                count5 = count5 - candidate5;

                            } requestSum = requestSum - requestSum5;
                            System.out.println("Выдаем 5-ками " + requestSum5 + " осталось выдать - " + requestSum);
                            sum = count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200;
                            System.out.println("--> Ваш баланс равен: " + sum + " EUR");
                        } else {
                            int coins = requestSum % 5;
                            System.out.println("Банкомат не выдает монеты, можете снять -" + (requestSum - coins)   );
                        }
                    }
                }
                    break;

                case 2: {
                        System.out.println("Внесение денег");

                    System.out.println("Внесите количество купюр, номинала 5");
                    newBanknotes = scanner.nextInt();
                    count5 = count5 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 5 EUR");

                    System.out.println("Внесите количество купюр, номинала 10");
                    newBanknotes = scanner.nextInt();
                    count10 = count10 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 10 EUR");

                    System.out.println("Внесите количество купюр, номинала 20");
                    newBanknotes = scanner.nextInt();
                    count20 = count20 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 20 EUR");

                    System.out.println("Внесите количество купюр, номинала 50");
                    newBanknotes = scanner.nextInt();
                    count50 = count50 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 50 EUR");

                    System.out.println("Внесите количество купюр, номинала 100");
                    newBanknotes = scanner.nextInt();
                    count100 = count100 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 100 EUR");

                    System.out.println("Внесите количество купюр, номинала 200");
                    newBanknotes = scanner.nextInt();
                    count200 = count200 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 200 EUR");
                    sum = count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200;
                }

                    break;

                case 3: {
                            System.out.println("Проверка баланса");

                    System.out.println("--> Ваш баланс равен: " + sum + " EUR");
                    }
                    break;
                case 0: {
                                System.out.println("Завершение работы");
                                System.exit(0);
                            }
                default:
                    System.err.println("Команда не распознана");

                        }
                }
            }
        }


