package com.distributedTracing.Apptwo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="APP-THREE")
public interface AppProxy {
	
	@GetMapping("/appThree")
	public String get();
}
