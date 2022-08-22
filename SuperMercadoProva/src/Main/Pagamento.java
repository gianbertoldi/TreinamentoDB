package Main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import Utils.Inputs;

public class Pagamento {
	 private static ArrayList<Item> listaDeItens = new ArrayList();
	 protected static Map<Double, Integer> qtd = new LinkedHashMap<>();
	 private static double troco;
	 public static double pagamento;
	 public static int[] tipoNota = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
	 
	 public static boolean isPagamento() {
		 while (pagamento < Pedido.valorTotalDoPedido) {
			return false;
		}
		return true;
		
	}


	public static double getTroco() {
		pagamento = valorPagar();
		double d;
		while (isPagamento() != true) {
			System.out.println("Pagamento insuficiente para compra");
			pagamento = valorPagar();
		}
		d = pagamento - Pedido.valorTotalDoPedido;
		
		troco = (double) (Math.round(d *100.0)/100.0);
		return troco;
	}

	private static void notasEntregue() {
		int centavo = (int) (troco * 100);	
		for(int nota : tipoNota) {
			if (centavo >= nota) {
				int total = centavo / nota;
				qtd.put(nota / 100.0, total);
				centavo %= nota;
				if (centavo == 0) {
					break;
				}
			}
		}
	}
	

	public static void setTroco(double troco) {
		Pagamento.troco = troco;
	}
	public static void imprimeFimDoPedido() {
		getTroco();
        Pedido.imprimePedido();
        ImprimeValorPago();
        imprimeTroco();
    }

	private static void ImprimeValorPago() {
    	System.out.println();
    	System.out.printf("Valor pago: R$%.2f", pagamento);
    	System.out.println("___________________________________________________________________");

    }
	
	private static void imprimeTroco() {
    	System.out.println();
    	System.out.printf("Troco: R$%.2f", troco);
    	System.out.println("_________________________________________________________________________");
    	imprimeNotas();
        System.out.println();
        System.out.println();
    }
	
	private static void imprimeNotas() {
		 notasEntregue();
		 System.out.print("|| ");
		for (Map.Entry<Double, Integer> ps : qtd.entrySet()) {
			double num = ps.getKey();
			int quant = ps.getValue();
			String tipo;
			if (num > 1) {
				tipo ="cedula";
			}else {
				tipo = "moeda";
			}
			System.out.printf("%d %s%s de %.2f || ", quant, tipo, quant > 1 ? "s" : "", num );
		}
	}
	public static double valorPagar(){
        System.out.print("Faça o pagamento:");
        return Inputs.inputDouble();
    }
}
