package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Ram", "Sharma", "123456789");
		 * 
		 * studentRepo.save(student1);
		 * 
		 * Student student2 = new Student("Husna", "Yt", "654321987");
		 * studentRepo.save(student2);
		 */
		
	}
	
	

}
