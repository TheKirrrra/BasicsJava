package homeworks.homework49_.homework_51;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProcessData {

    public static void main(String[] args) {

        String[] inputData = {
                "user1:2050",
                "user2:1200",
                "user1:1700",
                "user3:1800",
                "user1:1300",
                "user4:2100",
                "user2:750"
        };


        Map<String, Integer> userSums = new HashMap<>();


        for (String data : inputData) {
            String[] parts = data.split(":");
            String username = parts[0];
            int amount = Integer.parseInt(parts[1]);

            userSums.put(username, userSums.getOrDefault(username, 0) + amount);
        }


        Map<String, Integer> lessThan2000 = new HashMap<>();
        Map<String, Integer> moreThan2000 = new HashMap<>();

        for (Map.Entry<String, Integer> entry : userSums.entrySet()) {
            if (entry.getValue() < 2000) {
                lessThan2000.put(entry.getKey(), entry.getValue());
            } else {
                moreThan2000.put(entry.getKey(), entry.getValue());
            }
        }

        writeToFile("src/homeworks/homework49_/homework_51/less.txt", lessThan2000);
        writeToFile("src/homeworks/homework49_/homework_51/more.txt", moreThan2000);

        System.out.println("Файлы успешно созданы.");
    }

    private static void writeToFile(String filename, Map<String, Integer> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, Integer> entry : data.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
