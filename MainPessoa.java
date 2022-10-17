package ifsc;

public class MainPessoa {
	
	public static void main(String[] args) {
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		professor.setSiape(1254);
		
		pessoa.setNome("Bruna");
		pessoa.setCpf("100000");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCpf());
		System.out.println(professor.siape);
	}
	
}
