package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() � uma instancia (criac�ao de objeto)*/
		/*aluno1 � uma refer�ncia para o objeto Aluno*/
		
		/*String nome= JOptionPane.showInputDialog("Qual nome do aluno?");
		String idade= JOptionPane.showInputDialog("Qual � a idade?");
		String dataNacimento= JOptionPane.showInputDialog("Data de nascimento?");
		String rg= JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF?");
		String mae= JOptionPane.showInputDialog("Qual nome da m�e?");
		String pai= JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula= JOptionPane.showInputDialog("Data da matricula?");
		String serie= JOptionPane.showInputDialog("Qual a serie?");
		String escola= JOptionPane.showInputDialog("Qual � a escola?");
		String nota1= JOptionPane.showInputDialog("Nota 1");
		String nota2= JOptionPane.showInputDialog("Nota 2");
		String nota3= JOptionPane.showInputDialog("Nota 3");
		String nota4= JOptionPane.showInputDialog("Nota 4");*/
		
		//Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		
		/*aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNacimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4)); 
		

		
		System.out.println(aluno1); ///descri��o da mem�ria
		System.out.println("M�dia do aluno " + aluno1.getMediaNota());
		System.out.println("Resultado " + aluno1.getAlunoAprovado2());*/
		
		/*Equals e hashcode Diferencia e comparar objetos*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais!");
		} else {
			System.out.println("Alunos n�o s�o iguais!");
		}
		
	}
	
}