package com.trayapi.vendedores.Email;


import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import java.io.UnsupportedEncodingException;

import static com.google.common.collect.Lists.newArrayList;

@Service
public class EmailSender {

    @Autowired
    private EmailService emailService;

    public void sendEmail() throws UnsupportedEncodingException {
        final Email email = DefaultEmail.builder()
                .from(new InternetAddress("pierhett@gmail.com",
                        "Email"))
                .to(newArrayList(
                        new InternetAddress("API TRAY",
                        "LISTA DE VENDAS")))
                .subject("SEGUE NO EMAIL A LISTA DE VENDAS DO DIA")
                .body("Lista de vendas")
                .encoding("UTF-8").build();

        emailService.send(email);
    }

}
