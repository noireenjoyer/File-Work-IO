package Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class FileReadService {
    String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(FileConfig.BASE_URL + fileName + ".txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(isr)) {

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("File reading error: " + e.getMessage());
        }

        return content.toString();
    }
}
