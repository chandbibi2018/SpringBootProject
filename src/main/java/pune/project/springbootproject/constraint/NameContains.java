package pune.project.springbootproject.constraint;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameContainsValidator.class)
@Documented
public @interface NameContains {

	String substring() default "";
	
	String message() default "it does not contain given string";
	
	Class<?> [] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
	     @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
	     @Retention(RetentionPolicy.RUNTIME)
	     @Documented
	     @interface List{
	    	 NameContains[] value();
	     }
	}

