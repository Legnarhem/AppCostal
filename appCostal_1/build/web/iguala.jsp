<%@page import="java.util.List"%>
<%@page import="appcostal.model.Hermano"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<%--<jsp:useBean id="hermanos" scope="request" type="List<Hermano>" />--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>G-Paso</title>
        <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
        <!--<link rel="stylesheet" href="http://localhost:8080/appCostal/assets/css/font-awesome.css"/>-->
        <!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script type="text/javascript">
            function editar(){
                $("#btn-editar").click(function(){
                /*$(".tr-form").attr('onclick','').unbind('click');
                $(".caja-botones").hide(vel);
                $(".submit").show(vel);
                $("#btn-editar-form").show();
                $("#btn-crear").hide();
                $("#num_e-form").hide();
                $("#num_edit-form").show();*/
            });
            }
        </script>-->
        <style>
            #page {
    margin:0px auto;
    width:100%;
}

#header{
  position: fixed;
  top:0;
  width:100%;
  height:auto;
  background-color:#333;
  color:#FFFFFF;
}
 #content{
  padding:30px;
  width:800px;
 }
        </style>
    </head>
    <body>
        <div id="page">
            <div id="header"><h1 style="font-size: 40px;text-align: center;">Gestión de Igualas</h1></div>
            <div id="content">
                
            </div>
        </div>
        <br />
        <br />
        <br />
        
        <%--
            for(int i=0;i<hermanos.size();i++){
                out.write(hermanos.get(i).getNombre());
            }
        --%>
        <logic:notEmpty name="igualas" scope="request">
        <center>
            <table border=1 cellspacing=2 cellpadding=2 width="60%" bgcolor="#FFFFFF">
                <tr>
                    <td><b>Nº</b></td>
                    <td><b>Opción</b></td>
                    <td><b>ID</b></td>
                    <td><b>Paso</b></td>
                    <td><b>Descripcion</b></td>
                    <td><b>Fecha</b></td>
                </tr>
                <logic:iterate name="igualas" id="p" indexId="cont">
                    <tr>
                        <td><bean:write name="cont" /></td>
                        <td>
                            <!--<i class="fa fa-times"></i> |-->
                            <html:form action="seleccionIguala" method="post">
                                <html:hidden property="idiguala" name="p"></html:hidden>
                                <i class="fa fa-pencil-square-o"></i><html:submit styleClass="fa fa-pencil-square-o" value="&#xf043"></html:submit>
                            </html:form> |
                            <html:form action="eliminarIguala" method="post">
                                <html:hidden property="idiguala" name="p"></html:hidden>
                               <i class="fa fa-trash-o"></i><html:submit styleClass="fa fa-pencil-square-o" value="&#xf043"></html:submit>
                            </html:form>
                        </td>
                        <td><bean:write name="p" property="idiguala" /> </td>
                        <td><bean:write name="p" property="paso.idpaso" /> </td>
                        <td><bean:write name="p" property="descripcion" /> </td>
                        <td><bean:write name="p" property="fecha" /> </td>
                        
                    </tr>
                </logic:iterate>
            </table>
        </center>    
    </logic:notEmpty>
    <div style="margin: 0 auto 0 auto; padding: 20px;background-color: #E0ECF8; width: 300px; border: 2px solid black; border-radius: 8px;">
    <html:errors></html:errors>
    
    <html:form action="checkIguala" style="margin-top:2%;">
        <fieldset> <legend align="left">Datos</legend>
            ID:<html:text property="idiguala"></html:text><br />
            Hermandad<html:text property="idpaso"></html:text><br />
            Descripcion:<html:text property="descripcion"></html:text><br />
            Tipo:<html:text property="fecha"></html:text><br />

            <html:hidden property="accion" styleId="accion" value="crear"></html:hidden>
            <i class="fa fa-plus-circle"></i><html:submit>Enviar</html:submit>
            </fieldset>
    </html:form>
    
    
    </div>
</body>
</html>
