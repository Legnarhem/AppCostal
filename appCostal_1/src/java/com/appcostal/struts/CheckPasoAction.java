/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.appcostal.struts;

import appcostal.model.DAO;
import appcostal.model.Hermandad;
import appcostal.model.Paso;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MAMISHO
 */
public class CheckPasoAction extends org.apache.struts.action.Action {

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
        
        String idpaso=((CheckPasoActionForm)form).getIdpaso();
        String idhermandad=((CheckPasoActionForm)form).getIdhermandad();
        String nombre=((CheckPasoActionForm)form).getNombre();
        String tipo=((CheckPasoActionForm)form).getTipo();
        String accion=((CheckPasoActionForm)form).getAccion();
        
        DAO dao=new DAO();
        Hermandad hermandad=dao.obtenerHermandad(idhermandad);
        Paso paso=new Paso(hermandad,nombre,tipo);
        if(accion.equals("crear")){
            dao.Insertar(paso);
        }else{

            paso.setIdpaso(Integer.parseInt(idpaso));
            dao.actualizar(paso);
        }
        return mapping.findForward(SUCCESS);
    }
}
