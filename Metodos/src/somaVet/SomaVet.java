package somaVet;

import java.util.Scanner;

public class SomaVet {

	private static int cont = 1;
	private static int tam;

	public static void main(String[] args) {

		SomaVet.tela();
		
	}
	
	public static int[] priVet(int tama) {
		Scanner key = new Scanner(System.in);
		int v[] = new int[getTam()];
		int i = 0, tela = 0;
		for (i = 0; i < v.length; i++) {
			 System.out.println("Qual o valor " + cont + " do PRIMEIRO vetor");
			v[i] = key.nextInt();
			cont++;
		}
		return v;
	}
	
	public static int[] segVet(int tama) {
		Scanner key = new Scanner(System.in);
		cont = 1;
		int v[] = new int[getTam()],i = 0, tela = 0;
		for (i = 0; i < v.length; i++) {
			 System.out.println("Qual o valor " + cont + " do SEGUNDO vetor");
			v[i] = key.nextInt();
			cont++;
		}
		return v;
	}
	

	
	public static void tela() {
		
		int i = 0, j = 0, x = 0;
		int soma[] =  new int[getTam()];
		int[] vP = new int[getTam()];
		int[] vS = new int[getTam()];
		
		vP = priVet(getTam());
		vS = segVet(getTam());

		System.out.print("A soma dos vetores são => ");
		while(x != getTam()) {
			soma[x] = vP[i] + vS[j];
			i++;
			j++;
			System.out.print(soma[x] + " ");
			x++;
		}
	}
	
	public static int getTam() {
		tam = 10;
		return tam;
	}

	

}
