package com.keepcoding.appweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.keepcoding.appweb.entity.Empleado;
import com.keepcoding.appweb.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping({"/", "/empleados"})
	public String listarEmpleado(Model modelo) {
		
		modelo.addAttribute("empleados", servicio.listarEmpleado());
		return "empleado";
	}
	
	@GetMapping("/empleado/new")
	public String vistaFormularioAtla(Model modelo) {
		
		Empleado empleado = new Empleado();
		
		modelo.addAttribute("empleado", empleado);
		return "new_empleado";
	}
	
	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleados";
	}
	
	@GetMapping("/empleado/delete/{id}")
	public String borrarEmpleado(@PathVariable Long id) {
		
		servicio.borrarEmpleado(id);
		return "redirect:/empleados";
	}
	
	@GetMapping("/empleado/edit/{id}")
	public String vistaFormularioEdit(@PathVariable Long id, Model modelo) {
		Empleado editEmpleado = servicio.empleadoPorId(id);
		modelo.addAttribute("empleado", editEmpleado);
		
		return "edit_empleado";
	}
	
	@PostMapping("/empleados/edit/{id}")
	public String editarEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado empleado) {
		
		Empleado editEmpleado = servicio.empleadoPorId(id);
		editEmpleado.setNombre(empleado.getNombre());
		editEmpleado.setApellido(empleado.getApellido());
		editEmpleado.setEmail(empleado.getEmail());
		editEmpleado.setTelefono(empleado.getTelefono());
		
		servicio.guardarEmpleado(editEmpleado);
		
		return "redirect:/empleados";
	}
	
	
}
