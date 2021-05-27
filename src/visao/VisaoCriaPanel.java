package visao;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author: Sara Coelho
 */

public class VisaoCriaPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	BufferedImage imagem = null;
	private JLabel labelImagem;

	public VisaoCriaPanel() {
		setLayout(null); // Permite colocar os componentes em qualquer lugar do Panel.
		LocalizaCaminhoDaImagem();
		add(getLabelImagem()); // Adiciona o JLabel no Panel.
	}

	public void LocalizaCaminhoDaImagem() {
		/*
		 * Busca a localização da imagem. E, trata o erro, caso o argumento passado não
		 * exista ou não for possível ser ler o arquivo.
		 */
		try {
			this.imagem = ImageIO.read(getClass().getResource("planoDeFundo.png"));
		} catch (IOException | IllegalArgumentException e) {
			e.printStackTrace(); // Exibe o erro.
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		// Adiciona imagem no Panel.
		
		super.paintComponent(g);
		if (imagem != null) {
			g.drawImage(imagem, 0, 0, this.getWidth(), this.getHeight(), null);
		}
	}

	public JLabel getLabelImagem() {
		// Cria o JLabel e adiciona imagens e configurações de tamanho.
		if (labelImagem == null) {
			labelImagem = new JLabel(new ImageIcon(getClass().getResource("bolha.png")));
			labelImagem.setVisible(true);
			labelImagem.setBounds(125, 65, 85, 85);
		}
		return labelImagem;
	}
}
