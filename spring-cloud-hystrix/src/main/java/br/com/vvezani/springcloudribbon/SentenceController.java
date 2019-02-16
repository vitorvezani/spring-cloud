package br.com.vvezani.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class SentenceController {

	@Autowired
	private FeignNounClient client;
	
	@GetMapping("/sentence")
	@HystrixCommand(fallbackMethod="fallbackSentence")
	public String getSentence() {
		return client.getValue();
	}
	
	public String fallbackSentence() {
		return "Provided by hystrix fallback";
	}
}
