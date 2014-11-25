<%@page session="true"%>
<% 
	session.invalidate();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="../css/styleLogin.css" />
</head>

<body>

<br/>
<br/>
<fieldset id="login">
                    	<h4>Ingreso de Usuarios</h4>
               			<form method="post" action="intraway.jsp">
                        	<p class="clearfix"><label for="username">Usuario</label>
                            <input name="username" id="username" type="text" value="" /></p>
                            <p class="clearfix"><label for="password">Clave</label>
							<input name="password" id="password" type="password" value="" />
                            </p>
                            <p class="clearfix check">
                              
                        <input name="submit" id="submit" type="submit" value="" /></p>
                        <h3><label for="remember" id="remlabel">-<%
  if(request.getParameter("error")!=null){
  	out.println(request.getParameter("error"));
  }
  %></label></h3>
                    	</form>
</fieldset>

</body>
</html>
