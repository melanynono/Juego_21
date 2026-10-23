package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

    public static void main(String[] args) {

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

        System.out.println("===== PRIMERA PRUEBA =====");

        ArrayList<Jugador> ganadores = juego.jugar();

        imprimirResultados(juego, ganadores);

        System.out.println("\n===== SEGUNDA PRUEBA =====");

        boolean hayGanadores = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPARTIDA " + i);

            ganadores = juego.jugar();

            imprimirResultados(juego, ganadores);

            if (!ganadores.isEmpty()) {
                hayGanadores = true;
                break;
            }
        }

        if (!hayGanadores) {
            System.out.println(
                    "No hubo ganadores en las 10 partidas.");
        }
    }

    public static void imprimirResultados(
            Juego21 juego, ArrayList<Jugador> ganadores) {

        for (Jugador jugador : juego.getJugadores()) {
            jugador.imprimir();

            System.out.println(
                    "Puntaje total: "
                    + jugador.getPuntajeCartas());

            System.out.println("--------------------");
        }

        if (ganadores.isEmpty()) {
            System.out.println(
                    "No hay ganadores con 21 puntos.");
        } else {
            System.out.println("===== GANADORES =====");

            for (Jugador ganador : ganadores) {
                System.out.println(
                        ganador.getNickname()
                        + " - Puntaje: "
                        + ganador.getPuntajeCartas());
            }
        }
    }
}