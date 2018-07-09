/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroempleados;

/**
 *
 * @author Usuario
 */
public class Empleados {
    public String Nombre;
    public String Apellido;
    public String Cargo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    } 

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Empleados(String Nombre, String Apellido, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return  Nombre +  Apellido +  Cargo ;
    }
    

 
    
    
}
