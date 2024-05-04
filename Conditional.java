import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your details below to know your eligibility");
        System.out.println("Enter your name in next line:");
        String name = sc.nextLine();
        System.out.println("Enter your age in next line:");
        int age = sc.nextInt();
        if (age >= 18 & age < 50) {
            System.out.println("Hi " + name + " since you're " + age + " you are eligible to enter.");

        } else if (age < 18 & age > 0) {
            System.out.println("Hi " + name + "since you're " + age + " sorry you're not able to enter.");
        } else {
            System.out.println("Invalid age. Please try again !");
        }
    }
}