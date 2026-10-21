package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Jugador jugador = new Jugador();
	        jugador.setNickname("Melany");

	        Carta carta = new Carta();
	        carta.setValor("A");
	        carta.setPalo("D");

	        jugador.recibirCarta(carta);

	        System.out.println("Jugador: " + jugador.getNickname());
	        System.out.println("Cantidad de cartas: "
	                + jugador.getCartas().size());

	        jugador.getCartas().get(0).imprimir();
	    }
	}
