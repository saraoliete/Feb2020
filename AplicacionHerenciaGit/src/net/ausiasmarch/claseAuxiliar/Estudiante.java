package net.ausiasmarch.claseAuxiliar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Estudiante extends Persona {
	
	private String cendtroEducativo;
	
	private Map<String, Float> asignaturas = new HashMap<>();
	
	public Estudiante(String centroEducativo, Map<String, Float> asignaturas, 
			String dni, String apellidos, String nombres,
			String sexo, int edad, double peso) {
		super(dni, apellidos, nombres, sexo, edad, peso);
		
		this.cendtroEducativo=centroEducativo;
		
	}
	
	
	public Float getNotaMedia() {
		
		float contador=0;
		
		Iterator<String>
		it=asignaturas.keySet().iterator();
		
		while(it.hasNext()) {
		String clave=it.next();
		Float valor=asignaturas.get(clave);
		
		contador+=valor;
		}
		
		return contador/asignaturas.size();
		
	}

	/**
	 * @return the cendtroEducativo
	 */
	public String getCendtroEducativo() {
		return cendtroEducativo;
	}

	/**
	 * @param cendtroEducativo the cendtroEducativo to set
	 */
	public void setCendtroEducativo(String cendtroEducativo) {
		this.cendtroEducativo = cendtroEducativo;
	}

	/**
	 * @return the asignaturas
	 */
	public Map<String, Float> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(Map<String, Float> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	

}
