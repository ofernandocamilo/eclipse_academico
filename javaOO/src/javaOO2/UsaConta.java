package javaOO2;

public class UsaConta {
	public static void main(String[] args) { //classe principal, controladora;
		
	   //declara��o  //instancia��o
		Conta c1 = new Conta();  //cria em mem�ria uma c�pia da classe Conta na vari�vel c1;
		Conta c2 = new Conta();
		
		//especializa��o
		c1.numero = 01;
		c1.nome = "Robert";
		c1.saldo = 1000.0;
		c1.limite = 500.0;
		
		c2.numero = 02;
		c2.nome = "Pedro";
		c2.saldo = 5000.0;
		c2.limite = 100.0;
		
		System.out.println("N�mero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite:  "+c1.limite);
		
		System.out.println("         ");
		
		System.out.println("N�mero da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite:  "+c2.limite);
		
		System.out.println("         ");
		System.out.println("SAQUE: ");
		
		//m�todo sacar com par�metro de valor = 100
		c1.sacar(500);
		System.out.println("Saldo atualizado ap�s sacar 100 reais do Robert: "+c1.saldo);
		
		c2.sacar(200);
		System.out.println("Saldo atualizado ap�s sacar 200 reais do Pedro: "+c2.saldo);
		
		System.out.println("         ");
		System.out.println("DESP�SITO: ");
		
	    //m�todo depositar
		c1.despositar(1000);
		System.out.println("Saldo atualizado ap�s depositar 1000 reais do Robert: "+c1.saldo);
		
		c2.despositar(500);
		System.out.println("Saldo atualizado ap�s depositar 500 reais do Pedro: "+c2.saldo);
	
		System.out.println("         ");
		System.out.println("Testando integra��o com o Github");
		
	}
}
