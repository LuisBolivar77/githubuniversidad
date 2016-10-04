package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;

/**
 * 
 * @author LuchoBolivar
 * Encargada de definir las operaciones de asigantura
 */
public interface IDAOAsignatura {
	
	/**
	 * Permite crear una nueva asigantura
	 * @param a Asignatura que se desea crear
	 * @throws Exception en caso de que falle la conexi�n
	 */
	public void crear(Asignatura a) throws Exception;

	/**
	 * Permite editar una de las asignaturas creadas
	 * @param a Asignatura que se desea editar
	 * @throws Exception en caso de que falle la conexi�n
	 */
	public void editar(Asignatura a) throws Exception;

	/**
	 * Permite buscar una de las asignaturas registradas
	 * @param cod c�digo de la asignatura que se desea buscar
	 * @return la asignatura si la encuentra, de lo contrario null
	 * @throws Exception en caso de que falle la conexi�n
	 */
	public Asignatura buscar(String cod) throws Exception;
	
	/**
	 * Permite eliminar una asignatura
	 * @param cod C�digo de la asignatura que se desea eliminar
	 * @throws Exception Si falla la operaci�n
	 */
	public void eliminar (String cod) throws Exception;

}
