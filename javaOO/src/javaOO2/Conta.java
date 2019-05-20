package javaOO2;

public class Conta {
	//escopo de vari�veis da classe: existe enquanto a linha de execu��o da classe for usada
	
	//atributos
	int codigo;
	String nome;
	int numero;
	double saldo; //float = precis�o menor em rela��o ao double = 64bits, range maior
	double limite;
	
	//m�todos 
	//valor � par�metro para o m�todo sacar, vari�vel existe em outro lugar
	//escopo vari�veis do m�todo: exemplo valor, saldoAlterado = criadas a partir de um m�todo
	
	void sacar(double valor){
		
		//Op��o 1: com vari�vel auxiliar
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		
		//Op��o 2:
		//saldo = saldo - valor;
		
		//Op��o 3:
		//this.saldo -= valor;
		
        if (valor > this.saldo){ 
            System.out.println("N�o posso sacar um valor maior que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
	}
	
	void despositar(double valor) {
		this.saldo += valor;
		
		//this. = diretiva de desambigua��o = algumas vezes a boa pr�tica � repetir na vari�vel do m�todo o nome da vari�vel da classe.
		//this.saldo = vari�vel saldo pertencente a esta classe Conta
	}
}
