package lessons.lesson49_.lesson_51.Practise;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String filename = "test" + i;
            String content = "Java" + i;

            try {
                FileWriter writer = new FileWriter(filename);
                writer.write(content);
                writer.close();
                System.out.println("Файл " + filename + " успешно создан.");
                System.out.println(content);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Ошибка при создании файла " + filename);
            }
        }
    }
}
