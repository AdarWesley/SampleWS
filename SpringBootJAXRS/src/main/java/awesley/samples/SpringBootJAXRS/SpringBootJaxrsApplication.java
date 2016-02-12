package awesley.samples.SpringBootJAXRS;

import org.activiti.spring.boot.DataSourceProcessEngineAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.spring.JaxRsConfig;
import org.apache.cxf.transport.servlet.CXFServlet;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, 
		DataSourceProcessEngineAutoConfiguration.class})
@Import(JaxRsConfig.class)
public class SpringBootJaxrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJaxrsApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean servletRegistrationBean(ApplicationContext context){
		return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
	}
	
	@Bean
	public Server rsServer() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setServiceBean(new HelloService());
		endpoint.setAddress("/helloservice");
		return endpoint.create();
	}
}
