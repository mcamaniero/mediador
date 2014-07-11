
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Consulta de Troncales E1s</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>

<%@page session="true"%>
<%@ page language="java" import="com.app.dao.usuarioiw.*"%>


<script language="JavaScript">
<!--
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
 -->
 </script>
 
	<%
			
		session.removeAttribute("cmbSafari");
		session.removeAttribute("txtLinea");

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
					<li><a href="#">E1s</a></li>
					<li><a href="auris.jsp">Auris</a></li>
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

					<h2 class="title"><img src="../images/Search-icon.png"/><a href="#">Safari - E1s</a></h2>
                   	
					<div class="entry"> 
                    	 Consulta de Troncales E1s
                         <br/><br/><br/>
<form name="form2" method="post" action="re1.jsp">
<div align="center">
<table width="210" align="center" >
  <tr>
    <td width="76"><div align="left">Safari:</div></td>
    <td width="100">
        
          <div align="right">
            <select name="cmbSafari" id="cmbSafari" style="width: 128px">
              <option value="94">Safari GYE</option>
              <option value="63">Safari UIO</option>
            </select>
           </div></td>
  </tr>
  <tr>
    <td><div align="left">Nº Piloto:</div></td>
    <td>
      
        <div align="right">
          <input name="txtLinea" type="text" id="txtLinea" size="18" maxlength="7"/>
        </div></td>
  </tr>
  <tr>
    <td height="26"></td>
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
                
                <% //Perfil 4 para los procesos masivos
				boolean habilitar = false;
				if(perfil != null){ 
					String[] p = perfil.split(",");
					for (String tmp : p)
						if(tmp.equals("4"))
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
		<p>Sistema de Aprovisionamiento - Titan </br>(c) GRUPO TVCABLE</p>
         <div id="footerLogo"><img src="../images/GrupoTVC.png"/></div>
	</div>
</div>
<!-- end #wrapper -->
</body>
<script language="JavaScript">
<!--
document.form2.txtLinea.focus();
 -->
</script>
</html>
