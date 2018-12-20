package com.aseguradora.aseguradora;

public class Asegurador {

	private int dni;
	private String nombre;
	private String apellido;
	private int id;
	private String pasword;
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	@Override
	public String toString() {
		return "Asegurador [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", pasword="
				+ pasword + "]";
	}
	
	public Asegurador(int dni, String nombre, String apellido, int id, String pasword) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.pasword = pasword;
	}
}
