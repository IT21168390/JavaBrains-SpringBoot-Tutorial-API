package springboot.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Added the (exclude = {DataSourceAutoConfiguration.class }) to avoid :

		/*Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

			Reason: Failed to determine a suitable driver class
			
			
			Action:
			
			Consider the following:
				If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
				If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).
		*/

// The above error caused by adding the database dependencies to the pom.xml. If that added, relevant configuration such as 'url' should be added.


@SpringBootApplication
//@ComponentScan("springboot.javabrains.topic")		// Additional. May need in some cases.
public class API_App {

	public static void main(String[] args) {
	
		SpringApplication.run(API_App.class, args);

	}

}
