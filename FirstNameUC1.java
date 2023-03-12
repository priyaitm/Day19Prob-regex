package Day19PracticeProbRegex;
import java.util.Scanner;
public class FirstNameUC1 {
       String first;
        static String VALID_NAME_PATTERN = "^([A-Z]{1}[a-z]{2,})?$";

        public static void main(String[] args) {
            System.out.println("Welcome to Regex Problem");
            Scanner sc = new Scanner(System.in);
            FirstNameUC1 name = new FirstNameUC1();

            System.out.println("Enter first name: ");
            name.first = sc.nextLine();

            if (name.first.matches(VALID_NAME_PATTERN)) {
                System.out.println("First Name: " + name.first);
            } else {
                System.out.println("Enter Valid Format");
            }
        }
    }





