package com.krakedev.juegos.entidades;

public class Carta {
	
	private String valor;
	private int valorJuego;
	private String palo;
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getValorJuego() {
		return valorJuego;
	}
	public void setValorJuego(int valorJuego) {
		this.valorJuego = valorJuego;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	public void imprimir() {
		
		System.out.println("Valor de la carta: " + valor);
		System.out.println("Valor dentro del juego: " + valorJuego);
		System.out.println("Palo : " + palo);
		
	}
	
	

}
