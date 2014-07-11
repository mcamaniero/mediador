<%@page session="true"%>
<%@ page language="java" import="com.app.dao.usuarioiw.*"%>

<html>

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
.style11 {color: #333333}

-->
</style>

  <head>
    
    
    <%
			
		session.removeAttribute("codigo");
		session.removeAttribute("ciudad");
		
		session.removeAttribute("cmbSafari");
		session.removeAttribute("txtLinea");

		HttpSession sesionOk = request.getSession();
		
		String usuario = "";
		String clave = "";
		String perfil = "";
		
		if(sesionOk.isNew()){
		
			if (request.getParameter("txtUsuario") != null)
				usuario = request.getParameter("txtUsuario");
			if (request.getParameter("txtClave") != null)
				clave = request.getParameter("txtClave");
			
			AdmUsuarioIntraway ObjUsuario = new ConsultaUsuario().getUsuario(usuario, clave);
			
			if(ObjUsuario != null){
				sesionOk.setAttribute("usuario",usuario);
				sesionOk.setAttribute("objUsuario",ObjUsuario);
				perfil = ObjUsuario.getPerfil().toString();
				sesionOk.setAttribute("perfil",perfil);
			} else {
			%>
			<jsp:forward page="login.jsp">
			<jsp:param name="error" value="Usuario y/o clave incorrectos."/>
			</jsp:forward>
			<%
			}
			
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario",usuario);
			sesion.setAttribute("perfil",perfil);
		}else{
			usuario = (String)sesionOk.getAttribute("usuario");
			perfil = (String)sesionOk.getAttribute("perfil");
			
			if(!perfil.equals("2")){%>
				<jsp:forward page="ids.jsp">
				<jsp:param name="error" value="No posee permisos"/>
				</jsp:forward>
			<%}
		}
	%> 
 </head>
  
  <body>
    
<table width="453" align="center" cellpadding="1" cellspacing="1">
  <tr>
    <td width="155" align="left" class="style5"><%out.println(usuario); %><strong></strong></td>
    <td width="426" align="right" class="style5"><strong><a href="login.jsp"><input type="image" src="../images/ico_salir.gif" /></a></strong></td>
  </tr>
</table>


<form enctype="multipart/form-data" method="post" action="../servlet/UploadFile"> 
    
<table width="406" height="190" border="0" align="center" cellpadding="2" cellspacing="2" class="tabla2">
  <tr class="style4">
    <td colspan="3" align="center">Eliminacion Masiva de Lineas en Safari</td>
  </tr>
  <tr>
    <td width="106">&nbsp;</td>
    <td width="141">&nbsp;</td>
    <td width="135">&nbsp;</td>
  </tr>
  <tr>
    <td class="style8"><div align="right">Archivo:</div></td>
    <td colspan="2"><input type="file" name="fichero"></td>
  </tr>
  <tr>
    <td height="27">&nbsp;</td>
    <td>&nbsp;</td>
    <td>
    	<input name="pagina" type="hidden" value="eliminacionsip" />
        <input type="submit" name="button" id="button" value="Procesar" />
    </td>
  </tr>
  <tr>
  <br />
    <td height="72" colspan="3" class="style10 style11" >
    <p>Eliminacion masiva: <a href="../doc/eliminacionessip.txt">Instrucciones</a></p> 
    <p>Suspension masiva: <a href="../doc/suspensionessip.txt">Instrucciones</a></p>
    </td>
  </tr>
</table>
    </form>
  </body>
</html>