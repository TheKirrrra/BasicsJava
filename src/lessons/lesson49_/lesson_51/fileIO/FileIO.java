package lessons.lesson49_.lesson_51.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        File pathDir = new File("./files");

        pathDir = new File("lesson_51/db");
        System.out.println(pathDir.mkdirs());

        File file = new File(pathDir, "text.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("exists " + file.exists());

        System.out.println("isFile: " +file.isFile());
        System.out.println("isDirectory: " +file.isDirectory());
        System.out.println("isDirectory: " +pathDir.isFile());
        System.out.println("isHidden: " + file.isHidden());


        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello, Java!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
