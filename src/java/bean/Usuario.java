/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.sql.Date;

// Esto es un cometario adicional

/**
 *
 * @author garfi
 */
public class Usuario {

    int id;
    String nombre;
    String apellido;
    String correo;
    String pass;
    private Date fecIngreso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the fecIngreso
     */
    public Date getFecIngreso() {
        return fecIngreso;
    }

    /**
     * @param fecIngreso the fecIngreso to set
     */
    public void setFecIngreso(Date fecIngreso) {
        this.fecIngreso = fecIngreso;
    }
}
