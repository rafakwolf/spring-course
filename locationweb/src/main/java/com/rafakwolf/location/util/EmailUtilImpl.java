package com.rafakwolf.location.util;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailUtilImpl implements EmailUtil {

    private JavaMailSender javaMailSender;

    public EmailUtilImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendMail(String toAddress, String subject, String body) {
        MimeMessage mailMessage = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage);
        try {
            helper.setTo(toAddress);
            helper.setText(body);
            helper.setSubject(subject);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        this.javaMailSender.send(mailMessage);
    }
}
