/*
Unlike Python, Java is a typed language i.e before making any variable we need to declare its data type.

# Data Types:

    i) Primitive (basic data types, already in java)
        - byte (1 byte)
        - short 
        - char (2 bytes)
        - boolean (1 byte)
        - int (4 bytes)
        - long (8 bytes)
        - float (4 bytes)
        - double (8 bytes)

    ii) Non-Primitive (customizable, we can create and modify outselves)
        - String
        - Array
        - Class
        - Object
        - Interface
 */

public class Variables {
    public static void main(String[] args){
        String hello="hello world";
        int age = 19;
        System.out.println(hello);
        System.out.println(age);
        int num1, num2;
        num1 = 23;
        num2=79;
        int sum = num1+num2;
        System.out.println(sum);
        
    }
}
