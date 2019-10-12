/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.util.Date;

/**
 *
 * @author Ismael Ruiz
 */
public class Usuario {
    private String correo;
    private String password;
    private String nombre;
    private String apellido;
    private int idEstado;
    private String estadoDescr;
    private int idRol;
    private String rolDescr;
    private Date fechaCreacion;

    /**
     * Creates a new instance of Usuario
     */
    public Usuario() {
    }

    //Metodos gets y sets
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstadoDescr() {
        return estadoDescr;
    }

    public void setEstadoDescr(String estadoDescr) {
        this.estadoDescr = estadoDescr;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRolDescr() {
        return rolDescr;
    }

    public void setRolDescr(String rolDescr) {
        this.rolDescr = rolDescr;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
