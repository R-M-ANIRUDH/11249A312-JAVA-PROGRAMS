import java.util.Scanner;

class AgeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        try {
            
            int age = Integer.parseInt(input);

        
            int score = 100 / age; 

            System.out.println("Valid Age Entered: " + age);
            System.out.println("Calculated Score (100 / Age): " + score);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid format! Age must be a whole number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! Age must be greater than 0.");
        } finally {
            sc.close();
        }
    }
}