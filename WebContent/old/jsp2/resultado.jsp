<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="com.app.intraway.consulta.ids.*" %>
<%@ page language="java" import="com.app.intraway.consulta.GetReport" %>
<%@ page session="true"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<link href="../css/estilos2.css" rel="stylesheet" type="text/css" media="screen" />

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
			//sesionOk.setMaxInactiveInterval(180000);
		}
	%>



<head>
<title>Eliminacion de Espacios en Intraway</title>
<script language="JavaScript">
<!--
	
	function confirma(){
		confirmar = confirm("¿Esta seguro de Eliminar este Espacio?");
		if (confirmar)
		//Aquí pones lo que quieras si da a Aceptar
		//En este caso seria algo asi como
		document.form.submit()
		//alert('Diste a Aceptar')
		else
		return false;
		//Aquí pones lo que quieras Cancelar
		//alert('Diste a Cancelar')
	} 
	
	function confirmaActivar(){
		confirmar = confirm("¿Esta seguro de la Activacion?");
		if (confirmar)
			document.form.submit()
		else
			return false;
	} 
	
	function confirmaDesactivar(){
		confirmar = confirm("¿Esta seguro de la DesActivacion?");
		if (confirmar)
			document.form.submit()
		else
			return false;
	} 
	
	function confirmaMail(){
		confirmar = confirm("¿Esta seguro de Eliminar este Cuenta de Correo?");
		if (confirmar)
		document.form.submit()
		else
		return false;
	} 
	
	function confirmaDialUp(){
		confirmar = confirm("¿Esta seguro de Eliminar este Cuenta DialUp?");
		if (confirmar)
		document.form.submit()
		else
		return false;
	} 
	
	function ShowForm(i){
		document.getElementById('formulario'+i).style.display='block';
	}
	function ShowFormMTA(i){
		document.getElementById('formularioMTA'+i).style.display='block';
	}
	
 -->
 </script>
