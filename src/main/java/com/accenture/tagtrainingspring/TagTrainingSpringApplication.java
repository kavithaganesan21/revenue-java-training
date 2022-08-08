package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.databaseaccess.ScreeningDatabase;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.service.ScreeningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	@Autowired
	private  ScreeningService screeningService;

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
//		printWelcomeMessage();
		TagTrainingSpringApplication tag = new TagTrainingSpringApplication();
//		tag.printscreening();
//		tag.findnamematch();
	}
	// DAY 2

	public  void printscreening() {

//		ScreeningDatabase screeningDatabase = new ScreeningDatabase();
//		ScreeningService screeningService = new ScreeningService(screeningDatabase);
		List<Screening> screeningList = screeningService.readScreening();

		//List<Screening> screeningList =  screeningService.readScreening();
//		List<Screening> screeningList = screeningService.readScreening();
//		for (Screening prntList: screeningList)
//		{
//			System.out.println("Screening for patient,"+prntList.getPnt_Id().getName()+ " returned a malignant result of "+ prntList.getMalignantResult());
//		}

		// java 8 forEach loop
		screeningList.forEach(prntList -> System.out.println("Screening for patient," + prntList.getPnt_Id().getName() + " returned a malignant result of " + prntList.getMalignantResult()));

	}

//		boolean status = sserv1.isPatientScreenig(s1,p1);
//		System.out.println("Status : "+status);
//		System.out.println("Screening: "+s1.getPnt_Id().getId()+ " has a match of "+ status+ " with patient "+ s1.getPnt_Id().getName());


	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}

	public static void findnamematch() {
		String name = "Claraa";
		ScreeningDatabase screeningDatabase = new ScreeningDatabase();
		ScreeningService screeningService = new ScreeningService(screeningDatabase);

//		if (screeningService != null) {
//			Screening screening = screeningService.isNameMatch(name);
//			System.out.println("Screenig result for "+screening.getPnt_Id().getName()+" is "+ screening.getMalignantResult());
//
//		} else
//			System.out.println("No Screening was found");

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
