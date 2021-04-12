package com.adidaschallenge.emailservice.service;

import com.adidaschallenge.emailservice.entity.dto.UserDto;

public interface EmailService {

	void sendConfirmMessage(UserDto input);
}
