package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact us");
		return "contact";
	}
	
	@RequestMapping(path ="/processform",method = RequestMethod.POST)
	public String handlerForm(HttpServletRequest request) {
	String name=	request.getParameter("userName");
	System.out.println(name);
		return "";
	}
}
