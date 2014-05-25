<%@page import="appcostal.model.Paso"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<jsp:useBean id="paso" scope="request" type="Paso" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>G-Paso</title>
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
            <div id="header"><h1 style="font-size: 40px;text-align: center;">Editar Paso</h1></div>
            <div id="content">
                
            </div>
            <br /> 
            <br /> 
            <br /> 
            <br /> 
            
        <%
            String idpaso=Integer.toString(paso.getIdpaso());
            String idhermandad=Integer.toString(paso.getHermandad().getIdhermandad());
            
        %>
        <div style="margin: 0 auto 0 auto; padding: 20px;background-color: #E0ECF8; width: 300px; border: 2px solid black; border-radius: 8px;">
        <html:errors></html:errors>
        <html:form action="checkPaso" style="margin-top:2%;">
            <fieldset> <legend align="left">Datos</legend>
                ID:<html:text property="idpaso" value="<%=idpaso%>"></html:text><br />
                Hermandad<html:text property="idhermandad" value="<%=idhermandad%>"></html:text><br />
                Nombre:<html:text property="nombre" value="<%=paso.getNombre()%>"></html:text><br />
                Tipo:<html:text property="tipo" value="<%=paso.getTipo()%>"></html:text><br />
                
                <html:hidden property="accion" styleId="accion" value="editar"></html:hidden>
                <i class="fa fa-plus-circle"></i><html:submit>Guardar</html:submit>
                </fieldset>
        </html:form>
        </div>
    </body>
</html>