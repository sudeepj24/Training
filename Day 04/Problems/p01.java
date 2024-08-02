//Create a custom exception by name InavlidAgeException. Allowed 18 is allowed to vote, 
//less than 18 is not allowed.

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            checkAgeForVoting(age);
            System.out.println("You are allowed to vote.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }

    public static void checkAgeForVoting(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not allowed to vote.");
        }
    }
}
