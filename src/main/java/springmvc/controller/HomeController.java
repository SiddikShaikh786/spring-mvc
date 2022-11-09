package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
@RequestMapping("/home")	
public String home(Model model) {
	System.out.println("This is home URL");
	model.addAttribute("name","Shaikh");
	model.addAttribute("roll",1233);
	model.addAttribute("isTrue",false);
	return "index";
   }
@RequestMapping("/about")
public String about() {
	System.out.println("This is about controller");
	return "about";
}

}