</head>
<body>
  
     <br>
        <%
        	String ciudad = "";
        	String codigo = "";
        	String perfil = "";
    		
        	ClienteCrm cliente = null;

        	if (session.getAttribute("ciudad") == null) {
        		session.setAttribute("ciudad", request.getParameter("ciudad"));
        		session.setAttribute("codigo", request.getParameter("codigo"));
        	}

        	ciudad = session.getAttribute("ciudad").toString(); 
        	codigo = session.getAttribute("codigo").toString(); 
        	perfil = session.getAttribute("perfil").toString(); 
        	
        	cliente = new GetReport(ciudad.trim(), codigo.trim(), usuario, request.getRemoteHost(), request.getRemoteAddr())
        							.getClienteCrm();

        	CableModem[] cm = cliente.getCm();
			Email[] email = cliente.getEm();
			DialUp[] dialUp = cliente.getDial();

        	if (request.getParameter("objeto") != null) {
        		//Elimina el Espacio
        		String DetMensaje = cm[Integer.parseInt(request.getParameter("objeto").toString()
        				.trim())].EliminarArbol();
        		session.setAttribute("DetMensaje",DetMensaje);
        	}

        	if (request.getParameter("objeto2") != null) {
        		//Elimina el Espacio
        		String DetMensaje = email[Integer.parseInt(request.getParameter("objeto2").toString()
        				.trim())].EliminarEmail();
        		session.setAttribute("DetMensaje",DetMensaje);
        	}
        	
        	if (request.getParameter("objeto3") != null) {
        		//Elimina el Espacio
        		String DetMensaje = dialUp[Integer.parseInt(request.getParameter("objeto3").toString()
        				.trim())].EliminarDialUp();
        		session.setAttribute("DetMensaje",DetMensaje);
        	}
        	
        	if (request.getParameter("objMacCM") != null || request.getParameter("deletemaccm")!= null ) {
        		String DetMensaje = cm[Integer.parseInt(request.getParameter("objMacCM")!=null 
        				? request.getParameter("objMacCM").toString() : request.getParameter("deletemaccm")
        				.trim())].ActivarCM(request.getParameter("txtMacCM")!=null ? request.getParameter("txtMacCM").toString():"");
        		session.setAttribute("DetMensaje",DetMensaje);
        	}
        	
        	if (request.getParameter("objMacMTA") != null || request.getParameter("deletemacmta")!= null 
        			) {
        		//out.println(request.getParameter("cmbModel"));
        		String DetMensaje = cm[Integer.parseInt(request.getParameter("objMacMTA")!=null 
        				? request.getParameter("objMacMTA").toString() : request.getParameter("deletemacmta")
        				.trim())].ActivarMTA(request.getParameter("txtMacMTA")!=null ? request.getParameter("txtMacMTA").toString().trim():"",
        						request.getParameter("cmbModel")!=null ? request.getParameter("cmbModel").toString().trim() 
        								: "3080");
        		session.setAttribute("DetMensaje",DetMensaje);
        	}
        	
        	ciudad = session.getAttribute("ciudad").toString(); //request.getParameter("ciudad");
        	codigo = session.getAttribute("codigo").toString(); //request.getParameter("codigo");
        	cliente = new GetReport(ciudad.trim(), codigo.trim(), usuario, request.getRemoteHost(), request.getRemoteAddr())
        			.getClienteCrm();

        	cm = cliente.getCm();
        	email = cliente.getEm();
        	dialUp = cliente.getDial();
        	
        %>
        
        <table align="center" width="650">
        	<tr>
        		<td><%if(session.getAttribute("DetMensaje")!=null)out.print(session.getAttribute("DetMensaje"));%></td>
        		<td><div align="right" class="style5"><%out.println(usuario); %><strong><a href="login.jsp" ><img src="../images/ico_salir.gif" alt="Salir"/></a></strong></div></td>
        	</tr>
        </table>
        
        <% session.removeAttribute("DetMensaje"); %>
        
        <table class="tabla" align="center" width="650">
        <tr bgcolor="#7CAED8">
        	<td colspan="5">
        		<form method="post" action="ids.jsp">
					<input type="submit" value="Nueva Consulta" class="boton">
				</form>
        	</td>
        </tr>
        <tr class="style7">
       	  <td align="center">Contrato</td>
        	<td align="center">Nombre</td>
        	<td align="center">UserName</td>
        	<td align="center">Ciudad</td>
        	<td align="center">TipoCliente</td>
        </tr>
        <tr class="style4">
       	  <td align="center"><%=codigo%></td>
        	<td><%=cliente.getNombre()%></td>
        	<td><%=cliente.getUsername()%></td>
        	<td><%=cliente.getEmpresa()%></td>
        	<td><%=cliente.getTipoCliente()%></td>
        </tr>
        </table>
        <br>
        
        <%
                	if (cm != null)
                		for (int i = 0; i < cm.length; i++) {
                %>		
        	
        	
 <table width="750" align="center" class="tabla">
     
 <tr >
    <td height="52" colspan="9" bgcolor="#7CAED8"><div align="right">
       <form method="post" action="" onSubmit="return confirma()"><label>
       <input name="btnEliminarCM" type="submit" id="btnEliminarCM" value="Eliminar" class="boton">
       <input name="objeto" type="hidden" value="<%=i%>" /></label>
        </form>
      </div><span class="style6">Cable Modem</span></td>
  </tr>
  
  <tr class="style7">
    <td colspan="4" align="center">MAC address</td>
    <td width="137" align="center">ServicePackege</td>
    <td width="26" align="center">CPE</td>
    <td width="110" align="center">IdProducto</td>
    <td width="110" align="center">IdProdPadre</td>
    <td width="53" align="center">Estado</td>
  </tr>

  <tr>
  
  <%	String selectIcon = "";
  		if(cm[i].getMacaddress()==null || cm[i].getMacaddress().equals(""))
  			selectIcon = "add.gif";
  		else selectIcon = "delete.gif";
  %>
    <td colspan="4" align="center" class="style4"><%=cm[i].getMacaddress()%>
    	<%
    		if(perfil.equals("3"))
    		if(selectIcon.equals("add.gif")){
    	%>
    		<a onClick="ShowForm('<%=i%>')" href="#"><img src="../images/<%=selectIcon%>" ></a>
    			<div id="formulario<%=i%>" style="display:none" >
	    			<form method="post" action="" onSubmit="return confirmaActivar()">
	    			<input name="objMacCM" type="hidden" value=<%=i%> />
	    				<table>
	    					<tr>
	    					<td><input name="txtMacCM" type="text" id="txtMacCM" size="14" maxlength="12" class="tb10"/></td>
	    					<td align="center"><input class="boton" type="submit" name="btnActivaCM" value="Activar"/></td>
	    					</tr>
	    				</table>
	    			</form>
    			</div>
    	<%}else if(selectIcon.equals("delete.gif")){%>
    		<a href="?deletemaccm=<%=i%>" onClick="return confirmaDesactivar()"><img src="../images/<%=selectIcon%>" ></a>
    	<%}%>
    	
    </td>
    
    <td align="center" class="style4"><%=cm[i].getServicePackege().toLowerCase()%></td>
    <td align="center" class="style4"><%=cm[i].getCantCPE()%></td>
    <td align="center" class="style4"><%=cm[i].getIdProducto()%></td>
    <td align="center" class="style4"><%=cm[i].getIdProductoPadre()%></td>
    <td align="center" class="style4"><%=cm[i].getEstado()%></td>
  </tr>
	        
	 <%
	 	Mta mta = cm[i].getMta();
	 		if (mta != null) {
	 	    	Linea[] lineas = cm[i].getMta().getEndPoint();
	 %>
  <tr >
    <td width="32" rowspan="22" bgcolor="#A5C7E4" align="center" class="style6"><strong>MTA</strong></td>
    <td colspan="2" rowspan="1" class="style7" align="center">MAC address</td>
    <td width="76" class="style7" align="center">Modelo</td>
    <td colspan="2" class="style7" align="center">MtaProfile</td>
    <td class="style7" align="center">IdProducto</td>
    <td class="style7" align="center">IdProdPadre</td>
    <td class="style7" align="center">Estado</td>
  </tr>

  
  <%	String selectIconMta = "";
  		if(mta.getMacaddress()==null || mta.getMacaddress().equals(""))
  			selectIconMta = "add.gif";
  		else selectIconMta = "delete.gif";
  %>
  <tr class="style4">
    <td colspan="2" align="center" ><%=mta.getMacaddress()%>
    	<%
    	if(perfil.equals("3"))
    		if(selectIconMta.equals("add.gif")){
    	%>
    		<a onClick="ShowFormMTA('<%=i%>')" href="#"><img src="../images/<%=selectIconMta%>" ></a>
    			<div id="formularioMTA<%=i%>" style="display:none" >
    			<form method="post" action="" onSubmit="return confirmaActivar()">
    			<input name="objMacMTA" type="hidden" value=<%=i%> />
    				<table border="none">
    					<tr>
    					<td><input name="txtMacMTA" type="text" id="txtMacMTA" size="13" maxlength="12" class="tb10"/></td>
    					<td>
	    					<select name="cmbModel" id="cmbModel">
					          <option value="3080">TM402G</option>
					          <option value="TM502G">TM502G</option>
					          <option value="TM602G">TM602G</option>
					          <option value="SBV5120">SBV5120</option>
					          <option value="U10C022">AMBIT22</option>
					          <option value="U10C034">AMBIT34</option>
					        </select>
	    				</td>
    					<td align="center"><input class="boton" type="submit" name="btnActivaMTA" value="Activar"/></td>
    					</tr>
    				</table>
    			</form>
    			</div>  
    	<%}else if(selectIconMta.equals("delete.gif")){%>
    		<a href="?deletemacmta=<%=i%>" onClick="return confirmaDesactivar()"><img src="../images/<%=selectIconMta%>" ></a>
    	<%}%>
      
    </td>
    <td align="center" ><%=mta.getMtaModel()%></td>
    <td colspan="2" align="center" ><%=mta.getMtaProfile()%></td>
    <td align="center" ><%=mta.getIdProducto()%></td>
    <td align="center" ><%=mta.getIdProductoPadre()%></td>
    <td align="center" ><%=mta.getEstado()%></td>
  </tr>
        
	        <%
        	        	for (int j = 0; j < lineas.length; j++) {
        	        					CallFeature call[] = lineas[j].getCFeatures();
        	        %>	
 
  <tr>
    <td width="46" rowspan="<%=(3 + lineas[j].getCallFeatureValidos())%>" bgcolor="#BDDEF9" align="center" class="style6"><strong>Linea</strong></td>
    <td width="58" class="style7" align="center"><strong>EndPoint</strong></td>
    <td class="style7" align="center"><strong>Numero</strong></td>
    <td colspan="2" class="style7" align="center"><strong>HomeExchange</strong></td>
    <td class="style7" align="center"><strong>IdProducto</strong></td>
    <td class="style7" align="center"><strong>IdProdPadre</strong></td>
    <td class="style7" align="center"><strong>Estado</strong></td>
  </tr>
  
  <tr class="style4">
    <td align="center"><%=lineas[j].getEndPointNumber()%></td>
    <td align="center" ><%=lineas[j].getTN()%></td>
    <td colspan="2" align="center" ><%=lineas[j].getEpHomeExchange()%></td>
    <td align="center" ><%=lineas[j].getIdProducto()%></td>
    <td align="center" ><%=lineas[j].getIdProductoPadre()%></td>
    <td align="center" ><%=lineas[j].getEstado()%></td>
  </tr>

	
  <tr>
    <td rowspan="<%=(1 + lineas[j].getCallFeatureValidos())%>" bgcolor="#DCEEFC" align="center" class="style6"><strong>Call<br/>Features</strong></td>
    <td class="style7" align="center"><strong>CallFeature</strong></td>
    <td colspan="2" class="style7" align="center"><strong>Feature</strong></td>
    <td class="style7" align="center"><strong>IdProducto</strong></td>
    <td class="style7" align="center"><strong>IdProdPadre</strong></td>
    <td class="style7" align="center"><strong>Estado</strong></td>
  </tr>
 
  
	        <%
	        	for (int k = 0; k < call.length; k++) {
	        		if (!call[k].getIdProducto().equals("-1") && !call[k].getIdProductoPadre().equals("-1")) {
	        %>
   
  
   <tr class="style4">
    <td ><%=call[k].getNombre()+" "+call[k].getCustom1()+" "+call[k].getCustom2()%></td>
    <td colspan="2"><%=call[k].getCfName()%></td>
    <td align="center"><%=call[k].getIdProducto()%></td>
    <td align="center"><%=call[k].getIdProductoPadre()%></td>
    <td align="center">Activo</td>
  </tr>
	        <%
	        	}
	        	}
	        	}
	        }
	        %>
</table>
<br/>
        	<br/>
        <%
        	}
        %>
    
    
  
  <%if(email != null && email.length>0){ %>
     
<table width="750" border="1" align="center" class="tabla">
  <tr bgcolor="#7CAED8">
    <td height="35" colspan="7" class="style6">Cuentas de Correos</td>
    </tr>
  <tr class="style7">
    <td width="159">Cuenta</td>
    <td width="93" align="center">Password</td>
    <td width="93" align="center">DiskQuota</td>
    <td width="112" align="center">IdProducto</td>
    <td width="112" align="center">IdProdPadre</td>
    <td width="55" align="center">Estado</td>
    <td width="74"></td>
  </tr>
  
  <% for(int i = 0; i<email.length; i++){ %>
  
  <tr class="style4" height="20">
    <td><%=email[i].getUserName()+"@"+email[i].getDominio()%></td>
    <td><%=email[i].getPassword()%></td>
    <td><%=email[i].getDiskQuota()%></td>
    <td align="center"><%=email[i].getIdProducto()%></td>
    <td align="center"><%=email[i].getIdProductoPadre()%></td>
    <td align="center"><%=email[i].getEstado()%></td>
    <td align="right">
    	<form method="post" action="" onSubmit="return confirmaMail()">
      		<input type="submit" name="btnEliminarEMail" id="btnEliminarEMail" value="Eliminar" class="boton">
            <input name="objeto2" type="hidden" value=<%=i%> />
        </form>
    </td>
  </tr>
  <% } %>
</table>
<% } %>

     <br/>
     <br/> 
     
