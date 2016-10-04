package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BONota;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOProfesor;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorIngreCalificaciones {
	
	private BOCurso boCurso;
	private BOProfesor boProfesor;
	private BONota boNota;
	private BORegistroCurso boRegisCurso;
	
	public ControladorIngreCalificaciones() {
		// TODO Auto-generated constructor stub
		boCurso = new BOCurso();
		boProfesor = new BOProfesor();
		boNota = new BONota();
		boRegisCurso = new BORegistroCurso();
	}
	
	/**
	 * Permite buscar un docente
	 * @param ced Cedula del docente que se desea buscar
	 * @return El docente si lo encuentra, de lo contrario null
	 * @throws Exception Si falla la operacion
	 */
	public Profesor buscarDocente (String ced) throws Exception{
		return boProfesor.buscarProfesor(ced);
	}
	
	public List<Curso> cursosDocente (Profesor p) throws Exception{
		return boCurso.cursosDocente(p);
	}
	
	/**
	 * Obtiene la calificacion de una evaluacion de un estudiante
	 * @param e El estudiante
	 * @param a La Evaluacion
	 * @return La calificacion
	 * @throws Exception si falla la operacion
	 */
	public String calificacionEstudiante (Estudiante e, Evaluacion a) throws Exception{
		return boNota.calificacionEstudianteEvaluacion(e, a);
	}
	
	/**
	 * Busca los estudiantes de un curso 
	 * @param c Curso en el que se buscaron los estudiantes	
	 * @return lista de estudiantes del curso
	 * @throws Exception Si falla la operacion
	 */
	public List<Estudiante> estudiantes (Curso c) throws Exception{
		return boRegisCurso.buscarEstudiantesCurso(c);
	}
	
	/**
	 * Obttiene el RegistroCurso de un estudiante
	 * @param e el estudiante
	 * @param c curso que registro
	 * @return el registro del estudiante
	 * @throws Exception si falla la operacion
	 */
	public RegistroCurso registroEstudiante (Estudiante e, Curso c) throws Exception{
		return boRegisCurso.registroEstudianteCurso(e, c);
	}
	
	/**
	 * Agrega una nota
	 * @param n nota que se desea agregar
	 * @throws Exception si falla la operacion
	 */
	public void agregarNota (Nota n, String co) throws Exception{
		boNota.agregarNota(n, co);
	}

}
