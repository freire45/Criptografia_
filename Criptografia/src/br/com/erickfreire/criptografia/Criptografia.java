package br.com.erickfreire.criptografia;

import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) {
		int valor;
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int aux;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que criptografa um valor: ");
		System.out.print("Digite um valor de 4 digitos: ");
		valor = entrada.nextInt();
		
		while(valor < 1000 || valor > 10000) {
			System.out.println("Valor incorreto!");
			System.out.print("Digite um valor de 4 digitos: ");
			valor = entrada.nextInt();
		}
		
		numero1 = valor / 1000;
		numero2 = (valor % 1000) / 100;
		numero3 = (valor % 100) / 10;
		numero4 = (valor % 10) / 1;
		
		numero1 = (numero1 + 7) % 10;
		numero2 = (numero2 + 7) % 10;
		numero3 = (numero3 + 7) % 10;
		numero4 = (numero4 + 7) % 10;
		
		aux = numero1;
		numero1 = numero3;
		numero3 = aux;
		
		aux = numero2;
		numero2 = numero4;
		numero4 = aux;
		
		System.out.printf("O valor criptografado é de: %d%d%d%d%n", numero1, numero2, numero3, numero4);

	}

}
