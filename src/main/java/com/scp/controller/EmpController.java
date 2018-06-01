package com.scp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scp.model.EmpModel;
import com.scp.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/emps", method=RequestMethod.GET)
	public ModelAndView getEmps(){
		System.out.println("getEmps() called");
		List<EmpModel> l = empService.getEmps();
		ModelAndView model = new ModelAndView("home", "emps", l);
		return model;
	}
	
	@RequestMapping(value="/newEmp", method=RequestMethod.GET )
	public ModelAndView newEmp(){
		ModelAndView model = new ModelAndView("EmpForm");
		EmpModel emp = new EmpModel();
		model.addObject("emp", emp);
		return model;
	}
	
	@RequestMapping(value="addEmp", method=RequestMethod.POST )
	public ModelAndView addEmp(@ModelAttribute EmpModel emp){
		empService.addEmp(emp);
		return new ModelAndView("redirect:/emps");
		
	}
	
	

}
