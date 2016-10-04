package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.DiaEnum;

/**
 * Clase que representa una sesion de un curso.
 * @author Camilo Andres Ferrer Bustos.
 *
 */
public class SesionCurso implements Serializable{

	/**
	 * Curso de la sesion.
	 */
	private Curso curso;

	/**
	 * Dia de la sesion.
	 */
	private DiaEnum dia;

	/**
	 * Hora en que empieza una sesion.
	 */
	private int horaInicio;

	/**
	 * Hora en que termina la sesion.
	 */
	private int horaFinal;

	/**
	 * Cosntructor.
	 */
	public SesionCurso() {
		super();
	}
	
	/**
	 * Constructor.
	 * @param curso
	 * @param dia
	 * @param horaInicio
	 * @param horaFinal
	 */
	public SesionCurso(Curso curso, DiaEnum dia, int horaInicio, int horaFinal) {
		super();
		this.curso = curso;
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
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
	 * @return the dia
	 */
	public DiaEnum getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(DiaEnum dia) {
		this.dia = dia;
	}

	/**
	 * @return the horaInicio
	 */
	public int getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFinal
	 */
	public int getHoraFinal() {
		return horaFinal;
	}

	/**
	 * @param horaFinal the horaFinal to set
	 */
	public void setHoraFinal(int horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	

}
