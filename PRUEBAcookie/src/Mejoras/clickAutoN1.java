package Mejoras;

import Main.Contadores;
import Main.PanelSuperior;

public class clickAutoN1 extends Mejora {
    private Thread hiloGeneracion;
    private boolean generando = false;
    private PanelSuperior panelSuperior; // Referencia para actualizar la UI
    
    public clickAutoN1(PanelSuperior panel) {
        super("Mano", "Genera 0.1 clicks por segundo", 15);
        this.cantidadPorSegundo = 0.1;
        this.panelSuperior = panel;
    }
    
    private void iniciarGeneracion() {
        if (generando) {
            return; // Ya está generando
        }
        
        generando = true;
        hiloGeneracion = new Thread(() -> {
            while (generando) {
                try {
                    Thread.sleep(1000);
                    // Añade la cantidad por segundo al contador
                    Contadores.setContador(Contadores.getContador() + cantidadPorSegundo);
                    // Actualizar la interfaz
                    if (panelSuperior != null) {
                        javax.swing.SwingUtilities.invokeLater(() -> panelSuperior.Editar());
                    }
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        hiloGeneracion.setDaemon(true);
        hiloGeneracion.start();
    }
    
    private void detenerGeneracion() {
        generando = false;
        if (hiloGeneracion != null) {
            hiloGeneracion.interrupt();
        }
    }
    
    @Override
    public void aplicarMejora() {
        // Comprobar si tiene suficiente dinero
        if (Contadores.getContador() >= precio) {
            // Restar el precio
            Contadores.setContador(Contadores.getContador() - precio);
            
            // Aumentar nivel y cantidad
            nivel++;
            precio = precio * (nivel + 1);
            
            // Si es la primera mejora (nivel 1), iniciar generación
            if (nivel == 1) {
                iniciarGeneracion();
            }else
            	cantidadPorSegundo += 0.1;
            
            // Actualizar interfaz
            if (panelSuperior != null) {
                panelSuperior.Editar();
            }
            
            System.out.println(nombre + " nivel " + nivel + 
                             " - Ahora genera " + cantidadPorSegundo + " por segundo" +
                             " - Precio siguiente: " + precio);
        } else {
            System.out.println("No tienes suficiente dinero. Necesitas: " + precio);
        }
    }
    
    public void detener() {
        detenerGeneracion();
    }
    
    // Getter para el precio actual
    public int getPrecioActual() {
        return precio;
    }
    
    // Getter para el nivel actual
    public int getNivelActual() {
        return nivel;
    }
}