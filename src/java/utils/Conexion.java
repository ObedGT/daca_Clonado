/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author ismaelruiz
 */
public class Conexion implements Serializable{
     //Atributos de la conexion
    private String host = "localhost";
    private String port = "3306";
    private String userName = "root";
    private String password = "admon";
    private String dbName = "daca";
    private String urlReportesPdf = "http://DESKTOP-P8BTJDH:8080/daca/Jasper/";

    /**
     * Creates a new instance of Conexion
     */
    public Conexion() {
    }
    
    
    /**
     * Método que inicializa la conexión a la bd a traves de paramatros
     * @return una conexión válida a la db.
     * @throws java.net.ConnectException
     * @throws java.sql.SQLException
     */
    public Connection connect() throws ConnectException, SQLException {
        Connection conn;
        try {
            // Creamos la conexión
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host + "/" + dbName;
            conn = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return conn;
    }

    /** 
     * Método que desconecta una conexión de la bd con la bd.
     * @param conn la conexión a desconectar.
     */
    public void disconnect(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    //Metodos Gets y Sets
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUrlReportesPdf() {
        return urlReportesPdf;
    }

    public void setUrlReportesPdf(String urlReportesPdf) {
        this.urlReportesPdf = urlReportesPdf;
    }
    
}
