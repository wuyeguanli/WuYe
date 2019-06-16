package webadv.s99201105.p3;

import java.awt.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model,String account, String password) {
		if ("abc".equals(account) && "123".equals(password))
			return "home";
		else
			return "index";
	}
	@GetMapping("/login")
	public String login(Model model) {
//		if ("abc".equals(account) && "123".equals(password))
			return "home";
//		else
//			return "index";
	}
	@GetMapping("/wjAddHouse")
	public String AddHouse(Model model) {
		return "wjAddHouse";
	}
	@GetMapping("/wjSearchHouse")
	public String search(Model model) {
		return "wjSearchHouse";
	}
}

