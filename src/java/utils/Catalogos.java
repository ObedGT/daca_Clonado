/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.model.SelectItem;

/**
 *
 * @author Ismael Ruiz
 */
public class Catalogos {

    /**
     * Creates a new instance of Catalogos
     */
    public Catalogos() {
    }
        
    /**
     * Metodo que carga la lista de status
     * @return 
     */
    public SelectItem[] cargarEstado(){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select * from sp_load_status()";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_status");
                String descr = rs.getString("descripcion");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
    
    /**
     * Metodo que carga la lista de tipo de ingresos
     * @return 
     */
    public SelectItem[] cargarTipoIngreso(){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select * from sp_load_tipo_ingreso()";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_tipo_ingreso");
                String descr = rs.getString("descripcion");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
    
    /**
     * Metodo que carga la lista de roles
     * @return 
     */
    public SelectItem[] cargarRoles(){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select id_rol, descripcion from rol where id_estado = 1";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_rol");
                String descr = rs.getString("descripcion");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
    
    /**
     * Metodo que carga la lista de tipo de contribuyente
     * @return 
     */
    public SelectItem[] cargarTipoContribuyente(){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select * from sp_load_tipo_contribuyente()";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_tipo");
                String descr = rs.getString("descripcion");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
    
    /**
     * Metodo que carga la lista de empresas dado un nit
     * @return 
     */
    public SelectItem[] cargarEmpresas(String nit){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select * from sp_consultar_empresas_nit('" + nit + "')";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_empresa");
                String descr = rs.getString("nombre_comercial");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
    
    /**
     * Metodo que carga la lista de tipo de documentos
     * @return 
     */
    public SelectItem[] cargarTipoDocumento(){
        SelectItem[] options = new SelectItem[]{new SelectItem("-1", "-")};
        try {
            Connection conect;
            Conexion conexion = new Conexion();
            conect = conexion.connect();
            Statement stmt = conect.createStatement(ResultSet. TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "select * from sp_load_tipo_documento()";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.last()) {
                int size = rs.getRow();
                rs.beforeFirst();
                options = new SelectItem[size];
            }
            int i = 0;
            while (rs.next()) {
                String id = rs.getString("id_tipo_documento");
                String descr = rs.getString("descripcion");
                SelectItem d = new SelectItem();
                d.setValue(id);
                d.setLabel(descr);
                options[i] = d;
                i++;
            }
            conect.close();
        } catch (ConnectException | SQLException ex) {
            System.out.println("ERROR AL CARGAR LA LISTA");
        }
        return options;
    }
}
