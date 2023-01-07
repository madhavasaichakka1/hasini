package JPAMappingAndQuery;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Class2 {
	
	@Id
	private int id;
	
	private String username;
	
	private Date orderDate;
	
	@ManyToOne
	private Class1 c1;

}
