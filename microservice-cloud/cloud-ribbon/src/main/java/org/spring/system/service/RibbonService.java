package org.spring.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String addService() {
		return restTemplate.getForEntity("http://cloud-consumer/add?a=10&b=20", String.class).getBody();
	}

	public String addServiceFallback() {
		return "error";
	}
}
