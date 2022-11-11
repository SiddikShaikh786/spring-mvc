package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact us");
		return "contact";
	}
	
	@RequestMapping(path ="/processform",method = RequestMethod.POST)
	public String handlerForm(
			@RequestParam("userName") String userName,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model)
	{
		System.out.println("user name "+userName);
		System.out.println("your Email "+email);
		System.out.println("password "+password);
		
		model.addAttribute("name", userName);
		model.addAttribute("email",email);
		model.addAttribute("password",password);
	
		return "success";
	}
}
