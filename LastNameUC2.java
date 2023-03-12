package Day19PracticeProbRegex;
import java.util.Scanner;
public class LastNameUC2 {
    String first, last;
    static String VALID_NAME_PATTERN = "^([A-Z]{1}[a-z]{2,})?$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LastNameUC2 name = new LastNameUC2();

        System.out.println("Enter first name: ");
        name.first = sc.nextLine();

        System.out.println("Enter last name: ");
        name.last = sc.nextLine();

        if (name.first.matches(VALID_NAME_PATTERN) && name.last.matches(VALID_NAME_PATTERN)) {
            System.out.println("First Name: " + name.first);
            System.out.println("Last Name: " + name.last);
        } else {
            System.out.println("Enter Valid name");
        }
    }
}
