package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que representa a un curso.
 * 
 * @author Cmilo Andres Ferrer Bustso.
 * 
 */
public class Curso implements Serializable {

	/**
	 * Codigo del curso. el codigo se forma con el codigo de la
	 * asignatura+a�o+semestre del a�o (I o II)
	 */
	private String codigo;

	/**
	 * Docente que imparte la asignatura.
	 */
	private Docente docente;

	/**
	 * Asignatura de este curso.
	 */
	private Asignatura asignatura;

	/**
	 * Sesiones del curso. las sesiones son los dias en que los estudiantes y el
	 * profesor se encuentran para la clase.
	 */
	private List<SesionCurso> sesiones;
	
	/**
	 * Estudiantes registrados en este curso.
	 */
	private List<RegistroCurso> estudiantes;
	
	/**
	 * Evaluaciones del curso.
	 */
	private List<Evaluacion> evaluaciones;
	
	/**
	 * Constructor.
	 */
	public Curso() {
		super();
	}
	
	/**
	 * Constructor.
	 * 
	 * @param codigo
	 * @param docente
	 * @param asignatura
	 */
	public Curso(String codigo, Docente docente, Asignatura asignatura) {
		super();
		this.codigo = codigo;
		this.docente = docente;
		this.asignatura = asignatura;
	}

	

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the docente
	 */
	public Docente getDocente() {
		return docente;
	}

	/**
	 * @param docente
	 *            the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura
	 *            the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the sesiones
	 */
	public List<SesionCurso> getSesiones() {
		return sesiones;
	}

	/**
	 * @param sesiones the sesiones to set
	 */
	public void setSesiones(List<SesionCurso> sesiones) {
		this.sesiones = sesiones;
	}

	/**
	 * @return the estudiantes
	 */
	public List<RegistroCurso> getEstudiantes() {
		return estudiantes;
	}

	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(List<RegistroCurso> estudiantes) {
		this.estudiantes = estudiantes;
	}

	/**
	 * @return the evaluaciones
	 */
	public List<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	/**
	 * @param evaluaciones the evaluaciones to set
	 */
	public void setEvaluaciones(List<Evaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}

}
