package br.com.vvezani.springcloudconfigclient;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class HelloService {

	@Value("${hello}")
	private String value;
	
	private AtomicInteger atomicInteger = new AtomicInteger();

	public String getHello() {
		return value + " " + atomicInteger.getAndIncrement();
	}
	
}
