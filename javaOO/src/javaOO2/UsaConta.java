package javaOO2;

public class UsaConta {
	public static void main(String[] args) { //classe principal, controladora;
		
	   //declaração  //instanciação
		Conta c1 = new Conta();  //cria em memória uma cópia da classe Conta na variável c1;
		Conta c2 = new Conta();
		
		//especialização
		c1.numero = 01;
		c1.nome = "Robert";
		c1.saldo = 1000.0;
		c1.limite = 500.0;
		
		c2.numero = 02;
		c2.nome = "Pedro";
		c2.saldo = 5000.0;
		c2.limite = 100.0;
		
		System.out.println("Número da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite:  "+c1.limite);
		
		System.out.println("         ");
		
		System.out.println("Número da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite:  "+c2.limite);
		
		System.out.println("         ");
		System.out.println("SAQUE: ");
		
		//método sacar com parâmetro de valor = 100
		c1.sacar(500);
		System.out.println("Saldo atualizado após sacar 100 reais do Robert: "+c1.saldo);
		
		c2.sacar(200);
		System.out.println("Saldo atualizado após sacar 200 reais do Pedro: "+c2.saldo);
		
		System.out.println("         ");
		System.out.println("DESPÓSITO: ");
		
	    //método depositar
		c1.despositar(1000);
		System.out.println("Saldo atualizado após depositar 1000 reais do Robert: "+c1.saldo);
		
		c2.despositar(500);
		System.out.println("Saldo atualizado após depositar 500 reais do Pedro: "+c2.saldo);
	
		System.out.println("         ");
		System.out.println("Testando integração com o Github");
		
	}
}
