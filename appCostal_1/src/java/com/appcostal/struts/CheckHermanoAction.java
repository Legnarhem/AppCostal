/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appcostal.struts;

import appcostal.model.DAO;
import appcostal.model.Hermano;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MAMISHO
 */
public class CheckHermanoAction extends org.apache.struts.action.Action {

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
        //aqui insertamos los datos.

        String dni=((CheckHermanoActionForm) form).getDni();
        String nombre = ((CheckHermanoActionForm) form).getNombre();
        String apellido1=((CheckHermanoActionForm) form).getApellido1();
        String apellido2=((CheckHermanoActionForm) form).getApellido2();
        String direccion=((CheckHermanoActionForm) form).getDireccion();
        String localidad=((CheckHermanoActionForm) form).getLocalidad();
        String provincia=((CheckHermanoActionForm) form).getProvincia();
        String telefonofijo=((CheckHermanoActionForm) form).getTelefonofijo();
        String telefonomovil=((CheckHermanoActionForm) form).getTelefonomovil();
        String fechanac=((CheckHermanoActionForm) form).getFechanacimiento();
        String clave=((CheckHermanoActionForm) form).getClave();
        String email=((CheckHermanoActionForm) form).getEmail();
        String accion=((CheckHermanoActionForm)form).getAccion();
        
        //Date ahora = fechanacimiento;
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        //return (Date)formateador.format(ahora);
        Date fechanacimiento=formateador.parse(fechanac);
        
        

        Hermano her=new Hermano(dni, nombre, apellido1,  apellido2,  direccion,  localidad,  provincia,  telefonofijo,  telefonomovil,  fechanacimiento,  clave,  email);
        DAO dao=new DAO();
        if(accion.equals("crear")){
            dao.Insertar(her);
        }else{
            dao.actualizar(her);
        }
        
        /*if (nombre.equals(
                "prueba")) {
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }*/
                
        return mapping.findForward(SUCCESS);
    }
}
