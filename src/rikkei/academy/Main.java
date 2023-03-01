package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers you want to find: ");
        int n = input.nextInt();
        input.close();

        int count = 0;
        int number = 2;

        System.out.println("The first " + n + " prime numbers are:");

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}
