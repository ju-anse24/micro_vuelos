package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Vuelo;

public interface IVueloService {

	public List<Vuelo> listarVuelos();
	public Vuelo guardarVuelo(Vuelo vuelo);
	public Vuelo vueloPorId(Long idVuelo);
}
