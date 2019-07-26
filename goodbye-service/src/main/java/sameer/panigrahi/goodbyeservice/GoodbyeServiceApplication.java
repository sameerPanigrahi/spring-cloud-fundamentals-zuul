package sameer.panigrahi.goodbyeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class GoodbyeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyeServiceApplication.class, args);
	}

	@RequestMapping
	public String getString() {
		return "Goodbye";
	}

}
