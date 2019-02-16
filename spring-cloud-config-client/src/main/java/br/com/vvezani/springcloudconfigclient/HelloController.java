package br.com.vvezani.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${hello}")
	private String value;

	@GetMapping("/hello")
	public String hello() {
		return "Hello " + value;
	}
	
}
