import java.util.Scanner;

public class PasswordVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "mypassword12345";
        
        System.out.print("Enter password: ");
        String input = scanner.nextLine();
        
        if (input.equals(password)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied.");
        }
    }
}
