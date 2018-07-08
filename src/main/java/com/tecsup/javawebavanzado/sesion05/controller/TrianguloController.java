package com.tecsup.javawebavanzado.sesion05.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrianguloController {
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "/triangulo", method = RequestMethod.GET)
	protected ModelAndView inicio() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMMM 'de' yyyy");
		String fecha = sdf.format(new Date());

		return new ModelAndView("triangulo", "fecha", fecha);
	}

	@RequestMapping(value = "/triangulo", method = RequestMethod.POST)
	protected ModelAndView calcular(HttpServletRequest request) throws Exception {
		double base = Double.parseDouble(request.getParameter("base"));
		double altura = Double.parseDouble(request.getParameter("altura"));
		
		double resultado = (base * altura)/2;

		logger.info("base: " + base);
		logger.info("altura: " + altura);

		return new ModelAndView("triangulo", "mensaje", "Resultado: " + resultado);
	}
	
	@RequestMapping(value = "/trianguloHome", method = RequestMethod.GET)
	protected ModelAndView inicioTriangulo() throws Exception {
		return new ModelAndView("homeTriangulo");
	}
	
	@RequestMapping(value = "/trianguloHome", method = RequestMethod.POST)
	protected ModelAndView trianguloHome(HttpServletRequest request) throws Exception {
		
		return new ModelAndView("triangulo");
	}
}