<%if(dialUp != null && dialUp.length>0){ %>
     
<table width="657" border="1" align="center" class="tabla">
  <tr bgcolor="#7CAED8">
    <td height="35" colspan="7" class="style6">Cuentas DialUp</td>
    </tr>
  <tr class="style7">
    <td width="159">Cuenta</td>
    <td width="93" align="center">Password</td>
    <td width="112" align="center">IdProducto</td>
    <td width="112" align="center">IdProdPadre</td>
    <td width="55" align="center">Estado</td>
    <td width="74"></td>
  </tr>
  
  <% for(int i = 0; i<dialUp.length; i++){ %>
  
  <tr class="style4" height="35">
    <td><%=dialUp[i].getUserName()%></td>
    <td><%=dialUp[i].getPassword()%></td>
    <td align="center"><%=dialUp[i].getIdProducto()%></td>
    <td align="center"><%=dialUp[i].getIdProductoPadre()%></td>
    <td align="center"><%=dialUp[i].getEstado()%></td>
    <td align="right">
    	<form method="post" action="" onSubmit="return confirmaDialUp()">
      		<input type="submit" name="btnEliminarDialUp" id="btnEliminarDialUp" value="Eliminar" class="boton">
            <input name="objeto3" type="hidden" value=<%=i%> />
        </form>
    </td>
  </tr>
 
  <% } %>
</table>
<% } %>

    <br/>
     <br/>    
        
</body>
  
</html>
