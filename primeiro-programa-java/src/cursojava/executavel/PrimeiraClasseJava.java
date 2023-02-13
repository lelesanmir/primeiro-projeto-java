package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() � uma instancia (criac�ao de objeto)*/
		/*aluno1 � uma refer�ncia para o objeto Aluno*/
		
		String nome= JOptionPane.showInputDialog("Qual nome do aluno?");
		String idade= JOptionPane.showInputDialog("Qual � a idade?");
		String dataNacimento= JOptionPane.showInputDialog("Data de nascimento?");
		String rg= JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF?");
		String mae= JOptionPane.showInputDialog("Qual nome da m�e?");
		String pai= JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula= JOptionPane.showInputDialog("Data da matricula?");
		String serie= JOptionPane.showInputDialog("Qual a serie?");
		String escola= JOptionPane.showInputDialog("Qual � a escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
		String nota1= JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
		String nota2= JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
		String nota3= JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
		String nota4= JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno(); /*Aqui ser� o Jo�o*/
		
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
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		

		
		System.out.println(aluno1); //descri��o da mem�ria
		System.out.println("M�dia do aluno " + aluno1.getMediaNota());
		System.out.println("Situa��o " + aluno1.getAlunoAprovado());
		
		
	}
	
}