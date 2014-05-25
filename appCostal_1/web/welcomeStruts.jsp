<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App Costal</title>
        <html:base/>
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
    <body style="background-color: white">
        
        <div id="page">
            <div id="header"><h1 style="font-size: 40px;text-align: center;">Panel de administración</h1></div>
            <div id="content">
                
            </div>
        </div>
        <br />
        <br />
        <br />
        <%--<html:errors></html:errors>
        <html:form action="checkHermandad" method="post">
            <html:submit>Gestionar hermanada</html:submit>
        </html:form>
        --%>
        <div style="margin: 0 auto 0 auto; padding: 20px;background-color: #E0ECF8; width: 300px; border: 2px solid black; border-radius: 8px;">
            <form action="hermandad.do" method="post">
                <input type="submit" name="enviar" value="Gestionar hermandades" style="width: 150px;height: 150px;"/>
            </form>
            <form action="paso.do" method="post">
                <input type="submit" name="enviar" value="Gestionar pasos" />
            </form>
            <form action="hermano.do" method="post">
                <input type="submit" name="enviar" value="Gestionar hermano" />
            </form>
            <form action="iguala.do" method="post">
                <input type="submit" name="enviar" value="Gestionar Igualas" />
            </form>
        </div>

    </body>
</html:html>
