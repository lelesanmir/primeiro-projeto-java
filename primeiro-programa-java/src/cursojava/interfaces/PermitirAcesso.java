package cursojava.interfaces;


/**
 * Essa interface ser� o nosso contrato de autentica��o
 * @author Leonardo
 *
 */
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);/*Apenas declara��o do m�todo*/
	public boolean autenticar();
	
}
