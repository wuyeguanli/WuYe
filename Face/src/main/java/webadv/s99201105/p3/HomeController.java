package webadv.s99201105.p3;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.Face.repository.CheweiRepository;
import webadv.Face.repository.FangchanRepository;
import webadv.Face.repository.HuzhuRepository;


@Controller
public class HomeController {
//	@GetMapping("/")
//	public String index(Model model, String account, String password) {
//		if ("abc".equals(account) && "123".equals(password))
//			return "home";
//		else
//			return "index";
//	}

//	@GetMapping("/login")
//	public String login(Model model) {
//		return "home";
//	}
	@Autowired
	private HuzhuRepository repository;
	@Autowired
	private FangchanRepository fangchan;
 	@GetMapping("/")
	public String login(Model model,String account, String password) {
			return "index";
	}
	@GetMapping("/login")
	public String chewei(Model model) {
		model.addAttribute("s","s");	
		return "home";
	}
    
	@GetMapping("/wjAddHouse")
	public String AddHouse(Model model,String address,int size,String state,String specifications,) {
		model.addAttribute("","")
		return "wjAddHouse";
	}

	@GetMapping("/wjSearchHouse")
	public String searchHouse(Model model) {
		model.addAttribute("fangchan_list",fangchan.findAll());
		return "wjSearchHouse";
	}

	@GetMapping("/wjAddUser")
	public String wjAddUser(Model model) {
		return "wjAddUser";
	}
	
	@GetMapping("/wjSearchUser")
	public String wjSearchUser(Model model) {
		model.addAttribute("huzhu_list",repository.findAll());
		return "wjSearchUser";
	}
}
