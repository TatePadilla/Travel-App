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
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tate
 *
 */

@Data
@NoArgsConstructor
@Entity
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
}
