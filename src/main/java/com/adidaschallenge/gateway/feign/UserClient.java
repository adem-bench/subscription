package com.adidaschallenge.gateway.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user")
public interface UserClient {

	@RequestMapping(value = "api/user/info", method = RequestMethod.GET)
	String info();

}
