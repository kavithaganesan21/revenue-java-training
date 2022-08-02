package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {

    private String Name;

    private  int Id;

    private LocalDate DOB;

    public Patient(String name, int id, LocalDate DOB) {
        Name = name;
        Id = id;
        this.DOB = DOB;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
}
