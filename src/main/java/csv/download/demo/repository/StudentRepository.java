package csv.download.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import csv.download.demo.entity.*;

public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional<Student> findByTitle(String name);
	Optional<Student> findByDescription(String name);
	Optional<Student> findById(long id);
	Optional<Student> findByPublished(boolean isPublished);

	


}

