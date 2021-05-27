package controle;

import visao.VisaoCriaPanel;

/*
 * @author: Sara Coelho
 */

public class ControleMoverImagem {

	private VisaoCriaPanel panel;
	int posicaoImagemX;
	int posicaoImagemY;
	int movimentaPosicaoY = 2;
	int movimentaPosicaoX = 2;

	public ControleMoverImagem(VisaoCriaPanel p) {
		this.panel = p; // Recebe o Panel criado.

		// Pega as posições iniciais do JLabel.
		posicaoImagemX = panel.getLabelImagem().getX();
		posicaoImagemY = panel.getLabelImagem().getY();

		// Adiciona o processo na Thread.
		Thread mover = new Thread(executaMovimento);

		// Inicia execução dos movimentos do JLabel.
		mover.start();
	}

	Runnable executaMovimento = new Runnable() {
		@Override
		public void run() {
			while (true) { // Deixa a condição verdadeira para que a ação execute sempre.

				/*
				 * Condições para evitar que o JLabel passe das bordas, fazendo com que ele mude
				 * a direção em que está se movendo.
				 */
				
				// Movimentos horizontais. 
				if (posicaoImagemX <= 0) {
					movimentaPosicaoX *= (-1);
				} else if (posicaoImagemX >= panel.getWidth() - 85) { 
					movimentaPosicaoX *= (-1);
				}
				
				// Movimentos verticais. 
				if (posicaoImagemY <= 0) {
					movimentaPosicaoY *= (-1);
				} else if (posicaoImagemY >= panel.getHeight() - 85) {  
					movimentaPosicaoY *= (-1);
				}

				// Altera a posição do JLabel.
				posicaoImagemX += movimentaPosicaoX;
				posicaoImagemY += movimentaPosicaoY;

				// Executa a mudança da posição do JLabel.
				panel.getLabelImagem().setLocation(posicaoImagemX, posicaoImagemY);

				try { 
					Thread.sleep(5);  // Faz uma pausa entre cada execução.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	};

}
