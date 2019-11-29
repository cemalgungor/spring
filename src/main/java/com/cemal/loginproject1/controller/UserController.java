
package com.cemal.loginproject1.controller;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cemal.loginproject1.dao.model.User;
import com.cemal.loginproject1.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	//my home page
	@GetMapping("home")
	public String home() {
			return "home";
	}
	@GetMapping("/users")
	public List<User> get() {
			return userService.get();
	}
	@GetMapping("reg")
	public String reg() {
			return "newreg";
	}
	//login user
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView validateUsr(@RequestParam("username")String username, @RequestParam("password")String password) {
        String msg = "";
     
        
        boolean isValid = userService.findUser(username, password);
       
 
        if(isValid) {
            msg = "Welcome " + username + "!";
           
        } else {
 
            msg = "we dont find that user";
            return new ModelAndView("result", "output", msg);
    
        }
 
        return new ModelAndView("result", "output", msg);
    }
	//new user to database
	@RequestMapping(value = "/registiration", method = RequestMethod.POST)
    public ModelAndView registirationUsr(@RequestParam("username")String username, @RequestParam("password")String password) {
		 String msg = "";
		  boolean isValid = userService.save(username, password);
		  if(isValid) {
	            msg = "Welcome " + username + "!";
	           
	        } else {
	 
	            msg = "we have that username";
	            return new ModelAndView("result", "output", msg);
	    
	        }
		  
     return new ModelAndView("result", "output",msg);
    		
    }
	
	@RequestMapping(value = "/logout", method= RequestMethod.GET)
    public String logout(HttpSession session) {
      session.invalidate();
      return "home";
    }

}
