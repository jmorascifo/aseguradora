package com.aseguradora.aseguradora;

import java.util.List;

public class Siniestro {
private String tipo;
private List<Vehiculo> vehiculos;
private String estado;

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public List<Vehiculo> getVehiculos() {
	return vehiculos;
}
public void setVehiculos(List<Vehiculo> vehiculos) {
	this.vehiculos = vehiculos;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
@Override
public String toString() {
	return "Siniestro [tipo=" + tipo + ", vehiculos=" + vehiculos + ", estado=" + estado + "]";
}
public Siniestro(String tipo, List<Vehiculo> vehiculos, String estado) {
	this.tipo = tipo;
	this.vehiculos = vehiculos;
	this.estado = estado;
}



}
