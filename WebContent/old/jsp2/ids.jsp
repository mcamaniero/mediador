<%@page session="true"%>
<%@ page language="java" import="com.app.dao.usuarioiw.*"%>


<script language="JavaScript">
<!--
	function verificar(){
	
		if(form1.codigo.value.replace(/ /g, '') == ''){
			alert("Favor: Debe Ingresar un contrato de Intraway ");
			form1.codigo.focus();
			form1.codigo.select();
			return false;
		}
		
		if( !/^([0-9])*$/.test( form1.codigo.value ) ){
			alert("Solo se aceptan valores numericos...");
			form1.codigo.focus();
			form1.codigo.select();
			return false;
		}
		
	}   
	
	function verificarLinea(){
	
		if(form2.txtLinea.value.replace(/ /g, '') == ''){
			alert("Favor: Debe Ingresar una Linea ");
			form2.txtLinea.focus();
			form2.txtLinea.select();
			return false;
		}
		
		if( !/^([0-9])*$/.test( form2.txtLinea.value ) ){
			alert("Solo se aceptan valores numericos...");
			form2.txtLinea.focus();
			form2.txtLinea.select();
			return false;
		}
		
	} 
	
	
	function ShowForm1(){
		document.getElementById('formulario1').style.display='block';
		document.getElementById('formulario2').style.display='none';
	}
	
	function ShowForm2(){
		document.getElementById('formulario2').style.display='block';
		document.getElementById('formulario1').style.display='none';
	}
	
 -->
 </script>
 
 
<html>
<link href="../css/estilos.css" rel="stylesheet" type="text/css" media="screen" />
	<head>
		<title>Eliminacion de Espacios en Intraway y Linea en Safari</title>
 	</head>
	
<body>
	<%
			
		session.removeAttribute("codigo");
		session.removeAttribute("ciudad");
		
		session.removeAttribute("cmbSafari");
		session.removeAttribute("txtLinea");

		HttpSession sesionOk = request.getSession();
		
		String usuario = "";
		String clave = "";
		String perfil = "";
		
		
		AdmUsuarioIntraway ObjUsuario = null;
		
		if(sesionOk.isNew()){
		
			if (request.getParameter("txtUsuario") != null)
				usuario = request.getParameter("txtUsuario");
			if (request.getParameter("txtClave") != null)
				clave = request.getParameter("txtClave");
			
			ObjUsuario = new ConsultaUsuario().getUsuario(usuario, clave);
			
			
			if(ObjUsuario != null){
				sesionOk.setAttribute("usuario",usuario);
				sesionOk.setAttribute("perfil",ObjUsuario.getPerfil());
				sesionOk.setAttribute("objUsuario",ObjUsuario);
				perfil = ObjUsuario.getPerfil().toString();
				
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
		}
	%> 
	
<br/>
<br/>

<table width="453" align="center">
  <tr>
    <td width="155" align="left" class="style5"><%out.println(usuario); %><strong><a href="password.jsp" ><img src="../images/ico_psw.gif" alt="Cambio de Clave"/></a></strong></td>
    <td width="426" align="right" class="style8"><%if(request.getParameter("error")!=null){ %>
    <%out.println(request.getParameter("error"));%>
  <%}%><strong><a href="login.jsp" alt="Cerrar Sesion"><img src="../images/ico_salir.gif" alt="Salir"/></a></strong></td>
  </tr>
</table>

<table width="453" height="155" align="center" class="tabla2">
  <tr>
    <td height="25" align="center" valign="top" bgcolor="A5C6E5" class="style9"><a onClick="ShowForm1()">Intraway</a></td>
    <td width="285" rowspan="4" align="center">
    
    
    
    
    <div id="formulario1" >
    <form name="form1" method="post" action="resultado.jsp">
<table width="255" align="center" class="tabla">
<tr>
    <td colspan="2" class="style4" align="center">Eliminacion de Espacios - Intraway</td>
  </tr>
  <tr>
    <td width="111" align="right" class="style8">Ciudad:</td>
    <td width="130">
      <select name="ciudad" id="ciudad"">
        <option value="94">Guayaquil</option>
        <option value="63">Quito</option>
        <option value="65">Cuenca</option>
        <option value="96">Machala</option>
      </select>    </td>
  </tr>
  <tr>
    <td> <div align="right" class="style8">Contrato IW:</div></td>
    <td><label>
    <input name="codigo" type="text" id="codigo" size="15" maxlength="15" class="tb11"/>
    </label></td>
  </tr>
  <tr>
    <td height="26">&nbsp;</td>
    <td>
      <div align="right">
        <input class="boton" type="submit" name="Consulta" value="Consultar" onClick="return verificar()"/>
       </div></td>
  </tr>
</table>
</form> 
</div> 
     
   <div id="formulario2" style="display:none">
   <form name="form2" method="post" action="linea.jsp">
      
  <table width="255" align="center" class="tabla">
  <tr >
    <td colspan="2" class="style4"><div align="center" >Eliminacion de Lineas - Safari</div></td>
    </tr>
    <tr>
      <td width="111"> <div align="right" class="style8">Safari:</div></td>
      <td width="130">
        <select name="cmbSafari" id="cmbLinea"">
          <option value="94">Safari GYE</option>
          <option value="63">Safari UIO</option>
          </select>    
        </td>
    </tr>
    <tr>
      <td> <div align="right" class="style8">Linea:</div></td>
      <td><label>
        <input name="txtLinea" type="text" id="txtLinea" size="15" maxlength="7" class="tb11"/>
        </label></td>
    </tr>
    <tr>
      <td height="26">&nbsp;</td>
      <td>
        <div align="right">
          <input class="boton" type="submit" name="Consulta" value="Consultar" onClick="return verificarLinea()"/>
          </div></td>
    </tr>
  </table>
        </form>
      </div>       </td>
  </tr>
  <tr>
  
    <td height="35" valign="top" bgcolor="A5C6E5"><div align="left" class="style10">
    
    <% if(perfil != null && perfil.equals("2")){ %>
    <a href="eliminacioniw.jsp">-Procesos Masivos</a>
    <% } %>
    
    </div></td>
  </tr>
  <tr>
    <td width="145" height="25" align="center" valign="top" bgcolor="A5C6E5" class="style9"><a onClick="ShowForm2()">Safari</a></td>
  </tr>
  <tr>
  
    <td height="24" valign="top" bgcolor="A5C6E5"><div align="left" class="style10">
    <% 
  	if(perfil != null && perfil.equals("2")){ %>
  	<a href="eliminacionsip.jsp">-Procesos Masivos</a>
     <% } %>
    </div></td>
  </tr>
</table>

</body>
</html>
