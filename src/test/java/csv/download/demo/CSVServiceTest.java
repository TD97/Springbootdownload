package csv.download.demo;

//Java Program to Illustrate Unit Testing of Service Class


import static org.mockito.Mockito.verify;

import csv.download.demo.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import csv.download.demo.service.*;

@ExtendWith(MockitoExtension.class)

//Main class
class PersonServiceTest {

	@Mock private StudentRepository  Repo;

	private CSVService personService;

	@BeforeEach void setUp()
	{
		this.personService= new CSVService(this.Repo)	;
	}
	 @Test void getAllPerson()
	    {
	        personService.findAllStudents();
	        verify(Repo).findAll();
	    }
	 @Test void getAllByte(){
		 personService.load();
		 
	 }

	
}
