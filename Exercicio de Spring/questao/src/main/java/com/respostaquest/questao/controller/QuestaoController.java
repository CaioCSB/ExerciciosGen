package com.respostaquest.questao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questao")
public class QuestaoController {
	
	@GetMapping
	public String questao() {
		return "Respondendo a questão: \t Eles são essenciais na minha vida, para distração. \n São super importantes, gosto de me reunir com amigos para jogar qualquer coisa, pela diversão e distração que aquilo causa.";
	}
}
