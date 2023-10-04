package lesson_21;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(456231234432123156L, "USD", "Ivan Pupkin", "Haspa");
        System.out.println(bankAccount.toString());

        BankAccount bankAccount1 = new BankAccount(4567777773156L, "EUR", "Vasya Pupkin", "DB");
        System.out.println(bankAccount1.toString());
}}
