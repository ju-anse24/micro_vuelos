package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Pasajero;
import com.example.demo.service.PasajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class PasajeroController {

	@Autowired
	PasajeroServiceImpl pasajeroServiceImpl;
	
	@GetMapping("/pasajeros")
	public List<Pasajero> listarPasajero(){
		return pasajeroServiceImpl.listarPasajeros();
	}
	
	@PostMapping("/pasajeros")
	public Pasajero salvarPasajero(@RequestBody Pasajero pasajero) {
		return pasajeroServiceImpl.guardarPasajero(pasajero);
	}
	
	@GetMapping("/pasajeros/{numeroIdentificacion}")
	public Pasajero pasajeroPorId(@PathVariable(name ="numeroIdentificacion") Long numeroIdentificacion)  {
	
		Pasajero pasajeroPorId = new Pasajero();
		pasajeroPorId = pasajeroServiceImpl.pasajeroPorId(numeroIdentificacion);
		System.out.println("Pasajero seleccionado:" +pasajeroPorId);
		return pasajeroPorId;
	}
	
	@PutMapping("/pasajeros/{numeroIdentificacion}")
	public Pasajero actualizarPasajero(@PathVariable(name ="numeroIdentificacion")Long numeroIdentificacion, @RequestBody Pasajero pasajero) {
		Pasajero pasajeroSeleccionado = new Pasajero();
		Pasajero pasajeroActualizado = new Pasajero();
		
		pasajeroSeleccionado= pasajeroServiceImpl.pasajeroPorId(numeroIdentificacion);
		pasajeroSeleccionado.setNombres(pasajero.getNombres());
		pasajeroSeleccionado.setApellidos(pasajero.getApellidos());
		pasajeroSeleccionado.setCorreo(pasajero.getCorreo());
		pasajeroSeleccionado.setTelefono(pasajero.getTelefono());
		
		pasajeroActualizado = pasajeroServiceImpl.actualizarPasajero(pasajeroSeleccionado);
		System.out.println("El pasajero actualizado es:" +pasajeroActualizado);
		
		return pasajeroActualizado;
	}
	
	@DeleteMapping("/pasajeros/{numeroIdentificacion}")
	public void eliminarPasajero(@PathVariable(name ="numeroIdentificacion")Long numeroIdentificacion)  {
	
		pasajeroServiceImpl.eliminarPasajero(numeroIdentificacion);
	}
	
}
