package com.sillycat.springbootaxis;

import java.io.IOException;

import org.apache.axis2.extensions.spring.receivers.ApplicationContextHolder;
import org.apache.axis2.transport.http.AxisServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.sillycat.springbootaxis.service.Axis2ServiceRegister;

@SpringBootApplication
public class SpringBootAxisApplication extends SpringBootServletInitializer {
	@Autowired
	Axis2ServiceRegister register;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAxisApplication.class, args);
	}

	public @Bean ServletRegistrationBean<AxisServlet> servletRegistration() throws IOException {
		ServletRegistrationBean<AxisServlet> bean = new ServletRegistrationBean<AxisServlet>(new AxisServlet(),
				"/services/*");
		bean.setLoadOnStartup(1);
		bean.addInitParameter("axis2.repository.path", register.getRepoPath());
		bean.addInitParameter("axis2.xml.url", new ClassPathResource("axis2.xml").getURL().toString());

		return bean;
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootAxisApplication.class);
	}

	public @Bean ApplicationContextHolder getApplicationContext() {
		ApplicationContextHolder applicationContextHolder = new ApplicationContextHolder();
		return applicationContextHolder;
	}
}
