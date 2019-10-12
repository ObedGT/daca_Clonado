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
public class MenuPrincipalBean implements Serializable{

    /**
     * Creates a new instance of MenuPrincipalBean
     */
    public MenuPrincipalBean() {
    }
    
    public String irCrearUsuario(){
        String resultado = "crear";
        return resultado;
    }
     public String irActualizarUsuario(){
        String resultado = "actualizar";
        return resultado;
    }
      public String irVerUsuario(){
        String resultado = "ver";
        return resultado;
    }
}
