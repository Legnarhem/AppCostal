/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.appcostal.struts;

import appcostal.model.DAO;
import appcostal.model.Hermandad;
import appcostal.model.Iguala;
import appcostal.model.Paso;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Jesus
 */
public class CheckIgualaAction extends org.apache.struts.action.Action {

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
        
        String idiguala=((CheckIgualaActionForm)form).getIdiguala();
        String idpaso=((CheckIgualaActionForm)form).getIdpaso();
        String descripcion=((CheckIgualaActionForm)form).getDescripcion();
        Date fecha=((CheckIgualaActionForm)form).getFecha();
        String accion=((CheckIgualaActionForm)form).getAccion();
        
        DAO dao=new DAO();
        //Hermandad hermandad=dao.obtenerHermandad(idhermandad);
        Paso paso=dao.obtenerPaso(idpaso);
        Iguala iguala=new Iguala(paso,descripcion,fecha);
        if(accion.equals("crear")){
            dao.Insertar(iguala);
        }else{

            iguala.setIdiguala(Integer.parseInt(idiguala));
            dao.actualizar(iguala);
        }
        return mapping.findForward(SUCCESS);
    }
}
