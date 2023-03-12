package Day19PracticeProbRegex;
import java.util.Scanner;
public class PasswordRuleUC5 {
    static String VALID_PASSWORD = "^([a-z]{8,})$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        if (password.matches(VALID_PASSWORD)) {
            System.out.println(password);
        }else {
            System.out.println("Enter Valid password");
        }
    }
}
