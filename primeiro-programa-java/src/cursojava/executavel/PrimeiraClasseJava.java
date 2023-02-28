package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	// Método principal
	@SuppressWarnings("rawTypes")
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");
		if(login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*� uma lista que dentro dela temos uma chave que indentifica uma sequ�ncia de valores tamb�m*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		

		for (int qtd = 1; qtd <= 5; qtd++) {

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

			for (int pos = 1; pos <= 1; pos++) {

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

			alunos.add(aluno1); /*Separei em listas*/
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
		}
		
		System.out.println("---------------------------Listas dos aprovados-----------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno = " + aluno.getAlunoAprovado2() + " Resultado =" + aluno.getAlunoAprovado2() + " com m�dia de =" + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------Listas de Recupera��o-----------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno = " + aluno.getAlunoAprovado2() + " Resultado =" + aluno.getAlunoAprovado2() + " com m�dia de =" + aluno.getMediaNota());
		}
		
		System.out.println("---------------------------Listas dos Reprovados-----------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno = " + aluno.getAlunoAprovado2() + " Resultado =" + aluno.getAlunoAprovado2() + " com m�dia de =" + aluno.getMediaNota());
		}
		
	}
		
	}

}
