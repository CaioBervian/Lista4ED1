package Lista4;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int menor=0, aux;
		int tam;
		System.out.println("Qual tamanho?");
		tam = entrada.nextInt();
		int numeros[] = new int [tam];
		for (int x=0; x<tam;x++) {
			System.out.println("Valor");
			numeros[x] = entrada.nextInt();
		}
		for (int i=0; i <tam -1 ; i++) {
			menor = i;
			aux = numeros[i];
			for (int j=i+1; j< tam ;j++) {
				if (numeros[j] < aux) {
					menor =j;
					aux = numeros[j];}}
			numeros[menor] = numeros[i];
			numeros[i] = aux;
			}
		
		for (int i=0; i<tam; i++) {
			System.out.print(numeros[i] + " || ");
			
		}
		System.out.println();
		System.out.println(numeros[0] + " � o menor");
		System.out.println(numeros[tam-1] + " � o maior");
		entrada.close();
	}}

