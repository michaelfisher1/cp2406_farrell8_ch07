/**
 * Created by jc225828 on 1/09/17.
 */
import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args)
    {
        char aChar;
        String aString;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character to check: ");
        aString = input.nextLine();
        aChar = aString.charAt(0);
        System.out.println("The character is " + aChar);
        if(Character.isUpperCase(aChar))
            System.out.println(aChar + " is uppercase");
        else
            System.out.println(aChar + " is not uppercase");
        if(Character.isLowerCase(aChar))
            System.out.println(aChar + " is lowercase");
        else
            System.out.println(aChar + "is not lowercase");
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        if(Character.isLetterOrDigit(aChar))
            System.out.println(aChar + " is a letter or digit");
        else
            System.out.println(aChar + " is neither a letter or digit");
        if(Character.isWhitespace(aChar))
            System.out.println(aChar + "is a whitespace");
        else
            System.out.println(aChar + "is not a whitespace");

    }
}
