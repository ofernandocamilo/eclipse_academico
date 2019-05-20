package javaOO1;

public class UsaProduto{
	public static void main(String args[])
	{
	//Vari�veis: Produto A, B, C
	Produto A; //declara��o da vari�vel
	Produto B; //declara��o da vari�vel
	Produto C; //declara��o da vari�vel
	
	//Produto A = new Produto(); <-- Pode ser assim tamb�m
	
	A = new Produto(); //instancia��o da vari�vel/classe
	B = new Produto(); //instancia��o da vari�vel/classe
	C = new Produto(); //instancia��o da vari�vel/classe
	
	//Etapas: Declara��o, Instancia��o e Incializa��o.
	
	System.out.println("Exemplo de inicializa��o default:");
	System.out.println(A.codigo +" "+A.nome); //println = print new line 
	System.out.println(" ");
	
	//Inicializa��o Padr�o (default): 
	//Automaticamente o java incializa com estes par�metros quando ela n�o � inicializada: 
	//inteiro = 0
	//String (vari�vel do tipo classe) = null
	//float = 0
	//boolean = false
	
	A.codigo = 001; //inicializa��o
	A.nome = "Sabonete"; //inicializa��o
	A.quantidade = 50; //inicializa��o
	A.preco = 5.00; //inicializa��o
	
	B.codigo = 002;
	B.nome = "Shampoo";
	B.quantidade = 100;
	B.preco = 15.00;
	
	System.out.println("Atributos da classe Produto:");
	System.out.println(A.codigo +" "+ A.nome + " " + A.quantidade + " " + A.preco);
	System.out.println(B.codigo + " "+ B.nome + " " + B.quantidade + " " + B.preco);
	
	System.out.println(" ");
	System.out.println("M�todos mostraPreco da classe Produto:");
	A.mostraPreco();
	B.mostraPreco();
	
	System.out.println(" ");
	System.out.println("M�todos atualizaPreco da classe Produto:");
	B.atualizaPreco(10); //10% percentual atribuido no par�metro do m�todo
	B.mostraPreco();
	
	}
}
