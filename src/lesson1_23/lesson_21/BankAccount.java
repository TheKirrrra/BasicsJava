package lesson1_23.lesson_21;

import java.util.Arrays;

public class BankAccount {
    private final int id;
    private final long accountNumber;
    private double amount;

    private String currency;
    private String owner;
    private int bankBranch;
    private String bank;
    static final int BALANCEACCOUNT = 2600;

    private static int counter;

    public BankAccount(long accountNumber, String currency, String owner, String bank) {
        //TODO генерация номера счета:
        // балансовый счет + id клиента + номер счета (х символов) + "код валюты"

        this.accountNumber = accountNumber;
        this.currency = currency;
        this.owner = owner;
        this.bank = bank;
        this.bankBranch = 1;
        this.id = counter++;
        generateAccountNumber();
    }

    private String generateAccountNumber() {
        StringBuilder sb = new StringBuilder(BALANCEACCOUNT);
        //2600
        //00000
        int[] ints = new int[5];
        int temp = id;
        for (int i = 0; i < ints.length; i++) {
            int digit = temp % 10;
            ints[i] = digit;
            temp /= 10;
        }
        for (int value: ints) {
            sb.append(value);
        }
        // Преобразование числа в строку заданной длины
        //String strNumberToString = String.format("%05d", id);

        sb.append(Arrays.toString(ints));

        System.out.println(sb.toString());
        return sb.toString();
    }

    public String toString() {
        return "{Account id: " + id + "; amount: " + amount + " " + currency + "; owner: " + owner +"; bank: " + bank +"}";

    }

    public String info() {
        StringBuilder sb = new StringBuilder();

        sb.append("{Account ID: ").append(id).append("; amount: ").append(amount)
                .append(" ").append(currency).append("; owner: ").append(owner)
                .append("; bank: ").append(bank).append("}");
return sb.toString();
    }

}
