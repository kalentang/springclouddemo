package cloud.kms.feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	ServiceFacade sFacade;
	
	@RequestMapping(value="hi")
	String sayHello(){
		return sFacade.sayHello();
	}
}
