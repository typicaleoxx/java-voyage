import java.util.*;

public class CompareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number below:");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number below:");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        } else {
            System.out.println(num1 + " and " + num2 + "are equal.");
        }
    }
}