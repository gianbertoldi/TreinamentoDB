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
		int v[] = new int[keyEnt()];
		
	}
	
	static int keyEnt() {
        Scanner keyEnt = new Scanner(System.in);
        return keyEnt.nextInt();
    }
	static int keyValor() {
        Scanner keyValor = new Scanner(System.in);
        return keyValor.nextInt();
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

	public boolean isVer() {
		if (getTamEnt() > 0) {
			System.out.println("Qual o valor");
			this.getValor();
			
		}else {
			 System.out.println("-");
		}
		return ver;
	}

	public void setVer(boolean ver) {
		this.ver = ver;
	}
	
	
	
}
