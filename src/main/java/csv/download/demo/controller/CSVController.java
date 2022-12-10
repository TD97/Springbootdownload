package csv.download.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.lowagie.text.DocumentException;
import csv.download.demo.repository.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


import csv.download.demo.service.*;
import csv.download.demo.controller.*;
import csv.download.demo.entity.*;
import csv.download.demo.repository.*;
@Controller
@RequestMapping("/api/csv")



public class CSVController {

	

  @Autowired
  CSVService fileService;
 
  @GetMapping("/index1")
	public String viewHomePage(Model model) {
		model.addAttribute("allemplist", fileService.findAllStudents());
		return "index";
	}

 
  
  @GetMapping("/download")
  public ResponseEntity<Resource> getFile() {
    String filename = "Booklist.csv";
    InputStreamResource file = new InputStreamResource(fileService.load());

    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
        .contentType(MediaType.parseMediaType("application/csv"))
        .body(file);
  }
  @GetMapping("/index")
  public String index() {
  	return "index";
  }
  

 
  
  
  
  
}
