package cursojava.interfaces;


/**
 * Essa interface será o nosso contrato de autenticação
 * @author Leonardo
 *
 */
public interface PermitirAcesso {

	public boolean autenticar(String login, String senha);/*Apenas declaração do método*/
	public boolean autenticar();
	
}
