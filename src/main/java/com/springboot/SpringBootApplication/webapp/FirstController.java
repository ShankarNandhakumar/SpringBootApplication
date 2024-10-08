package com.springboot.SpringBootApplication.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class FirstController {

//	@RequestMapping("/home")
//	public String home(String name, HttpSession session) {
////		HttpSession session=req.getSession();
////		String name=req.getParameter("name");
//		System.out.println("output displayed"+ name);
//		session.setAttribute("name", name);
//		return "home";
//	}
	
	
	@GetMapping("/home")
	public ModelAndView home(@RequestParam("name") String value) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", value);
		mv.setViewName("home");
		return mv;
		
	}
}
