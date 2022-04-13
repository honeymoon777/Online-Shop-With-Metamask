package projectakhirOpenStory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projectakhirOpenStory.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	private String index(Model model) {

		return "index";
	}
	
	@GetMapping("/index")
	private String home(Model model) {

		return "index";
	}
	
	@GetMapping("/contacts")
	private String contacts(Model model) {

		return "contacts";
	}
	
	@GetMapping("/grid-listing-3")
	private String explore(Model model) {

		return "grid-listing-3";
	}
	
	@GetMapping("/help")
	private String help(Model model) {

		return "help";
	}
	
	@GetMapping("/login")
	private String login(Model model) {

		return "login";
	}
	
	@GetMapping("/register")
	private String register(Model model) {

		return "register";
	}
	
	@GetMapping("/author")
	private String author(Model model) {

		return "author";
	}
	
	@GetMapping("/blog")
	private String blog(Model model) {

		return "blog";
	}
	
	
	
	
	
}
