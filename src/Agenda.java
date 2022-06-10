import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda extends Pessoa{

	private Scanner leitor;

	public Agenda() 
	{
		super();
		this.leitor = new Scanner(System.in);
		
	}

	

	public void armazenaPessoa(Pessoa pessoa) {
		int decisao;
		String nome;
		int idade;
		float altura;

		do {

			System.out.println("Digite o nome ");
			nome = leitor.next();
			pessoa.getNome().add(0, nome);
			
			System.out.println("Digite a idade ");
			idade = leitor.nextInt();
			pessoa.getIdade().add(0, idade);
			
			
			System.out.println("Digite a altura ");
			altura = leitor.nextFloat();
			pessoa.getAltura().add(0, altura);

			System.out.println();

			System.out.println("Deseja adicionar novamente? 1 sim 2 sair");
			decisao = leitor.nextInt();
		} while (decisao == 1);
	}

	public void removePessoa(String nome, Pessoa pessoa) {
		String remover;
		
		System.out.println("Qual contato deseja remover? ");
		remover = leitor.next();
		
		for (int i = 0; i < pessoa.getNome().size(); i++) {
			
			if(remover.equals(getNome())) {
				pessoa.getNome().remove(i);
			}
		}
	}

	public int buscaPessoa(String nome) {
		return 0;

	}

	public void imprimeAgenda(Pessoa pessoa) {
		
		for (int i = 0; i < pessoa.getNome().size(); i++) {
			System.out.println("Nome: " + pessoa.getNome().get(i) + " Idade: " + pessoa.getIdade().get(i)  + " Altura : " + pessoa.getAltura().get(i));
		}
	}

	void imprimePessoa(int index) {
		
	}

}
