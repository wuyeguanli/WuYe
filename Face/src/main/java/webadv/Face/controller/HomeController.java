package webadv.Face.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.Face.repository.CheweiRepository;
import webadv.Face.repository.FangchanRepository;
import webadv.Face.repository.FeiyongRepository;
import webadv.Face.repository.GonggaoRepository;
import webadv.Face.repository.HuzhuRepository;
import webadv.Face.repository.ListRepository;
import webadv.Face.repository.ShebeiRepository;

  
@Controller
public class HomeController {
	@Autowired
	private CheweiRepository cw_findAll;//查找共享
	
	@Autowired
	private CheweiRepository cw_findPer;//查找私人
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
	@GetMapping("/login") //登陆
	public String login(Model model) {
			return "home";
	}
	@GetMapping("/reminder")
	public String reminder(Model model) {
		return "lhy_CostReminder";
	}
	@GetMapping("call")//费用催缴
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
	
	
	@GetMapping("/person")
	public String person(Model model) {
		model.addAttribute("chewei_list",cw_findPer.findPer());	
		return "lhy_ParkPerson";
	}
	
	@GetMapping("/chewei_delete")	//删除
	public String chewei_delete(int id ,Model model) {
		System.out.println(id);
		model.addAttribute("del_message",cw_deleteID.delID(id));	
		model.addAttribute("chewei_list",cw_deleteID.findAll());
		return "lhy_ParkManagement";
	}
	
	@GetMapping("/chewei_update")	//更新界面
	public String chewei_update(int id ,Model model) {
		model.addAttribute("id",id);
		return "lhy_UpdateState";
	}
	
	@GetMapping("/state_update")	//更新后的查询
	public String state_update(int id,String address, String state,Model model) {
		model.addAttribute("update_message",cw_updateID.update(id, address,state));	
		model.addAttribute("chewei_list",cw_updateID.findAll());
		return "lhy_ParkManagement";
	}
	
	
	@GetMapping("/chewei_update_person")	//更新界面
	public String chewei_update_person(int id ,Model model) {
		model.addAttribute("id",id);
		return "lhy_UpdateState_Person";
	}
	
	@GetMapping("/state_update_person")	//更新后的查询
	public String state_update_person(int id,String address, String state,Model model) {
		model.addAttribute("update_message",cw_updateID.update(id, address,state));	
		model.addAttribute("chewei_list",cw_updateID.findPer());
		return "lhy_ParkPerson";
	}

	
	
	@GetMapping("/state")
	public String state(Model model) {
		return "lhy_ParkState";
		
	}

	@GetMapping("/state_select")//车位信息删除
	public String Park_select(int id,Model model) {
		model.addAttribute("id",id);
		model.addAttribute("chewei_list",cw_selectID.findID(id));	
		System.out.println(id);
		return "lhy_StateSelect";
	}
	
	
	
	
	
	
	@Autowired
	private GonggaoRepository gg_findall;
	@Autowired
	private GonggaoRepository gg_selecttime;
	@Autowired
	private GonggaoRepository gg_add;
	@Autowired
	private GonggaoRepository gg_update;
	@Autowired
	private GonggaoRepository gg_delect;

	
	


	
	@GetMapping("/lswaddNotice")
	public String lswaddNotice(Model model) {
		return "lswaddNotice";
	}
	
	@GetMapping("/addNotice")
	public String Register(int id,String title,String notice,String time,String publisher,Model model) {
		model.addAttribute("gonggao_message",gg_add.Insert(id, title, notice, time, publisher));
		System.out.print(id);
		return "message";
	}
	
	@GetMapping("/lswselectNotice")
	public String lswdelectNotice(Model model) {
		return "lswselectNotice";
	}

	@GetMapping("/select_Notice")
	public String selectNotice(Model model,String time) {
		model.addAttribute("gonggao_list",gg_selecttime.findtime(time));	
		return "lswselectresultNotice";
	}
	
	@GetMapping("/update_Notice")
	public String updateNotice(int id,Model model) {
		model.addAttribute("id",id);
		return "lswupdateNotice";
	}
	
	@GetMapping("/updateNotice")
	public String update(int id,String title,String notice,String time,String publisher) {
		gg_update.update(id, title, notice, time, publisher);
		gg_update.findAll();
		return "message";
	}
	
	@GetMapping("/delete_Notice")
	public String deleteNotice(int id ,Model model) {
		model.addAttribute("gonggao_message",gg_delect.delid(id));	
		model.addAttribute("gonggao_list",gg_delect.findAll());
		return "message";
	}
	
	@Autowired
	private ShebeiRepository sb;
	@GetMapping("/lyxAddpark")
	public String lyxAddpark(Model model) {
		return "lyxAddpark";
	}
	
	@GetMapping("/Addpark")
	public String Addpark(int id,String name,String num,String state,Model model) {
		model.addAttribute("shebei_message",sb.Insert(id, name, num, state));
		return "message";
	}
	@GetMapping("/lyxDelectpark")
	public String lyxDelectpark(Model model) {
		model.addAttribute("shebei_list",sb.findAll());
		return "lyxDelectpark";
	}
	@GetMapping("/Delectpark")
	public String Delectpark(int id,Model model) {
		model.addAttribute("shebei_message",sb.delid(id));	
		return "message";
	}
	@GetMapping("/lyxFixpark")
	public String lyxFixpark(Model model) {
		model.addAttribute("shebei_list",sb.findAll());
		return "lyxFixpark";
	}
	@GetMapping("/Fixpark")
	public String Fixpark(int id,Model model) {
		model.addAttribute("id",id);
		return "lyxupdatepark";
	}
	@GetMapping("/fixpark")
	public String update(int id,String name,String num,String state,Model model) {
		sb.update(id, name, num, state);
		return "message";
	}


	
	
	@Autowired
	private HuzhuRepository Huzhu;
	@Autowired
	private FangchanRepository fangchan;

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
		Huzhu.deleteUser(address2);
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
	
	@GetMapping("/wj_state_update")
	public String wjstate_update(Model model,String address,String size ,String state,String specifications) {
		System.out.print("update  fangchan set size="+size+" ,state="+state+" ,specifications="+specifications+" where address="+address+"");
		fangchan.updatehouse(address, size, state, specifications);
		model.addAttribute("fangchan_list", fangchan.findAll());
		return "wjSearchHouse";
	}
	
	
}


