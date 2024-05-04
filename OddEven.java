import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to check either the number is odd or even ?(y/n)");
        String choicee = sc.nextLine();
        if (choicee.equals("y")) {
            System.out.println("Enter the number below: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num + " is an odd number");
            }
        } else if (choicee.equals("n")) {
            System.out.println("Alright, have a great dayyy.");
        }
        else {
            System.out.println("Invalid input!!");
        }
    }
}