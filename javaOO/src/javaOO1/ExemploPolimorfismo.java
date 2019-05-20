package javaOO1;

//Em tempo de execução, executa comportamentos diferentes de um mesmo método
public class ExemploPolimorfismo {

	public static void main(String[] args) {
		Veiculo2 a = new Veiculo2();
		Veiculo3 b = new Veiculo3();
		
		a.velocidade = 10;
		b.velocidade = 20;
		mostraVelocidade(a);
		mostraVelocidade(b);

	}
	
	public static void mostraVelocidade(Veiculo2 v) { //Veiculo2 é foi dado como parâmetro
		System.out.println(v.velocidade);
	}

}
