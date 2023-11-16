/**
 * @author Tate - tlpadilla
 * CIS175 - Fall 2023
 * Nov 15, 2023
 */
package travel.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;

import travel.beans.*;
import travel.repository.ITravelRepo;


/**
 * @author Tate
 *
 */
@Controller
public class WebController {
	// Auto wiring CRUD capabilities from JPA repository/ITravelRepo
	@Autowired
	ITravelRepo repo;
	
	// This method will direct to add.html from results/index
	@GetMapping("/add")
	public String add(Model model) {
		Destination d = new Destination();
		model.addAttribute("newDestination", d);
		return "add";
	}
	
	// This method will be used in add.html template, to add entities into DB
	@PostMapping("/add")
	public String add(@ModelAttribute Destination d, Model model) {
		repo.save(d);
		return viewAll(model);
	}
	
	// This method is used to update/edit existing entities
	@GetMapping("/edit/{id}")
	public String showUpdate(@PathVariable("id") long id, Model model) {
		Destination d = repo.findById(id).orElse(null);
		model.addAttribute("newDestination", d);
		return "add.html";
	}
	
	// This method is used to delete existing entities
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id, Model model) {
		Destination d = repo.findById(id).orElse(null);
		System.out.println(d);
		repo.delete(d);
		return viewAll(model);
	}
	
	// This method is used to show all existing entities within the /add method
	@GetMapping({ "/", "viewAll" })
	public String viewAll(Model model) {
		if (repo.findAll().isEmpty()) {
			return add(model);
		}
		model.addAttribute("Destination", repo.findAll());
		return "results";
	}
	
}
