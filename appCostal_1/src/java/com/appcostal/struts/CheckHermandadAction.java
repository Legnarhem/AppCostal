/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.appcostal.struts;

import appcostal.model.DAO;
import appcostal.model.Hermandad;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MAMISHO
 */
public class CheckHermandadAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        
        String idhermandad=((CheckHermandadActionForm)form).getIdhermandad();
        String nombre=((CheckHermandadActionForm)form).getNombre();
        String sede=((CheckHermandadActionForm)form).getSede();
        String accion=((CheckHermandadActionForm)form).getAccion();
        
        DAO dao=new DAO();
        Hermandad hermandad=new Hermandad(nombre,sede);
        
        if(accion.equals("crear")){
            dao.Insertar(hermandad);
        }else{

            hermandad.setIdhermandad(Integer.parseInt(idhermandad));
            dao.actualizar(hermandad);
        }
        
        return mapping.findForward(SUCCESS);
    }
}
