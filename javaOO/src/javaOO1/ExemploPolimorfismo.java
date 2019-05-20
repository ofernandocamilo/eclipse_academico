package javaOO1;

//Em tempo de execu��o, executa comportamentos diferentes de um mesmo m�todo
public class ExemploPolimorfismo {

	public static void main(String[] args) {
		Veiculo2 a = new Veiculo2();
		Veiculo3 b = new Veiculo3();
		
		a.velocidade = 10;
		b.velocidade = 20;
		mostraVelocidade(a);
		mostraVelocidade(b);

	}
	
	public static void mostraVelocidade(Veiculo2 v) { //Veiculo2 � foi dado como par�metro
		System.out.println(v.velocidade);
	}

}
