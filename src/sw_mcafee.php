<?php


require_once('/opt/iway/commands/sendreq/nusoap.php');
$oSoapClient = new soapclient('http://192.168.0.114:8081/WsAprovisionamiento/services/WsdlMcAfee?wsdl', true);


$aParametros = array("IdEmpresa" => $argv[1],
                     "Sistema" => $argv[2],
                     "Interfaz" => $argv[3],
                     "IdEstado" => $argv[4],
                     "Cuenta" => $argv[5],
                     "IdProducto" => $argv[6],
                     "Correo" => $argv[7],
                     "PlanMcAfeeTvCable" => $argv[8],
					 "ClienteCRM" => $argv[9],
					 "IdProductoCRM" => $argv[10],
					 "IdMcAfee" => $argv[11],
					 "Referencia" => $argv[12]); 


$respuesta = $oSoapClient->call("AprovMcAfee",$aParametros); 

echo ';'.$respuesta['CodError'].';'.$respuesta['DetMensaje'];
//echo 'xxxxxxxx '.$respuesta;         
?> 