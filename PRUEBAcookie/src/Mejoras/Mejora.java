package Mejoras;

import Main.Contadores;

public abstract class Mejora {
	//Atributos
	protected String nombre;
	protected int precio;
	protected int nivel = 0;
	protected double cantidadPorSegundo;
	protected String descripcion;
	
	//Constructor
	public Mejora(String nombre, String descripcion, int precio) {
	    setNombre(nombre);
	    setDescripcion(descripcion);
	    setPrecio(precio);
	    // ELIMINA esta línea:
	    // Contadores.setCantidadporclick(Contadores.getCantidadporclick()+this.cantidadPorSegundo);
	}
	
	//Métodos abstractos
	public abstract void aplicarMejora();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getCantidadPorSegundo() {
		return cantidadPorSegundo;
	}

	public void setCantidadPorSegundo(double cantidadPorSegundo) {
		this.cantidadPorSegundo = cantidadPorSegundo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
