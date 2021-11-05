
package Persistencia;

import Logica.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public void crearCliente(Cliente clien){
        try {
            clienteJpa.create(clien);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
