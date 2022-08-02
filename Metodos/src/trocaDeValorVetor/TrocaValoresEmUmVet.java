package trocaDeValorVetor;

import java.util.Random;
import java.util.Scanner;

public class TrocaValoresEmUmVet {

	private static int tam, modo;

	public static void main(String[] args) {
		
		TrocaValoresEmUmVet.opEnt();
		TrocaValoresEmUmVet.telaInc();
		
	}
	
	static int gerador() {
		Random ger = new Random();
		return ger.nextInt(21);
	}
	
	public static int[] incVetor(int tamanho){
		Scanner  key = new Scanner(System.in);
		int v[] = new int[getTam()];
		switch(getModo()) {
		case 1:
			for (int i = 0; i < v.length; i++) {
				v[i] = gerador();
			}
				break;
		case 2:
			for (int i = 0; i < v.length; i++) {
				v[i] = key.nextInt();
			}
			break;
		}
		return v;
	}

	static void opEnt() {
		System.out.println("Deseja gerar numeros aleatorio ou fazer manualmente? \n SELECIONE \n"
				+ "1 para gerar automaticamente \n"
				+ "2 para fazer de forma manual \n"
				+ "0 para cancelar");
	}
	
	static void telaInc() {
		int i, j, temp;
		int[] val = new int[20];
		val = incVetor(20);
		for (i = 0; i < val.length; i++) {
			System.out.print(val[i] + " ");
		}
		System.out.println();
		for (i = 0; i < val.length; i++) {
		}
		
		i = 0;
		j = getTam() - 1;
		
		while(j > i){
        temp = val[i];
        val[i] = val[j];
        val[j] = temp;
        i++;
        j--;
		}
		
		for ( i = 0; i < getTam(); i++) {
			System.out.print(val[i] + " ");
		}
	}
	
	public static int getTam() {
		tam = 20;
		return tam;
	}
	
	public static int getModo() {
		Scanner  key = new Scanner(System.in);
		modo = key.nextInt();
		return modo;
	}

}
