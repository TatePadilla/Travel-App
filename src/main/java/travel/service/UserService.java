//package
package travel.service;

//imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import travel.beans.User;
import travel.repository.UserRepository;

//Sets up service
@Service
public class UserService {

	// connects user repository
	@Autowired
	private UserRepository userRepository;

	// sets up saving user
	public void save(User user) {
		userRepository.save(user);
	}

	// sets up finding by username
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
