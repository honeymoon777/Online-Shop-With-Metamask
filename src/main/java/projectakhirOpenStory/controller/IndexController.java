package projectakhirOpenStory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
	@GetMapping("/")
	private String index(Model model) {
		return "index";
	}
	
	@GetMapping("/help")
	private String help(Model model) {
		return "help";
	}
	
	@GetMapping("/contacts")
	private String contacts(Model model) {
		return "contacts";
	}
	
	@GetMapping("/blog")
	private String blog(Model model) {
		return "blog";
	}
	
	@GetMapping("/author")
	private String author(Model model) {
		return "author";
	}
	
	@GetMapping("/login")
	private String login(Model model) {
		return "login";
	}
	
	@GetMapping("/register")
	private String register(Model model) {
		return "register";
	}
	
	@GetMapping("/uploadArtwork")
	private String uploadArtwork(Model model) {
		return "upload-artwork";
	}

}
