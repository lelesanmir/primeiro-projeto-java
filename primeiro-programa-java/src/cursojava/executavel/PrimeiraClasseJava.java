package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	/* Main � um m�todo auto execut�vel em Java */
	@SuppressWarnings("rawTypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new Aluno() � uma instancia (criac�ao de objeto) */
			/* aluno1 � uma refer�ncia para o objeto Aluno */

			String nome = JOptionPane.showInputDialog("Qual nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual � a idade?"); String
			 * dataNacimento = JOptionPane.showInputDialog("Data de nascimento?"); String rg
			 * = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual � o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Qual nome da m�e?"); String pai =
			 * JOptionPane.showInputDialog("Qual nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
			 * JOptionPane.showInputDialog("Qual � a escola?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui ser� o Jo�o */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNacimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 4; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

			if (escolha == 0) { /* Op�ao Sim � Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");

				}

			}

			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("Leonardo")) {
				alunos.remove(aluno);
				break;
			} else {

				System.out.println(aluno); // descri��o da mem�ria
				System.out.println("M�dia do aluno " + aluno.getMediaNota());
				System.out.println("Situa��o " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------------------------------");
			}
		}

	}

}