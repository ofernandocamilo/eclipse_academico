package javaOO1;

public class UsaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("João"); //"João" é parâmetro para o atributo nome no Construtor
		Cliente c2 = new Cliente("Maria"); //"Maria" é parâmetro para o atributo nome no Construtor
		
		System.out.println(c1.nome);
		System.out.println(c1.cidade);
	}
}
