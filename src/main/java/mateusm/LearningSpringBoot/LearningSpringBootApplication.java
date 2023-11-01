package mateusm.LearningSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class LearningSpringBootApplication {

	private final ApiConfiguration apiConfiguration = new ApiConfiguration(new DefaultApiInitializer());

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringBootApplication.class, args);
	}

	@GetMapping("/configure")
	public String configure() {
		return apiConfiguration.getMessage();
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@GetMapping("/about")
	public String about() {
		return "about us";
	}

	@GetMapping("/restartApi")
	public String restartApi() {
		Boolean apiRestarted = apiConfiguration.restart();
		if (apiRestarted) {
			return "Api Restarted successfully";
		}
		return "Api not restarted";
	}
}
