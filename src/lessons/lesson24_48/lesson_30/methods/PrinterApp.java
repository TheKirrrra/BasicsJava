package lessons.lesson24_48.lesson_30.methods;

public class PrinterApp {
    public static void main(String[] args) {
        String[] strings = new String[]{"Test", "Hello", "Printer","Journal"};
        Integer[] integers = new Integer[] {1,6,13,17,10, -12, 0,19};

        Printer printer = new Printer();
        printer.printArray(strings);
        System.out.println("==========");
        printer.printArray(integers);

        System.out.println(printer.minValue(integers));
        System.out.println(printer.minValue(strings));
        System.out.println("=============");
        System.out.println(printer.sumArray(integers));

        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.print(100);
    }
}
