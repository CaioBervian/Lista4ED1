package Lista4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int tam;
		System.out.println("Qual tamanho?");
		tam = entrada.nextInt();
		entrada.nextLine();
		String vetor[] = new String[tam];
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

	for (int x=tam-1; x>=0;x--) {
		System.out.println(vetor[x]);}
	
entrada.close();		
}}