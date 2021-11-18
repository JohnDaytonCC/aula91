package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner input = new Scanner(System.in);
		Aluno[] vetor = new Aluno[10]; // Construção de um vetor do objeto Aluno com 10 elementos.

		System.out.println("Quantos quartos irá alugar? ");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			input.nextLine();
			String nome = input.nextLine();
			String email = input.nextLine();
			int numeroDoQuarto = input.nextInt();
			vetor[numeroDoQuarto] = new Aluno(nome, email, numeroDoQuarto);
		}
		/*
		Aluno aux = new Aluno(null, null, 0);
		
		for(int i=0; i<(n-1); i++) {
			if(vetor[i].getNumeroDoQuarto()>vetor[i+1].getNumeroDoQuarto()) {
				aux = vetor[i];
				vetor[i] = vetor[i+1];
				vetor[i+1] = aux;
			}
		}
		*/
		System.out.println("\nQuartos Alugados:");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] != null) {
				vetor[i].relatorioDoAluno();
			}
		}
		
		
		input.close();
	}
}
