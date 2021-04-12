package com.adidaschallenge.gateway.bff.controller;

import com.adidaschallenge.gateway.feign.UserClient;
import com.adidaschallenge.gateway.feign.SubscriptionClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bff/subscription")
public class SubscriptionController {

	@Autowired
	private SubscriptionClient subscriptionClient;

	@Autowired
	private UserClient userClient;

	/**
	 * we made two calls to zuul and aggregate  the result 
	 *
	 * @return Map of String of the service as key and the JSON result ass the value
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Map<String, String> subscriptionDetail() {
		Map<String, String> aggregatedResult = new HashMap<>();

		aggregatedResult.put("subscription", subscriptionClient.detail());
		aggregatedResult.put("user", userClient.info());

		return aggregatedResult;
	}
}
