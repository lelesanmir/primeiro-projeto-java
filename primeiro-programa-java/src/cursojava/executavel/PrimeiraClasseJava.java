package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	/* Main é um método auto executável em Java */
	@SuppressWarnings("rawTypes")
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* new Aluno() é uma instancia (criacçao de objeto) */
			/* aluno1 é uma referência para o objeto Aluno */

			String nome = JOptionPane.showInputDialog("Qual nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual é a idade?"); String
			 * dataNacimento = JOptionPane.showInputDialog("Data de nascimento?"); String rg
			 * = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("Qual é o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Qual nome da mãe?"); String pai =
			 * JOptionPane.showInputDialog("Qual nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
			 * JOptionPane.showInputDialog("Qual é a escola?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNacimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");

			if (escolha == 0) { /* Opçao Sim é Zero */

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");

				}

			}

			alunos.add(aluno1); /*Separei em listas*/
		}
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.Aprovado)) {
				alunosAprovados.add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.Recuperacao)) {
					alunosRecuperacao.add(aluno);
				}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.Reprovado)){
					alunosReprovados.add(aluno);
				}
		}
		
		System.out.println("---------------------------Listas dos aprovados-----------------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno = " + aluno.getNome() + " Resultado =" + aluno.getAlunoAprovado2() + " com média de =" + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------Listas de Recuperação-----------------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno = " + aluno.getNome() + " Resultado =" + aluno.getAlunoAprovado2() + " com média de =" + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------Listas dos Reprovados-----------------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno = " + aluno.getNome() + " Resultado =" + aluno.getAlunoAprovado2() + " com média de =" + aluno.getMediaNota());
		}
		
	}

}
