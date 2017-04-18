package evolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnyController {
	@GetMapping("/filter")
	public String filter(@RequestParam("parameter") String parameter) {
		System.out.println("Controller : Welcome to Google Proxy");
		return "redirect:https://www.google.com.hk/#q=" + parameter;
	}
}
