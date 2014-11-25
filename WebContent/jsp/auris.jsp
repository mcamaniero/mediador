
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Eliminacion de Lineas en Safari</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" media="screen" />
<script language="javascript" type="text/javascript" src="../js/title.js"></script>

</head>

<%@page session="true"%>
<%@ page language="java" import="com.app.dao.usuarioiw.*"%>


<script language="JavaScript">
<!--

document.write('La fecha de hoy es:'+retornarFecha());
document.write('<br>');
document.write('La hora es:'+retornarHora());

	
	function verificarLinea(){
	
		if(form1.txtLinea.value.replace(/ /g, '') == ''){
			alert("Favor: Debe Ingresar un Pin ");
			form1.txtLinea.focus();
			form1.txtLinea.select();
			return false;
		}
		
		if( !/^([0-9])*$/.test( form1.txtLinea.value ) ){
			alert("Solo se aceptan valores numericos...");
			form1.txtLinea.focus();
			form1.txtLinea.select();
			return false;
		}
		
	} 
	
	
	function verificarPin(){
	
		if(form1.txtPin.value.replace(/ /g, '') == ''){
			alert("Favor: Debe Ingresar un Pin ");
			form1.txtPin.focus();
			form1.txtPin.select();
			return false;
		}
		
		if( !/^([0-9])*$/.test( form1.txtPin.value ) ){
			alert("Solo se aceptan valores numericos...");
			form1.txtPin.focus();
			form1.txtPin.select();
			return false;
		}
		
	} 
	
function Disab (val) {
	if(val=="1"){
		form1.txtPin.disabled=false;
		form1.txtPin.focus();
		form1.txtTelefono.disabled=true;
		//form1.txtTelefono.value='';
	}
	if(val=="2"){
		form1.txtPin.disabled=true;
		form1.txtTelefono.disabled=false;
		form1.txtTelefono.focus();
		//form1.txtPin.value='';
	}
}
	
 -->
 </script>
 
	<%
			
		session.removeAttribute("txtTelefono");
		session.removeAttribute("txtPin");

		HttpSession sesionOk = request.getSession();
		
		String usuario = "";
		String clave = "";
		String perfil = "";
		
		AdmUsuarioIntraway ObjUsuario = null;
		
		if(sesionOk.isNew()){
		
			if (request.getParameter("username") != null)
				usuario = request.getParameter("username");
			if (request.getParameter("password") != null)
				clave = request.getParameter("password");
			
			ObjUsuario = new ConsultaUsuario().getUsuario(usuario, clave);
			
			
			if(ObjUsuario != null){
				sesionOk.setAttribute("usuario",usuario);
				sesionOk.setAttribute("perfil",ObjUsuario.getPerfil());
				sesionOk.setAttribute("objUsuario",ObjUsuario);
				perfil = ObjUsuario.getPerfil().toString();
				
			} else {
			%>
			<jsp:forward page="index.jsp">
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




<body>
<div id="wrapper">
	<div id="wrapper2">
		<div id="header">
<div id="logo">
				<h1><img src="../images/logo_blanco.png" alt="" class="left" /></h1>
			</div>
			<div id="menu">
				<ul>
					<li><a href="intraway.jsp">Intraway</a></li>
					<li><a href="safari.jsp">Safari</a></li>
					<li><a href="e1.jsp">E1s</a></li>
					<li><a href="#">Auris</a></li>
					<!--<li><a href="#">Configuracion</a></li>-->
				</ul>
			</div>
		</div>
		<!-- end #header -->
		<div id="page">
			<div id="content">
				
              <div class="post">
                <div id="userData" align="left">
               	  <img src="../images/User-icon.png"/>                	
                    <%out.println(usuario); %>
            	</div>
                <h2 class="title"><img src="../images/Search-icon.png"/><a href="#">Auris</a></h2>
                   	
					<div class="entry"> 
                    	 Consulta de Pines Auris
                      <br/><br/><br/>
<form name="form1" method="post" action="rauris.jsp">
<div align="center">
 <table width="220" align="center" >
  <tr>
    <td width="76"><div align="left"><label>Pin</label></div></td>
    <td>
        
           <div align="right">
             <input name="txtPin" type="text" id="txtPin" size="18" maxlength="10" title="ej: 3423456718" />
           </div>           </td>
  </tr>
  <tr>
    <td><div align="left"><label>Telefono</label></div></td>
    <td>
      
        <div align="right">
          <input name="txtTelefono" type="text" id="txtTelefono" size="18" maxlength="11" title="ej: 26002400"/>
        </div></td>
  </tr>
  <tr>
    <td height="26">&nbsp;</td>
    <td>
    		
    <ul >
		<li id="search">
	      <div align="right">
	        <input type="submit" name="Consulta" value="Consultar"/>
	      </div>
		</li>
    </ul>    </td>
  </tr>
</table>


<!--
<table width="220" align="center" >
  <tr>
    <td width="76"><div align="left"><label>
                        Pin</label></div></td>
    <td>
        
           <div align="right">
             <input name="txtPin" type="text" id="txtPin" size="18" maxlength="10" title="ej: 3423456718" />
           </div>           </td>
  </tr>
  <tr>
    <td height="26"></td>
    <td>
    		
    <ul >
		<li id="search">
	      <div align="right">
	        <input type="submit" name="Consulta" value="Consultar" onclick="verificarPin()"/>
	      </div>
		</li>
    </ul>    </td>
  </tr>
</table>
-->
</div>
</form>     

<br/><br/><br/><br/><br/>
                        
					</div>
					
				</div>
				
			</div>
			<!-- end #content -->
			<div id="sidebar">
            	<div id="logOutData" align="right">
                	<a href="index.jsp"><img src="../images/Log-Out-icon.png" title="Salir"/></a>
            	</div>
                
                <% //Perfil 5 para los procesos masivos
				boolean habilitar = false;
				if(perfil != null){ 
					String[] p = perfil.split(",");
					for (String tmp : p)
						if(tmp.equals("5"))
							habilitar = true;
				}
				if(habilitar){
				%>
				<ul>
					<li id="search">
						<h3>Procesos masivos</h3>
						<form id="searchform" enctype="multipart/form-data" method="post" action="../servlet/UploadFile">
							<div>
								<input type="file" name="fichero" id="fichero" size="15" />
							</div>
						</form>
					</li>
				</ul>
                
                <h4>Instrucciones</h4>
                Eliminacion masiva: <a href="../doc/eliminacionessip.txt">Ver Archivo</a> 
    			Suspension masiva: <a href="../doc/suspensionessip.txt">Ver Archivo</a>
                <%}%>
                
			</div>
			<!-- end #sidebar -->
			<div style="clear: both;"></div>
			
			<!-- end #widebar -->
		</div>
		<!-- end #page -->
	</div>
	<!-- end #wrapper2 -->
	<div id="footer">
    	<p align="right">Sistema de Aprovisionamiento - Titan </br>(c) GRUPO TVCABLE</p>
        <div id="footerLogo"><img src="../images/GrupoTVC.png"/></div>
  </div>
</div>
<!-- end #wrapper -->
</body>

<script language="JavaScript">
<!--
 -->
document.form1.txtTelefono.focus();


</script>
 
</html>
