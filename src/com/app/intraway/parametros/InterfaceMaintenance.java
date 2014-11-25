package com.app.intraway.parametros;

public class InterfaceMaintenance  implements IXMLEncoding{
	
	private String idEntradaCaller;
	private String idEmpresaCRM;
	private String idServicio;
	private String idVenta;
	private String idProducto;
	private String idPromotor;
	private String xmlEncoding;
	
	public InterfaceMaintenance(String idEntradaCaller, String idEmpresaCRM,
			String idServicio, String idVenta, String idProducto,
			String idPromotor, int option) {
		super();
		
		this.idEntradaCaller = idEntradaCaller;
		this.idEmpresaCRM = idEmpresaCRM;
		this.idServicio = idServicio;
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.idPromotor = idPromotor;
		this.setXmlEncoding(option);		
	}
	public InterfaceMaintenance(int option) {
		super();
		this.setXmlEncoding(option);		
	}
	
	public String getXMLEncoding() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("<idEntradaCaller>");
		str.append(this.getIdEntradaCaller() );
		str.append("</idEntradaCaller>");
		str.append("<idEmpresaCRM>");
		str.append(this.getIdEmpresaCRM());
		str.append("</idEmpresaCRM>");
		str.append("<idServicio>");
		str.append(this.getIdServicio());
		str.append("</idServicio>");
		str.append("<idVenta>");
		str.append(this.getIdVenta());
		str.append("</idVenta>");
		str.append("<idProducto>");
		str.append(this.getIdProducto());
		str.append("</idProducto>");
		str.append("<idPromotor>");
		str.append(this.getIdPromotor());
		str.append("</idPromotor>");
		System.out.println(str.toString());
		StringBuilder str2 = new StringBuilder();
		str2.append(this.getXmlEncodingParam());
		return str2.toString();
	}
	
	public String getIdEntradaCaller() {
		return idEntradaCaller;
	}
	public void setIdEntradaCaller(String idEntradaCaller) {
		this.idEntradaCaller = idEntradaCaller;
	}

	public String getIdEmpresaCRM() {
		return idEmpresaCRM;
	}

	public void setIdEmpresaCRM(String idEmpresaCRM) {
		this.idEmpresaCRM = idEmpresaCRM;
	}

	public String getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getIdPromotor() {
		return idPromotor;
	}

	public void setIdPromotor(String idPromotor) {
		this.idPromotor = idPromotor;
	}

	public String getXmlEncodingParam() {
		return xmlEncoding;
	}

	public void setXmlEncodingParam(String xmlEncoding) {
		this.xmlEncoding = xmlEncoding;
	}
	
	public void setXmlEncoding(int option) {
		switch (option) {
			case 1: setXmlEncodingParam("<maintenance><command><name>ENABLE_MOBILITY</name></command></maintenance>"); break;
			default: setXmlEncodingParam("");break;
		}
	}

}
