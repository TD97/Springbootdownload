package csv.download.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import csv.download.demo.entity.*;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

