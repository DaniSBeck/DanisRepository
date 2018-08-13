package de.dash.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("hello")  // Vorderer Teil des properties-Namens in den application.properties

public class HelloProperties {

	private String welcome = "Willkommen!";	// Dieser Wert kann ueber die spring.properties 
											// ueberschrieben werden! hello.welcome=

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	
	
}
