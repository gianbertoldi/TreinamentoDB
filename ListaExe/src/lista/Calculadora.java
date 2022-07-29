package lista;

public class Calculadora {
	protected char oper;
	public double priVal;
	public double segVal;
	private double res;
	public char getOper() {
		return oper;
	}
	public void setOper(char oper) {
		this.oper = oper;
	}
	public double getPriVal() {
		return priVal;
	}
	public void setPriVal(double priVal) {
		this.priVal = priVal;
	}
	public double getSegVal() {
		return segVal;
	}
	public void setSegVal(double segVal) {
		this.segVal = segVal;
	}
	public double getRes() {
		switch(getOper()) {
		case '+':
			res = getPriVal() + getSegVal();
			break; 
		case '-':
			res = getPriVal() - getSegVal();
			break; 
		case '*':
			res = getPriVal() * getSegVal();
			break;
		case '/':
			res = getPriVal() / getSegVal();
			break;
		case 'p':
			res = Math.pow(getPriVal(), getSegVal());
			break;
		case 'r':
			res = Math.sqrt(getPriVal());
			break;
		}
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	public void getTela() {
		switch(getOper()) {
		case '+':
			System.out.println(getPriVal() + " + " + getSegVal() + " = " + getRes());
			break;
		case '-':
			System.out.println(getPriVal() + " - " + getSegVal() + " = " + getRes());
			break; 
		case '*':
			System.out.println(getPriVal() + " * " + getSegVal() + " = " + getRes());
			break; 
		case '/':
			System.out.println(getPriVal() + " / " + getSegVal() + " = " + getRes());
			break; 
		case 'p':
			System.out.println(getPriVal() + " p " + getSegVal() + " = " + getRes());
			break;
		case 'r':
			System.out.println(getPriVal() + " r " + getSegVal() + " = " + getRes());
			break; 
		case 'f':
			System.out.println("Voce cancelou!!");
			break;
			default:
				System.out.println("Operador invalido");
				break;
		}
	}

}
