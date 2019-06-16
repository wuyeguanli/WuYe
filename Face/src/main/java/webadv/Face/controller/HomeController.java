package webadv.Face.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import webadv.Face.repository.CheweiRepository;
import webadv.Face.repository.HuzhuRepository;

  
@Controller
	public class HomeController {

	@Autowired
	private HuzhuRepository repository;	
	@GetMapping("/")
	public String login(Model model,String account, String password) {
			return "index";
	}
	
//	@GetMapping("/login")
//	public String chewei(Model model) {
//		model.addAttribute("chewei_list",repository.findAll());	
//		return "home";
//	}
	
//	@GetMapping("/login")
//	public String fangchan(Model model) {
//		model.addAttribute("fangchan_list",repository.findAll());	
//		return "home";
//	}
	
//	@GetMapping("/login")
//	public String feiyong(Model model) {
//		model.addAttribute("feiyong_list",repository.findAll());	
//		return "home";
//	}
	
//	@GetMapping("/login")
//	public String gonggao(Model model) {
//		model.addAttribute("gonggao_list",repository.findAll());	
//		return "home";
//	}
	
//	@GetMapping("/login")
//	public String shebei(Model model) {
//		model.addAttribute("shebei_list",repository.findAll());	
//		return "home";
//	}

	@GetMapping("/login")
	public String huzhu(Model model) {
		model.addAttribute("huzhu_list",repository.findAll());	
		return "home";
	}
	
	@GetMapping(value="/hello",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String hello() {
		return "<h1>Hello,Spring...</h1>";
	}
		
}


