package Program;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de indices do vetor: ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("digite o valor: ");
			vet[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + ", ");
		}
		
		for (int i = 0; i < vet.length - 1; i++) {
			for (int j = i+1; j < vet.length; j++) {
				int x;
				if (vet[i] > vet[j]) {
					x = vet[i];
					vet[i] = vet[j];
					vet[j] = x;
				}
			}	 
		}	
		
		System.out.println("\nVetor ordenado:");
		
		// for each
		for (int indice : vet) {
			System.out.print(indice + ", ");
		}
		
		sc.close();
		}
}
