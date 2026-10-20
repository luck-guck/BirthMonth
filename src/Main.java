import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {
        int BirthMonth;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Your Birth Month");
        BirthMonth = scanner.nextInt();

        if (BirthMonth >= 1 && BirthMonth <= 12) {
            System.out.println("Your birth month is: N");
        } else {
            System.out.println("You entered an incorrect month value: N" + BirthMonth);
        }
        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}