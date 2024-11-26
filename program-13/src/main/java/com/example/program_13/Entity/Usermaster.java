package com.example.program_13.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Usermaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String Fullname;
}
