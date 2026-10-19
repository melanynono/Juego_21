package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dealer dealer = new Dealer();
		
		dealer.imprimirNaipe();
		
        System.out.println("Cantidad de cartas: " + dealer.getNaipe().size());
		
        if (dealer.getNaipe().size() == 52) {
            System.out.println("El mazo se genero correctamente");
        } else {
            System.out.println("Error: el mazo no tiene 52 cartas");
        }
        
        
        
	}

}
