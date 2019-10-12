/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbActions;

import java.io.Serializable;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pojos.Estado;
import pojos.Rol;
import utils.Conexion;
import utils.Messages;

/**
 *
 * @author ardan
 */
public class MenuCrearUsuarioDbAction implements Serializable {

    /**
     * Creates a new instance of MenuCrearUsuarioDbAction
     */
    public MenuCrearUsuarioDbAction() {
    }

    /**
     * Metodo que crea un nuevo usuario
     *
     * @param correo
     * @param password
     * @param nombre
     * @param apellido
     * @param rol
     * @param estado
     */
    public int registrar(String correo, String password, String nombre, String apellido, int rol) {
        int result = 0;
        try {
            Connection conn;
            Conexion newConexion = new Conexion();
            conn = newConexion.connect();
            String sql = "insert into usuario(correo, password, nombre, apellido, id_rol, id_estado, fecha_creacion ) values('" + correo + "', '" + password + "', '" + nombre + "', '" + apellido + "', " + rol + ", 1, getDate())";
            Statement pst = conn.createStatement();
            int resultado = pst.executeUpdate(sql);
            if (resultado == 1) {
                result = resultado;                
            } else {
                result = resultado;                
            }
        } catch (ConnectException | SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
