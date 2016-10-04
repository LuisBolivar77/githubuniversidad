package co.edu.eam.disenosoft.universidad.modelo;

import java.util.List;

/**
 * Clase que presenta un Docente.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
public class Docente extends Persona {

	/**
	 * Profesion del docente.
	 */
	private Profesion profesion;

	/**
	 * indica si el docente tiene postgrado.
	 */
	private boolean postgrado;
	
	/**
	 * Cursos que imparte el docente.
	 */
	private List<Curso> cursos;

	/**
	 * Constructo.
	 */
	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor.
	 * 
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 */
	public Docente(String nombre, String apellido, String cedula,
			String correo, String direccion, String telefono,
			Profesion profesion, boolean postgrado) {
		super(nombre, apellido, cedula, correo, direccion, telefono);
		this.postgrado = postgrado;
		this.profesion = profesion;
	}

	/**
	 * @return the profesion
	 */
	public Profesion getProfesion() {
		return profesion;
	}

	/**
	 * @param profesion
	 *            the profesion to set
	 */
	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	/**
	 * @return the postgrado
	 */
	public boolean isPostgrado() {
		return postgrado;
	}

	/**
	 * @param postgrado
	 *            the postgrado to set
	 */
	public void setPostgrado(boolean postgrado) {
		this.postgrado = postgrado;
	}

	/**
	 * @return the cursos
	 */
	public List<Curso> getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
