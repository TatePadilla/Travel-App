/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Nov 15, 2023
 */
package travel.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message = "Must add a location")
	private String location;
	@NotNull(message = "Must contain data")
	private double price;
	@NotNull(message = "Must contain data")
	private double rating;
	@NotNull(message = "Must contain data")
	private String details;
	@NotNull(message = "Must contain data")
	private String amenities;
}
