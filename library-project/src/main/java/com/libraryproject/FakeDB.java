package com.libraryproject;

import com.libraryproject.model.Book;
import com.libraryproject.model.FakeLoan;
import com.libraryproject.model.Guest;
import com.libraryproject.model.Loan;
import org.thymeleaf.util.DateUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class FakeDB {

    //declare variables
    private static FakeDB fakeDB = null;
    private List<Book> bookList = null;
    private List<Guest> guestList = null;
    private List<FakeLoan> loanList = null;

    private Calendar cal = Calendar.getInstance();

    private FakeDB(){
        //generate fake DB data

        //books
        bookList.add(new Book(UUID.randomUUID(), "Title 1", "Author 1"));
        bookList.add(new Book(UUID.randomUUID(), "Title 2", "Author 2"));
        bookList.add(new Book(UUID.randomUUID(), "Title 3", "Author 3"));
        bookList.add(new Book(UUID.randomUUID(), "Title 4", "Author 4"));
        bookList.add(new Book(UUID.randomUUID(), "Title 5", "Author 5"));

        //guests
        guestList.add(new Guest(UUID.randomUUID(), "Dorian", "Gray", "fake1@email.com", "1-234-5678"));
        guestList.add(new Guest(UUID.randomUUID(), "Jay", "Gatsby", "fake2@email.com", "1-234-5678"));
        guestList.add(new Guest(UUID.randomUUID(), "Harry", "Potter", "fake3@email.com", "1-234-5678"));
        guestList.add(new Guest(UUID.randomUUID(), "Frodo", "Baggins", "fake4@email.com", "1-234-5678"));
        guestList.add(new Guest(UUID.randomUUID(), "Jane", "Eyre", "fake5@email.com", "1-234-5678"));

        //loans
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_MONTH, -90);
        loanList.add(new FakeLoan(bookList.get(0), guestList.get(0)));
        loanList.get(0).setCheckout(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 10);
        loanList.get(0).setReturn_date(cal.getTime());
        loanList.add(new FakeLoan(bookList.get(1), guestList.get(2)));
        loanList.get(1).setCheckout(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 10);
        loanList.get(1).setReturn_date(cal.getTime());
        loanList.add(new FakeLoan(bookList.get(2), guestList.get(3)));
        loanList.get(2).setCheckout(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 15);
        loanList.get(2).setReturn_date(cal.getTime());
        loanList.add(new FakeLoan(bookList.get(3), guestList.get(0)));
        loanList.get(3).setCheckout(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 20);
        loanList.get(3).setReturn_date(cal.getTime());
        loanList.add(new FakeLoan(bookList.get(4), guestList.get(1)));
        loanList.get(4).setCheckout(cal.getTime());
    }
}
