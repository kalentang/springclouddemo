package cloud.kms.feign.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="cloud-kms-service", fallback=ServiceFacadeImpl.class)
public interface ServiceFacade {

	@RequestMapping(value="/config",method=RequestMethod.GET)
	String sayHello();
}
