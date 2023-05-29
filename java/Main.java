/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasinterface;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("1. Power On");
                System.out.println("2. Power Off");
                System.out.println("3. Increase Volume");
                System.out.println("4. Decrease Volume");
                System.out.println("5. Top up Balance");
                System.out.println("6. View Balance");
                System.out.println("7. Add Contact");
                System.out.println("8. View All Contacts");
                System.out.println("9. Search Contact");
                System.out.println("10. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        myPhone.powerOn();
                        break;
                    case 2:
                        myPhone.powerOff();
                        break;
                    case 3:
                        myPhone.increaseVolume();
                        break;
                    case 4:
                        myPhone.decreaseVolume();
                        break;
                    case 5:
                        System.out.print("Enter amount to top up: $");
                        double amount = scanner.nextDouble();
                        myPhone.topUpBalance(amount);
                        break;
                    case 6:
                        System.out.println("Balance: $" + myPhone.getBalance());
                        break;
                    case 7:
                        System.out.print("Enter contact name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.print("Enter contact phone number: ");
                        String phoneNumber = scanner.nextLine();
                        myPhone.addContact(name, phoneNumber);
                        break;
                    case 8:
                        myPhone.viewAllContacts();
                        break;
                    case 9:
                        System.out.print("Enter contact name to search: ");
                        scanner.nextLine();
                        String searchName = scanner.nextLine();
                        myPhone.searchContact(searchName);
                        break;
                    case 10:
                        isRunning = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        }
    }
}
