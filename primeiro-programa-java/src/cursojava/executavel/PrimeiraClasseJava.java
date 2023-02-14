package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		/* new Aluno() � uma instancia (criac�ao de objeto) */
		/* aluno1 � uma refer�ncia para o objeto Aluno */

		String nome = JOptionPane.showInputDialog("Qual nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual � a idade?");
		String dataNacimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF?");
		String mae = JOptionPane.showInputDialog("Qual nome da m�e?");
		String pai = JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Qual � a escola?");

		

		Aluno aluno1 = new Aluno(); /* Aqui ser� o Jo�o */

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNacimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);


		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);


		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);


		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		

		System.out.println(aluno1); // descri��o da mem�ria
		System.out.println("M�dia do aluno " + aluno1.getMediaNota());
		System.out.println("Situa��o " + aluno1.getAlunoAprovado());

	}

}