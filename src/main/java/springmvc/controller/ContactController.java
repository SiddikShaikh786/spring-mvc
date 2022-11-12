package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
@Controller

public class ContactController {
	@ModelAttribute
	public void commonData(Model m) {
	
		m.addAttribute("course","Learn code with Durgesh");
	}

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact us");
		return "contact";
	}
	
	@RequestMapping(path ="/processform",method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
	
		model.addAttribute("user",user);
		return "success";
	}
	
	
	//@RequestParam(); annonation
/*	@RequestMapping(path ="/processform",method = RequestMethod.POST)
	public String handlerForm(
			@RequestParam("userName") String userName,
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword,
			Model model)
	{
		User user  =  new User();
		user.setUserName(userName);
		user.setEmail(userEmail);
		user.setPassword(userPassword);
		
		System.out.println("user name "+userName);
		System.out.println("your Email "+userEmail);
		System.out.println("password "+userPassword);
		
		/*
		 * model.addAttribute("name", userName);
		 *  model.addAttribute("email",email);
		 * model.addAttribute("password",password);
		 
	
		model.addAttribute("user",user);
		return "success";
	}
	*/

}



