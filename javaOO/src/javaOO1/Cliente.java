package javaOO1;

//Construtor

public class Cliente {
	int codigo;
	String nome;
	String cidade;
	
	Cliente(String n){ //Construtor = mesmo nome da classe: constr�i objetos pr� determinados; ex de uso; conex�o com o banco par inserir dados diretamente na database
		nome = n;
		cidade = "Rio de Janeiro";
	}
}
