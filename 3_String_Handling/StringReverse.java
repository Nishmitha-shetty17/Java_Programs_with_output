/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package LAB3_String_Programs;
import java.util.*;
public class StringReverse {
	public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String result = reverseString(input);
        System.out.println("Reversed string: " + result);
        scanner.close();
    }
}
