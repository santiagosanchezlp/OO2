package io.github.unlp_oo.Ejercicio13_SubteWay;

public class Sandwich {
	private double pan;
	private double aderezo;
	private double principal;
	private double adicional;
	public double getPan() {
		return pan;
	}
	public void setPan(double pan) {
		this.pan = pan;
	}
	public double getAderezo() {
		return aderezo;
	}
	public void setAderezo(double aderezo) {
		this.aderezo = aderezo;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAdicional() {
		return adicional;
	}
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public double precio() {
		return this.pan
				+ this.aderezo
				+ this.principal
				+this.adicional;
	}

}
