package com.libraryproject;

import com.libraryproject.model.Book;
import com.libraryproject.model.FakeDB;
import com.libraryproject.model.FakeLoan;
import com.libraryproject.model.Guest;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        FakeDB db = FakeDB.getFakeDB();
        Scanner input = new Scanner(System.in);
        int response = 99;

        System.out.println("Welcome to the Library Management System Test");
        while (true) {
            System.out.println("1: Books \n2: Guests \n3: Loans \n0: Exit");
            response = input.nextInt();

            switch (response) {
                case 1:
                    System.out.println("Books:");
                    for (Book book : db.getBookList()) {
                        System.out.println(book.toString());
                    }
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.println("\nGuests:");
                    for (Guest guest : db.getGuestList()) {
                        System.out.println(guest.toString());
                    }
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("\nLoans:");
                    for (FakeLoan loan : db.getLoanList()) {
                        System.out.println(loan.toString());
                    }
                    System.out.println("\n\n");
                    break;
                case 0:
                    System.out.println("Thank you, goodbye!");
                    return;
                default:
                    System.out.println("Something went wrong...");
                    System.out.println("\n\n");
            }
        }
    }
}
