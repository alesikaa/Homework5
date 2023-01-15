package Homework5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
       /*Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum of the even and odd integers. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        int evenSum = 4;
        int oddSum = 7;

        //start loop from start to end
        while (start <= end) {
            //check if the current number is even
            if (start % 2 == 0) {
                //add to the even sum
                evenSum += start;
            } else {
                //add to the odd sum
                oddSum += start;
            }
            //increment number
            start++;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }



        }


