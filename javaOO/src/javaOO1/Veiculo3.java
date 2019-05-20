package javaOO1;

public class Veiculo3 extends Veiculo2 { //extends é um palavra reservada para para relacionar uma classe como pai e filho, Veiculo2 é filho de Veiculo3;
	boolean ligado;
	
	public void liga() {
		ligado = true;
	}
	
	public void desliga() {
		ligado = false;
	}
}
