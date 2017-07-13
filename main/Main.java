package main;

import java.util.Scanner;
import pista.Pista;
import carro.Carro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num1, num2;
		String com,comRes,marcaDelarro;
					
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System. in);
		
		//num1 = teclado.nextInt();
		//num2 = teclado.nextInt();
		
		Pista p = new Pista();
		Carro mazda = new Carro();
		
		System.out.println("inicio de la simulación");
		
		//p.Resultado(num1, num2);
		
		marcaDelarro = mazda.marcaDelCarro();
		
		p.GenerarPista(marcaDelarro,"0,0");
		
		System.out.println("Escriba el comando");
		
		com = teclado.next();
		
		comRes = p.IngresarComando(com);
		
		p.GenerarPista(marcaDelarro,comRes);
	}

}
