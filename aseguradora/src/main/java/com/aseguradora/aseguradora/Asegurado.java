package com.aseguradora.aseguradora;

public class Asegurado {
	private Asegurador asegurador;
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	private String domicilio;
	
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		return "Asegurado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", domicilio=" + domicilio
				+ "]";
	}
	
	public Asegurado(String nombre, String apellido, int edad, String domicilio,int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
		this.domicilio = domicilio;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	

}
