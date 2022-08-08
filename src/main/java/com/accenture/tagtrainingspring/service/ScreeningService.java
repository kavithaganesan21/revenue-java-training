package com.accenture.tagtrainingspring.service;

import com.accenture.tagtrainingspring.Screening;
import com.accenture.tagtrainingspring.databaseaccess.ScreeningDatabase;
import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

     ScreeningDatabase screeningdb;
//    public ScreeningService() {
//    }
    @Autowired
    public ScreeningService(ScreeningDatabase screeningdb) {
        this.screeningdb = screeningdb;
    }

    public boolean isPatientScreenig(Screening s1, Patient p1)
    {
//        System.out.println(s1.getPnt_Id().getId());
        return (s1.getPnt_Id().getId() == p1.getId())?true:false;
    }

    public  List<Screening> readScreening()
    {
        return this.screeningdb.readdbdata();
    }

   public Screening isNameMatch(String name){
        Screening screenigMatch = null;
        List<Screening> screeningList = this.readScreening();
            for (Screening screening : screeningList) {
                if (screening.getPnt_Id().getName().equalsIgnoreCase(name)) {
                    screenigMatch = screening;
                }
            }

//            System.out.println("No details found in this name");
        return screenigMatch;
        }
}
