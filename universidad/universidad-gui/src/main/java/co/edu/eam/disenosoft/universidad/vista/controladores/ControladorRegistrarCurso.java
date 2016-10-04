package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorRegistrarCurso {
	
	private BOAsignatura boAsi;
	private BOCurso boCurso;
	private BOEstudiante boEstudiante;
	private BORegistroCurso boRegisCurso;
	
	public ControladorRegistrarCurso() {
		// TODO Auto-generated constructor stub
		boAsi = new BOAsignatura();
		boCurso = new BOCurso();
		boEstudiante = new BOEstudiante();
		boRegisCurso = new BORegistroCurso();
	}

	/**
	 * permite buscar un estudiante
	 * @param ced codula del estudiante que se desea buscar
	 * @return el estudiante o null
	 * @throws Exception 
	 */
	public Estudiante buscarEstudiante (String ced) throws Exception{
		return boEstudiante.buscarEstudiante(ced);
	}
	
	/**
	 * Permite crear un registro de un curso
	 * @param c RegsitroCurso que se desea crear
	 * @throws Exception si falla la operacion
	 */
	public void crearRegistroCurso (RegistroCurso c) throws Exception{
		boRegisCurso.crearRegistroCurso(c);
	}
	
	/**
	 * permite buscar una asignatura
	 * @param cod codigo de la asignatura que se desea buscar
	 * @return la asignatura o null
	 * @throws Exception si falla la operacion
	 */
	public Asignatura buscarAsignatura (String cod) throws Exception{
		return boAsi.buscarAsignatura(cod);
	}
	
	/**
	 * Permite obtener la lista de cursos de una asignatura
	 * @param as asignatura a la cual se desea obtener los cursos
	 * @return la lista de cursos para esa asignatura
	 * @throws Exception si falla la operacion
	 */
	public List<Curso> cursosAsignatura (Asignatura as) throws Exception{
		return boCurso.listarCursoAsignatura(as);
	}
	
	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public int creditosRegistradosEstudiante (Estudiante e) throws Exception{
		return boRegisCurso.creditosEstudiante(e);
	}
	
}
