package UserRegister;

import java.util.HashMap;
import java.util.Scanner;

class Register {
    private HashMap<String, String> users = new HashMap<>();

    // Register a user
    public void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists! Choose another.");
        } else {
            users.put(username, password);
            System.out.println("User registered successfully!");
        }
    }

    // Login function
    public boolean loginUser(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    // Display all registered users
    public void displayUsers() {
        System.out.println("Registered Users: " + users.keySet());
    }
}

public class UserRegistrationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register system = new Register();

        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Display Users\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter username: ");
                    String regUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String regPass = sc.nextLine();
                    system.registerUser(regUser, regPass);
                    break;
                    
                case 2:
                    System.out.print("Enter username: ");
                    String loginUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPass = sc.nextLine();
                    system.loginUser(loginUser, loginPass);
                    break;
                    
                case 3:
                    system.displayUsers();
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
