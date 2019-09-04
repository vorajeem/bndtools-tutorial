/**
 * 
 */
package org.example.command;

import org.apache.felix.service.command.CommandProcessor;
import org.example.api.Greeting;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author vivcrone
 *
 */

@Component(property = { // NOT properties
		/*Felix GoGo Shell commands*/
		CommandProcessor.COMMAND_SCOPE + ":String=example",
		CommandProcessor.COMMAND_FUNCTION+ ":String=greet"
},
service = Object.class
//NOT provide = Object.class
)
public class GreetingCommand {
	private Greeting greetingSvc;
	
	@Reference
	public void setGreeting(Greeting greetingSvc) {
		this.greetingSvc = greetingSvc;
	}
	
	public void greet(String name) {
		System.out.println(greetingSvc.sayHello(name));
	}

}
