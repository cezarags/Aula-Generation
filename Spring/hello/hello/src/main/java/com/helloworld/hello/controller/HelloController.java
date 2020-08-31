package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String gethello(){
		return "Olá Mundo = Hello Word";	
	}
	@GetMapping("/exercicio1")
	public String metodoResp() {
		
		return "No caso minha familia é o grupo e onde tem papel crucial onde sempre recebi orientações para a vida  e estrutura, Sim muito importante"
				+ "pois é da onde eu ganho cada dia mais experiencias e licoes de vida  em familia."
				+ "Sim gosto de me reunir pois sempre posso aprender algo novo ou  ouvir historias e o melhor de tudo se divertir.";
		
	}
	@GetMapping("/exercicio2")
	public String metodoResp2() {
		
		return "Na minha opnião mostra  que todos querem comemorar a sua alegria/Vitoria, mas em momentos de tristeza somente os mais"
				+ "proximos a voce que irá partilhar sua dor ou tristeza";
		
	}
	
	
	

}
