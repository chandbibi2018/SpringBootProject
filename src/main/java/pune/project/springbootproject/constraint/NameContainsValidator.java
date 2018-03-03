package pune.project.springbootproject.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import pune.project.springbootproject.model.Student;

@Component
public class NameContainsValidator implements ConstraintValidator<NameContains, Student> {

	String substring;

	@Override
	public void initialize(NameContains constraintAnnotation) {
		this.substring=constraintAnnotation.substring();		
	}

	@Override
	public boolean isValid(Student value, ConstraintValidatorContext context) {
		System.out.println("in validator:"+ value.getStudentName().contains(substring));
		return value.getStudentName().contains(substring);
	}
	

}
