package com.aseguradora.aseguradora;

public class TipoPoliza {
private boolean causaNatural;
private boolean vidrios;
private boolean terceros;
private boolean robo;
private int monto;

public boolean isCausaNatural() {
	return causaNatural;
}
public void setCausaNatural(boolean causaNatural) {
	this.causaNatural = causaNatural;
}
public boolean isVidrios() {
	return vidrios;
}
public void setVidrios(boolean vidrios) {
	this.vidrios = vidrios;
}
public int getMonto() {
	return monto;
}
public void setMonto(boolean causaNatural, boolean vidrios, boolean terceros, boolean robo) {
	if(causaNatural==true) {
		this.monto += 100;
	}
	if(vidrios==true) {
		this.monto += 100;
	}
	if(terceros==true) {
		this.monto += 100;
	}
	if(robo==true) {
		this.monto += 100;
	} ;
}
public boolean isTerceros() {
	return terceros;
}
public void setTerceros(boolean terceros) {
	this.terceros = terceros;
}
public boolean isRobo() {
	return robo;
}
public void setRobo(boolean robo) {
	this.robo = robo;
}
@Override
public String toString() {
	return "TipoPoliza [causaNatural=" + causaNatural + ", vidrios=" + vidrios + ", monto=" + monto + ", terceros="
			+ terceros + ", robo=" + robo + "]";
}
public TipoPoliza(boolean causaNatural, boolean vidrios, boolean terceros, boolean robo) {
	super();
	this.causaNatural = causaNatural;
	this.vidrios = vidrios;
	this.terceros = terceros;
	this.robo = robo;
	setMonto(causaNatural, vidrios, terceros, robo);
}

}
