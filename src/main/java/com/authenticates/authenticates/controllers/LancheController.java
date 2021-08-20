package com.authenticates.authenticates.controllers;

import com.authenticates.authenticates.services.LancheServicesMock;
import com.authenticates.authenticates.vo.IngredienteVO;
import com.authenticates.authenticates.vo.LancheVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class LancheController {


    @Autowired
    private LancheServicesMock lancheServicesMock;

	@GetMapping("/cadastrarlanche")
	public ModelAndView inicio() {
		ModelAndView view = new ModelAndView("lanche/cadastrarlanche");


        view.addObject("lancheobjeto", lancheServicesMock.listaTodosOsLanches().get(0));
        view.addObject("lista", lancheServicesMock.listaTodosOsIngredientes());
        view.addObject("listaingredientes", lancheServicesMock.listaTodosOsIngredientes());
        view.addObject("ingredientesadicionados", lancheServicesMock.listaTodosOsIngredientes());

		return view;
	}


}