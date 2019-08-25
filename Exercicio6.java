package Lista4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int menor, aux;
		int tam;
		System.out.println("Quantos funcionários?");
		tam = entrada.nextInt();
		int numeros[] = new int [tam];
		String vetor[] = new String[tam];
		entrada.nextLine();
		for (int x=0; x<tam;x++) {
			System.out.println("Digite o nome");
			vetor[x] = entrada.nextLine();}
		
	Arrays.sort(vetor, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			if (o1 == null && o1 == null)
				return 0;
			if (o2 == null) 
				return -1; //2
			return o1.compareTo(o2);
		}
	});
		for (int x=0; x<tam;x++) {
			System.out.println("Valor salário");
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
		for (int x=0; x<tam;x++) {
			System.out.print(vetor[x] + " || ");}
			System.out.println();
		for (int i=tam-1; i>=0; i--) {
			System.out.print(numeros[i] + " || ");
		}
		entrada.close();
	}}
