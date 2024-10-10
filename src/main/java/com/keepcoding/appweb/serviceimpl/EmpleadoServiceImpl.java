package com.keepcoding.appweb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.appweb.entity.Empleado;
import com.keepcoding.appweb.repository.EmpleadoRepository;
import com.keepcoding.appweb.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public List<Empleado> listarEmpleado() {
		// método para listar todos los empleados
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// Método para guardar un nuevo empleado
		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado empleadoPorId(long id) {
		// Método para buscar empleado por id
		return empleadoRepository.findById(id).get();
	}

	@Override
	public void borrarEmpleado(long id) {
		empleadoRepository.deleteById(id);	
	}

}
