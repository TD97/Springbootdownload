package csv.download.demo;

import static org.mockito.Mockito.verify;

import org.assertj.core.api.Assertions;

import csv.download.demo.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import csv.download.demo.service.*;
import csv.download.demo.helper.*;
import csv.download.demo.entity.*;
import csv.download.demo.repository.*;
import java.util.*;

@ExtendWith(MockitoExtension.class)

//Main class
class CSVHelperTest{

	@Mock private CSVHelper  helper;

	
	 @Test void help() {
			Assertions.assertThat(helper).isNotNull();

	 }
	
	 }
	    
	        