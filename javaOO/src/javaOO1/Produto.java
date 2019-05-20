package javaOO1;

public class Produto
{
	//atributos
	static int codigo; //atributo de classe, estático
	int cod_prod;
	String nome; //String é uma classe, começa com letra maiúscula
	int quantidade;
	double preco;
	
	//métodos
	public void mostraPreco() { //visibilidade ; tipo de retorno; nome do método; () parâmetros
		System.out.println(preco);
	}
	
	public void atualizaPreco(double percentual) {
		preco = preco + preco *percentual/100;
	}
}