package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Juego21 juego = new Juego21();
		
        Jugador jugador1 = new Jugador();
        jugador1.setNickname("Jugador1");

        Jugador jugador2 = new Jugador();
        jugador2.setNickname("Jugador2");

        Jugador jugador3 = new Jugador();
        jugador3.setNickname("Jugador3");
        
        juego.agregarJugador(jugador1);
        juego.agregarJugador(jugador2);
        juego.agregarJugador(jugador3);
        
        juego.inicializar();
        
        juego.repartirRonda();
				
        System.out.println("=== CARTAS DE LOS JUGADORES ===");

        jugador1.imprimir();
        jugador2.imprimir();
        jugador3.imprimir();

        System.out.println("Cantidad de cartas restantes: "
                + juego.getDealer().getNaipe().size());
        
	}

}
