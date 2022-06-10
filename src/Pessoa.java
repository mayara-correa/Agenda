import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private List<String> nome;
	private List<Integer> idade;
	private List<Float> altura;
	
	public Pessoa() {
		super();
		this.nome = new ArrayList<String>();
		this.idade =  new ArrayList<Integer>();
		this.altura = new ArrayList<Float> ();
		
	}

	public List<String> getNome() {
		return nome;
	}

	public void setNome(List<String> nome) {
		this.nome = nome;
	}

	public List<Integer> getIdade() {
		return idade;
	}

	public void setIdade(List<Integer> idade) {
		this.idade = idade;
	}

	public List<Float> getAltura() {
		return altura;
	}

	public void setAltura(List<Float> altura) {
		this.altura = altura;
	}


	
	
	
	

}
