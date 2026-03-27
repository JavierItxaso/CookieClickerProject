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
			Contadores.setContador(Contadores.getContador()+1);
			System.out.println(Contadores.getContador());
			p.Editar();
			
		});
		
		add(bot);
		
		
	}

}
