package com.libraryproject.model;

import java.util.Calendar;
import java.util.Date;

public class FakeLoan {

    private Book book;
    private Guest guest;
    private Date checkout;
    private Date due_date;
    private Date return_date;
    Calendar cal = Calendar.getInstance();

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
        cal.setTime(checkout);
        cal.add(Calendar.DATE, 14);
        this.due_date = cal.getTime();
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    //constructor for new checkout
    public FakeLoan(Book book, Guest guest){
        cal.setTime(new Date());
        this.book = book;
        this.guest = guest;
        this.checkout = cal.getTime();
        cal.add(Calendar.DATE, 14);
        this.due_date = cal.getTime();
    }

}
