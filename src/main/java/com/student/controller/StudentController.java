package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entity.Student;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student", student);		
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("students/edit/{id}")
	public String editStudent(@PathVariable int id, Model model) {
		
		model.addAttribute("student", studentService.getStudentbyId(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute Student student) {
		Student student2 = studentService.updateStudent(student);
		if(student2!=null)
		{
			System.out.println("Update Successfully");
		}else
		{
			System.out.println("Not Updated");
		}
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudentbyId(id);
		return "redirect:/students";
	}
	
	
	

}
