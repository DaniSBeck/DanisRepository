package de.dash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.dash.configuration.HelloProperties;

@RestController
public class HelloController {

	@Autowired
	private HelloProperties props;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return props.getWelcome();
	}
}
