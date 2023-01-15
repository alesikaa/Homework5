package Homework5;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        /* Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change.
          Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the item you want to buy: ");
        String item = scanner.nextLine();
        System.out.print("Enter the price of the item: ");
        double price = scanner.nextDouble();

        double amountPaid = 0;
        while (amountPaid < price) {
            System.out.print("Enter the amount you are paying: ");
            double payment = scanner.nextDouble();
            amountPaid += payment;
            double remaining = price - amountPaid;
            if (remaining > 0) {
                System.out.println("Amount remaining: " + remaining);
            } else {
                double change = -remaining;
                System.out.println("Your change is: " + change);
            }
        }
        System.out.println("Thank you for shopping!");
    }
}
