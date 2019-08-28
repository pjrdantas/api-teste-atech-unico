package br.com.atech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class ApiTesteAtechUnicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTesteAtechUnicoApplication.class, args);
		System.out.println("SERVIÇO PRONTO PARA SER CONSUMIDO!..................................................");
	}

}
