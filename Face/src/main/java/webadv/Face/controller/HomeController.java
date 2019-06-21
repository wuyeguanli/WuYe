package webadv.Face.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.Face.repository.CheweiRepository;
import webadv.Face.repository.FeiyongRepository;
import webadv.Face.repository.ListRepository;

  
@Controller
public class HomeController {
	@Autowired
	private CheweiRepository cw_findAll;//查找所有
	
	@Autowired
	private CheweiRepository cw_selectID;//模糊查询
	
	@Autowired
	private CheweiRepository cw_deleteID;//车位删除
	
	@Autowired
	private CheweiRepository cw_updateID;//车位删除
	
	@Autowired
	private FeiyongRepository fy_fingALl;
	
	@Autowired
	private ListRepository cost_call;
	
	@GetMapping("/")
	public String Index(Model model) {
			return "index";
	} 
	@GetMapping("/login")
	public String login(Model model) {
			return "home";
	}
	@GetMapping("/reminder")
	public String reminder(Model model) {
		return "lhy_CostReminder";
	}
	@GetMapping("call")
	public String call(int id,String num,String result,String time,Model model) {
//		String sql="insert into cost values("+id+",'"+num+"','"+result+"','"+time+"')";
//		System.out.print(sql);
		model.addAttribute("list_message",cost_call.Insert(id, num, result, time));
		model.addAttribute("list_cost",cost_call.findAll());
		return "lhy_CostCall";
	}
	@GetMapping("/modify")
	public String modify(Model model) {
		model.addAttribute("feiyong_list",fy_fingALl.findAll());
		return "lhy_ModifyCost";
	}
	
	@GetMapping("/park")
	public String park(Model model) {
		model.addAttribute("chewei_list",cw_findAll.findAll());	
		return "lhy_ParkManagement";
	}
	
	@GetMapping("/chewei_delete")
	public String chewei_delete(int id ,Model model) {
		System.out.println(id);
		model.addAttribute("del_message",cw_deleteID.delID(id));	
		model.addAttribute("chewei_list",cw_deleteID.findAll());
		return "lhy_ParkManagement";
	}
	
	@GetMapping("/chewei_update")
	public String chewei_update(int id ,Model model) {
		model.addAttribute("id",id);
		return "lhy_UpdateState";
	}
	
	@GetMapping("/state_update")
	public String state_update(int id,String address, String state,Model model) {
		model.addAttribute("update_message",cw_updateID.update(id, address,state));	
		model.addAttribute("chewei_list",cw_updateID.findAll());
		return "lhy_ParkManagement";
	}
	
	
	@GetMapping("/state")
	public String state(Model model) {
		return "lhy_ParkState";
		
	}

	@GetMapping("/state_select")
	public String Park_select(int id,Model model) {
		model.addAttribute("id",id);
		model.addAttribute("chewei_list",cw_selectID.findID(id));	
		System.out.println(id);
		return "lhy_StateSelect";
	}
	
}


