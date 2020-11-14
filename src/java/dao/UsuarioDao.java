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

    
    private String stmInsert = "Insert into usuario "
            + " (nombre, apellido, correo, contrasena) "
            + "values (?, ?, ? ,?);";
    private String stmUpdate = "Update usuario "
            + "set nombre = ?, "
            + " apellido = ?,"
            + " correo = ?,"
            + " contrasena = ? "
            + " where id = ? ";
    private String stmDelete = "Delete FROM usuario "
                              + "where id = ?";
    private String sql2 = "Select * from usuario";

    public boolean insertar(Usuario u) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmInsert);

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
    
    public boolean modificar(Usuario u) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmUpdate);

        ps.setString(1, u.getNombre());
        ps.setString(2, u.getApellido());
        ps.setString(3, u.getCorreo());
        ps.setString(4, u.getPass());
        ps.setInt(5, u.getId());

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }
    
    public boolean borrar(int pId) throws SQLException {
        boolean resultado = false;

        Connection con = ConexionSQL.getConnetion();
        PreparedStatement ps = con.prepareStatement(stmDelete);
        ps.setInt(1, pId);

        if (ps.executeUpdate() == 1) {
            resultado = true;
            ps.close();
            con.close();
        }
        return resultado;
    }
    
    
    

    public List<Usuario> consulta() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
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

    public Usuario consultaPorId(int id) throws SQLException {
        Usuario us = new Usuario();
              
        Connection con = ConexionSQL.getConnetion();
        sql2 += " where id = " + Integer.toString(id);
        PreparedStatement ps = con.prepareStatement(sql2);
        ResultSet res = ps.executeQuery(sql2);

        while (res.next()) {
            us.setId(res.getInt(1));
            us.setNombre(res.getString(2));
            us.setApellido(res.getString(3));
            us.setCorreo(res.getString(4));
            us.setPass(res.getString(5));
            us.setFecIngreso(res.getDate(6));
        }
        ps.close();
        res.close();
        con.close();
        return us;
    }
}
