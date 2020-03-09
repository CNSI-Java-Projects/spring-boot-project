package com.sample.springbootproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

@Controller
public class UserController {

	@RequestMapping("addUser")
	@ResponseBody
	public String addUser(HttpServletRequest req, HttpServletResponse resp) {
		//System.out.println("request is : ");
		String userName = req.getParameter("name");
		return "Hello " + userName;
		//return "users";
	}
	
	@RequestMapping("addTask")
	@ResponseBody
	public String addTask(@RequestParam("tName") String taskName) {
		return "Hello " + taskName;
		
	}
	
	@RequestMapping("showWeb")
	public String showWeb(@RequestParam("text") String myText, HttpSession session) {
		session.setAttribute("text", myText);
		return "demopage";
		
	}
}
