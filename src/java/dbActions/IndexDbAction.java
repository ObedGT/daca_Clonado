/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbActions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.context.FacesContext;
import pojos.Usuario;
import utils.Conexion;

/**
 *
 * @author Ismael Ruiz
 */
public class IndexDbAction {

    /**
     * Creates a new instance of IndexDbAction
     */
    public IndexDbAction() {
    }
    
    public Usuario validarUsuario(String email, String pass){
        Usuario resultado = new Usuario();
        try{
            Connection conn;
            Conexion conexion = new Conexion();
            conn = conexion.connect();
            Statement st = conn.createStatement();
            String sql = "select correo, password, nombre, apellido, id_estado, id_rol, fecha_creacion from usuario where correo = '" + email + "' and password = '" + pass + "'";
            //st.executeUpdate("insert into usuario values ('"+user+"', '"+pass+"', '"+passEncript+"')");
            ResultSet rs = st.executeQuery(sql);            
            if(rs.next()){
                rs.beforeFirst();
                while(rs.next()){
                    resultado.setCorreo(rs.getString("correo"));
                    resultado.setPassword(rs.getString("password"));
                    resultado.setNombre(rs.getString("nombre"));
                    resultado.setApellido(rs.getString("apellido"));
                    resultado.setIdEstado(rs.getInt("id_estado"));
                    resultado.setIdRol(rs.getInt("id_rol"));
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("SESSION_ROL", rs.getInt("id_rol"));
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("SESSION_USER", rs.getString("correo"));
                }
            }
            else{
                resultado = null;
            }
        } catch(Exception ex){
            ex.printStackTrace();                    
        }        
        return resultado;
    }
    
}
