package com.accenture.tagtrainingspring.databaseaccess;

import com.accenture.tagtrainingspring.Screening;
import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningDatabase {

    public List<Screening> readdbdata() {
        Patient p1 = new Patient("Joe", 1, LocalDate.of(1940, 1, 1), "Male");
        Patient p2 = new Patient("Debbie", 2, LocalDate.of(1950, 6, 28), "Male");
        Patient p3 = new Patient("John", 3, LocalDate.of(1955, 8, 18), "Male");
        Patient p4 = new Patient("Clara", 4, LocalDate.of(1975, 9, 22), "Female");
        Patient p5 = new Patient("Mary", 5, LocalDate.of(1983, 2, 27), "Female");
        Patient p6 = new Patient("Alex", 6, LocalDate.of(1982, 5, 11), "Male");
        Patient p7 = new Patient("Alexandra", 7, LocalDate.of(1980, 7, 13), "Female");
        Patient p8 = new Patient("Nancy", 8, LocalDate.of(1979, 4, 16), "Female");


        //		 Screening s1 =new Screening(1,1,LocalDate.of(2020,7,26),false);
        Screening s1 = new Screening(1, p1, LocalDate.of(2020, 7, 26), false);
        Screening s2 = new Screening(2, p2, LocalDate.of(2021, 8, 22), false);
        Screening s3 = new Screening(3, p3, LocalDate.of(2019, 9, 11), false);
        Screening s4 = new Screening(4, p4, LocalDate.of(2018, 10, 2), false);
        Screening s5 = new Screening(5, p5, LocalDate.of(2021, 5, 3), false);
        Screening s6 = new Screening(6, p6, LocalDate.of(2021, 4, 15), false);
        Screening s7 = new Screening(7, p7, LocalDate.of(2020, 1, 20), false);
        Screening s8 = new Screening(8, p8, LocalDate.of(2019, 2, 26), false);

        List<Screening> l1 = new ArrayList<Screening>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.add(s5);
        l1.add(s6);
        l1.add(s7);
        l1.add(s8);

        return l1;
    }

}
