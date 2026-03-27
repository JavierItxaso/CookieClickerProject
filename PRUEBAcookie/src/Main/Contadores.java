package Main;

public class Contadores {
	private static double contador=0;
	private static double cantidadporclick=1;
	
	public static double getContador() {
		return contador;
	}
	public static void setContador(double d) {
		Contadores.contador = d;
	}
	public static double getCantidadporclick() {
		return cantidadporclick;
	}
	public static void setCantidadporclick(double d) {
		Contadores.cantidadporclick = d;
	}
	
	
}
