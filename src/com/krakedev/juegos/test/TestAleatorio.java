package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Dealer dealer = new Dealer();

        int maximo = 10;
        boolean salioCero = false;
        boolean salioMaximo = false;
        boolean rangoCorrecto = true;

        for (int i = 0; i < 100; i++) {

            int numero = dealer.generarAleatorio(maximo);

            System.out.println("Numero generado: " + numero);

            if (numero < 0 || numero > maximo) {
                rangoCorrecto = false;
            }

            if (numero == 0) {
                salioCero = true;
            }

            if (numero == maximo) {
                salioMaximo = true;
            }
        }

        System.out.println("Rango correcto: " + rangoCorrecto);
        System.out.println("Salio el cero: " + salioCero);
        System.out.println("Salio el maximo: " + salioMaximo);
		
	}

}
