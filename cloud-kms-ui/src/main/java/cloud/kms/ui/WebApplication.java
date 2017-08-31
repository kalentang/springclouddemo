package cloud.kms.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class WebApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebApplication.class, args);
    }
    
    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
    	return new RestTemplate();
    }
    
}
