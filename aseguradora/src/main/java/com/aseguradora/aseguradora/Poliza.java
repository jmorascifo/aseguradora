package com.aseguradora.aseguradora;

import java.util.Calendar;
import java.util.Date;

public class Poliza {
private String id;
	private Date fechaVencimiento;
	private Date fechaAlta;
	private Vehiculo vehiculo;
	private TipoPoliza tipoPoliza;
	private Asegurado asegurado;
	private Cuota cuota;
	
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public Date setFechaVencimiento(Date date,int mesesDuracion) {
		Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.MONTH, mesesDuracion);
	    return cal.getTime();
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public TipoPoliza getTipoPoliza() {
		return tipoPoliza;
	}
	public void setTipoPoliza(TipoPoliza tipoPoliza) {
		this.tipoPoliza = tipoPoliza;
	}
	public Asegurado getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}
	@Override
	public String toString() {
		return "Poliza [fechaVencimiento=" + fechaVencimiento + ", fechaAlta=" + fechaAlta + ", asegurado=" + asegurado
				+ "]";
	}
	public void generarCuotas(Date fechaAlta,int mesesDuracion) {
		for (int i = 1;i<mesesDuracion;i++) {
		Cuota cuota = new Cuota(setFechaVencimiento(fechaAlta, i));
		
		}
	}
	public void darBaja() {
	
	}
	
	public Poliza(Date fechaAlta, Vehiculo vehiculo, TipoPoliza tipoPoliza, Asegurado asegurado) {
		this.fechaAlta = fechaAlta;
		this.vehiculo = vehiculo;
		this.tipoPoliza = tipoPoliza;
		this.asegurado = asegurado;
		setFechaVencimiento(fechaAlta,6);
			
	}
	
	
	
}
