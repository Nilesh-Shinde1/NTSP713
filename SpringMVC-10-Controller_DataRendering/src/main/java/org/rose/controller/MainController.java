package org.rose.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.rose.dto.EmpDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/show")
	public String showData(Map<String, Object> map) {
		List<String> fruits = List.of("Mango","Apple","Grapes");
		Set<String> books = Set.of("Maths","Chemistry","Bio");
		Map<String,Float> glossary = Map.of("Sugar",10.0f,"Aata", 40.0f, "Spices", 1.0f);
		String[] colors = {"red","orange","white","green"};
		EmpDTO dto = new EmpDTO("Nilesh","Team Lead", 300000.53);
		
		map.put("fruitsList", fruits);
		map.put("booksSet",books);
		map.put("glossaryMap",glossary);
		map.put("colorsArray",colors);
		map.put("emp", dto);
		return "result";
	}
}
