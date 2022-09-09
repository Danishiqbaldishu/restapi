package com.Springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Springrest.springrest.Stuinfo.Student;
import com.Springrest.springrest.infomation.Information;

@RestController 
public class Mycontroller 
{
	
	@Autowired
	public Information informations;
	
	
	@GetMapping("/home")
	public String home()
	{
		return null;
	}; 
	
	//Student
	@GetMapping("/Student")
	public List<Student> getStudent()
	{
		return this.informations.getStudent(); 
	}
	
	@GetMapping("/Student/{studentId}")
	public Student getStudents(@PathVariable String studentId)
	{
		return this.informations.getStudents(Long.parseLong(studentId));
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student)
	{
		return this.informations.addStudent(student);
	}
	
	@PutMapping("/updateinfo")
	public Student updateinfo (@RequestBody Student student)
	{
		return this.informations.updateinfo(student);
	}
	
	@DeleteMapping("/deleteinfo")
	public  Student deleteinfo (@RequestBody Student student)
	{
		return this.informations.deleteinfo(student);
	}
	

}
