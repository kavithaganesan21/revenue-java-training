package com.accenture.tagtrainingspring;

import java.time.LocalDate;

public class Screening {
    private int Screening_Id;
    private int Patient_Id;
    private LocalDate ScreeningDate;
    private Boolean MalignantResult;

    public Screening(int screening_Id, int patient_Id, LocalDate screeningDate, Boolean malignantResult) {
        Screening_Id = screening_Id;
        Patient_Id = patient_Id;
        ScreeningDate = screeningDate;
        MalignantResult = malignantResult;
    }

    public int getScreening_Id() {
        return Screening_Id;
    }

    public void setScreening_Id(int screening_Id) {
        Screening_Id = screening_Id;
    }

    public int getPatient_Id() {
        return Patient_Id;
    }

    public void setPatient_Id(int patient_Id) {
        Patient_Id = patient_Id;
    }

    public LocalDate getScreeningDate() {
        return ScreeningDate;
    }

    public void setScreeningDate(LocalDate screeningDate) {
        ScreeningDate = screeningDate;
    }

    public Boolean getMalignantResult() {
        return MalignantResult;
    }

    public void setMalignantResult(Boolean malignantResult) {
        MalignantResult = malignantResult;
    }
}
