package lista;

import java.util.Random;

public class NumeroAleatorio {
	public void ale() {
		Random  raw = new Random();
		
		int ent[] = new int[10], maior = 0, menor = 101;
		
		System.out.println("Foi gerado 10 numeros aleatorios");
		for (int i = 0; i < ent.length; i++) {
			ent[i] = raw.nextInt((100 - 10) + 1) + 10;
			System.out.print(ent[i] + " ");
			if (ent[i] > maior ) {
				maior = ent[i];
			}
		}
		for (int j = 0; j < ent.length; j++) {
			if (ent[j] < menor) {
				menor = ent[j];
			}
		}
		System.out.println("\nO maior numero do aleatorios é " + maior);
		System.out.println("O menor numero dos aleatrios é " + menor);
	}
}
