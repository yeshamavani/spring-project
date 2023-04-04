package io.github.yeshamavani.service.hello;

import io.github.yeshamavani.library.core.CoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.yeshamavani.library.core")
@RestController
public class HelloServiceApplication {

	private final CoreService coreService;

	public HelloServiceApplication(CoreService coreService) {
		this.coreService = coreService;
	}

	@GetMapping("/")
	public String getHelloMessage (){
		return coreService.getMessage();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

}
