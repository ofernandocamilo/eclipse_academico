package javaOO2;

public class UsaConta2 {

	public static void main(String[] args) {
		
		//Apontando para o mesmo lugar em memória
		//Conceito de valor por referência
		//O valor de limite era 100 na variável em c1;
		//Em seguida um nova variável c2 foi criada em Conta;
		//c2 = c1: c2 foi apontada ao ponteir c1;
		//Limite de c2 é 200;
		//Printando o c1 e c2 do limite será o mesmo valor do c2 passado anteriormente;
		
		Conta c1 = new Conta();
		c1.limite = 100;
		System.out.println("Limite de c1: "+ c1.limite);
		
		Conta c2; //não foi instanciada uma nova cópia da classe conta associada a variável c2;
		c2 = c1; //estão apontando para a mesma área de memória
		c2.limite = 200;
		
		System.out.println("Limite de c2: "+ c2.limite);
		System.out.println("Limite de c1: "+ c1.limite);
	}

}
