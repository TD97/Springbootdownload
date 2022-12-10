package csv.download.demo.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csv.download.demo.controller.*;
import csv.download.demo.entity.*;
import csv.download.demo.repository.*;
import csv.download.demo.helper.*;

@Service
public class CSVService {

  @Autowired
  StudentRepository repository;
  public List<Student> findAllStudents() {
	  return this.repository.findAll();
		
	}
  
  public ByteArrayInputStream load() {
    List<Student> test= repository.findAll();
   
    ByteArrayInputStream in = CSVHelper.testToCSV(test);
    
    return in;
  }
 
  public void save(Student student) {
		repository.save(student);
	}
  public CSVService(StudentRepository repository)
  {
      // this keyword refers to current instance
      this.repository=repository;
  }

}
