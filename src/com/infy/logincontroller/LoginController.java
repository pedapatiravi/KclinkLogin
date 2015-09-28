package com.infy.logincontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infy.bean.User;
import com.infy.loginservice.LoginServiceImpl;

@Controller
public class LoginController {
	Logger logger=Logger.getLogger(LoginController.class);
@Autowired
LoginServiceImpl loginServiceImpl;

@RequestMapping(value="/index" ,method=RequestMethod.GET)
public ModelAndView getHomePage(){
	ModelAndView model=new ModelAndView("loginpage");
	return model;
}

@RequestMapping(value="/login" ,method=RequestMethod.POST)
public String afterLogin(@ModelAttribute("user") User user){
	logger.info("Logincontroller@ afterLogin()");
	
	System.out.println(user.getUser_name()+" "+user.getUser_password());
	
	   return loginServiceImpl.loginCheck(user)?"success":"loginpage";
	
}


}
