package visao;

import javax.swing.JFrame;

/*
 * @author: Sara Coelho
 */

public class VisaoCriaFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public VisaoCriaFrame() {
		setTitle("Protetor de Tela");  // Título do Frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Fecha e para a execução do programa quando pressiona X.
		setSize(800, 600); // Largura e altura do Frame.
		setLocationRelativeTo(null);  // Faz Frame inicializar no centro da tela.
		setResizable(false);  // Imprede o usuário de maximizar a tela.  
		setVisible(true); // Visibilidade do Frame.
	}
}
