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
<jsp:forward page="login.jsp">
	<jsp:param name="error" value="Es obligatorio identificarse" />
</jsp:forward>
<%
	} else {
		usuario = (String) sesionOk.getAttribute("usuario");
		sesionOk.setMaxInactiveInterval(180000);
	}
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Eliminacion de Lineas en SafariView</title>
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
		
		
<link href="../css/estilos2.css" rel="stylesheet" type="text/css" media="screen" />

<body>

<br>

	<table align="center" width="830">
		<tr>
			<td>
				<%
					if (session.getAttribute("DetMensaje") != null)
						out.print(session.getAttribute("DetMensaje"));
					session.removeAttribute("DetMensaje");
				%>
			</td>
			<td>
				<div align="right" class="style5">
					<%
						out.println(usuario);
					%><strong><a href="login.jsp"><img src="../images/ico_salir.gif" alt="Salir"/></a>
					</strong>
				</div>
			</td>
		</tr>
	</table>


	<table width="830" align="center" class="tabla">
  <tr>
    <td height="35" colspan="6"><span class="style13">
      <label>
      <form method="post" action="ids.jsp">
			<input type="submit" value="Nueva Consulta" class="boton">
	  </form>
      </label>
    </span></td>
  </tr>
  
  
  <tr bgcolor="#7CAED8">
    <td height="35" colspan="5"><span class="style6">SAFARI Subscriber:</span><span class="style3"><% out.println(RespBusqueda); %> </span></td>
    <td><span class="style10">
   <%if(RespBusqueda.equals("") ){ %>
    <form method="post" action="" onSubmit="return confirma()">
        <div align="right">
          <input type="submit" name="Eliminar" id="Eliminar" value="Eliminar" class="boton"/>
        </div>
     </form>
    <%} %>
     </td>
  </tr>
  
   <tr class="style7">
    <td width="114"><div align="center" >Service Number</div></td>
    <td width="125"><div align="center" >Admin Status</div></td>
    <td width="121"><div align="center" >Display Name</div></td>
    <td width="110"><div align="center" >Network Type</div></td>
    <td width="165"><div align="center" >MTA Address / IP</div></td>
    <td width="143"><div align="center" >Home Exhange ID</div></td>
  </tr>
  
  <tr >
    <td><div align="center" class="style4">
      <div><%if(lin!=null)out.println(lin.getServiceId()); %></div>
    </div></td>
    <td><div align="center" class="style4"><%if(lin!=null)out.println(lin.getAdminStatus()); %></div></td>
    <td class="style4"><%if(lin!=null)out.println(lin.getDisplayName()); %></td>
    <td><div align="center" class="style4"><%if(lin!=null)out.println(lin.getNetworkType());%></div></td>
    <td class="style4"><%if(lin!=null)if(!lin.getSipDestAddr().equals("")) out.println(lin.getSipDestAddr()); else out.println(lin.getMtaAddress());  %></td>
    <td class="style4"><%if(lin!=null)out.println(lin.getHomeExchangeId()); %></td>
  </tr>
</table>

<br/>

<% if(lin!=null && lin.getListOfCallFeatures()!=null){ %>

<table width="350" align="center" class="tabla">
  <tr class="style7">
    <td colspan="2" align="center">ListOfCallFeatures</td>
  </tr>
 <%  
	 for ( String key : lin.getListOfCallFeatures().keySet()){
 %>
	 <tr>
	 	<td class="style4"><%out.println(key);%></td>
	    <td class="style4"><%out.println(lin.getListOfCallFeatures().get(key));%></td>
	 </tr>
 <% } %>
</table>
<% } %>


<% if(lin!=null && lin.getDetMensaje().equals("Object not found in SAFARI DB")){ //posible que sea una E1 
	String resp[] = new SubscriberTrunkGrp(Integer.parseInt(ciudad), linea).getValues();
	if(resp != null){

%>
	
	<table width="350" align="center" class="tabla">
  <tr class="style7">
    <td colspan="2" align="center">TrunkGrp - E1</td>
  </tr>
  
  <% for(String r : resp){
	  String[] rr = r.split(":");
  %>
  	<tr>
	 	<td class="style4"><%out.println(rr[0]);%></td>
	    <td class="style4"><%out.println(rr[1]);%></td>
	 </tr>
  <% }%>
</table>

<%
	}
} 
%>


</body>