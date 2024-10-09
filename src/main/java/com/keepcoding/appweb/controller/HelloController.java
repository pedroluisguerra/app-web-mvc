package com.keepcoding.appweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.appweb.entity.Prueba;

@Controller
public class HelloController {
	
	@GetMapping("/saludar")
	public String saludar(Model modelo) {
		// Utilizamos el objeto model para pasar
		// Parámetros desde el controlador a la vista hola.html
		
		List<Prueba> listaPrueba = new ArrayList<>();
		
		Prueba obj = new Prueba(1, "Ramón", "Sanchez");
		Prueba obj1 = new Prueba(2, "Pedro", "Sanchez");
		listaPrueba.add(obj);
		listaPrueba.add(obj1);
				
		modelo.addAttribute("key", listaPrueba);
		return "hola";
		
	}

}
