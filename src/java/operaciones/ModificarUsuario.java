/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.Usuario;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.UsuarioDao;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/JSP")
@Action(value = "modificarUsuario", results = {
    @Result(name = SUCCESS, location = "/JSP/exito.jsp")})
public class ModificarUsuario extends ActionSupport {
    private Usuario us = new Usuario();
    
    public Usuario getUs() {
        return us;
    }
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        UsuarioDao ad = new UsuarioDao();
        us.setId(id);
        ad.modificar(getUs());
        return SUCCESS;
    }

}
