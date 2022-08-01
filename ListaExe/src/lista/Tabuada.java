package lista;

public class Tabuada {
	
	public int val;
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public void tela() {
		int mul[] = new int[11];
		
		for (int i = 0; i < mul.length; i++) {
			mul[i] = getVal()* i;
			System.out.println(getVal() + " x " + i + " = " + mul[i]);
		}
	}
}
