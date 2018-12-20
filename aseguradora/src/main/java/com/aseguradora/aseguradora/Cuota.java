package com.aseguradora.aseguradora;

import java.util.Date;

public class Cuota {
private boolean pagado;
private Date fechaVencimientoCuota;


public boolean isPagado() {
	return pagado;
}
public void setPagado(boolean pagado) {
	this.pagado = pagado;
}

public Date getFechaVencimientoCuota() {
	return fechaVencimientoCuota;
}
public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
	this.fechaVencimientoCuota = fechaVencimientoCuota;
}

public Cuota(Date fechaVencimientoCuota) {
	setPagado(false);
	this.fechaVencimientoCuota = fechaVencimientoCuota;
}
}
