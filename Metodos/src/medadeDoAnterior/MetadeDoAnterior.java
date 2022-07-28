package medadeDoAnterior;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MetadeDoAnterior {
	protected int tamEnt;
	protected double valor;
	protected boolean ver;
	
	public static void main(String[] args) {
		DecimalFormat dec =  new DecimalFormat("0.0000");
		//Scanner key = new Scanner(System.in);
		System.out.println("Qual o tamanho do vetor?");

		
	}
	
	static int keyEnt() {
        Scanner keyEnt = new Scanner(System.in);
        return keyEnt.nextInt();
    }
	static int keyValor() {
        Scanner keyValor = new Scanner(System.in);
        return keyValor.nextInt();
    }
	static int[] LeiaVetor(int tam) {
        int[] vetor = new int[keyEnt()];
        for(int i=0; i < keyEnt(); i++){
            vetor[i] = keyEnt();
        }
        return vetor;
    }
	public int getTamEnt() {
		tamEnt = keyEnt();
		return tamEnt;
	}

	public void setTamEnt(int tamEnt) {
		this.tamEnt = tamEnt;
	}
	public double getValor() {
		valor = keyValor();
		return valor;
	}

	public void setValor(double valor) {
		this.valor= valor;
	}

	public void ver() {
		if (getTamEnt() > 0) {
			System.out.println("Qual o valor");
			this.getValor();
			if (getValor() > 0) {
				System.out.println();
			} else {
				System.out.println("-");
			}
		}else {
			 System.out.println("-");
		}

	}	
}
