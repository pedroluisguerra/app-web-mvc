package com.keepcoding.appweb.service;

import java.util.List;

import com.keepcoding.appweb.entity.Empleado;

public interface EmpleadoService {
	
	// Listar todos los empleados registrados.
	List<Empleado> listarEmpleado();
	
	// Método para insertar un registro de empleado
	Empleado guardarEmpleado(Empleado empleado);
	
	// Método para buscar empleado por id
	Empleado empleadoPorId(long id);
	
	//Método para borrar un registro de empleado
	void borrarEmpleado(long id);

}
