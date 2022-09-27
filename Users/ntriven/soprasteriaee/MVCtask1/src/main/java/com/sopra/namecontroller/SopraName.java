package com.sopra.namecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SopraName 
{
	@RequestMapping("/name")
	public String name() {
		return "index";
		
	}

}
