package chauncy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = "chauncy.*")
@EnableJpaRepositories(basePackages = "chauncy.*")
@EntityScan("chauncy.*")
public class APP {
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
