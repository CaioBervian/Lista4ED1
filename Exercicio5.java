package Lista4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int menor, aux;
		int tam;
		int resposta;
		int resposta2;
		System.out.println("Quer em inteiros ou char? Digite 1-inteiros ou 2-char");
		resposta = entrada.nextInt();
		
		if (resposta == 1) {
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
		System.out.println("Quer ver em crescente ou decrescente? 1-cres e 2- decre");
		resposta2 = entrada.nextInt();
		if (resposta2== 1) {
			for (int i=0; i<tam; i++) {
				System.out.print(numeros[i] + " || ");
			}
		}
		if (resposta2 == 2) {
			for (int i=tam-1; i>=0; i--) {
				System.out.print(numeros[i] + " || ");
			}
		}
		}
		
		if (resposta == 2) {
			System.out.println("Qual tamanho?");
			tam = entrada.nextInt();
			entrada.nextLine();
			String vetor[] = new String[tam];
			for (int x=0; x<tam;x++) {
				System.out.println("Digite o character");
				vetor[x] = entrada.nextLine();
			
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
		}
			System.out.println("Quer ver em crescente ou decrescente?1-cres e 2- decre");
			resposta2 = entrada.nextInt();
			if (resposta2== 1) {
				for (int x=0; x<tam;x++) {
					System.out.println(vetor[x]);}
			}
			if (resposta2 == 2) {
				for (int x=tam-1; x>=0;x--) {
					System.out.println(vetor[x]);}
			}}
		entrada.close();
	}}
