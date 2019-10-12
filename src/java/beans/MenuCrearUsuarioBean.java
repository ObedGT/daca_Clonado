/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dbActions.MenuCrearUsuarioDbAction;
import java.io.Serializable;
import javax.faces.model.SelectItem;
import utils.Catalogos;
import utils.Messages;

/**
 *
 * @author ardan
 */
public class MenuCrearUsuarioBean implements Serializable{    
    //Atributos de la clase
    private String Correo;
    private String Password;
    private String Nombre;
    private String Apellido;
    private int rol;
    private String estado;
    private SelectItem[] listaRoles;
    
    /**
     * Creates a new instance of MenuCrearUsuarioBean
     */
    public MenuCrearUsuarioBean() {
        cargarRoles();
    }

    /**
     * Metodo que carga los roles de los usuarios
     */
    public void cargarRoles(){
        Catalogos lista = new Catalogos();
        listaRoles = lista.cargarRoles();
    }
    
    public void validarUsuario(){
        if(this.getCorreo().equals("") || this.getRol() == -1){
            Messages.warningMessage("Advertencia", "Debe llenar los campos requeridos");
        } else{
            MenuCrearUsuarioDbAction user = new MenuCrearUsuarioDbAction();
            int resultado = user.registrar(this.getCorreo(), this.getPassword(), this.getNombre(), this.getApellido(), this.getRol());
            if(resultado == 1){
                Messages.infoMessage("EXITO", "Usuario registrado exitosamente");
            } else{
                Messages.errorMessage("ERROR", "Error al guardar el usuario");
            }
        }
    }
        

    //Metodos gets y sets
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public SelectItem[] getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(SelectItem[] listaRoles) {
        this.listaRoles = listaRoles;
    }
   
}
