package com.micro.Zoo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ZooController {
	@Autowired
	Dao dao;
	

	@RequestMapping(value="/success",method = RequestMethod.POST)
	public String test(@ModelAttribute("Register")Employee emp) {
		
	      dao.save(emp);
	       
		System.out.println("s"+emp.getEmail());
		return "success";
	}

	@RequestMapping(value="/")
	public ModelAndView register() {
		
		System.out.println("Home");
		return new ModelAndView("home", "command", new Employee());
		
	}
}
