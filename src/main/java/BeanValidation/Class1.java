package BeanValidation;

import java.util.Date;

import javax.persistence.OneToMany;
import javax.validation.constraints.*;

public class Class1 {
	
	@Past(message = "purchase date cannot be future")
	private Date purchaseDate;
	
	@OneToMany(mappedBy = "BeanValidation")
	@NotNull
	private String itemName;

}
