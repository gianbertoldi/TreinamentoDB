package numeroprimo01;

import java.util.Scanner;

public class NumeroPrimo01 {

    public static void main(String[] args) {
         Scanner key = new Scanner(System.in);
        int a;
        boolean  primo = true;
        System.out.println("Digite o numero que deseja saber se é primo");
        a = key.nextInt();
        
        for (int i = 2; i < a; i++) {
             
            if (a % i == 0) {
                primo = false;
            }
        }
        if (primo == false ) {
            System.out.println("Não");            
        } else {
            System.out.println("Sim");
        }
    }
    
}
