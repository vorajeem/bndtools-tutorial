package org.example.impls;

import org.example.api.Greeting;
import org.osgi.service.component.annotations.*;

@Component
public class Example implements Greeting {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

	// TODO: class provided by template

}
