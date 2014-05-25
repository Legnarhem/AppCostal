/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appcostal.struts;

import appcostal.model.DAO;
import appcostal.model.Hermano;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author MAMISHO
 */
public class CheckLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ActionErrors errores = new ActionErrors();
        /**
         * Aqui se valida con los datos de la base de datos porque si llega
         * hasta este lugar, quiere decir que ha pasado por la validación del
         * formulario
         */

        //Aqui llamamos a la base de datos y comparamos con el reques.
        String email = ((CheckLoginActionForm) form).getEmail();
        String clave = ((CheckLoginActionForm) form).getClave();

        DAO dao = new DAO();
        Hermano hermano = dao.buscaHermano(email, clave);
        if (hermano != null) {
            if (email.equals(hermano.getEmail())) {
                return mapping.findForward(SUCCESS);
            } else {
                //errores.add("email", new ActionMessage("checkLogin.error.clave"));
                ((CheckLoginActionForm) form).validate(mapping, request).add("clave", new ActionMessage("checkLogin.error.clave"));
                ((CheckLoginActionForm) form).setEmail("");
                ((CheckLoginActionForm) form).setClave("");
                return mapping.findForward(FAILURE);
            }
        }else{
            //errores.add("email", new ActionMessage("checkLogin.error.clave"));
                ((CheckLoginActionForm) form).validate(mapping, request).add("clave", new ActionMessage("checkLogin.error.clave"));
                ((CheckLoginActionForm) form).setEmail("");
                ((CheckLoginActionForm) form).setClave("");
            return mapping.findForward(FAILURE);
        }
    }
}
