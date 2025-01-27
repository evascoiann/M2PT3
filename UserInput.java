

import java.util.Scanner;
 
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
 
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();
 
        int result = favoriteNumber * 2;
 
        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " meters tall.");
        System.out.println("Your favorite number multiplied by 2 is: " + result);
    }
}