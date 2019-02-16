package br.com.vvezani.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {

	@Autowired
	private RestTemplate restClient;
	
	@GetMapping("/sentence")
	public String getSentence() {
		return getWord("spring-cloud-eureka-client");
	}

	public String getWord(String service) {
		 return restClient.getForObject("http://" + service, String.class);
	}
}
