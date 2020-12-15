package com.domain;

public class Student {



    private String firstname;
    private String lastName;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastName = lastname;
    }

    public String getLastName() {
        return lastName;
    }
}
