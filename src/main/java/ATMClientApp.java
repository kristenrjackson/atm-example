import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMClientApp {
        public static void main(String[] args) {
            ATM myATM = new ATM("1111", 500.00);
            Scanner input = new Scanner(System.in);
            String currentPin = "";
            do {
                System.out.println("What is your PIN?");
                currentPin = input.nextLine();
            } while (!myATM.acceptPin(currentPin));

            int choice = -1;
            while (choice != 4) {
                System.out.println("Welcome to the bank of We Can Code IT!");
                System.out.println("Choose an option:");
                System.out.println("Press 1 to deposit funds.");
                System.out.println("Press 2 to withdraw funds.");
                System.out.println("Press 3 to check balance.");
                System.out.println("Press 4 to exit.");

                choice = input.nextInt();
                if (choice == 1) {
                    System.out.println("Please enter a deposit amount.");
                    double amount = input.nextDouble();
                    myATM.deposit(amount);
                    System.out.println("Updated balance is: " + myATM.getBalance());
                } else if (choice == 2) {
                    System.out.println("Please enter a withdrawal amount.");
                    double amount = input.nextDouble();
                    myATM.withdrawal(amount);
                    System.out.println("Updated balance is: " + myATM.getBalance());
                } else if (choice == 3) {
                    System.out.println("Your balance is " + myATM.getBalance());
                }
            }
    }

}
