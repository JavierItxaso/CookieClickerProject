package Main;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Boton extends JPanel {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Boton(PanelSuperior p) {
		JButton bot = new JButton("Galleta");
		bot.setBackground(null);
		bot.addActionListener(e -> {
			Contadores.contador+=Contadores.cantidadporclick;
			System.out.println(Contadores.contador);
			p.Editar();
			
		});
		
		add(bot);
		
		
	}

}
