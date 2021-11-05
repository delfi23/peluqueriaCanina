
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarCliente (String num_cliente, String nombre,String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String cel_duenio, String observaciones){
        
        Cliente cliente = new Cliente ();
        
        // casting
        int numCliente = Integer.parseInt(num_cliente);
        cliente.setNum_cliente(numCliente);
        
        cliente.setNombre(nombre);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setAlergico(alergico);
        cliente.setAtencion_especial(atencion_especial);
        cliente.setNombre_duenio(nombre_duenio);
        
        int celDuenio = Integer.parseInt(cel_duenio);
        cliente.setCel_duenio(celDuenio);
        
        cliente.setObservaciones(observaciones);
             
        controlPersis.crearCliente(cliente);
    }
}
