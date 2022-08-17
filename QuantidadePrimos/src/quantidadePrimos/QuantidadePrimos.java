package quantidadePrimos;

import java.util.ArrayList;
import java.util.Scanner;

public class QuantidadePrimos {
	public static int ent;

	public static void main(String[] args) {
		System.out.println("Começando o programa \n"
				+ "0 encerra o programa");
		conf();
		
	}

	public static void conf() {
		Scanner key =  new Scanner(System.in);
		
		ArrayList<Integer> pri =  new ArrayList<>();
		ent = 4;
		do {
			if (isPrimo(ent) == true) {
				pri.add(ent);
				System.out.println("Qual o valor a ser Add");
				getEnt(key);
			}else {
				System.out.println("Qual o valor a ser Add");
				getEnt(key);
			}
			
		} while(ent != 0) ;
		
		System.out.println(pri.size());
	}

	public static int getEnt(Scanner key) {
		ent  = key.nextInt();
		return ent;
	}

	public static void setEnt(int ent) {
		QuantidadePrimos.ent = ent;
	}

	private static boolean isPrimo(int ent) {
        for (int j = 2; j < ent; j++) {
            if (ent % j == 0)
                return false;   
        }
        return true;
    }
	
}
