package javaPooTrein;

public class Carro {
public String nome;
public int marcha;
public double peso;
public boolean ligado;

public void Lig() {
	this.ligado = true;
	System.out.println("Carro esta  ligado");
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getMarcha() {
	return marcha;
}
public void setMarcha(int marcha) {
	this.marcha = marcha;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public boolean isLigado() {
	return ligado;
}
public void setLigado(boolean ligado) {
	this.ligado = ligado;
}

}
