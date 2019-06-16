package webadv.s99201105.p07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import webadv.s99201105.p07.repository.TeacherRepository;
    
@Controller
	public class HomeController {
//		/*@PostMapping("/login")
//		public String login(Model model,String account, String password) {
//			if ("abc".equals(account) && "123".equals(password))
//				return "home";
//			else
//				return "index";
//		}*/
//		@PostMapping("/login")
//		public String login(Model model) {
//			
//				return "home";
//		}
	
	
	
	
	
	
	
	@Autowired
	private TeacherRepository repository;	
	@GetMapping("/")
	public String login(Model model,String account, String password) {
//		if ("abc".equals(account) && "123".equals(password))
//			return "home";
//		else
			return "index";
	}
	@GetMapping("/login")
	public String login(Model model) {
//		if ("abc".equals(account) && "123".equals(password))
		model.addAttribute("teacher_list",repository.findAll());	
		return "home";
//		else
//			return "index";
			
	}
		
}


