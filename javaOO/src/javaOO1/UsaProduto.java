package javaOO1;

public class UsaProduto{
	public static void main(String args[])
	{
	//Variáveis: Produto A, B, C
	Produto A; //declaração da variável
	Produto B; //declaração da variável
	Produto C; //declaração da variável
	
	//Produto A = new Produto(); <-- Pode ser assim também
	
	A = new Produto(); //instanciação da variável/classe
	B = new Produto(); //instanciação da variável/classe
	C = new Produto(); //instanciação da variável/classe
	
	//Etapas: Declaração, Instanciação e Incialização.
	
	System.out.println("Exemplo de inicialização default:");
	System.out.println(A.codigo +" "+A.nome); //println = print new line 
	System.out.println(" ");
	
	//Inicialização Padrão (default): 
	//Automaticamente o java incializa com estes parâmetros quando ela não é inicializada: 
	//inteiro = 0
	//String (variável do tipo classe) = null
	//float = 0
	//boolean = false
	
	A.codigo = 001; //inicialização
	A.nome = "Sabonete"; //inicialização
	A.quantidade = 50; //inicialização
	A.preco = 5.00; //inicialização
	
	B.codigo = 002;
	B.nome = "Shampoo";
	B.quantidade = 100;
	B.preco = 15.00;
	
	System.out.println("Atributos da classe Produto:");
	System.out.println(A.codigo +" "+ A.nome + " " + A.quantidade + " " + A.preco);
	System.out.println(B.codigo + " "+ B.nome + " " + B.quantidade + " " + B.preco);
	
	System.out.println(" ");
	System.out.println("Métodos mostraPreco da classe Produto:");
	A.mostraPreco();
	B.mostraPreco();
	
	System.out.println(" ");
	System.out.println("Métodos atualizaPreco da classe Produto:");
	B.atualizaPreco(10); //10% percentual atribuido no parâmetro do método
	B.mostraPreco();
	
	}
}
