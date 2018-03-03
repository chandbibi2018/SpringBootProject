package pune.project.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pune.project.springbootproject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
