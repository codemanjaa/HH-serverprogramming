package com.mayura.HH.web;
import groovyjarjarantlr.collections.List;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mayura.HH.domain.Student;




@Controller
public class StudentController {

	 @RequestMapping(value="/hello", method=RequestMethod.GET)
	    public String studentForm(Model model) {
	    
		//List<Student>  studentList =  new ArrayList<Student>();
		 ArrayList studentList = new ArrayList<Student>();
		
		Student kate = new Student("Kate","Cole","Kata@cole.com");
		Student dan = new Student("Dan","Brown","dan@brown.com");
		Student mike = new Student("Mike","Mars","mike@mars.com");
		studentList.add(kate);
		studentList.add(dan);
		studentList.add(mike);
		
		 //model.addAttribute("Student", new Student());
			model.addAttribute("studentList", studentList);
		//model.addAllAttributes("Lister",studentList);
	        return "helloStudent";
	    }

	    @RequestMapping(value="/hello", method=RequestMethod.POST)
	    public String greetingSubmit(@ModelAttribute Student student, Model model) {
	        model.addAttribute("Student", student);
	        return "result";
	    }

	
	
}
