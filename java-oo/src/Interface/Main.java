package Interface;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int raio, lado;
		
		System.out.print("digite um raio para o círculo: ");
		raio = in.nextInt();
		
		System.out.print("digite um lado para o quadrado: ");
		lado = in.nextInt();

		Circulo circulo = new Circulo(raio);
		Quadrado quadrado = new Quadrado(lado);
		
		//circulo.setRaio(10);
		
		System.out.print(circulo.getRaio());
		
		System.out.print(circulo.calcularArea());
	}
}