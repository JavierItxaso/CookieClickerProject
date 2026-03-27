package Mejoras;

import Main.Contadores;

public class Automatico {
	
	public void generarClicks(double mejoraCantidad) {
		new Thread(() -> {
			while(true) {
				Contadores.setContador(Contadores.getContador()+mejoraCantidad);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}).start();
	}
}
