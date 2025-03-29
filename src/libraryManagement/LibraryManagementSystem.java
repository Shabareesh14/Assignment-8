package libraryManagement;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryDataBase data = new LibraryDataBase();
        Account account = new Account();

        while (true) {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an Option: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    User.addUser();
                    break;

                case 2:
                    User user1 = User.loginUser();
                    if (user1 != null) {
                        data.libraryMenu(user1, account);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice, try again!");
            }
        }
    }
}
