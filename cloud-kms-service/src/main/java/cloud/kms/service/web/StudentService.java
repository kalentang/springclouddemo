package cloud.kms.service.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.kms.service.dao.StudentMapper;
import cloud.kms.service.domain.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public List<Student> findStudentList() {
		return studentMapper.findStudentList();
	}
}
