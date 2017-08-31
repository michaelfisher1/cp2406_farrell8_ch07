import java.util.Scanner;

/**
 * Created by jc225828 on 1/09/17.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        String nameOne;
        String nameTwo;
        String nameThree;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first name: ");
        nameOne = input.next();
        System.out.println("Please enter the second name: ");
        nameTwo = input.next();
        System.out.println("Please enter the third name: ");
        nameThree = input.next();
        System.out.println("You have chosen: " + nameOne + "," + nameTwo + "," + "and " + nameThree);
        System.out.println("The combinations are: ");
        System.out.println(nameOne + " " + nameTwo);
        System.out.println(nameOne + " " + nameThree);
        System.out.println(nameTwo + " " + nameOne);
        System.out.println(nameTwo + " " + nameThree);
        System.out.println(nameThree + " " + nameOne);
        System.out.println(nameThree + " " + nameTwo);

    }
}
