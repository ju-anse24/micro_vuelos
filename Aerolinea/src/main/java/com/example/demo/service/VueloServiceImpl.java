package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IVueloDAO;
import com.example.demo.dto.Vuelo;

@Service
public class VueloServiceImpl implements IVueloService {
	
	@Autowired
	IVueloDAO iVueloDAO;
	
	@Override
	public List<Vuelo> listarVuelos() {
		return iVueloDAO.findAll();
	}

	@Override
	public Vuelo guardarVuelo(Vuelo vuelo) {
		return iVueloDAO.save(vuelo);
	}

	@Override
	public Vuelo vueloPorId(Long idVuelo) {
		return iVueloDAO.findById(idVuelo).get();
	}
	
}
