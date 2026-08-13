import java.util.Scanner;

class FeedbackAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ratings = new double[5];
        double sum = 0;

        System.out.println("Enter 5 feedback ratings (1.0 to 5.0):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextDouble();
            sum += ratings[i]; 
        }

        double average = sum / ratings.length;
        System.out.printf("\nAverage Rating: %.2f / 5.0\n", average);

        sc.close();
    }
}