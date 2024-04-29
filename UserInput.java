import java.util.*;
// we are using this package for use Scanner class to use System.in

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}