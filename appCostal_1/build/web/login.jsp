<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            <div id="header"><h1 style="font-size: 40px;text-align: center;">App Costal</h1></div>
            <div id="content">
                
            </div>
            <br /> 
            <br /> 
            <br /> 
            <br /> 
        <div style="margin: 0 auto 0 auto; padding: 20px;background-color: #E0ECF8; width: 300px; border: 2px solid black; border-radius: 8px;">
             <h2>Login</h2>
        <html:errors></html:errors>
        <html:form action="checkLogin" method="post">
            Nombre: <html:text property="email" ></html:text><br />
            clave: <html:password property="clave"></html:password><br />
            <html:submit>Envíar</html:submit>
        </html:form>
       </div>
    </body>
</html>
