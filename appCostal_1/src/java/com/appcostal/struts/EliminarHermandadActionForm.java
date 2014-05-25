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
public class EliminarHermandadActionForm extends org.apache.struts.action.ActionForm {
    
    private String idhermandad;
    
    private int number;

    /**
     * @return
     */
    public String getIdhermandad() {
        return idhermandad;
    }

    /**
     * @param string
     */
    public void setIdhermandad(String string) {
        idhermandad = string;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param i
     */
    public void setNumber(int i) {
        number = i;
    }

    /**
     *
     */
    public EliminarHermandadActionForm() {
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
        /*if (getIdhermandad() == null || getIdhermandad().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.idhermandad.required' key to your resources
        }*/
        return errors;
    }
}
