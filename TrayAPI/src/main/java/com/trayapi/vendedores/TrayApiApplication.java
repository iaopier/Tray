package com.trayapi.vendedores;

import java.io.UnsupportedEncodingException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.trayapi.vendedores.Email.EmailSender;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;

@SpringBootApplication
@EnableEmailTools
public class TrayApiApplication {

	 @Autowired
	 private EmailSender emailSender;
	 
	public static void main(String[] args) {
		SpringApplication.run(TrayApiApplication.class, args);
	}
	//Email com problemas de two factor auth
	//@PostConstruct
    //public void sendEmail() throws UnsupportedEncodingException, InterruptedException {
     //   emailSender.sendEmail();
    //}
}
