package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Change to War:
 *      1. Implement SpringBootServletInitializer;
 *      2. Change packaging to war
 *      3. Set spring-boot-starter-tomcat to provider
 *      4. In Eclipse, change facet, add Java, Rest (JAX RS), Javascript, Dynamic Web
 *
 * @author Lsun
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer  {

    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
