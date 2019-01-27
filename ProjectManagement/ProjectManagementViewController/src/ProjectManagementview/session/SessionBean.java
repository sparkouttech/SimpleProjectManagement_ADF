package ProjectManagementview.session;

import com.sun.faces.context.SessionMap;

import java.util.Map;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

import weblogic.servlet.security.ServletAuthentication; 

public class SessionBean {
    public SessionBean() {
        super();
    }

    public void isAuthenticatedProgrammer(ComponentSystemEvent componentSystemEvent) {
        // Add event code here...
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession)(context.getExternalContext().getSession(false)); 
        String username = (String) session.getAttribute("username");
        String usergroup = (String) session.getAttribute("usergroup");
        if (usergroup.equals("Programmer")){
                    context.getApplication().getNavigationHandler().handleNavigation(context, null,
                                                                                     "Programmer");
                }
        else{
                context.getApplication().getNavigationHandler().handleNavigation(context, null,
                                                                                 "Login");
            }

    }
    
    public void isAuthenticatedManger(ComponentSystemEvent componentSystemEvent) {
        // Add event code here...
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession)(context.getExternalContext().getSession(false)); 
        String username = (String) session.getAttribute("username");
        String usergroup = (String) session.getAttribute("usergroup");
        if (usergroup.equals("Manager")){
                    context.getApplication().getNavigationHandler().handleNavigation(context, null,
                                                                                     "Manager");
                }
        else{
                context.getApplication().getNavigationHandler().handleNavigation(context, null,
                                                                                 "Login");
            }     

    }
    public void logout(ActionEvent ae){
                 FacesContext context = FacesContext.getCurrentInstance();
                 ExternalContext ectx = context.getExternalContext();  
                 String url = ectx.getRequestContextPath() + "/faces/Login.jsf"; 
                 HttpSession session = (HttpSession)ectx.getSession(false);  
                 session.invalidate();  
                   
                 HttpServletRequest request = (HttpServletRequest)ectx.getRequest();  
    //                 ServletAuthentication.invalidateAll(request);
    //                 ServletAuthentication.killCookie(request);
                 ServletAuthentication.logout(request);  
                   
                 try{  
                    ectx.redirect(url); 
                 }  
                 catch(Exception e){  
                   e.printStackTrace();  
                 }  
                 context.responseComplete();  
                   
                 return;  
               }
}
