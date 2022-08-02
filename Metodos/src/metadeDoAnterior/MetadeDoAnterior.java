package metadeDoAnterior;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class MetadeDoAnterior {
	public static int tam;
	public static double val;

	public static void main(String[] args) {
	    	Scanner key = new Scanner(System.in);
		Locale.setDefault(new Locale("en", "EUA"));
		MetadeDoAnterior.verificacao(key);
	}
	
	public static void verificacao(Scanner key) {
		System.out.println("Qual o tamanho do vetor?");
		
		tam = key.nextInt();
		
		if(getTam() > 0) {
			MetadeDoAnterior.forma(key);
		} else {
			System.out.println("-");
		}
	}
	public static void forma(Scanner key) {
		DecimalFormat dec =  new DecimalFormat("0.0000");
	
		
		double v[] = new double[getTam()];

		System.out.println("Qual o valor de entrada?");
		
		val = key.nextDouble();
		if (getVal() > 0) {
            v[0] = getVal();
            System.out.println("v[0] = "  + dec.format(v[0]));
            if (getTam() > 1) {
                for (int i = 1; i < getTam() ; i++) {
                        v[i] = v[i-1]/2;
                        System.out.println("v["+i+"] = " + dec.format(v[i]));
                }
            }
        }else{
            System.out.println("-");
        }
	}
	
	public static int getTam() {
		return tam;
	}

	public static double getVal() {
		return val;
	}
	
	
}
