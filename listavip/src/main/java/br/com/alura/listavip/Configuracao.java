
package br.com.alura.listavip;

//import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

/* CONFIGURA��ES DO NOSSO SPRING BOOT PASSO 2 */

@SpringBootApplication
//@Controller // COM A TAG CONTROLLER NAO PRECISO ME PREOCUPA EM FICA CONFIGURANDO ARQUIVO XML --- MAPEANDO
public class Configuracao {
	
	/*
	@RequestMapping("/")// MAPEANDO ONDE SER� EXIBIDO A MENSAGENS
	@ResponseBody// IREI RETORNA
	String ola() {
		return "�la, bem vindo ao sistema Lista Vips";
	}
	 CONFIGURA��O RETIRADA DAQUI, PQ AGORA NOSSA CLASSE � SOMENTE DE CONFIGURA��O ---> AULA 1*/
	
	public static void main(String[] args) {//SEMPRE SUBA SUA APLICA��O PELO M�TODO MAIN
		SpringApplication.run(Configuracao.class, args);//PARA RODA NOSSA APLICA��O
		
	}
	/*
	// CONFIGURANDO NOSSO BIN PARA ACESSOS NOSSO BANCO DE DADOS AULA 2 VIDEO 2
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");//DRIVE	
		dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");// BANCO
		dataSource.setUsername("root");// USER
		dataSource.setPassword("");//SENHAR
		return dataSource;
		
	}
*/
	 
	
}
















