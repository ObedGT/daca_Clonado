/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ismael Ruiz
 */
public class Dock implements Serializable{

    /**
     * Creates a new instance of Dock
     */
    public Dock() {
    }

    /**
     * Metodo que realiza la navegacion del dock en funcion del rol logueado
     * @return 
     */
    public String navegateDock() {
        String resultado = "";
        String rol = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("SESSION_ROL").toString();
        switch (rol) {
            case "1":
                resultado = "menuAdministrador";
                break;
            case "2":
                resultado = "menuDirector";
                break;
            case "3":
                resultado = "menuCoordinador";
                break;
            case "4":
                resultado = "menuUsuario";
                break;
        }
        return resultado;
    }
    
    /**
     * Metodo que muetra el mensaje de ayuda con el contacto telefonico
     */
    public void helpMessage(){
        Messages.infoMessage("Ayuda", "47399994 - Ing. Ismael Ruiz");
    }

}
