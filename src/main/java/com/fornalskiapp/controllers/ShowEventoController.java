package com.fornalskiapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fornalskiapp.models.CadastroEvento;
import com.fornalskiapp.repositories.ShowEventoRepository;

@Controller
public class ShowEventoController {

	@Autowired
	private ShowEventoRepository showRepo;
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "cadastro/formCadastro";/*esse caminho para pagina no template*/
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String form(CadastroEvento cadEvento) {
		showRepo.save(cadEvento);		
		return "redirect:/cadastrarEvento";
		
	}
}
