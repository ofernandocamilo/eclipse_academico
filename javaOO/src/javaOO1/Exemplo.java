package javaOO1;

//Conceito de inner class
//Uma única classe public "principal" com o mesmo nome do arquivo em questão, o nome desta classe é "Exemplo" e o nome da classe public é o mesmo.

public class Exemplo {
	public static void main(String[] args) { //main + CTRL + SPACE + ENTER
		Veiculo v1;
		v1 = new Veiculo();
		v1.nome = "Gol";
		System.out.println(v1.nome);
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			v1.acelerar();
			v1.mostrarVelocidade();
		}
	}
}


// Inner Class
class Veiculo{ 
	String nome;
	private float velocidade;
	
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
	
	void mostrarVelocidade() { //Se colocar como private, fica inacessível até dentro do mesmo arquivo
		System.out.println(velocidade); //Syso + CTRL + SPACE + ENTER
	}
	
}
