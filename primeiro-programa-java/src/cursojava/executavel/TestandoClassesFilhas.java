package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leonardo");
		aluno.setNomeEscola("Senac");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("2223346435");
		diretor.setNome("Ronaldo");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("0120982345");
		secretario.setIdade(18);
		secretario.setNome("Paulo");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio do aluno � = " + aluno.salario());
		System.out.println("Sal�rio do diretor � = " + diretor.salario());
		System.out.println("Sal�rio do secret�rio � = " + secretario.salario());
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " 
	+ pessoa.getNome() + " e o salario � de = " + pessoa.salario());
	}
	
}
