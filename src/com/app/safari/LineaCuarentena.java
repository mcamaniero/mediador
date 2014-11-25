package com.app.safari;

public class LineaCuarentena {

	private int IdEmpresa;
	private String Linea;
	
	public LineaCuarentena() {
	}

	public LineaCuarentena(int idEmpresa, String linea) {
		this.setIdEmpresa(idEmpresa);
		this.setLinea(linea);
	}

	public int getIdEmpresa() {
		return IdEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		IdEmpresa = idEmpresa;
	}

	public String getLinea() {
		return Linea;
	}

	public void setLinea(String linea) {
		Linea = linea;
	}

	
}
