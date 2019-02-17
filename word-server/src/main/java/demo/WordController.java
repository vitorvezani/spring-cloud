package demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
	
	@Value("${words}") String words;
	
	@GetMapping("/")
	public Word getWord() {
		String[] wordz = words.split(",");
		return new Word(wordz[new Random().nextInt(wordz.length - 1)]);
	}
}
