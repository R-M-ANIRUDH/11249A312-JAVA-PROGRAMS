import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FitnessApp {
    public static void main(String[] args) {
        String data = "Name: John Doe, Age: 28, Weight: 75kg";
        try (FileOutputStream fos = new FileOutputStream("profile.txt")) {
            fos.write(data.getBytes());
            System.out.println("Profile written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream("profile.txt")) {
            int ch;
            System.out.print("Reading Profile: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
