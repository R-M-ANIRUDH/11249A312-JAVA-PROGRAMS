import java.util.Scanner;

class BookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = new String[10];

        System.out.println("Enter titles for 10 books:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with 'A':");
        for (String book : books) {
            // Checks for 'A' or 'a' at the start
            if (book.trim().toUpperCase().startsWith("A")) {
                System.out.println("- " + book);
            }
        }

        sc.close();
    }
}