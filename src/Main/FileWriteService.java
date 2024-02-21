package Main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class FileWriteService {
    void writeToFile(String fileName, String content) {
        try (FileOutputStream fos = new FileOutputStream(FileConfig.BASE_URL + fileName + ".txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter writer = new BufferedWriter(osw)) {

            writer.write(content);
            System.out.println("The File was successfully created and written .");
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
