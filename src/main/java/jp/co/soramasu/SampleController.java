package jp.co.soramasu;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "Spring VC");
		return "hello";
	}
}
