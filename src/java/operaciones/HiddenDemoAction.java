/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;


/**
 *
 * @author garfi
 */
@Namespace(value="/JSP")
@Action(value="hiddenDemo", results= {@Result(name=SUCCESS , location="/JSP/resultags.jsp")})
public class HiddenDemoAction extends ActionSupport {

    private String pageId;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    @Override
    public String execute() {

        return SUCCESS;
    }
}
