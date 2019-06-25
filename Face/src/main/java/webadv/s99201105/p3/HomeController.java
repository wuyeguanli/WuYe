package webadv.s99201105.p3;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.Face.entity.Huzhu;
import webadv.Face.repository.CheweiRepository;
import webadv.Face.repository.FangchanRepository;
import webadv.Face.repository.HuzhuRepository;

@Controller
public class HomeController {
//	@GetMapping("/")

//	@GetMapping("/login")
//	public String login(Model model) {
//		return "home";
//	}
	@Autowired
	private HuzhuRepository Huzhu;
	@Autowired
	private FangchanRepository fangchan;

	@GetMapping("/")
	public String index(Model model, String account, String password) {
		if ("abc".equals(account) && "123".equals(password))
			return "home";
		else
			return "index";
	}
	@GetMapping("/login")
	public String chewei(Model model) {
		model.addAttribute("s", "s");
		return "home";
	}

	@GetMapping("/wjAddHouse")
	public String AddHouse(Model model) {
//		model.addAttribute("","");
		return "wjAddHouse";
	}

	@GetMapping("/wjSearchHouse")
	public String searchHouse(Model model) {
		model.addAttribute("fangchan_list", fangchan.findAll());
		return "wjSearchHouse";
	}

	@GetMapping("/wjSearchHouse1")
	public String searchHouse1(Model model, String address, String size, String state, String specifications) {
		model.addAttribute("fangchan_list", fangchan.Addhouse(address, size, state, specifications));
		model.addAttribute("fangchan_list", fangchan.findAll());
		return "wjSearchHouse";
	}

	@GetMapping("/wjSearchUser1")
	public String searchUser1(Model model, int id, String name, String tel, String address) {
		System.out.println(name);
		boolean result= Huzhu.Adduser(address, name, tel, id);
		model.addAttribute("result", result);
		model.addAttribute("huzhu_list", Huzhu.findAll());
		return "wjSearchUser";
	}

	@GetMapping("/deleteHouse")
	public String deleteHouse(Model model, String address1) {
		System.out.println(address1);
		fangchan.deletehouse(address1);
		model.addAttribute("fangchan_list", fangchan.findAll());
		return "wjSearchHouse";
	}
	@GetMapping("/deleteUser")
	public String deleteUser(Model model, String address2) {
		System.out.println(address2);
		fangchan.deletehouse(address2);
		model.addAttribute("huzhu_list", Huzhu.findAll());
		return "wjSearchUser";
	}
	@GetMapping("/wjAddUser")
	public String wjAddUser(Model model) {
		return "wjAddUser";
	}

	@GetMapping("/wjSearchUser")
	public String wjSearchUser(Model model) {
		model.addAttribute("huzhu_list", Huzhu.findAll());
		return "wjSearchUser";
	}
	
	@GetMapping("/wjUpdateHouse")
	public String wjUpdateHouse(Model model,String address) {
		model.addAttribute("address", address);
		return "wjUpdateHouse";
	}
	
	@GetMapping("/wjUpdateUser")
	public String wjUpdateUser(Model model,String address) {
		model.addAttribute("address", address);
		return "wjUpdateUser";
	}
	
	@GetMapping("/user_update")
	public String wjuser_update(Model model,String address,String name,String tel,int id) {
		Huzhu.updateUser(address, name, tel, id);
		model.addAttribute("huzhu_list", Huzhu.findAll());
		return "wjSearchUser";
	}
	
	@GetMapping("/state_update")
	public String wjstate_update(Model model,String address,String size ,String state,String specifications) {
		System.out.print("update  fangchan set size="+size+" ,state="+state+" ,specifications="+specifications+" where address="+address+"");
		fangchan.updatehouse(address, size, state, specifications);
		model.addAttribute("fangchan_list", fangchan.findAll());
		return "wjSearchHouse";
	}
}
