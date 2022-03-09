package com.login_and_registration.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.login_and_registration.email.EmailSender;

//@Service
//public class EmailService implements EmailSender {

//	private final static Logger log = org.slf4j.LoggerFactory.getLogger(EmailService.class);
//
//	private JavaMailSender mailSender;
//
//	@Override
//	@Async
//	public void send(String to, String email) {
//		try {
//			MimeMessage mimeMessage = mailSender.createMimeMessage();
//			
//			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
//			helper.setText(email, true);
//			helper.setTo(to);
//			helper.setSubject("Confirm your email");
//			helper.setFrom("hello@amigoscode.com");
//            
//			mailSender.send(mimeMessage);
//			
//		} catch(MessagingException e) {
//			log.error("failed to send email", e);
//			throw new IllegalStateException("failed to send email");
//		}
//	}
//
//}
