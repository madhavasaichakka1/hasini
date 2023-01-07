package JPAMappingAndQuery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "dfdf", query = "select c from Class1 c LEFT OUTER JOIN FETCH c.classlist where c.category=:param")
@NamedQuery(name = "demoquery", query = "select c from Class1 c LEFT OUTER JOIN FETCH c.classlist where c.category=:param")
public class Class1 {
	
	@Id
	private int id;
	
	private String category;
	
	private String name;
	
	private double cost;
	
	@OneToMany(mappedBy = "c1")
	private List<Class2> classlist=new ArrayList<>();

}
