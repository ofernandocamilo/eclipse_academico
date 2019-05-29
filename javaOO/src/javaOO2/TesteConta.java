package javaOO2;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Clayton";
		
		Conta c2 = new Conta();
		c2.nome = "Clayton";
		 
		               //comparando a área de memória entre os objetos;
		if(c1 == c2) { //acessando a mesma área de memória ou diferente; No caso ele identifica que sã objetos diferentes pois estão em diferentes espaços de memória
			System.out.println("As contas são iguais!");
		} else {
			System.out.println("As contas são diferentes!");
		}
		
	}
}
