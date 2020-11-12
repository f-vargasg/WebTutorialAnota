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
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value="/JSP")
@Action(value="consultar", results= {@Result(name="success" , location="/JSP/tabla.jsp")})
public class ConsultarAction extends ActionSupport {

    private List<Usuario> lista = new ArrayList<Usuario>();

    @Override
    public String execute() throws Exception {
        UsuarioDao ad = new UsuarioDao();

        lista = ad.consulta();

        return SUCCESS;
    }
    /**
     * @return the lista
     */
    public List<Usuario> getLista() {
        return lista;
    }    
}
