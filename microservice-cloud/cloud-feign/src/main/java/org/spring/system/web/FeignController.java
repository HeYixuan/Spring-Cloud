package org.spring.system.web;

import org.spring.system.service.ConsumerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	
	@Autowired
	private ConsumerClientService consumerClientService;
	
	@RequestMapping(method=RequestMethod.GET,value="/add")
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b){
		return consumerClientService.add(a,b);
	}
}
