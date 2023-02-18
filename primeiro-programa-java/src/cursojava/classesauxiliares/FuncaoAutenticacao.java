package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato de interface de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
