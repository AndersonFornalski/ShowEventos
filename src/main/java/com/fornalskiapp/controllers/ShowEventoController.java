package com.fornalskiapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fornalskiapp.models.CadastroEvento;
import com.fornalskiapp.models.ConvidadosEvento;
import com.fornalskiapp.repositories.ConvidadosEventoRepository;
import com.fornalskiapp.repositories.ShowEventoRepository;

@Controller
public class ShowEventoController {

	@Autowired
	private ShowEventoRepository showRepo;
	
	@Autowired
	private ConvidadosEventoRepository convRepo;
	
	/*METODO SALVAR*/
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String form() {
		return "cadastro/formCadastro";/*esse caminho para pagina no template*/
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String form(CadastroEvento cadEvento) {
		showRepo.save(cadEvento);		
		return "redirect:/cadastrarEvento";		
	}
	/*MÉTODO LISTAR */
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<CadastroEvento> listaEventos = showRepo.findAll();
		mv.addObject("eventosss",listaEventos);		
		return mv;
	}
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public ModelAndView detalhesEvento(@PathVariable("codigo") long codigo) {
		CadastroEvento cadEvento = showRepo.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("cadastro/detalhesEvento");/*muito cuidado, colocar o caminho da pasta correto*/
		mv.addObject("cadEvento", cadEvento);
		System.out.println("cadEvento" + cadEvento);
		return mv;
	}
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.POST)
	public String detalhesEventoPost(@PathVariable("codigo") long codigo,ConvidadosEvento convEvento) {
		CadastroEvento cadEvento = showRepo.findByCodigo(codigo);
		convEvento.setCadEvento(cadEvento);
		convRepo.save(convEvento);
		
		return "redirect:/{codigo}";
	}
	
	
}









