/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author ardan
 */
public class MenuAdministradorBean implements Serializable{
    

    /**
     * Creates a new instance of MenuAdministradorBean
     */
    public MenuAdministradorBean() {
    }
    
    /**
     * Metodo que valida la navegacion del menu administrador
     * @return 
     */
    public String irMenuCrear(){
        String resultado = "crear";
        return resultado;
    }
    public String irMenuActualizar(){
        String resultado = "actualizar";
        return resultado;
    }
    public String irMenuVer(){
        String resultado = "ver";
        return resultado;
    }
    
}

