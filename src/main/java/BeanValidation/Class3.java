package BeanValidation;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

public class Class3 {
	
	@Digits(fraction = 3, integer = 4)
	private double amount;
	
	@Pattern(regexp = "pattern")
	private String category;

}
