package br.com.vvezani.springcloudribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="spring-cloud-eureka-client")
public interface FeignNounClient {
	
	@GetMapping
	String getValue();

}
