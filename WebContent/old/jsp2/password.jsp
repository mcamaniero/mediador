<%@ page session="true"%>
<%@ page language="java" import="com.app.dao.usuarioiw.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Cambio de Clave</title>

<style type="text/css">
<!--

.tabla {
	border: thin outset #0000CC;
	background-attachment: fixed;
	background-color: #F0F7FB;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 11px;
}
.tabla2 {
	border: thin outset #0099FF;
	background-color: #DCEFFF;
}
.style4 {
	color: #0F487D;
	font-weight: bold;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 12px;
	background-image: url(../images/barra.png);
}
.style8 {
	color: #0066FF;
	font-weight: bold;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 11px;
}
.style9 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 13px;
	color: #FFFFFF;
	background-image: url(../images/fondo_th.png);
	background-repeat: repeat-x;
	font-weight: bold;
}
.style9 a{
color:#FFFFFF;
text-decoration:none;
}
.style9 a:hover{
text-decoration:underline;
}

.style10 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 9px;
	color: #FFFFFF;
	background-image: url(iw/fondo_th.png);
	background-repeat: repeat-x;
	font-weight: bold;
}

.style10 a{
color:#0066FF;
text-decoration:none;
}
.style10 a:hover{
text-decoration:underline;
}
TD{ 
	padding: 3px;
}

TABLE{ 
	border-collapse: collapse;
	
}
-->
</style>
	
   </head>
   
   <%
   		String usuario = "";
		HttpSession sesionOk = request.getSession();
		
		if (sesionOk.getAttribute("usuario") == null) {
			
	%>
	<jsp:forward page="login.jsp">
		<jsp:param name="error" value="Es obligatorio identificarse" />
	</jsp:forward>
	<%
		} else {
			
			usuario = (String) sesionOk.getAttribute("usuario");
			AdmUsuarioIntraway ObjUsuario = (AdmUsuarioIntraway)sesionOk.getAttribute("objUsuario");
			
			String clave = request.getParameter("txtClave");
			String nuevaClave= request.getParameter("txtNuevaClave");
				
			if (clave != null && nuevaClave != null ){
						
			String detmens ="";
			if(!clave.equals("") && !nuevaClave.equals("")){
				detmens = new ConsultaUsuario().CambiarClave(ObjUsuario, clave, nuevaClave);
			}else{
				detmens = "Ingrese datos";
			}
			%>
			<jsp:forward page="login.jsp">
				<jsp:param name="error" value="<%=detmens%>" />
			</jsp:forward>
			<%
			}
		}
	%>
   
 
  <body>
  
<table width="258" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <td align="right" class="style8">
    	<a href="login.jsp"><input type="image" src="../images/ico_salir.gif" alt="Cerrar Sesion"/></a>
    </td>
  </tr>
</table>   

<form method="post" action="">

<table width="258" align="center" cellpadding="3" cellspacing="2" class="tabla">
  <tr>
    <td colspan="2" class="style4" align="center">
    <input type="image" src="../images/icos_login2.gif" />Cambio de Clave: <%out.print(usuario);%></td>
  </tr>
  <tr>
    <td colspan="2"></td>
  </tr>
  <tr>
    <td width="103" align="right" class="style8">Clave:</td>
    <td width="133" valign="top"><label>
      <input name="txtClave" type="password" id="txtClave" size="20" maxlength="20" />
      </label>
    </td>
  </tr>
  <tr>
    <td align="right" class="style8">Nueva Clave:</td>
    <td><label>
      <input name="txtNuevaClave" type="password" size="20" maxlength="20" />
      </label>
    </td>
  </tr>
  <tr>
    <td></td>
    <td><div align="right">
      <input type="submit" name="btnIngresar" value="Aceptar" />
    </div></td>
  </tr>
  <tr>
    <td colspan="2"><%if(request.getParameter("error")!=null)out.println(request.getParameter("error"));%></td>
  </tr>
</table>

</form>

  </body>
</html>
