/*package com.chatapp;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121_poe;
import java.util.Scanner;
/**
 *Main application entry point for the Chat App.
 * @author Cleopatra Tayeta
 */
public class PROG5121_POE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login loggedInUser = null;

        System.out.println("Welcome to the Chat App");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Enter cell phone number (e.g. +27831234567): ");
            String phone = scanner.nextLine();

            loggedInUser = new Login(firstName, lastName,
                                     username, password, phone);
            System.out.println(loggedInUser.registerUser());

        } else if (choice == 2) {
            if (loggedInUser == null) {
                System.out.println("Please register first.");
            } else {
                System.out.print("Enter username: ");
                String u = scanner.nextLine();
                System.out.print("Enter password: ");
                String p = scanner.nextLine();
                System.out.println(
                    loggedInUser.returnLoginStatus(u, p));
            }
        }

        scanner.close();
    }
}

