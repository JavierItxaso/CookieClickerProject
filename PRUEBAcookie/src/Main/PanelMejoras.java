package Main;

import java.awt.Color;

import javax.swing.JPanel;

import Mejoras.clickAutoN1;

import javax.swing.JButton;

public class PanelMejoras extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	clickAutoN1 mejora=new clickAutoN1();
	public PanelMejoras() {
		JButton btnNewButton = new JButton(mejora.getNombre());
		add(btnNewButton);
		btnNewButton.addActionListener(e -> {
			mejora.aplicarMejora();
		});
		
	}

}
