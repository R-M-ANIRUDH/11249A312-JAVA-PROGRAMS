import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TextEditor {
    public static void main(String[] args) {
        String text = "This is a simple text editor content example.";
        try (FileWriter writer = new FileWriter("editor.txt")) {
            writer.write(text);
            System.out.println("Content saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing text: " + e.getMessage());
        }
        try (FileReader reader = new FileReader("editor.txt")) {
            int ch;
            System.out.print("File Content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading text: " + e.getMessage());
        }
    }
}
