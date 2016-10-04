package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BONota;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class ControladorVentanaVerCalificaciones {
	
	private BOAsignatura boAsig;
	private BOCurso boCurso;
	private BORegistroCurso boRegisCurso;
	private BONota boNota;
	
	public ControladorVentanaVerCalificaciones() {
		// TODO Auto-generated constructor stub
		boAsig = new BOAsignatura();
		boCurso = new BOCurso();
		boRegisCurso = new BORegistroCurso();
		boNota = new BONota();
	}
	
	/**
	 * Permite buscar una asignatura
	 * @param cod Codigo de la asignatura que se desea buscar
	 * @return la asignatura si la encuentra, de lo contrario null
	 * @throws Exception Si falla la operacion
	 */
	public Asignatura buscarAsignatura (String cod) throws Exception{
		return boAsig.buscarAsignatura(cod);
	}
	
	/**
	 * Obtiene la lista de cursos de una asignatura
	 * @param a Asignatura a la cual se le buscaran los cursos
	 * @return la lista de cursos
	 * @throws Exception en caso de que falle la operacion
	 */
	public List<Curso> cursosAsignatura (Asignatura a) throws Exception{
		return boCurso.listarCursoAsignatura(a);
	}
	
	/**
	 * Obtiene la lista de estudiantes de un curso
	 * @param c Curso en el que se buscara
	 * @return la lista de estudiantes
	 * @throws Exception si falla la operacion
	 */
	public List<Estudiante> estudiantesCurso (Curso c) throws Exception{
		return boRegisCurso.buscarEstudiantesCurso(c);
	}
	
	/**
	 * Obtiene las notas de un estudiante
	 * @param e el estudiante
	 * @return las notas 
	 * @throws Exception si falla la operacion
	 */
	public List<Nota> notasEstudiante (Estudiante e) throws Exception{
		return boNota.notasEstudiante(e);
	}
	
	/**
	 * Calcula la nota definitiva de un estudiante
	 * 
	 * @param notas
	 *            Notas del estudiante
	 * @return la calificacion del estudiante
	 */
	public double calificacionEstudiante (List<Nota> notas){
		return boNota.calcularDefinitiva(notas);
		}

}
