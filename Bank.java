package JAVA3;

//JAVA__BANKING__SYSTEM
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance = 1000.00f;
        int option;
        do {
            System.out.println(
                    "\n======Bank======\nChoose An Option\n(1)Show Balance\n(2)Withdraw Money\n(3)Deposit Money\n(4)Exit\n=================");
            System.out.print("Enter the option : ");
            while (!sc.hasNextFloat()) {
                System.out.println("Invalid  input! Please enter a number (1-4).");
                sc.next();
                System.out.print("Enter the option : ");
            }
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Current Balance = " + balance);
                System.out.println("Thank You, Visit Again");
            } else if (option == 2) {
                System.out.print("Enter Amount To Withdraw : ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Invalid  input! Please enter a number (1-4).");
                    sc.next();
                    System.out.print("Enter The Amount To Withdraw : ");
                }
                float withdraw = sc.nextFloat();
                if (withdraw <= 0 || withdraw > balance) {
                    System.out.println("Enter Valid Amount");
                } else {

                    balance -= withdraw;
                    System.out.println("Current Balance = " + balance);
                    System.out.println("Thank You, Visit Again");
                }
            } else if (option == 3) {
                System.out.print("Enter Amount To Deposit : ");
                while (!sc.hasNextFloat()) {
                    System.out.println("Invalid  input! Please enter a number (1-4).");
                    sc.next();
                    System.out.print("Enter The Amount To Deposit : ");
                }
                float Deposit = sc.nextFloat();
                if (Deposit <= 0) {
                    System.out.println("Enter Valid Amount");
                } else {
                    balance += Deposit;
                    System.out.println("Current Balance = " + balance);
                    System.out.println("Thank You, Visit Again");
                }
            } else if (option == 4) {
                System.out.println("----Exit----");
            } else {
                System.out.println("Invalid Option");
            }
        } while (option != 4);
        sc.close();
    }
}
