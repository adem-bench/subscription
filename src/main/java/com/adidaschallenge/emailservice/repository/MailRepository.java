package com.adidaschallenge.emailservice.repository;

import com.adidaschallenge.emailservice.entity.Mail;
import org.springframework.data.repository.CrudRepository;

public interface MailRepository extends CrudRepository<Mail, Long> {
}