
public class  Main extends Agenda {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		Pessoa pessoa = new Pessoa();
			
			agenda.armazenaPessoa(pessoa);
			agenda.imprimeAgenda(pessoa);
			agenda.removePessoa(null, pessoa);
			agenda.imprimeAgenda(pessoa);

		

	}

}
