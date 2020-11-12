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
import java.sql.SQLException;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Namespace(value="/JSP")
@Action(value="registrar", results= {@Result(name="success" , location="/JSP/exito.jsp")})
public class RegistrarAction  extends ActionSupport {
        private Usuario us = new Usuario();

    @Override
    public String execute() throws SQLException {

        UsuarioDao ad = new UsuarioDao();

        ad.insertUsuario(getUs());

        return SUCCESS;
    }



    /**
     * @return the us
     */
    public Usuario getUs() {
        return us;
    }


}
