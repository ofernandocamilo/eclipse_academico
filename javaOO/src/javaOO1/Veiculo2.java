package javaOO1;

public class Veiculo2 {
	String nome;
	float velocidade;
	
	public void acelerar() {
		if (velocidade <= 10) { //if + CTRL + SPACE + ENTER
			velocidade++;
		}
	}
	
	void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
}
