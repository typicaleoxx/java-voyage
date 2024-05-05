
/*
For loop syntax in java:

for (initialisation; condition; updation){
    //statements
}
 */

public class Loops {
    public static void main(String[] args) {
        /*
         * print from 0 to 10 using various java loops
         * #1. for loop
         * #2. while loop
         * #3.
         */
        System.out.println("This is done using for loop");
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\nThis is done using while loop");
        int i = 10;
        while (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("\nThis is done using do while loop");
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 11);
    }
}