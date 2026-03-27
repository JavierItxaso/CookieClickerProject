package Main;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class ClicksAuto extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ClicksAuto(PanelSuperior p) {
		
		JCheckBox click = new JCheckBox("Click Auto");
		add(click);
		click.addActionListener(e -> {
		    new Thread(() -> {
		        while(click.isSelected()) {
		            Contadores.contador += 1;
		            System.out.println(Contadores.contador);
		            p.Editar();
		            try {
		                Thread.sleep(1000);
		            } catch (InterruptedException ex) {
		                ex.printStackTrace();
		            }
		            
		        }
		    }).start();
		});
		

	}

}
