package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private int id;
    private String password;
    private boolean isLibrarian;
    private static ArrayList<User> users = new ArrayList<>();

    public User(String name, int id, String password, boolean isLibrarian) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.isLibrarian = isLibrarian;
    }

    public static void addUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        System.out.print("Are you a Librarian? (yes/no): ");
        boolean isLibrarian = scan.nextLine().equalsIgnoreCase("yes");

        users.add(new User(name, id, password, isLibrarian));
        System.out.println("Registration Successful! 😊🚀");
    }

    public static User loginUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        for (User user : users) {
            if (user.id == id && user.password.equals(password)) {
                System.out.println("Login Successful! ✅");
                return user;
            }
        }

        System.out.println("Invalid Credentials! 😒");
        return null;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }

    public int getId() {
        return id;
    }
}
