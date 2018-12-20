package com.aseguradora.aseguradora;

public class Vehiculo {
private String chasis;
private String modelo;
private String marca;
private String tipo;
private String patente;

public String getChasis() {
	return chasis;
}
public void setChasis(String chasis) {
	this.chasis = chasis;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPatente() {
	return patente;
}
public void setPatente(String patente) {
	this.patente = patente;
}


@Override
public String toString() {
	return "Vehiculo [chasis=" + chasis + ", modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + "]";
}


public Vehiculo(String chasis, String modelo, String marca, String tipo,String patente) {
	this.chasis = chasis;
	this.modelo = modelo;
	this.marca = marca;
	this.tipo = tipo;
	this.patente = patente;
}


}
