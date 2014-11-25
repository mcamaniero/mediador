<%@page session="true"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	
	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Ingreso de Usuario</title>
<style type="text/css">
<!--
.boton{
        background: #EBE3CD;
    vertical-align:middle; 
    border: 1px solid #969184;
	font-family:tahoma, arial, sans-serif
       }

.tb10 {
	background-image:url(../images/form_bg.jpg);
	background-repeat:repeat-x;
	border:1px solid #d1c7ac;
	width: 150px;
	color:#333333;
	padding:2px;
	margin-right:3px;
	margin-bottom:1px;
	margin-top:3px;
	font-family:tahoma, arial, sans-serif;
}
    
.tabla {
	border: thin outset #000099;
	background-attachment: fixed;
	background-color: #F0F7FB;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 12px;
}
.style2 {font-weight: bold}
.style4 {
	color: #FFFFFF;
	font-weight: bold;
}
.style6 {color: #FF0000}
.style8 {
	color: #0066FF;
	font-weight: bold;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 11px;
}
-->
</style>
</head>

<body>
<p>&nbsp;</p>

<% 
	session.invalidate();
%>

<form method="post" action="ids.jsp">
<table width="249" align="center" cellpadding="3" cellspacing="2" class="tabla">
  <tr>
    <td colspan="2" bgcolor="#7CAED8" class="style4">
    <input type="image" src="../images/icos_login.gif" />Login</td>
  </tr>
  <tr>
    <td width="67"><div align="right" class="style8">Usuario:</div></td>
    <td width="164" valign="top">      <label>
      <input name="txtUsuario" type="text" id="txtUsuario" maxlength="20" class="tb10"/>
    </label>    </td>
  </tr>
  <tr>
    <td><div align="right" class="style8">Clave:</div></td>
    <td>      <label>
      <input name="txtClave" type="password" id="txtClave" maxlength="20" class="tb10"/>
      </label>    </td>
  </tr>
  <tr>
    <td height="30" "></td>
    <td>
      <div align="right" class="style2">
        <input type="submit" name="btnIngresar" id="btnIngresar" value="Ingresar" class="boton"/>      
    </div>    </td>
  </tr>
  
  <%
  if(request.getParameter("error")!=null){
  %>
   <tr>
    <td colspan="2" "><span class="style6">
	<%out.println(request.getParameter("error"));%>
    </span></td>
  </tr>
  
 <% }%>
  
  
</table>
</form>
</body>
</html>
