package homework_09;

import java.util.Scanner;

public class homework09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Банкомат");

        int maxBanknotesCount = 40; // максимальное кол-во выдаваемой валюты
        int count5 = 0; // количество валюты в банкомате
        int count10 = 0;
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int count200 = 5;

        int newBanknotes;

        int sum = 0;

        int sumDep = 0; // общая сумма депозита

        int dep = 8; // процент депозита


        while (true) {
            System.out.println("Меню:");

            System.out.println("1. Получить деньги");
            System.out.println("2. Внести деньги");
            System.out.println("3. Проверить баланс");
            System.out.println("4. Внести депозит"); // внесение депозита не влияет на обычный счет, но влияет на количество валюты в банкомате.
            System.out.println("5. Проверить депозит");
            System.out.println("0. Завершить работу");

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    System.out.println("Получение денег");

                    int currentBanknotesCount = maxBanknotesCount;

                    int requestSum = scanner.nextInt();

                    if (requestSum > sum) {
                        System.err.println("Недостаточно денег на счету");
                    } else if (requestSum > count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200) { // проверка на наличие номинала в банкомате
                        System.err.println("Недостаточно денег в банкомате.");
                        System.out.println("На данный момент вы можете снять " + (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200) + " EUR");

                    } else {
                        if (requestSum % 5 == 0) {

                            int candidate200 = requestSum / 200;

                            int requestSum200;

                            if (candidate200 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                            candidate200 = currentBanknotesCount;
                            }
                                if (count200 < candidate200) {
                                    requestSum200 = count200 * 200;
                                    currentBanknotesCount = currentBanknotesCount - count200;
                                    count200 = 0;
                                } else {
                                    requestSum200 = candidate200 * 200;
                                    count200 = count200 - candidate200;
                                    currentBanknotesCount = currentBanknotesCount - candidate200;
                                }
                                requestSum = requestSum - requestSum200;

                                if (requestSum200 == 0) { // проверка на наличие купюры в банкомате
                                    System.out.println("Извините, купюра 200 EUR закончилась, выдаём следующей купюрой.");
                                } else {
                                    if (currentBanknotesCount == 0) {
                                        System.out.println("Выдаем 200-ками: " + requestSum200 + " EUR. Больше выдать не можем");
                                        System.out.println("--> С баланса списано: " + requestSum200 + " EUR");
                                        System.out.println("--> На балансе осталось: " + (sum - requestSum200) + " EUR");
                                        sum = sum - (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                        break;
                                    } else {
                                        System.out.println("Выдаем 200-ками: " + requestSum200 + " EUR осталось выдать - " + requestSum + " EUR");
                                    }
                                }
                            int candidate100 = requestSum / 100;

                            int requestSum100;
                            
                            if (candidate100 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                                candidate100 = currentBanknotesCount;
                            }
                            if (count100 < candidate100) {
                                requestSum100 = count100 * 100;
                                currentBanknotesCount = currentBanknotesCount - count100;
                                count100 = 0;
                            } else {
                                requestSum100 = candidate100 * 100;
                                count100 = count100 - candidate100;
                                currentBanknotesCount = currentBanknotesCount - candidate100;
                            }
                            requestSum = requestSum - requestSum100;
                            if (requestSum100 == 0) {
                                System.out.println("Извините, купюра 100 EUR закончилась, выдаём следующей купюрой."); // проверка на наличие купюры в банкомате
                            } else if (currentBanknotesCount == 0){
                                System.out.println("Выдаем 100-ками: " + requestSum100 + " EUR. Больше выдать не можем");
                                System.out.println("--> С баланса списано: " + (requestSum100 + requestSum200) + " EUR");
                                System.out.println("--> На балансе осталось: " + (sum - (requestSum100 + requestSum200)) + " EUR");
                                sum = sum - (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                break;
                            } else {
                                System.out.println("Выдаем 100-ками: " + requestSum100 + " EUR осталось выдать - " + requestSum + " EUR");
                            }

                            int candidate50 = requestSum / 50;

                            int requestSum50;

                            if (candidate50 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                                candidate50 = currentBanknotesCount;
                            }

                            if (count50 < candidate50) {
                                requestSum50 = count50 * 50;
                                currentBanknotesCount = currentBanknotesCount - count50;
                                count50 = 0;
                            } else {
                                requestSum50 = candidate50 * 50;
                                count50 = count50 - candidate50;
                                currentBanknotesCount = currentBanknotesCount - candidate50;
                            }
                            requestSum = requestSum - requestSum50;
                            if (requestSum50 == 0) {
                                System.out.println("Извините, купюра 50 EUR закончилась, выдаём следующей купюрой."); // проверка на наличие купюры в банкомате
                            } else if (currentBanknotesCount == 0){
                                System.out.println("Выдаем 50-ками: " + requestSum50 + " EUR. Больше выдать не можем");
                                System.out.println("--> С баланса списано: " + (requestSum50 + requestSum100 + requestSum200) + " EUR");
                                System.out.println("--> На балансе осталось: " + (sum - (requestSum50 + requestSum100 + requestSum200)) + " EUR");
                                sum = (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                break;
                            } else {
                                System.out.println("Выдаем 50-ками: " + requestSum50 + " EUR осталось выдать - " + requestSum + " EUR");
                            }

                            int candidate20 = requestSum / 20;

                            int requestSum20;

                            if (candidate20 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                                candidate20 = currentBanknotesCount;
                            }

                            if (count20 < candidate20) {
                                requestSum20 = count20 * 20;
                                currentBanknotesCount = currentBanknotesCount - count20;
                                count20 = 0;
                            } else {
                                requestSum20 = candidate20 * 20;
                                count20 = count20 - candidate20;
                                currentBanknotesCount = currentBanknotesCount - candidate20;
                            }
                            requestSum = requestSum - requestSum20;
                            if (requestSum20 == 0) {
                                System.out.println("Извините, купюра 20 EUR закончилась, выдаём следующей купюрой."); // проверка на наличие купюры в банкомате
                            } else if (currentBanknotesCount == 0){
                                System.out.println("Выдаем 20-ками: " + requestSum20 + " EUR. Больше выдать не можем");
                                System.out.println("--> С баланса списано: " + (requestSum20 + requestSum50 + requestSum100 + requestSum200) + " EUR");
                                System.out.println("--> На балансе осталось: " + (sum - (requestSum20 + requestSum50 + requestSum100 + requestSum200)) + " EUR");
                                sum = sum - (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                break;
                            } else {
                                System.out.println("Выдаем 20-ками: " + requestSum20 + " EUR осталось выдать - " + requestSum + " EUR");
                            }

                            int candidate10 = requestSum / 10;

                            int requestSum10;

                            if (candidate10 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                                candidate10 = currentBanknotesCount;
                            }
                            if (count10 < candidate10) {
                                requestSum10 = count10 * 10;
                                currentBanknotesCount = currentBanknotesCount - count10;
                                count10 = 0;
                            } else {
                                requestSum10 = candidate10 * 10;
                                count10 = count10 - candidate10;
                                currentBanknotesCount = currentBanknotesCount - candidate10;
                            }
                            if (requestSum10 == 0) {
                                System.out.println("Извините, купюра 10 EUR закончилась, выдаём следующей купюрой."); // проверка на наличие купюры в банкомате
                            } else if (currentBanknotesCount == 0){
                                System.out.println("Выдаем 10-ками: " + requestSum10 + " EUR. Больше выдать не можем");
                                System.out.println("--> С баланса списано: " + (requestSum10 + requestSum20 + requestSum50 + requestSum100 + requestSum200) + " EUR");
                                System.out.println("--> На балансе осталось: " + (sum - (requestSum10 + requestSum20 + requestSum50 + requestSum100 + requestSum200)) + " EUR");
                                sum = sum - (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                break;
                            } else {
                                System.out.println("Выдаем 10-ками: " + requestSum10 + " EUR осталось выдать - " + requestSum + " EUR");
                            }

                            int candidate5 = requestSum / 5;

                            int requestSum5;

                            if (candidate5 > currentBanknotesCount) { // проверка на количестве максимально выдаваемых купюр
                                candidate5 = currentBanknotesCount;
                            }

                            if (count5 < candidate5) {
                                requestSum5 = count5 * 5;
                                currentBanknotesCount = currentBanknotesCount - count5;
                                count5 = 0;
                            } else {
                                requestSum5 = candidate5 * 5;
                                count5 = count5 - candidate5;
                                currentBanknotesCount = currentBanknotesCount - candidate5;
                            }
                            requestSum = requestSum - requestSum5;
                            if (requestSum5 == 0) {
                                System.out.println("Извините, купюра 5 EUR закончилась.");
                            } else if (currentBanknotesCount == 0){
                                System.out.println("Выдаем 5-ками: " + requestSum5 + " EUR. Больше выдать не можем");
                                System.out.println("--> С баланса списано: " + (requestSum5 + requestSum10 + requestSum20 + requestSum50 + requestSum100 + requestSum200) + " EUR");
                                System.out.println("--> На балансе осталось: " + (sum - (requestSum5 + requestSum10 + requestSum20 + requestSum50 + requestSum100 + requestSum200)) + " EUR");
                                sum = sum - (count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                                break;
                            } else {
                                System.out.println("Выдаем 5-ками: " + requestSum5 + " EUR осталось выдать - " + requestSum + " EUR"); // проверка на наличие купюры в банкомате
                            }
                            sum = (sum - count5 * 5 + count10 * 10 + count20 * 20 + count50 * 50 + count100 * 100 + count200 * 200);
                            System.out.println("--> С баланса списано: " + (requestSum5 + requestSum10 + requestSum20 + requestSum50 + requestSum100 + requestSum200) + " EUR");
                            System.out.println("--> На балансе осталось: " + (sum + requestSum) + " EUR");
                        } else {
                            int coins = requestSum % 5;
                            System.out.println("Банкомат не выдает монеты, можете снять -" + (requestSum - coins));
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

                case 4: {
                    int countDep5 = 0;
                    int countDep10 = 0;
                    int countDep20 = 0;
                    int countDep50 = 0;
                    int countDep100 = 0;
                    int countDep200 = 0;
                    System.out.println("Депозит на данный момент составляет " + dep + "%");
                    System.out.println("Внесение денег на депозит");

                    System.out.println("Внесите количество купюр, номинала 5");
                    newBanknotes = scanner.nextInt();
                    countDep5 = countDep5 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 5 EUR");

                    System.out.println("Внесите количество купюр, номинала 10");
                    newBanknotes = scanner.nextInt();
                    countDep10 = countDep10 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 10 EUR");

                    System.out.println("Внесите количество купюр, номинала 20");
                    newBanknotes = scanner.nextInt();
                    countDep20 = countDep20 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 20 EUR");

                    System.out.println("Внесите количество купюр, номинала 50");
                    newBanknotes = scanner.nextInt();
                    countDep50 = countDep50 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 50 EUR");

                    System.out.println("Внесите количество купюр, номинала 100");
                    newBanknotes = scanner.nextInt();
                    countDep100 = countDep100 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 100 EUR");

                    System.out.println("Внесите количество купюр, номинала 200");
                    newBanknotes = scanner.nextInt();
                    countDep200 = countDep200 + newBanknotes;
                    System.out.println("--> Вы положили на счет " + newBanknotes + " купюр номиналом 200 EUR");
                    sumDep = sumDep + (countDep5 * 5 + countDep10 * 10 + countDep20 * 20 + countDep50 * 50 + countDep100 * 100 + countDep200 * 200);

                    count5 = countDep5; // пополняем банкомат с помощью депозита
                    count10 = countDep10;
                    count20 = countDep20;
                    count50 = countDep50;
                    count100 = countDep100;
                    count200 = countDep200;
                }
                break;
                case 5: {
                    int sumDepM = sumDep + sumDep*dep/100;
                    int sumDepMM = sumDepM + sumDepM*dep/100;
                    int sumDepMMM = sumDepMM + sumDepMM*dep/100;
                    int sumDepMMMM = sumDepMMM + sumDepMMM*dep/100;
                    int sumDepMMMMM = sumDepMMMM + sumDepMMMM*dep/100;

                    System.out.println("Проверка баланса депозита");
                    if (sumDep == 0) {
                        System.out.println("--> Ваш баланс равен: " + sumDep + " EUR");
                    } else {
                        System.out.println("--> Ваш баланс равен: " + sumDep + " EUR");
                        System.out.println("--> По истечению месяца ваш баланс будет равен: " + sumDepM + " EUR");
                        System.out.println("--> По истечению двух месяцев ваш баланс будет равен: " + sumDepMM + " EUR");
                        System.out.println("--> По истечению трёх месяцев ваш баланс будет равен: " + sumDepMMM + " EUR");
                        System.out.println("--> По истечению четырёх месяцев ваш баланс будет равен: " + sumDepMMMM + " EUR");
                        System.out.println("--> По истечению пяти месяцев ваш баланс будет равен: " + sumDepMMMMM + " EUR");
                    }
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


