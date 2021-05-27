package controle;

import visao.VisaoCriaFrame;
import visao.VisaoCriaPanel;

/*
 * @author: Sara Coelho
 */

public class ControleInicializaFrame {

	static VisaoCriaFrame frame = new VisaoCriaFrame();  // Cria um Frame.
	private VisaoCriaPanel panel;

	public ControleInicializaFrame() {
		panel = new VisaoCriaPanel(); // Cria o Panel.
		@SuppressWarnings("unused")
		ControleMoverImagem controle = new ControleMoverImagem(panel); // Chama controle do Panel.
		frame.setContentPane(panel); // Abre Panel
		frame.repaint();
		frame.validate();
	}

	public static void main(String[] args) {
		new ControleInicializaFrame();  // Inicia execução chamando o Frame.
	}
}
