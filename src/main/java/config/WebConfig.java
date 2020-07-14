/*by JoeK 14/07/20*/
package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"controllers"})
public abstract class WebConfig implements WebMvcConfigurer{ //tells spring im using mvc architcture

}

