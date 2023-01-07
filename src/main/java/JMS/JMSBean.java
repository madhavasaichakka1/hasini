package JMS;

import javax.ejb.ActivationConfigProperty;

import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;

//@MessageDriven(activationConfig = {@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "hdvbi/sidbviu/iabi"),
		//						   @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")})
@MessageDriven(name="JMSBEAN",activationConfig = {@ActivationConfigProperty(propertyName = "", propertyValue = ""),@ActivationConfigProperty(propertyName = "", propertyValue = "")})
public class JMSBean implements MessageListener{
	
	@Inject
	private LoggerService logService;


	
	public void process(Message msg) {
		try {
		// ----- ;
		// ----- ;
			
			logService.log();
			
			if(logService==logService) {
				// -----------
				// ----------
			}
			else {
				// -----------
				//------------
			}
			
		}
		catch(Exception e) {
			// -----------
			// -----------
		}
		
		// 5 -6 methods will be there here don't consider them just consider "process & onMessage" methods
		
	}



	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		process(message);
		
	}



}
