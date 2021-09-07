/*
 * Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 
 * 3 Threads, onde cada Thread calcula a soma dos valores de cada linha, impri_
 * mindo a identificação da linha e o resultado da soma. A main deve gerar uma 
 * matriz com números aleatórios, mas a Thread recebe um vetor.
 */

package view;

import controller.ThreadSoma;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		
		for(int linha = 0 ; linha < 3 ; linha++) {
			System.out.print("[\t");
			for(int coluna = 0 ; coluna < 5 ; coluna++) {
				matriz[linha][coluna] = (int)(Math.random() * 101);
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.print("]\n");
		}
		
		System.out.print("\n");
		
		for(int linha = 0 ; linha < 3 ; linha++) {  // Inicia as Threads
			Thread somaLM = new ThreadSoma(matriz[linha], linha);
			somaLM.start();
		}
	}

}
