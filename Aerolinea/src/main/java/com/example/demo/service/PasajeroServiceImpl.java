package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IPasajeroDAO;
import com.example.demo.dto.Pasajero;

@Service
public class PasajeroServiceImpl implements IPasajeroService {
	
	@Autowired
	IPasajeroDAO iPasajeroDAO;
	
	@Override
	public List<Pasajero> listarPasajeros() {
		return iPasajeroDAO.findAll();
	}

	@Override
	public Pasajero guardarPasajero(Pasajero pasajero) {
		return iPasajeroDAO.save(pasajero);
	}

	@Override
	public Pasajero pasajeroPorId(Long numeroIdentificacion) {
		return iPasajeroDAO.findById(numeroIdentificacion).get();
	}

	@Override
	public Pasajero actualizarPasajero(Pasajero pasajero) {
		return iPasajeroDAO.save(pasajero);
	}

	@Override
	public void eliminarPasajero(Long numeroIdentificacion) {
		iPasajeroDAO.deleteById(numeroIdentificacion);
	}

}
