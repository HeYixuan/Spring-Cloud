package org.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.system.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class Application {
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
		logger.info("Cloud-Gateway Boot Start Successfully");
	}
	
	
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}

}
