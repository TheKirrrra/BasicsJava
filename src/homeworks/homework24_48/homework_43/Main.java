package homeworks.homework24_48.homework_43;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Document document1 = new Document("Реферат", LocalDate.now());

        System.out.println("Состояние документа: " + document1.getState());

        document1.publish();

        System.out.println("Состояние документа: " + document1.getState());

        document1.publish();

        System.out.println("Состояние документа: " + document1.getState());


    }
}
