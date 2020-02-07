package net.ausiasmarch.claseAuxiliar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ProyectoListaPersonas {

	private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public static void main(String[] args) {
		
		int opcion;
		
		ProyectoListaPersonas proyectoPersonas = new ProyectoListaPersonas();
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("\nLISTA DE PERSONAS:");
			System.out.println("[1] Registrar persona");
			System.out.println("[2] Buscar persona por DNI");
			System.out.println("[3] Eliminar persona");
			System.out.println("[4] Mostrar persona");
			System.out.println("[5] Lee Personas de fichero");
			System.out.println("[6] Guarda Personas en fichero");
			System.out.println("[7] Salir\n");
			System.out.print("Ingrese opción (1-7): ");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				proyectoPersonas.registrarPersona();
				break;
			case 2:
				proyectoPersonas.buscarPersona();
				break;
			case 3:
				proyectoPersonas.eliminarPersona();
				break;
				
			case 4:
				proyectoPersonas.mostrarPersonas();
				break;
				
			case 5:
				 
				break;
				
			case 6:
				 
				break;
			}
			
		} while (opcion != 7);
		
	
	}
	

	public void registrarPersona() {
		
		String dni, apellidos, nombres, sexo;
		int edad, numeroPersonas;
		double peso;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantas personas va a introducir?");
		numeroPersonas = entrada.nextInt();
		for (int i=0; i<numeroPersonas; i++) {
			System.out.println("\nDatos Persona "+(i+1)+":");
			System.out.print("\tDNI: ");
			dni = entrada.next();
			System.out.print("\tApellidos: ");
			apellidos = entrada.next();
			System.out.print("\tNombres: ");
			nombres = entrada.next();
			System.out.print("\tSexo: ");
			sexo = entrada.next();
			System.out.print("\tEdad: ");
			edad = entrada.nextInt();
			System.out.print("\tPeso: ");
			peso = entrada.nextDouble();
			
			
			System.out.println("Soy: estudiante[0] / profesor[1] / ninguno[2]");
			int caso=entrada.nextInt();
			
			switch(caso) {
			
			case 0:
			
			System.out.println("Nombre del centro educativo:");
			String centro=entrada.next();
			
			System.out.println("Asignaturas a las que esta apuntado el alumno:");
			int asig=entrada.nextInt();
			
			Map<String, Float> asignaturas = new HashMap<>();
			for(int j=0; j<asig; j++) {
				
				System.out.println("Asignatura:");
				String as=entrada.next();
				
				System.out.println("Nota:");
				Float nota=entrada.nextFloat();
				
				
				asignaturas.put(as,  nota);	
			}
			
			
			listaPersonas.add(new Estudiante(centro, asignaturas, dni, apellidos, nombres, sexo, edad, peso));
			
			break;
			
			
			case 1:
				
				
			System.out.println("Años trabajando como profesor:");
			double anyos = entrada.nextInt();
				
			System.out.println("Departamento al que pertenece: ");
			String depart = entrada.next();
			
			System.out.println("Numero de asignaturas que imparte:");
			int asign=entrada.nextInt();			
			
			List<String>asigImpart = new ArrayList<String>();
			for(int k=0; k<asign; k++) {
				
				System.out.println("Asignatura que imparte: ");
				String asi=entrada.next();
				
				asigImpart.add(asi);				
				
			}
			
			
			listaPersonas.add(new Profesor(anyos, depart, asigImpart, dni, apellidos, nombres, sexo, edad, peso));
			
				break;
				
				
				
			case 2:
				
				listaPersonas.add(new Persona(dni, apellidos, nombres, sexo, edad, peso));
				
				break;
				
				
			}

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void buscarPersona() {
		String dni;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese DNI a buscar: ");
		dni = entrada.next();
		
		/************************************************/
		/* Buscar persona en ArrayList listaPersonas
		 * Si existe devuelve los datos de la persona
		 * Si no existe devuelve por consola el texto "La persona no se encuentra" */
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<listaPersonas.size();i++) {
			
			if(dni.equalsIgnoreCase(listaPersonas.get(i).getDni())){
				
				sb.append("Persona: " + listaPersonas.get(i).toString());	
			} 	
		}
				
			if(sb.length()!=0) {
				System.out.println(sb.toString());
			}
			else {
				System.out.println("La persona no se encuentra");				
			}
			
			
		
		
		
		/************************************************/
	}

	public void eliminarPersona() {
		String dni;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese DNI para eliminar: ");
		dni = entrada.next();
		/************************************************/
		/* Elimina a persona con DNI introducido del ArrayList listaPersonas
		 * Si existe devuelve por consola el texto "Persona eliminada" junto con los datos de la persona eliminada
		 * Si no existe devuelve el texto "La persona no se encuentra" */
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<listaPersonas.size(); i++) {
			
			if(dni.equalsIgnoreCase(listaPersonas.get(i).getDni())){
				
				sb.append("La persona " + listaPersonas.get(i).toString() + " ha sido eliminada.");
				
				listaPersonas.remove(i);
			}

		}
		
		if(sb.length()!=0){		
			
			
			System.out.println(sb.toString());
			
		}else {
			
			System.out.println("La persona no se encuentra");				
		}
		
		/************************************************/
	}

	public void mostrarPersonas() {
		/************************************************/
		/* Recorre las personas en el ArrayList listaPersonas y muestra por consola sus datos	 
		 * Si no existe devuelve por consola el texto "No existen personas registradas" */
		
		
		for(int i=0; i<listaPersonas.size(); i++) {
			
			
			if(listaPersonas.size()>0) {
				
				System.out.println("Datos de la persona: " + listaPersonas.get(i).toString());
				
			} else {
				
				System.out.println("No existen las personas registradas");
				
			}
			
		}
		
		/************************************************/
	}
	

	public ProyectoListaPersonas() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	
}
