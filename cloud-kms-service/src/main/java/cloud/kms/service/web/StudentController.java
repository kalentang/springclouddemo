package cloud.kms.service.web;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthDesktopIconUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cloud.kms.service.dao.StudentMapper;
import cloud.kms.service.domain.Student;

@RestController
public class StudentController {

	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> listUser() {
		List<Student> list=new ArrayList<Student>();
		Student studentA = new Student();
		studentA.setName("Zhangsan");
		studentA.setAge(22);
		studentA.setScore(85.0);
		list.add(studentA);

		Student studentB = new Student();
		studentB.setName("LisiLisiLisiLisi");
		studentB.setAge(23);
		studentB.setScore(95.0);
		list.add(studentB);
		return list;
		
	}
	
	@Value("${mysqldb.datasource.url}")
	String url="http";
	
	@Value("${server.port}")
	String sPort; 
	
	@RequestMapping(value="/config")
	public String config() {
		return url+" from port:"+sPort;
	}
	
	@Autowired
	StudentService student;
	
	@RequestMapping(value="/studentlist")
	public List<Student> findStudentList() {
		return student.findStudentList();
	}
}
