package pune.project.springbootproject.controller.advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentControllerAdvice {

	@ResponseStatus(HttpStatus.CONFLICT)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<String> constraintViolation(MethodArgumentNotValidException e)
	{
		List<String> slist=new ArrayList<String>();
		
	   System.out.println("exception MethodArgumentNotValidException");	
	   
	   for(ObjectError er: e.getBindingResult().getAllErrors())
	  	   slist.add( er.getDefaultMessage());
	  
		return slist;
	}	
}
