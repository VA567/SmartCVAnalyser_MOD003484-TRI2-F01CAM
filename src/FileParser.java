//Importing Packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {
    public static String readTxtFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return content.toString();
    }
}

