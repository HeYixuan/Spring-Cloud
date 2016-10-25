package org.spring.system.web;

import org.spring.system.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

	@Autowired
	private RibbonService ribbonService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return ribbonService.addService();
	}
}
