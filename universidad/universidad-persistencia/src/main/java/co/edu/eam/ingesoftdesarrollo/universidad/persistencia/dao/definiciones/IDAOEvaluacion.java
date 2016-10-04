package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import java.util.List;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

/**
 * Clase responsable de definir los m�todos de la entidad evaluaci�n
 * @author LuchoBolivar
 *
 */
public interface IDAOEvaluacion {

	/**
	 * Permite agregar una evaluaci�n
	 * @param e Evaluaci�n que se desea agregar
	 * @throws Exception En caso de que falle la operaci�n
	 */
	public void agregarEvaluacion (Evaluacion e) throws Exception;
	
	/**
	 * Permite eliminar un evaluaci�n
	 * @param e Evaluaci�n que se desea eliminar
	 * @throws Exception En caso de que falle la operaci�n
	 */
	public void eliminarEvaluacion (Evaluacion e) throws Exception;
	
	/**
	 * Obtiene la sumatoria del porcentaje de las evaluaciones de una asignatura en un curso
	 * @param c Curso en el que se encuentra la asignatura
	 * @param a la asignatura
	 * @return la sumatoria del porcentaje
	 * @throws Exception En caso de que falle la operaci�n
	 */
	public double sumatoriaProcentaje (Curso c, Asignatura a) throws Exception;
	
	/**
	 * Obtiene la lista de evaluaciones realizadas en una asignatura de un determinado curso
	 * @param c Curso en el cual esta la asignatura
	 * @param a la asignatura
	 * @return la lista de evaluaciones
	 * @throws Exception Si falla la operaci�n
	 */
	public List<Evaluacion> evaluacionesCurso (Curso c, Asignatura a) throws Exception;
	
}
