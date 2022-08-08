package com.accenture.tagtrainingspring.controller;


import com.accenture.tagtrainingspring.Screening;
import com.accenture.tagtrainingspring.service.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningService screeningService;

    @GetMapping("/screenings")
    List<Screening> getScreenings()
    {
         List<Screening> screening = screeningService.readScreening();
        return screening;
    }

    @GetMapping("/findname")
    public  void  findname()
    {
        String name = "Claraa";
        try{
            Screening screening = screeningService.isNameMatch(name);
            System.out.println("Screenig result for " + screening.getPnt_Id().getName() + " is " + screening.getMalignantResult());
        }
        catch (Exception ex)
        {
            System.out.println("No Screening was found for given patient name");

        }

    }

}
