import java.util.*;
// we are using this package for use Scanner class to use System.in

public class UserInput {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextLine for string only
        // for int nextInt
        // for float nextFloat
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}