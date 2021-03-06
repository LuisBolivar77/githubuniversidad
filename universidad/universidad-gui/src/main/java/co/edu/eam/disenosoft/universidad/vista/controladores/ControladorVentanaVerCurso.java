package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.Date;
import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;

public class ControladorVentanaVerCurso {

	private BOCurso boCurso;
	private BOAsignatura boAsignatura;
	private BORegistroCurso boRegisCurso;
	private BOEstudiante boEstu;

	public ControladorVentanaVerCurso() {
		boCurso = new BOCurso();
		boAsignatura = new BOAsignatura();
		boRegisCurso = new BORegistroCurso();
		boEstu = new BOEstudiante();
	}

	/**
	 * Permite buscar una asignatura
	 * 
	 * @param cod Codigo de la asignatura que se desea buscar
	 * @return La asignatura si la encuentra, de lo contrario null
	 * @throws Exception en caso de que falle la operacion
	 */
	public Asignatura buscarAsignatura(String cod) throws Exception {
		return boAsignatura.buscarAsignatura(cod);
	}

	/**
	 * Obtiene la lista de cursos que tienen una asignatura
	 * 
	 * @param a Asignatura a la cual se le buscaran los cursos
	 * @return La lista de cursos
	 * @throws Exception Si falla la operacion
	 */
	public List<Curso> cursosAsignatura(Asignatura a) throws Exception {
		return boCurso.listarCursoAsignatura(a);
	}

	/**
	 * Busca los estudiantes de un curso
	 * 
	 * @param c Curso en el que se buscaron los estudiantes
	 * @return lista de estudiantes del curso
	 * @throws Exception
	 *             Si falla la operacion
	 */
	public List<Estudiante> estudiantesCurso(Curso c) throws Exception {
		return boRegisCurso.buscarEstudiantesCurso(c);
	}

	/**
	 * Calcula la edad de un estudiante
	 * 
	 * @param e el estudiante
	 * @return la edad del estudiante
	 */
	public int calcularEdad(Estudiante e) {
		return boEstu.calcularEdadEstudiante(e);
	}
	
	/**
	 * Permite buscar un estudiante
	 * @param ced Cedula del estudiante que se desea buscar
	 * @return el estudiante si lo encuentra, de lo contrario null
	 * @throws Exception En caso de que falle la operacion
	 */
	public Estudiante buscarEstudiante (String ced) throws Exception{
		return boEstu.buscarEstudiante(ced);
	}

}
