package com.Springrest.springrest.infomation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Springrest.springrest.Stuinfo.Student;

@Service
public class Studentinfo implements Information {

	List<Student> list;
	
	public Studentinfo()
	{
	  list = new ArrayList<>();
	  {
		 list.add(new Student(123,"Danish","Noida")); 
		 list.add(new Student(456,"Ashish","Hydrabad")); 
		 list.add(new Student(789,"Pankaj","Ghazipur")); 
		 list.add(new Student(111,"Anas","Delhi")); 
		 list.add(new Student(222,"Arish","Mumbai")); 
	  }
	}
	
	
//	@Override
	public List<Student> getStudent() 
	{
		return list;
	}


	@Override
	public Student getStudents(long studentId) {
		Student c= null;
		for (Student Student:list)
		{
			if(Student.getId() == studentId)
			{
				c= Student;
				break;
			}
		}
		return c;
	}


	@Override
	public Student addStudent(Student student) {
		list.add(student);
		
		
		return student;
	}


	@Override
	public Student updateinfo(Student student) 
	{
		list.forEach( e ->{
			if(e.getId() == student.getId())
			{
				e.setId(student.getId());
				e.setName( student.getName());
				e.setAddress(student.getAddress());
			}			
		});
		return student;
	}


	


	




	
	
	
	
	
	
	
	
	
	
	
	

}
