/*
 * Fazer uma aplica��o que insira n�meros aleat�rios em uma matriz 3 x 5 e tenha 
 * 3 Threads, onde cada Thread calcula a soma dos valores de cada linha, impri_
 * mindo a identifica��o da linha e o resultado da soma. A main deve gerar uma 
 * matriz com n�meros aleat�rios, mas a Thread recebe um vetor.
 */

package controller;

public class ThreadSoma extends Thread {
	
	private int vet[];
	private int i;

	public ThreadSoma(int vet[], int i) {
		this.vet = vet;
		this.i = i;
	}

	@Override
	public void run() {
		somaLinha();
	}

	private void somaLinha() {
		int soma = 0;
		
		for(int item : vet) {
			soma += item;
		}
		System.out.println("A soma da linha " + (i+1) + " � igual a " + soma);
	}
	
}
