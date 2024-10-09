package com.keepcoding.appweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keepcoding.appweb.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping("/empleados")
	public String listarEmpleado(Model modelo) {
		
		modelo.addAttribute("empleados", servicio.listarEmpleado());
		return "empleado";
	}
	
	
}
