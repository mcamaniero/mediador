<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Eliminacion de Espacios en Intraway</title>
<link href="../css/styleR.css" rel="stylesheet" type="text/css" media="screen" />
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

<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="com.app.intraway.consulta.ids.*" %>
<%@ page language="java" import="com.app.intraway.consulta.GetReport" %>
<%@ page session="true"%>

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
        	
        	if (request.getParameter("deletebloq")!= null 
			) {
				String DetMensaje = cm[Integer.parseInt(request.getParameter("deletebloq").toString())]
				                       .EliminarBloqueo();
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
          <form method="post" action="intraway.jsp">
			<input type="submit" value="Nueva Consulta">
           </form>
       	</div>
		</li>
    </ul>
            
            </div>
                    
<h2 class="title">Cliente</h2>
<table cellspacing="0" id="mytable">
<caption>DATOS DEL CLIENTE</caption>
  <tr>
  <th scope="col" >Contrato</th>
  <th scope="col" >Nombre</th>
  <th scope="col" >UserName</th>
  <th scope="col" >Ciudad</th>
  <th scope="col" >TipoCliente</th>
</tr>
<tr>
  <th scope="row" class="spec"><%=codigo%></th>
  <td><%=cliente.getNombre()%></td>
  <td><%=cliente.getUsername()%></td>
  <td><%=cliente.getEmpresa()%></th>
  <td><%=cliente.getTipoCliente()%></th>
</tr>
</table>  
          <br/>  <br/>   <br/>       
                    
					<h3 class="title"><a href="#">Cable Modems</a></h3>
                    
                    <% 
					 if(session.getAttribute("DetMensaje")!=null){
					 %>
                    <div id="Mensaje">
                    	<div id="MensajeCaption">Mensaje de Respuesta: </div><%out.print(session.getAttribute("DetMensaje"));%>
                    </div>
                    
					<%}%>
				  
				  <% session.removeAttribute("DetMensaje"); %>
                  
                  <div class="entry">
				    <p>
                     <br/>


<%
     if (cm != null)
     for (int i = 0; i < cm.length; i++) {
%>	
                
<table align="center" cellspacing="0" id="mytable">
<caption>Serial Number: <%=cm[i].getSerial()%></caption>
  <tr >
    <th scope="col" colspan="4" >MAC CM</th>
    <th scope="col" width="137" >ServicePackege</th>
    <th scope="col" width="26" >CPE</th>
    <th scope="col" width="110" >IdProducto</th>
    <th scope="col" width="110" >IdProdPadre</th>
    <th scope="col" width="53" >Estado</th>
  </tr>

  <tr>
  
  <%	String selectIcon = "";
  		if(cm[i].getMacaddress()==null || cm[i].getMacaddress().equals(""))
  			selectIcon = "add.gif";
  		else selectIcon = "delete.gif";
  %>
    <th scope="row" class="spec" colspan="4"><%=cm[i].getMacaddress()%>
    	<%
			
			 //Perfil 3 para activar desactivar macs
				boolean habilitar = false;
				if(perfil != null){ 
					String[] p = perfil.split(",");
					for (String tmp : p)
						if(tmp.equals("3"))
							habilitar = true;
				}
				if(habilitar)
			
    		if(selectIcon.equals("add.gif")){
		%>
    		<a onClick="ShowForm('<%=i%>')" href="#"><img src="../images/<%=selectIcon%>" ></a>
    			<div id="formulario<%=i%>" style="display:none" >
	    			<form method="post" action="" onSubmit="return confirmaActivar()">
	    			<input name="objMacCM" type="hidden" value=<%=i%> />
	    				<div align="center">
                        <table cellspacing="0">
	    					<tr>
	    					<th scope="col"><input name="txtMacCM" type="text" id="txtMacCM" size="14" maxlength="12" class="tb10"/></td>
                            </th>
                            <tr>
	    					<th scope="row" class="spec"><input class="boton" type="submit" name="btnActivaCM" value="Activar"/></td>
	    					</th>
	    				</table>
                        </div>
	    			</form>
    			</div>
    	<%}else if(selectIcon.equals("delete.gif")){%>
		<a href="?deletemaccm=<%=i%>" onClick="return confirmaDesactivar()"><img src="../images/<%=selectIcon%>" ></a>
		<%}%>    </th>
    
    <td ><%=cm[i].getServicePackege().toLowerCase()%></td>
    <td ><%=cm[i].getCantCPE()%></td>
    <td ><%=cm[i].getIdProducto()%></td>
    <td ><%=cm[i].getIdProductoPadre()%></td>
    <td ><%=cm[i].getEstado()%> <a href="?deletebloq=<%=i%>">x</a></td>
  </tr>
	        
	 <%
	 	Mta mta = cm[i].getMta();
	 		if (mta != null) {
	 	    	Linea[] lineas = cm[i].getMta().getEndPoint();
	 %>
  <tr >
    <th scope="row" class="specalt" rowspan="22" ><strong>MTA</strong></th>
    <th scope="col" colspan="2" rowspan="1" >MAC MTA</th>
    <th scope="col" >Modelo</th>
    <th scope="col" colspan="2" >MtaProfile</th>
    <th scope="col">IdProducto</th>
    <th scope="col">IdProdPadre</th>
    <th scope="col">Estado</th>
  </tr>

  
  <%	String selectIconMta = "";
  		if(mta.getMacaddress()==null || mta.getMacaddress().equals(""))
  			selectIconMta = "add.gif";
  		else selectIconMta = "delete.gif";
  %>
  <tr >
    <td colspan="2"><%=mta.getMacaddress()%>
      <%
    	if(habilitar)
    		if(selectIconMta.equals("add.gif")){
    	%>
    		<div align="right">
            	<a onClick="ShowFormMTA('<%=i%>')" href="#">
                	<img src="../images/<%=selectIconMta%>" >                
                </a>            
            </div>
    			<div id="formularioMTA<%=i%>"  style="display:none">
    			<form method="post" action="" onSubmit="return confirmaActivar()">
    			<input name="objMacMTA" type="hidden" value=<%=i%> />
    				<table cellspacing="0"	>
    					<tr>
    					  <th scope="col"><input name="txtMacMTA" type="text" id="txtMacMTA" size="12" maxlength="12" /></th>
   					    </tr>
    					<tr>
    					  <th scope="row" class="spec"><select name="cmbModel" id="cmbModel">
					          <option value="3080">TM402G</option>
					          <option value="TM502G">TM502G</option>
					          <option value="TM602G">TM602G</option>
					          <option value="SBV5120">SBV5120</option>
					          <option value="U10C022">AMBIT22</option>
					          <option value="U10C034">AMBIT34</option>
					        </select>   </th>
   					    </tr>
    					<tr>
    					<th scope="row" class="spec"><input type="submit" name="btnActivaMTA" value="Activar"/></th>
    					</tr>
    				</table>
    			</form>
    			</div>  
    	<%}else if(selectIconMta.equals("delete.gif")){%>
    		<div align="right">
            	<a href="?deletemacmta=<%=i%>" onClick="return confirmaDesactivar()"><img src="../images/<%=selectIconMta%>" ></a>
            </div>
    	<%}%>    </td>
    <td ><%=mta.getMtaModel()%></td>
    <td colspan="2" align="center" ><%=mta.getMtaProfile()%></td>
    <td ><%=mta.getIdProducto()%></td>
    <td ><%=mta.getIdProductoPadre()%></td>
    <td ><%=mta.getEstado()%></td>
  </tr>
        
	        <%
        	        	for (int j = 0; j < lineas.length; j++) {
        	        					CallFeature call[] = lineas[j].getCFeatures();
        	        %>	
 
  <tr>
    <th scope="row" class="specalt" rowspan="<%=(3 + lineas[j].getCallFeatureValidos())%>"><strong>Linea</strong></td>
    <th scope="col"><strong>EndPoint</strong></th>
    <th scope="col"><strong>Numero</strong></th>
    <th scope="col" colspan="2"><strong>HomeExchange</strong></th>
    <th scope="col"><strong>IdProducto</strong></th>
    <th scope="col"><strong>IdProdPadre</strong></th>
    <th scope="col"><strong>Estado</strong></th>
  </tr>
  
  <tr>
    <td align="center"><%=lineas[j].getEndPointNumber()%></td>
    <td ><%=lineas[j].getTN()%></td>
    <td colspan="2" align="center" ><%=lineas[j].getEpHomeExchange()%></td>
    <td ><%=lineas[j].getIdProducto()%></td>
    <td ><%=lineas[j].getIdProductoPadre()%></td>
    <td ><%=lineas[j].getEstado()%></td>
  </tr>

	
  <tr>
    <th scope="row" class="specalt" rowspan="<%=(1 + lineas[j].getCallFeatureValidos())%>">Features</th>
    <th scope="col">ID</th>
    <th scope="col"colspan="2">Feature</th>
    <th scope="col">IdProducto</th>
    <th scope="col">IdProdPadre</th>
    <th scope="col">Estado</th>
  </tr>
 
  
	        <%
	        	for (int k = 0; k < call.length; k++) {
	        		if (!call[k].getIdProducto().equals("-1") && !call[k].getIdProductoPadre().equals("-1")) {
	        %>
   
  
   <tr>
    <td ><%= call[k].getNombre()+" "+call[k].getCustom1()+" "+call[k].getCustom2()%> </td>
    <td colspan="2"><%= call[k].getCfName()%></td>
    <td ><%= call[k].getIdProducto()%></td>
    <td ><%= call[k].getIdProductoPadre()%></td>
    <td >Activo</td>
  </tr>
	        <%
	        	}
	        	}
	        	}
	        }
	        %>
</table>
	<ul >
		<li id="search">
	      <div align="right">
		<form method="post" action="" onSubmit="return confirma()">
         <input name="btnEliminarCM" type="submit" id="btnEliminarCM" value="Eliminar" >
       <input name="objeto" type="hidden" value="<%=i%>"/>
       </form>
       		</div>
		</li>
    </ul>
       
 <br/>
 <br/>
 <%
 }
 %>
                        
                      </p>
                        
                        
					</div>
					
				</div>
				
	
	
 <%if(email != null && email.length>0){ %>

	<div class="post">
					<h3 class="title"><a href="#">Cuentas de Correo</a></h3>
					<div class="entry">
						<p>
                        
                        
      <table align="center" cellspacing="0" id="mytable" summary="Ids">
<caption>Tabla 2: Detalles de las Cuentas de Correo </caption>

  <tr>
  <th scope="col" abbr="Cuenta">Cuenta</th>
  <th scope="col" abbr="Password">Password</th>
  <th scope="col" abbr="IdProducto">IdProducto</th>
  <th scope="col" abbr="IdProdPadre">IdProdPadre</th>
  <th scope="col" abbr="Estado">Estado</th>
  <th scope="col" abbr="Accion"></th>
</tr>
 <% for(int i = 0; i<email.length; i++){ %>
 
<tr>
  <th scope="row" class="spec"><%=email[i].getUserName()+"@"+email[i].getDominio()%></th>
  <td><%=email[i].getPassword()%></td>
  <td><%=email[i].getIdProducto()%></td>
  <td><%=email[i].getIdProductoPadre()%></th>
  <td><%=email[i].getEstado()%></th>
  <td>
  
  <ul >
		<li id="search">
	      <div align="right">
		<form method="post" action="" onSubmit="return confirmaMail()">
         <input name="btnEliminarEMail" type="submit" id="btnEliminarEMail" value="Eliminar" >
       <input name="objeto2" type="hidden" value="<%=i%>"/>
       </form>
       		</div>
		</li>
    </ul>
  </th>
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
