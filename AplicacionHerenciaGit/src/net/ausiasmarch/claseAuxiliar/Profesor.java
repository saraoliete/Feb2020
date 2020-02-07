package net.ausiasmarch.claseAuxiliar;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
	
	private double anyosTrabajados;
	private String departamento;
	
	private List<String> cursosImpartidos = new ArrayList<String>();
	
	public Profesor(double anyosTrabajados, String departamento, List<String> cursosImpartidos, 
			String dni, String apellidos, String nombres,
			String sexo, int edad, double peso) {
		super(dni, apellidos, nombres, sexo, edad, peso);
		
		this.anyosTrabajados=anyosTrabajados;
		this.departamento=departamento;
		
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the anyosTrabajados
	 */
	public double getAnyosTrabajados() {
		return anyosTrabajados;
	}

	/**
	 * @param anyosTrabajados the anyosTrabajados to set
	 */
	public void setAnyosTrabajados(double anyosTrabajados) {
		this.anyosTrabajados = anyosTrabajados;
	}

	/**
	 * @return the cursosImpartidos
	 */
	public List<String> getCursosImpartidos() {
		return cursosImpartidos;
	}

	/**
	 * @param cursosImpartidos the cursosImpartidos to set
	 */
	public void setCursosImpartidos(List<String> cursosImpartidos) {
		this.cursosImpartidos = cursosImpartidos;
	}
	
	
	
	

}
