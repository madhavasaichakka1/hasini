package Security;

import javax.annotation.security.RolesAllowed;

public class DemoSecurity {
	
	@RolesAllowed(Role.employee_role)
	public void request() {
		
	}
	
	@RolesAllowed(Role.employee_role)
	public void cancel() {
		
	}
	
	@RolesAllowed(Role.manager_role)
	public void approve() {
		
	}
	
	@RolesAllowed(Role.manager_role)
	public void reject() {
		
	}
	
	@RolesAllowed(Role.manager_role)
	public void sendBackRequest() {
		
	}
	
	@RolesAllowed(Role.admin_role)
	public void maintainance() {
		
	}
	
	@RolesAllowed(Role.manager_role)
	public void mainn() {}

}
