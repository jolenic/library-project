package com.libraryproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Guest {
    private final UUID guest_id;
    private String first_name;
    private String last_name;
    private String email_address;
    private String phone_number;

    public UUID getGuestId() {
        return guest_id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getEmailAddress() {
        return email_address;
    }

    public void setEmailAddress(String email_address) {
        this.email_address = email_address;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public Guest(@JsonProperty("guest_id") UUID guest_id,
                 @JsonProperty("first_name") String first_name,
                 @JsonProperty("last_name") String last_name,
                 @JsonProperty("email_address") String email_address,
                 @JsonProperty("phone_number") String phone_number){
        this.guest_id = guest_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.phone_number = phone_number;
    }

    public String toString(){
        return "Name: " + first_name + " " + last_name + ", Email: " + email_address + ", Phone: " + phone_number;
    }
}
