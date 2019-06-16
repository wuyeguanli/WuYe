package webadv.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String Index(Model model) {
			return "index";
	} 
	@GetMapping("/login")
	public String login(Model model,String account, String password) {
			return "home";
	}
	@GetMapping("/reminder")
	public String reminder(Model model,String account, String password) {
			return "lhy_CostReminder";
	}
	@GetMapping("/modify")
	public String modify(Model model,String account, String password) {
			return "lhy_ModifyCost";
	}
	@GetMapping("/park")
	public String park(Model model,String account, String password) {
			return "lhy_ParkManagement";
	}
	@GetMapping("/state")
	public String state(Model model,String account, String password) {
			return "lhy_ParkState";
	}
	
}