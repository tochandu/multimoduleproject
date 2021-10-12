package captemplate.lifecyle;

import captemplate.data.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Application Main entry class for starting the Springboot Application.
 * @author Chandresh Singh
 */

@SpringBootApplication(scanBasePackages={"captemplate.*","captemplate.service.*","captemplate.controller"})
#enablemysql#
#enablemogno#
public class CapTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapTemplateApplication.class, args);
	}
}