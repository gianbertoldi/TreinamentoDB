package lista;

import java.text.DecimalFormat;

public class DescontoDoMercado {
	DecimalFormat dec = new DecimalFormat("0.00");
	public String nome;
	public int quantidade;
	public double preco;
	private int desconto;
	protected double total, totalDesco;
	
	public void perguntaNome() {
		System.out.println("Qual o produto que deseja comprar?");
	}
	public void perguntaQuantidade() {
		System.out.println("Quantos comprou?");
	}
	public void perguntaPreco() {
		System.out.println("Qual o preço do produto?");
	}
	public void tela() {
		System.out.println("A compra do " + nome +
				" foi um total de " + this.getTotal() +
				" Voce teve um desconto de " + this.getDesconto() + "% " + 
				" deu um total de " + this.getTotalDesco());
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getDesconto() {
		if (quantidade <= 10) {
			this.desconto =  0;
		} else if ((quantidade >= 11) && (quantidade <= 20)) {
			this.desconto = 10;
		} else if ((quantidade >= 21) && (quantidade <= 50)) {
			this.desconto = 20;
		} else {
			this.desconto = 25;
		}
		return desconto;
	}
	
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public double getTotal() {
		total = quantidade * preco;
		return this.total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getTotalDesco() {
		double temp;
		temp = (total*this.getDesconto())/100;
		totalDesco = total - temp;
		return totalDesco;
	}
	public void setTotalDesco(double totalDesco) {
		this.totalDesco = totalDesco;
	}
	
	
	
}
