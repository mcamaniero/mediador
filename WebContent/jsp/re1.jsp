<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Consulta de Troncales E1s</title>
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
          <form method="post" action="e1.jsp">
			<input type="submit" value="Nueva Consulta">
           </form>
       	</div>
		</li>
    </ul>
            
            </div>
                    
<h2 class="title">
<%
if(ciudad.equals("63"))
	out.print("Safari TrunkGrp - E1 UIO ");
else if(ciudad.equals("94"))
	out.print("Safari TrunkGrp - E1 GYE ");
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
  <% 
  String resp[] = new SubscriberTrunkGrp(Integer.parseInt(ciudad), linea).getValues();
	if(resp != null){%>
  
  
  <table align="center" cellspacing="0" id="mytable2">
<caption>Detalles de la E1</caption>

  <tr>
  <th scope="col" abbr="Cuenta">Key</th>
  <th scope="col" abbr="Password">Value</th>
</tr>
<%  
	 for(String r : resp){
	  String[] rr = r.split(":");
  
 %>
	 <tr>
	 	<th scope="row" class="spec"><%out.println(rr[0]);%></th>
	    <td><%out.println(rr[1]);%></td>
	 </tr>
 <% } %>

</table>  
 
<br/>                      
		<%}else {%>	
        <div id="Mensaje">
        <div id="MensajeCaption">Mensaje de Respuesta: </div>Object not found in SAFARI DB</div>
        <br/><br/><br/><br/><br/><br/>
        <%}%>	 
           	  </div>
              
			  
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
