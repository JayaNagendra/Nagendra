package com.Nagendra.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.Nagendra.Entity.Entity;
@Service
public class EmailServiceImpl implements EmailService {
@Autowired
private JavaMailSender javaMailSender;
@Value("${spring.mail.username}")
private String sender;
@Override
public String sendSimpleMail(Entity Entity) {
SimpleMailMessage mailMessage = new SimpleMailMessage();
mailMessage.setFrom(sender);
mailMessage.setTo(Entity.getRecipient());
mailMessage.setText(Entity.getMsgBody());
mailMessage.setSubject("Nagendra Sending Mail");
javaMailSender.send(mailMessage);
return "Mail Sent Successfully...";
}
}