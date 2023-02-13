package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	/*Main é um método auto executável em Java*/
	public static void main(String[] args) {
		
		/* new Aluno() é uma instancia (criacçao de objeto)*/
		/*aluno1 é uma referência para o objeto Aluno*/
		
		String nome= JOptionPane.showInputDialog("Qual nome do aluno?");
		String idade= JOptionPane.showInputDialog("Qual é a idade?");
		String dataNacimento= JOptionPane.showInputDialog("Data de nascimento?");
		String rg= JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae= JOptionPane.showInputDialog("Qual nome da mãe?");
		String pai= JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula= JOptionPane.showInputDialog("Data da matricula?");
		String serie= JOptionPane.showInputDialog("Qual a serie?");
		String escola= JOptionPane.showInputDialog("Qual é a escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
		String nota1= JOptionPane.showInputDialog("Nota 1");
		
		String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
		String nota2= JOptionPane.showInputDialog("Nota 2");
		
		String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
		String nota3= JOptionPane.showInputDialog("Nota 3");
		
		String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
		String nota4= JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		
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
		

		
		System.out.println(aluno1); //descrição da memória
		System.out.println("Média do aluno " + aluno1.getMediaNota());
		System.out.println("Situação " + aluno1.getAlunoAprovado());
		
		
	}
	
}