package com.authenticates.authenticates.controllers;

import com.authenticates.authenticates.vo.LancheVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class LancheController {

	@GetMapping("/cadastrarlanche")
	public ModelAndView inicio() {
		ModelAndView view = new ModelAndView("lanche/cadastrarlanche");

		view.addObject("lancheobjeto", new LancheVO());
		view.addObject("lista",  new ArrayList<>());
		view.addObject("listaingredientes",  new ArrayList<>());
		view.addObject("ingredientesadicionados", new ArrayList<>());

		return view;
	}
}