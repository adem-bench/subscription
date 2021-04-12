package com.adidaschallenge.gateway.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("subscription")
public interface SubscriptionClient {

  @RequestMapping(value = "api/subscription/detail", method = RequestMethod.GET)
  String detail();
}
