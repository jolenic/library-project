package com.libraryproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

public class Loan {
    private final UUID loan_id;
    private UUID book_id;
    private UUID guest_id;
    private Date checkout;
    private Date due_date;
    private Date return_date;

    public Loan(@JsonProperty("loan_id") UUID loan_id,
                @JsonProperty("book_id") UUID book_id,
                @JsonProperty("guest_id") UUID guest_id,
                @JsonProperty("checkout") Date checkout,
                @JsonProperty("due_date") Date due_date,
                @JsonProperty("return_date") Date return_date){
        this.loan_id = loan_id;
        this.book_id = book_id;
        this.guest_id = guest_id;
        this.checkout = checkout;
        this.due_date = due_date;
        this.return_date = return_date;
    }
}
