package jp.co.soramasu.controller;


import jp.co.soramasu.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@Autowired
	private HelloService helloService ;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		String word = helloService.saySomething();
		model.addAttribute("msg", word);
		return "hello";
	}
}
