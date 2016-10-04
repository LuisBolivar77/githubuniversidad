package co.edu.eam.disenosoft.universidad.vista.controladores;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOProfesor;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class ControladorAdministrarCurso {

	private BOSesionCurso boSesCurso;
	private BOProfesor boProf;
	private BOAsignatura boAsig;
	private BOCurso boCur;
	
	public ControladorAdministrarCurso(){
		boSesCurso = new BOSesionCurso();
		boProf = new BOProfesor();
		boAsig = new BOAsignatura();
		boCur = new BOCurso();
	}
	
	/**
	 * Busca un docente 
	 * @param ced cedula del docente que se desea buscar
	 * @return el docente si  lo encuentra, de lo contrario null
	 * @throws Exception si falla la operacion
	 */
	public Profesor buscarDocente(String ced) throws Exception{
		return boProf.buscarProfesor(ced);
	}
	
	/**
	 * Busca una asignatura
	 * @param cod Codigo de la asigantura que se desea buscar
	 * @return la asignatura si la encuentra, de lo contrario null
	 * @throws Exception Si no se pudo realizar la operacion
	 */
	public Asignatura buscarAsignatura(String cod) throws Exception{
		return boAsig.buscarAsignatura(cod);
	}
	
	/**
	 * Crea una sesion de un curso
	 * @param s Sesion que se desea crear
	 * @throws Excepti
	 * on en caso de que no se pueda crear la sesion del curso
	 */
	public void crearSesionCurso (SesionCurso s) throws Exception{
		boSesCurso.crearSesionCurso(s);
	}
	
	/**
	 * Permite eliminar una sesion de un curso
	 * @param s Sesion del curso que se desea eliminar
	 * @throws Exception si falla la operacion
	 */
	public void eliminarSesCurso (Curso s) throws Exception{
		//boSesionCurso.eliminarSesion(s);
		boCur.editarCurso(s);
	}
	
	/**
	 * Permite editar un curso
	 * @param c Curso que se desea editar
	 * @throws Exception si falla la operacion
	 */
	public void editarCurso (Curso c) throws Exception{
		boCur.editarCurso(c);
	}
	
	/**
	 * Crea un curso
	 * @param c Curso que se desea crear
	 * @throws Exception si falla la operacion
	 */
	public void crearCurso (Curso c) throws Exception{
		boCur.crearCurso(c);
	}
	
	/**
	 * Busca un curso
	 * @param cod Codigo del curso que se desea buscar
	 * @return El curso si lo encuentra, de lo contrario null
	 * @throws Exception Si falla la operaci�n
	 */
	public Curso buscarCurso (String cod) throws Exception{
		return boCur.buscarCurso(cod);
	}
	
}
