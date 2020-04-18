package com.example.demo.service;
import java.util.List; 
import com.example.demo.dto.Pasajero;

public interface IPasajeroService {

	public List<Pasajero> listarPasajeros();
	public Pasajero guardarPasajero(Pasajero pasajero);
	public Pasajero pasajeroPorId(Long numeroIdentificacion);
	public Pasajero actualizarPasajero(Pasajero pasajero);
	public void eliminarPasajero(Long numeroIdentificacion);
}
