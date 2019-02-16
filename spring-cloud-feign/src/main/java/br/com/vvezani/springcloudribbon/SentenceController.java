package br.com.vvezani.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

	@Autowired
	private FeignNounClient client;
	
	@GetMapping("/sentence")
	public String getSentence() {
		return client.getValue();
	}
}
