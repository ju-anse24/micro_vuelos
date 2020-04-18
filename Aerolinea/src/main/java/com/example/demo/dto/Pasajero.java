package com.example.demo.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="pasajero")
public class Pasajero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroIdentificacion;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "correo")
	private String correo;
	@Column(name = "telefono")
	private String telefono;
	
	@ManyToMany
	@JoinTable (name="vuelo_pasajeros", joinColumns = @JoinColumn(name="idVuelo"), inverseJoinColumns = @JoinColumn(name="numeroIdentificacion"))
	private Set<Pasajero> pasajeros;
	
	public Pasajero() {
		super();
	}

	public Pasajero(Long numeroIdentificacion, String nombres, String apellidos, String correo, String telefono) {
		
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Pasajero [numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
}
