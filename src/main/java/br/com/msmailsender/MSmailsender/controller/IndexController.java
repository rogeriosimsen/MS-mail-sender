package br.com.msmailsender.MSmailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msmailsender.MSmailsender.enums.StatusEmail;
import br.com.msmailsender.MSmailsender.model.EmailModel;
import br.com.msmailsender.MSmailsender.service.EmailService;

@RestController
@RequestMapping(value = "/mail-sender")
@CrossOrigin(origins = "https://weare3d.netlify.app")
public class IndexController {
	
	@Autowired
	EmailService emailService;
	
	@GetMapping(value = "/", produces = "application/json")
	public String init() {
		
		return "MS Mail-Sender";
	}
	
	@PostMapping(value = "/send", produces = "application/json")
	public StatusEmail sendEmail(@RequestBody EmailModel emailModel){
		
		EmailModel email = new EmailModel();
		
		email.setFullname(emailModel.getFullname());
		email.setEmail(emailModel.getEmail());
		email.setMessage(emailModel.getMessage());
		
		emailService.sendEmail(email);
		
		return email.getStatusEmail();
	}

}
