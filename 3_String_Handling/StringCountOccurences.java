/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package LAB3_String_Programs;
import java.util.*;
public class StringCountOccurences {
	public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); 
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();
        int occurrences = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " times.");
        scanner.close();
    }
}
