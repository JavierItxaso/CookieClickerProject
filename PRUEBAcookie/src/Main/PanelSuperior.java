package Main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelSuperior extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	

	/**
	 * Create the panel.
	 */
	public PanelSuperior() {
		
		textField = new JTextField();
		textField.setEditable(false);
		add(textField);
		textField.setColumns(10);

	}
	void Editar() {
		textField.setText(""+Contadores.contador);
	}
	
}
