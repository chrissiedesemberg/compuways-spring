package springboot.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springboot.model.Property;
import springboot.repository.PropertyRepository;

@Controller
@RequestMapping("/properties/")
public class PropertyController {

	@Autowired
	private PropertyRepository propertyRepository;

	@GetMapping("/")
	public String firstPageProperties(Model model) {
		model.addAttribute("properties", this.propertyRepository.findAll());
		return "list";
	}

	@GetMapping("showForm")
	public String showPropertyForm(Property property) {
		return "add-property";
	}

	@GetMapping("list")
	public String properties(Model model) {
		model.addAttribute("properties", this.propertyRepository.findAll());
		return "index";
	}

	@PostMapping("add")
	public String addProperty(@Valid Property property, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-property";
		}
		propertyRepository.save(property);
		return "redirect:list";
	}

	@GetMapping("edit/{id}")
	public String showUpdatedForm(@PathVariable("id") long id, Model model) {
		Property property = propertyRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Property ID: " + id));

		model.addAttribute("property", property);
		return "update-property";

	}

	@PostMapping("update/{id}")
	public String updateProperty(@PathVariable("id") long id, @Valid Property property, BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			property.setId(id);
			return "update-property";
		}
		// update property
		propertyRepository.save(property);

		// get all properties (with update)
		model.addAttribute("properties", propertyRepository.findAll());
		return "index";
	}

	@GetMapping("delete/{id}")
	public String deleteProperty(@PathVariable("id") long id, Model model) {
		Property property = propertyRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Property Id: " + id));
		propertyRepository.delete(property);
		model.addAttribute("properties", propertyRepository.findAll());
		return "index";
	}
}

