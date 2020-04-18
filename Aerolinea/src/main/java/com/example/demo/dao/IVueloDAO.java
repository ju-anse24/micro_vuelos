package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Vuelo;

public interface IVueloDAO extends JpaRepository<Vuelo, Long>  {

}
