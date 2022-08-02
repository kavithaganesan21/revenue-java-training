package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {

    private String Name;

    private  int Id;

    private LocalDate DOB;

    private String Gender;

    public Patient(String name, int id, LocalDate DOB, String gender) {
        Name = name;
        Id = id;
        this.DOB = DOB;
        Gender = gender;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
