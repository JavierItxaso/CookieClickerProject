package Main;

import java.awt.Color;
import javax.swing.JPanel;
import Mejoras.clickAutoN1;
import javax.swing.JButton;

public class PanelMejoras extends JPanel {

    private static final long serialVersionUID = 1L;
    private clickAutoN1 mejora;
    private JButton btnNewButton;

    public PanelMejoras(PanelSuperior p) {  // Recibe PanelSuperior como parámetro
        mejora = new clickAutoN1(p);
        
        btnNewButton = new JButton(mejora.getNombre() + " Nivel " + mejora.getNivelActual() + 
                " - Precio: " + mejora.getPrecioActual()+" - "+mejora.getDescripcion());
        add(btnNewButton);
        
        btnNewButton.addActionListener(e -> {
            mejora.aplicarMejora();
            // Actualizar texto del botón con el nuevo precio y nivel
            btnNewButton.setText(mejora.getNombre() + " Nivel " + mejora.getNivelActual() + 
                                " - Precio: " + mejora.getPrecioActual()+" - "+mejora.getDescripcion());
        });
    }
}