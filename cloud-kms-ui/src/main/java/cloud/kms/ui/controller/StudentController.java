package cloud.kms.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.kms.ui.model.Student;
import cloud.kms.ui.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> listUser() {
		
		return studentService.listStudent();
	}
}
