package org.rose.controller;

import java.util.Map;

import org.rose.service.WishMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("wishController")
public class WishMessageController {
	
	@Autowired
	private WishMessageService service;

	/* Does not work bcoz 'ModelAndView' is not is parameter list of handler method.
	 * @RequestMapping("/wish.htm") public String getMessage(ModelAndView mov){
	 * String msg = service.getWishMessage(); mov.addObject("wMsg", msg); return
	 * "result"; }
	 */
	
//	@RequestMapping("/wish.htm")
//	public String getMessage(Model model){
//		System.out.println("class : "+model.getClass());	//BindingAwareModelMap
//		String msg = service.getWishMessage();
//		model.addAttribute("wMsg", msg);
//		return "result";
//	}
	
//	@RequestMapping("/wish.htm")
//	public String getMessage(Map<String,Object> map){
//		System.out.println("class : "+map.getClass());	//BindingAwareModelMap
//		String msg = service.getWishMessage();
//		map.put("wMsg", msg);
//		return "result";
//	}
	
	@RequestMapping("/wish.htm")
	public void getMessage(Map<String,Object> map){
		System.out.println("class : "+map.getClass());	//BindingAwareModelMap
		String msg = service.getWishMessage();
		map.put("wMsg", msg);
	}
	
	@RequestMapping("/welcome.htm")
	public void homeComp() {
		
	}

}
