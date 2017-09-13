package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastar(@Valid Cerveja cerveja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro de menssagem");
			System.out.println("tem erro realmente");
		}
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping("cervejas/cadastro")
	public String cadastro() {
		return "cerveja/cadastro-produto";
	}
}
