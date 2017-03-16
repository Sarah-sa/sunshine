package com.sunshine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunshine.service.VolunteerActivityService;

@Controller
@RequestMapping("/volunteeractivity")
public class VolunteerActivityController {
@Autowired
private VolunteerActivityService vas;


@RequestMapping("/getAll")
private String showAllVolunteerAtivity(){
	              
	
	return null;
}
	
@RequestMapping("/getAllOn")
private String showAllVolunteerOnAtivity(){
	         
	
	return null;
}


@RequestMapping("/getAllhistory")
private String showAllVolunteerhistoryAtivity(){
	         
	
	return null;
}

}
