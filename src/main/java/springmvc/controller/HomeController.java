package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
@RequestMapping("/home")	
public String home(Model model) {
	System.out.println("This is home URL");
	List<String> course= new ArrayList<String>();
	course.add("Java");
	course.add("DOt.NET");
	course.add("PhP");
	course.add("NODE.JS");
	
	model.addAttribute("name","Shaikh");
	model.addAttribute("roll",1233);
	model.addAttribute("isTrue",false);
	model.addAttribute("course",course);
	
	return "index";
   }
@RequestMapping("/about")
public String about() {
	System.out.println("This is about controller");
	return "about";
}
@RequestMapping("/help")
public ModelAndView help() {
	
	//create Object
	ModelAndView modelAndView = new ModelAndView();
	
	//set up data
	List<Integer> num= new ArrayList<Integer>();
	num.add(1);
	num.add(2);
	num.add(3);
	
	modelAndView.addObject("name","Shaikh");
	modelAndView.addObject("ID",100);
	LocalDateTime now =  LocalDateTime.now();
	modelAndView.addObject("date",now);
	modelAndView.addObject("number",num);
	//set up view name
	modelAndView.setViewName("help");
	
	System.out.println("This is help controller");
	return modelAndView;
}

}
