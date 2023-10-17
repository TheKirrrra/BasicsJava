package lesson_28;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.put("A", 10);
        table1.put("B", 20);
        table1.put("C", 30);

        Table table2 = new Table();
        table2.put("X", 100);
        table2.put("Y", 200);
        table2.put("Z", 400);

        Table.Printer printer1 = table1.new Printer("HI:");
        Table.Printer printer2 = table2.new Printer("BYE:");

        printer1.print();
        printer2.print();

    }
}


