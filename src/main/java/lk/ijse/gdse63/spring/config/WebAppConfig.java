package lk.ijse.gdse63.spring.config;

import lk.ijse.gdse63.spring.api.EmployeeApi;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {EmployeeApi.class})
public class WebAppConfig {
}
