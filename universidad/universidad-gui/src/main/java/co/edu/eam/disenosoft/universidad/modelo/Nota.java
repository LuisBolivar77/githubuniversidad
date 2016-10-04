/**
 * 
 */
package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

/**
 * Clase que representa una calificacion de una evaluacion de un curso.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
public class Nota implements Serializable {

	/**
	 * Curso y estudiante al que pertenece esta nota.
	 */
	private RegistroCurso registroCurso;
	/**
	 * Evaluacion a la que pertenece esta nota.
	 */
	private Evaluacion evaluacion;

	/**
	 * Nota que puso el profesor.
	 */
	private double valor;

	/**
	 * bandera que indica si la nota ya fue modificada para no dejar que lo sea
	 * una vez mas.
	 */
	private boolean editada;
	
	

	/**
	 * Constructor
	 */
	public Nota() {
		super();
	}



	/**
	 * @param evaluacion
	 * @param valor
	 * @param editada
	 */
	public Nota(Evaluacion evaluacion, double valor, boolean editada) {
		super();
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = editada;
	}



	/**
	 * @param registroCurso
	 * @param evaluacion
	 * @param valor
	 * @param editada
	 */
	public Nota(RegistroCurso registroCurso, Evaluacion evaluacion,
			double valor, boolean editada) {
		super();
		this.registroCurso = registroCurso;
		this.evaluacion = evaluacion;
		this.valor = valor;
		this.editada = editada;
	}



	/**
	 * @return the evaluacion
	 */
	public Evaluacion getEvaluacion() {
		return evaluacion;
	}



	/**
	 * @param evaluacion the evaluacion to set
	 */
	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}



	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}



	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}



	/**
	 * @return the editada
	 */
	public boolean isEditada() {
		return editada;
	}



	/**
	 * @param editada the editada to set
	 */
	public void setEditada(boolean editada) {
		this.editada = editada;
	}



	/**
	 * @return the registroCurso
	 */
	public RegistroCurso getRegistroCurso() {
		return registroCurso;
	}



	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setRegistroCurso(RegistroCurso registroCurso) {
		this.registroCurso = registroCurso;
	}

}
