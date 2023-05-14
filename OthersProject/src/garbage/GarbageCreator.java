package garbage;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.exe";
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime-startTime);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
