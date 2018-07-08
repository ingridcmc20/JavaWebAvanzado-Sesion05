package com.tecsup.javawebavanzado.sesion05.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IngridController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/jmj", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		String pais = "Panama";
		logger.info("A menos de 6 meses!!! {}.", locale);
		
		model.addAttribute("pais", pais );
		model.addAttribute("anio", "2019" );
		
		return "jmj"+pais;
	}
}
