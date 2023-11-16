/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Nov 15, 2023
 */
package travel.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import travel.beans.Destination;

@Configuration
public class BeanConfiguration {
	@Bean
	public Destination destination() {
		Destination destination = new Destination();
		return destination;
	}
}
