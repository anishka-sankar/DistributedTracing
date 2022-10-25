package com.distributedTracing.Appone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="APP-TWO")
public interface Proxy {
	
	@GetMapping("/appTwo")
	public String get();
}
