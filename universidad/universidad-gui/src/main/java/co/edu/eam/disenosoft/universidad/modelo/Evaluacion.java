/**
 * 
 */
package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

/**
 * Clase que representa la evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
public class Evaluacion implements Serializable{

	/**
	 * Curso al que pertenece esta evaluacion.
	 */
	private Curso curso;

	/**
	 * Nombre de la evaluacion;
	 */
	private String nombre;

	/**
	 * Porcentaje que vale esta evaluacion dentro del curso.
	 */
	private double porcentaje;

	/**
	 * Constructor.
	 */
	public Evaluacion() {
		super();
	}
	
	

	/**
	 * Constructor de la clase.
	 * @param curso
	 * @param nombre
	 * @param porcentaje
	 */
	public Evaluacion(Curso curso, String nombre, double porcentaje) {
		super();
		this.curso = curso;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}



	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	

	
	
}
