package cloud.kms.ui.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cloud.kms.ui.model.Student;

@Service
public class StudentService {

	@Qualifier("restTemplate")
	@Autowired	 
	RestTemplate restTemplate;
	

	
	final String SERVICE_NAME="cloud-kms-service";
	
	@HystrixCommand(fallbackMethod="fallbackListStudent")
	public List<Student> listStudent() {
		return restTemplate.getForObject("http://"+SERVICE_NAME+"/students", List.class);

	}
	
	public List<Student> fallbackListStudent() {
		List<Student> list=new ArrayList<Student>();
		Student studentA = new Student();
		studentA.setName("Kalen Tang");
		studentA.setAge(20);
		studentA.setScore(60.0);
		list.add(studentA);
		
		return list;
	}
}
