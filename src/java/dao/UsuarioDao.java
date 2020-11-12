/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuario;
import conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author garfi
 */
public class UsuarioDao {
        private String sql= "Insert into usuario (nombre, apellido, correo, contrasena) values (?, ?, ? ,?);";
    private String sql2 = "Select * from usuario";
            
    public boolean insertUsuario(Usuario u) throws SQLException{
        boolean resultado = false;
        
        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, u.getNombre());
        ps.setString(2, u.getApellido());
        ps.setString(3, u.getCorreo());
        ps.setString(4, u.getPass());
        
        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }
    
    public List<Usuario> consulta () throws SQLException {
        List<Usuario> lista = new ArrayList<Usuario>();
        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(sql2);
        ResultSet res = ps.executeQuery(sql2);
        
        while (res.next()) {            
            Usuario us = new Usuario();
            us.setId(res.getInt(1));
            us.setNombre(res.getString(2));
            us.setApellido(res.getString(3));
            us.setCorreo(res.getString(4));
            us.setPass(res.getString(5));
            us.setFecIngreso(res.getDate(6));
            lista.add(us);
        }
        ps.close();
        res.close();
        con.close();
        return lista;
    }
}
