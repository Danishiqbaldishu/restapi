package com.Springrest.springrest.infomation;
import java.util.List;

import com.Springrest.springrest.Stuinfo.Student;
public interface Information 
{
 public List<Student>getStudent();

 public Student getStudents(long studentId);
 
 public Student addStudent(Student student);
 
 public Student updateinfo (Student student);
  
 public Student deleteinfo (Student student);
 
 
}
