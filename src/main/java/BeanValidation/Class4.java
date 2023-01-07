package BeanValidation;

import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NamedQuery(name = "findClaimByClimate", query = "select c from Claim c left outer join fetch c.items where c.climate=:param")


public class Class4 {
	
	@OneToMany(mappedBy = "Claim")
	private double aa;
	
	
	private String kk;
	
}
