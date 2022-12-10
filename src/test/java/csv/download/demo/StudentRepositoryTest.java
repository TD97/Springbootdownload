package csv.download.demo;
import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.*;
import org.springframework.beans.factory.annotation.*;
import csv.download.demo.repository.*;
import csv.download.demo.service.*;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import antlr.collections.List;
import csv.download.demo.controller.*;
import csv.download.demo.entity.*;
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryTest {
	@Autowired StudentRepository repo;
	
	@Test
	void contextLoads1() {
		Assertions.assertThat(repo).isNotNull();
		
	}
	@Test
	public void whenFindByTitle_thenReturnProduct() {
	    // when
	    Student product = repo.findByTitle("boot").orElseThrow(() -> new RuntimeException("Title not found"));

	    // then
	    assertThat(product.getTitle()).isEqualTo("boot");
	}
	@Test
	public void whenFindByName_thenReturnProduct() {
	    // when
	    Student product = repo.findByDescription("spring").orElseThrow(() -> new RuntimeException("Description not found"));

	    // then
	    assertThat(product.getDescription()).isEqualTo("spring");
	}
	@Test
	public void whenFindById_thenReturnProduct() {
	    // when
	    Student product = repo.findById(1).orElseThrow(() -> new RuntimeException("Id not found"));

	    // then
	    assertThat(product.getId()).isEqualTo(1);
	}
	@Test
	public void whenFindAll_thenReturnProductList() {
	    // when

	    // then
	}


}
