
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    @Id
    int num_cliente;
    @Basic
    String nombre;
    String raza;
    String color;
    String alergico;
    String atencion_especial;
    String nombre_duenio;
    int cel_duenio;
    String observaciones;
    
    //Constructor vacio

    public Cliente() {
    }
    
    //Constructor con atributos

    public Cliente(int num_cliente, String nombre, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, int cel_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.cel_duenio = cel_duenio;
        this.observaciones = observaciones;
    }

    // Getters
    
    public int getNum_cliente() {
        return num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public int getCel_duenio() {
        return cel_duenio;
    }
    
    public String getObservaciones() {    
        return observaciones;
    }

    // Setters
    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setCel_duenio(int cel_duenio) {
        this.cel_duenio = cel_duenio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
