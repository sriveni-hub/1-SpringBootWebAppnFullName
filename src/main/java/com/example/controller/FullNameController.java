package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FullNameController {
	@RequestMapping("/")
public String FullNameForm()
{
	return "name";
}
	@RequestMapping("/submit")
	public String printFullName(@RequestParam String fname,@RequestParam String lname,ModelMap model) {
		model.put("k1", fname);
		model.put("k2", lname);
		String FullName=fname+" "+lname;
		model.put("fullname", FullName);
		
		return "result";
	}
}
