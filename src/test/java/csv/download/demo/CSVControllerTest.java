package csv.download.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;
import org.springframework.beans.factory.annotation.*;
import csv.download.demo.repository.*;
import csv.download.demo.service.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import csv.download.demo.controller.*;
import csv.download.demo.helper.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest

class CsvControllerTest {
	
	
	@Autowired CSVController controller;

	@Test
	void contextLoads3() {
		Assertions.assertThat(controller).isNotNull();

		
	}
	@Test
	void contextLoads4() {
		Assertions.assertThat(controller.getFile()).isNotNull();

		
	}
	@Test
	void contextLoads5() {
		Assertions.assertThat(controller.index()).isNotNull();

		
	}
	

	

}