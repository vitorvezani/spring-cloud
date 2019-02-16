package br.com.vvezani.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordsController {

	@Value("${eureka.instance.instanceId}")
	private String instanceId;

	@GetMapping("/")
	public @ResponseBody String getWord() {
		return "Response from instanceId: " + instanceId;
	}

}
