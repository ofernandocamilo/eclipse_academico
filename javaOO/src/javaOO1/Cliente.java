package javaOO1;

//Construtor

public class Cliente {
	int codigo;
	String nome;
	String cidade;
	
	Cliente(String n){ //Construtor = mesmo nome da classe: constrói objetos pré determinados; ex de uso; conexão com o banco par inserir dados diretamente na database
		nome = n;
		cidade = "Rio de Janeiro";
	}
}
