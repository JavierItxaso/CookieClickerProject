package Mejoras;

public abstract class Mejora {
	//Atributos
	protected String nombre;
	protected int precio;
	protected int nivel = 0;
	protected int cantidadPorSegundo;
	
	//Constructor
	public Mejora(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Métodos abstractos
	public abstract void aplicarMejora();
}
