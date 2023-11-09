package br.com.rosanam.aplicationspringboot07112023;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import service.PasswordValidatorService;

@SpringBootApplication
public class AplicationSpringboot07112023Application {

	public static void main(String[] args) {
		PasswordValidatorService.main(args);
	}
}