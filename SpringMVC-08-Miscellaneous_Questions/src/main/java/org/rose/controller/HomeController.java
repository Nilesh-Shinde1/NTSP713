package org.rose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("homeCtrl")
public class HomeController {
	
	/*	//urls are case sensitive
	 * @RequestMapping("/welcome") public String showHome1() { return "home1"; }
	 * 
	 * @RequestMapping("/WELCOME") public String showHome2() { return "home2"; }
	 */
	

	//default methodtype is 'GET'
	//if post request came and there is no method to handle the request url with POST then 
	//it will be handled by method having handling url and GET mode
	@RequestMapping(value="/welcome")
	public String showHome1() {
		System.out.println("showHome1()");
		return "home1";
	}

	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String showHome2() {
		return "home2";
	}

}
