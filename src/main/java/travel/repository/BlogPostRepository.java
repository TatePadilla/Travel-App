//package
package travel.repository;

//imports
import org.springframework.data.jpa.repository.JpaRepository;

import travel.beans.BlogPost;

import java.util.List;

//repository set up
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

	// allows for searching
	List<BlogPost> findByContentContaining(String searchTerm);

}
