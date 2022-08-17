package multiplo;

import java.util.Scanner;

public class Multiplo {
	
	public static int cont = -1;
	public static int ent;
	public static int mult;

	public static void main(String[] args) {
		getEnt();
		System.out.println(getCont());
		
	}

	public static int getCont() {
		cont++;
		return cont;
	}

	public static void setCont(int cont) {
		Multiplo.cont = cont;
	}

	public static int getEnt() {
		Scanner key =  new Scanner(System.in);
		ent = key.nextInt();
		getMult(key);
		return ent;
	}

	public static void setEnt(int ent) {
		Multiplo.ent = ent;
	}

	public static int getMult(Scanner key) {
		mult = key.nextInt();
		while (mult != 0) {
			if(mult % ent == 0) {
				getCont();
				mult =  key.nextInt();
			} else {
				mult = key.nextInt();
			}
		}
		return mult;
	}

	public static void setMult(int mult) {
		Multiplo.mult = mult;
	}
}
