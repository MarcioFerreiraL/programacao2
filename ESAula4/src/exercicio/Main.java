package exercicio;

public class Main {
	public static void main(String[] args) {
		Cachorro dados = new Cachorro("Cachorro", "Padrao");
		System.out.println(dados.toString()); 
		
		Funcionario funcionario = new Funcionario("Zé", 70, "Cozinheiro", 1518);
		String printarFuncionario = funcionario.getNome() + ' ' + funcionario.getIdade() + ' ' + funcionario.getCargo() + ' '  + funcionario.getSalario();
		System.out.println(printarFuncionario);
	}
}
