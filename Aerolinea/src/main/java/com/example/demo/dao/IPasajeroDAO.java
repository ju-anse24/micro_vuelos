package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Pasajero;

public interface IPasajeroDAO extends JpaRepository<Pasajero, Long> {

}

