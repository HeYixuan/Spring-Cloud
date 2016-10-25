package org.spring.system.service;

import org.spring.system.service.impl.ConsumerClientServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="cloud-consumer",fallback=ConsumerClientServiceHystrix.class)
public interface ConsumerClientService {
	
	@RequestMapping(method=RequestMethod.GET, value="/add")
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
