package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {
    private int Screening_Id;
//    private int Patient_Id;

    private Patient Pnt_Id;
    private LocalDate ScreeningDate;
    private boolean MalignantResult;

//    public Screening(int screening_Id, int patient_Id, LocalDate screeningDate, Boolean malignantResult) {
//        Screening_Id = screening_Id;
//        Patient_Id = patient_Id;
//        ScreeningDate = screeningDate;
//        MalignantResult = malignantResult;
//    }

    public Screening(int screening_Id, Patient patient_Id, LocalDate screeningDate, Boolean malignantResult) {
        Screening_Id = screening_Id;
        Pnt_Id = patient_Id;
        ScreeningDate = screeningDate;
        MalignantResult = malignantResult;
    }

    public int getScreening_Id() {
        return Screening_Id;
    }

    public void setScreening_Id(int screening_Id) {
        Screening_Id = screening_Id;
    }

//    public int getPatient_Id() {
//        return Patient_Id;
//    }

    public Patient getPnt_Id() {
        return Pnt_Id;
    }


//    public void setPatient_Id(int patient_Id) {
//        Patient_Id = patient_Id;
//    }

    public void setPatient_Id(Patient patient_Id) {
        Pnt_Id = patient_Id;
    }

    public LocalDate getScreeningDate() {
        return ScreeningDate;
    }

    public void setScreeningDate(LocalDate screeningDate) {
        ScreeningDate = screeningDate;
    }

    public boolean getMalignantResult() {
        return MalignantResult;
    }

    public void setMalignantResult(boolean malignantResult) {
        MalignantResult = malignantResult;
    }
}
