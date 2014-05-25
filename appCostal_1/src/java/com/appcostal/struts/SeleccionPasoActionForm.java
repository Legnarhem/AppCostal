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
public class SeleccionPasoActionForm extends org.apache.struts.action.ActionForm {
    
    private String idpaso;
    
    
    
    public String getIdpaso() {
        return idpaso;
    }

    /**
     * @param string
     */
    public void setIdpaso(String string) {
        idpaso = string;
    }

    public SeleccionPasoActionForm() {
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
        /*if (getIdpaso() == null || getIdpaso().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.idpaso.required' key to your resources
        }*/
        return errors;
    }
}
