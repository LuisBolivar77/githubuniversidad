package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que reprenta un curso registrado por un estudiante.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
public class RegistroCurso implements Serializable {

	/**
	 * Estudiante que registro el curso.
	 */
	private Estudiante estudiante;

	/**
	 * Curso que registro el estudiante.
	 */
	private Curso curso;

	/**
	 * Notas que el estudiante tiene registradas en este curso.
	 */
	private List<Nota> notas;

	public RegistroCurso() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param estudiante
	 * @param curso
	 * @param notas
	 */
	public RegistroCurso(Estudiante estudiante, Curso curso, List<Nota> notas) {
		super();
		this.estudiante = estudiante;
		this.curso = curso;
		this.notas = notas;
	}

	/**
	 * @return the estudiante
	 */
	public Estudiante getEstudiante() {
		return estudiante;
	}

	/**
	 * @param estudiante
	 *            the estudiante to set
	 */
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * @param curso
	 *            the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	 * @return the notas
	 */
	public List<Nota> getNotas() {
		return notas;
	}

	/**
	 * @param notas
	 *            the notas to set
	 */
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
