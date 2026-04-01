package Main;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelSuperior extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private ClicksAuto c;

    public PanelSuperior() {
        textField = new JTextField();
        textField.setEditable(false);
        textField.setColumns(15);
        textField.setText("0.0");
        add(textField);
        
        c = new ClicksAuto(this);
        add(c);
    }
    
    public void Editar() {
        textField.setText(String.format("%.1f", Contadores.getContador()));
    }
}