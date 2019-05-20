package javaOO2;

public class Conta {
	//escopo de variáveis da classe: existe enquanto a linha de execução da classe for usada
	
	//atributos
	int codigo;
	String nome;
	int numero;
	double saldo; //float = precisão menor em relação ao double = 64bits, range maior
	double limite;
	
	//métodos 
	//valor é parâmetro para o método sacar, variável existe em outro lugar
	//escopo variáveis do método: exemplo valor, saldoAlterado = criadas a partir de um método
	
	void sacar(double valor){
		
		//Opção 1: com variável auxiliar
		//double saldoAlterado = saldo - valor;
		//saldo = saldoAlterado;
		
		//Opção 2:
		//saldo = saldo - valor;
		
		//Opção 3:
		//this.saldo -= valor;
		
        if (valor > this.saldo){ 
            System.out.println("Não posso sacar um valor maior que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
	}
	
	void despositar(double valor) {
		this.saldo += valor;
		
		//this. = diretiva de desambiguação = algumas vezes a boa prática é repetir na variável do método o nome da variável da classe.
		//this.saldo = variável saldo pertencente a esta classe Conta
	}
}
