<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Consulta Pines Auris</title>
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
<%@ page language="java" import="com.app.auris.*"%>

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
			String pin = "";
			String linea = "";
			Map resPin = null;
			
			if (session.getAttribute("txtPin") == null) {
				sesionOk.setAttribute("txtPin", request.getParameter("txtPin"));
			}
			if (session.getAttribute("txtTelefono") == null) {
				sesionOk.setAttribute("txtTelefono", request.getParameter("txtTelefono"));
			}



			pin = sesionOk.getAttribute("txtPin").toString();
			linea = sesionOk.getAttribute("txtTelefono").toString();
        	
        	String RespBusqueda = "";
        	
				//consulto por pin
			if(!pin.equals("")){
				resPin = new Consulta().getValuesPin(pin);
			}else{
				pin = new Consulta().getPINbyFONO(linea);
				resPin = new Consulta().getValuesPin(pin);

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
          <form method="post" action="auris.jsp">
			<input type="submit" value="Nueva Consulta">
           </form>
       	</div>
		</li>
    </ul>
            
            </div>
                    
<h2 class="title">
Auris
</h2>

 			<% 
					 if(session.getAttribute("DetMensaje")!=null){
					 %>
                  <div id="Mensaje">
                    	<div id="MensajeCaption">Mensaje de Respuesta: </div>
                        <%out.print(session.getAttribute("DetMensaje"));%>
                  </div>
                  
             <%
			 }
			 session.removeAttribute("DetMensaje");
			 %>
  
                
<table cellspacing="0" id="mytable">
<caption>DATOS DE LA LINEA</caption>
  <tr>
  <th  scope="col" >Pin Auris</th>
  <th  scope="col" >Saldo</th>
  <th  scope="col" >Estado</th>
  <th  scope="col" >Plan Planeta</th>

</tr>
<tr>
  <th scope="row" class="spec"><%out.println(resPin.get("account_number")); %></th>
  <td><%out.println(resPin.get("post_transaction_balance")); %></td>
  <td><%out.println(resPin.get("post_transaction_status")+"-"+Consulta.getAccountStatuses().get(resPin.get("pre_transaction_status"))); %></td>
  <td><%out.println(resPin.get("product_id")+"-"+resPin.get("ProductName"));%></td>
</tr>
</table> 

<br/>                      
		
			 
           	  </div>
              

	      <div class="post">
					<h3 class="title"><a href="#">DIDs y 1800</a></h3>
					<div class="entry" align="center">
						<p>
                        
                        
      <table align="center" cellspacing="0" id="mytable2">
<caption>Detalles de los DIDs/1800</caption>

  <tr>
  <th scope="col" abbr="Cuenta">Numero Telefono</th>
  <th scope="col" abbr="Password">DID/1800</th>
</tr>
<% 
	Map<String, String> values = new Consulta().getDIDAccessNumberDisplay(pin);
	for(String key : values.keySet()){
%>
	 <tr>
	 	<th scope="row" class="spec"><%out.println(values.get(key));%></th>
	 	<td><%out.println(key);%></td>
	 </tr>
<% } %>

</table>                  
                        
                        
                        </p>
				  </div>
					
				</div>
    
    
    
    	      <div class="post">
					<h3 class="title"><a href="#">Numeros Telefonicos asociados al PIN</a></h3>
					<div class="entry" align="center">
						<p>
                        
                        
      <table align="center" cellspacing="0" id="mytable2">
<caption>
Detalle de Numeros
</caption>
  <tr>
  <th scope="col" >Numero Telefono</th>
  <th scope="col" >Fecha de Registro</th>
</tr>
<% 
	Map<String, String> values2 = new Consulta().getANIDisplayRequest(pin);
	for(String key : values2.keySet()){
%>
	 <tr>
	 	<th scope="row" class="spec"><%out.println(key);%></th>
	 	<td><%out.println(values2.get(key));%></td>
	 </tr>
<% } %>

</table>                  
                        
                        
                        </p>
				  </div>
					
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
		<p>Sistema de Aprovisionamiento - Titan <br/>(c) GRUPO TVCABLE</p>
	</div>
</div>
<!-- end #wrapper -->
</body>
</html>
