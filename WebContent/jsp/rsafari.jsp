<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Eliminacion de Espacios en Intraway</title>
<link href="../css/styleR.css" rel="stylesheet" type="text/css" media="screen" />
<script language="JavaScript">
<!--
	
function confirma(){
		confirmar = confirm("¿Esta seguro de Eliminar esta Linea?");
		if (confirmar)
			document.form.submit()
		else
			return false;
	} 
	
 -->
 </script>

</head>

<%@ page session="true"%>
<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.Map"%>
<%@ page language="java" import="com.app.safari.*"%>
<%@ page language="java" import="com.app.safari.e1.*"%>

	<%
		String usuario = "";
		HttpSession sesionOk = request.getSession();
		if (sesionOk.getAttribute("usuario") == null) {
	%>
	<jsp:forward page="index.jsp">
		<jsp:param name="error" value="Es obligatorio identificarse" />
	</jsp:forward>
	<%
		} else {
			usuario = (String) sesionOk.getAttribute("usuario");
		}
	%>


<%
			String ciudad = "";
			String linea = "";
			
			if (session.getAttribute("cmbSafari") == null) {
				sesionOk.setAttribute("cmbSafari", request.getParameter("cmbSafari"));
				sesionOk.setAttribute("txtLinea", request.getParameter("txtLinea"));
        	}

        	ciudad = sesionOk.getAttribute("cmbSafari").toString();
        	linea = sesionOk.getAttribute("txtLinea").toString();
        	
        	Linea lin = null;
			
        	String RespBusqueda = "";
        	
        	if (request.getParameter("Eliminar") != null) {
        		//Elimina la Linea
        		String detMensaje = new EliminarLineaWeb(linea, ciudad, usuario).EliminarLinea();
        		session.setAttribute("DetMensaje",detMensaje);
        		
        	}else {
        		lin = new EliminarLineaWeb(linea, ciudad, usuario).ConsultarLinea();
        		if(lin.getServiceId().equals(""))
        			RespBusqueda = lin.getError()+" - "+lin.getDetMensaje();
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
					<li><a href="auris.jsp">Auris</a></li>
					<!--<li><a href="#">Configuracion</a></li>-->
				</ul>
			</div>
		</div>
		<!-- end #header -->
		<div id="page">
			<div id="content">
            	<div class="post">
            
            <div id="userData">
            <ul >
		<li id="search">
	      <div align="right">
          <form method="post" action="safari.jsp">
			<input type="submit" value="Nueva Consulta">
           </form>
       	</div>
		</li>
    </ul>
            
            </div>
                    
<h2 class="title">
<%
if(ciudad.equals("63"))
	out.print("Safari Subscriber UIO ");
else if(ciudad.equals("94"))
	out.print("Safari Subscriber GYE ");
%>
</h2>

 			<% 
					 if(session.getAttribute("DetMensaje")!=null){
					 %>
                    <div id="Mensaje">
                    	<div id="MensajeCaption">Mensaje de Respuesta: </div><%out.print(session.getAttribute("DetMensaje"));%>
                    </div>
             <%}
			 session.removeAttribute("DetMensaje");
			 %>
  <% if(lin!=null && lin.getListOfCallFeatures()!=null){ %>
                
<table cellspacing="0" id="mytable3">
<caption>DATOS DE LA LINEA</caption>
  <tr>
  <th scope="col" >Service Number</th>
  <th scope="col" >Admin Status</th>
  <th scope="col" >Display Name</th>
  <th scope="col" >Network Type</th>
  <th scope="col" >MTA Address / IP</th>
  <th scope="col" >Home Exhange ID</th>
</tr>
<tr>
  <th scope="row" class="spec"><%if(lin!=null)out.println(lin.getServiceId()); %></th>
  <td><%if(lin!=null)out.println(lin.getAdminStatus()); %></td>
  <td><%if(lin!=null)out.println(lin.getDisplayName()); %></td>
  <td><%if(lin!=null)out.println(lin.getNetworkType());%></td>
  <td><%if(lin!=null)if(!lin.getSipDestAddr().equals("")) out.println(lin.getSipDestAddr()); else out.println(lin.getMtaAddress());  %></th>
  <td><%if(lin!=null)out.println(lin.getHomeExchangeId()); %></td>
</tr>
</table> 
<ul >
		<li id="search">
	      <div align="right">
		<form method="post" action="" onSubmit="return confirma()">
         <input name="Eliminar" type="submit" id="Eliminar" value="Eliminar" >
        </form>
       		</div>
		</li>
    </ul> 
<br/>                      
		<%}else {%>	
        <div id="Mensaje">
        <div id="MensajeCaption">Mensaje de Respuesta: </div>Object not found in SAFARI DB</div>
        <br/><br/><br/><br/><br/><br/>
        <%}%>	 
           	  </div>
              
			  <% if(lin!=null && lin.getListOfCallFeatures()!=null){ %>
        
            	<div class="post">
					<h3 class="title"><a href="#">Call Features</a></h3>
					<div class="entry" align="center">
						<p>
                        
                        
      <table align="center" cellspacing="0" id="mytable2">
<caption>Detalles de los Call Features</caption>

  <tr>
  <th scope="col" abbr="Cuenta">Id CallFeature</th>
  <th scope="col" abbr="Password">Call Feature</th>
</tr>
<%  
	 for ( String key : lin.getListOfCallFeatures().keySet()){
 %>
	 <tr>
	 	<th scope="row" class="spec"><%out.println(key);%></th>
	    <td><%out.println(lin.getListOfCallFeatures().get(key));%></td>
	 </tr>
 <% } %>

</table>                  
                        
                        
                        </p>
				  </div>
					
				</div>
     <% } %>
			</div>
    
			<!-- end #content -->
		  <!-- end #sidebar -->
		  <div style="clear: both;"></div>
			
			<!-- end #widebar -->
		</div>
		<!-- end #page -->
	</div>
	<!-- end #wrapper2 -->
	<div id="footer">
		<p>Sistema de Aprovisionamiento - Titan </br>(c) GRUPO TVCABLE</p>
	</div>
</div>
<!-- end #wrapper -->
</body>
</html>
