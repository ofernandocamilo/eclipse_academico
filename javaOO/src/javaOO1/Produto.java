package javaOO1;

public class Produto
{
	//atributos
	static int codigo; //atributo de classe, est�tico
	int cod_prod;
	String nome; //String � uma classe, come�a com letra mai�scula
	int quantidade;
	double preco;
	
	//m�todos
	public void mostraPreco() { //visibilidade ; tipo de retorno; nome do m�todo; () par�metros
		System.out.println(preco);
	}
	
	public void atualizaPreco(double percentual) {
		preco = preco + preco *percentual/100;
	}
}