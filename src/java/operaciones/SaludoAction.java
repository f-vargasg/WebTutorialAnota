package operaciones;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author garfi
 */

@Namespace(value="/JSP")
@Action(value="saludo", results={@Result(name="success", location="/JSP/saludo.jsp")})
public class SaludoAction extends ActionSupport {
    private String mensaje;
    
    @Override
    public String execute() {
        mensaje = "Hola Mundo de Struts 2";

        return "success";
    }

    public String getMensaje() {
        return mensaje;
    }
}
