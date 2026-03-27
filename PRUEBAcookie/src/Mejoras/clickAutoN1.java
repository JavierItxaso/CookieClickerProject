package Mejoras;

import Main.Contadores;

public class clickAutoN1 extends Mejora {
	
	public clickAutoN1() {
		super("Click Auto N1", "Genera 0.1 clicks por segundo", 15);
		
	}

	@Override
	public void aplicarMejora() {
		nivel++;
		cantidadPorSegundo += 0.1;
		precio=precio*(nivel+1);
	}

}
