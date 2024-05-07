import java.util.*;

public class Sumofn {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int j = 0;
        for (i = 1; i <= n; i++) {
            j = j + i;

        }
        System.out.println(j);
        System.out.println("The sum of first " + n + " natual numbers is " + j);
    }
}