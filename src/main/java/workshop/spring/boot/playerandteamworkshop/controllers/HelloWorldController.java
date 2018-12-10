package workshop.spring.boot.playerandteamworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

	@GetMapping
	@ResponseBody
	public String helloWorld() {
		return "hello world";
	}

}
