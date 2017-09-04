package cloud.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication 
{
	@Value("${spring.application.name}")
    String name="world";
    
    @RequestMapping("/")
    public String home(){
    	return "Hello "+name;
    }
    
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
    
    
}
