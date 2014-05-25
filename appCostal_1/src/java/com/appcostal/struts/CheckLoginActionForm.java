/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.appcostal.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author MAMISHO
 */
public class CheckLoginActionForm extends org.apache.struts.action.ActionForm {
    
    private String email;
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param string
     */
    public void setEmail(String string) {
        email = string;
    }

   


    /**
     *
     */
    public CheckLoginActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        
        /**
         * Aqui vamos a hacer la validación que los campos sean correctos, es decir qu no
         * estén en blanco o en formato incorrecto, para la validación de los datos los hacemos
         * en el actionForm
         */
        
        if (getEmail() == null || getEmail().length() < 1) {
            errors.add("email", new ActionMessage("errors.required"));
            // TODO: add 'error.email.required' key to your resources
        }
        
        return errors;
    }
}
