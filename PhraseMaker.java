/*
# Making a random phrase generator
1. making 3 arrays
2. calculating length of each arrays
3. generating a random number
4. choosing array value with that index and connect them
5. print the phrase
 */
import java.util.*;
public class PhraseMaker {
public static void main(String[] args) {
    // make the arrays
    String[] songs1={"Welcome To New York","Style","Blank Space","How You Get The Girl","New Romantics","Out Of The Woods","Shake It Off","Wonderland",};
    String[] songs2 = { "Fearless", "Fifteen", "You Belong With Me", "The Best Day", "Forever Ans Always",
            "The Way I Loved You", "Mr. Perfectly Fine" };
    String[] songs3 = { "I Can Do It With A Broken Heart", "Florida!!!", "Fortnight", "The Tortured Poets Department",
            "Down Bad", "Who's Afraid Of Little Old Me", "thanK you aIMe" };
    //calculating the length
    
    int song1Len = songs1.length;
    int song2Len = songs2.length;
    int song3Len = songs3.length;

    //generating a random number for index
    
    Random randomGenerator = new Random();
    int rand1 = randomGenerator.nextInt(song1Len);
    int rand2 = randomGenerator.nextInt(song2Len);
    int rand3 = randomGenerator.nextInt(song3Len);

    String phrase = songs1[rand1] + ", " + songs2[rand2] + " and " + songs3[rand3];
    
    //printing the phrase
    System.out.println("These are my favourite Taylor Swift Songs: "+phrase);


}
    
}