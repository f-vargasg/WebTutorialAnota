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
@Action(value = "showDelUsuario", results = {
    @Result(name = SUCCESS, location = "/JSP/delUsuario.jsp")})
public class ShowDelUsuario extends ActionSupport {

    private int id;
    private Usuario us; //  = new Usuario();

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the us
     */
    public Usuario getUs() {
        return us;
    }

    @Override
    public String execute() throws Exception {
        UsuarioDao ad = new UsuarioDao();

        this.us = ad.consultaPorId(this.id);
        
        return SUCCESS;
    }

}
