package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;

public class ControladorCrearCalificaciones {

	private BOAsignatura boAsig;
	private BOCurso boCurso;
	private BOEvaluacion boEvaluacion;
	
	public ControladorCrearCalificaciones() {
		boAsig = new BOAsignatura();
		boEvaluacion = new BOEvaluacion();
		boCurso = new BOCurso();
	}
	
	/**
	 * Permite buscar una asignatura
	 * @param cod Codigo de la asignatura que se desea buscar
	 * @return La asignatura si la encuentra, de lo contrario null
	 * @throws Exception En caso de que falle la operacion
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
	 * Permite crear una evaluacion
	 * @param e Evalucion que se desea crear
	 * @throws Exception En caso de que falle la operacion
	 */
	public void agregarEvaluacion (Evaluacion e, double sum, double por) throws Exception{
		boEvaluacion.agregarEvaluacion(e, sum, por);
	}
	
	/**
	 * Permite eliminar una evaluacion
	 * @param e Evaluacion que se desea eliminar
	 * @throws Exception En caso de que falle la operacion
	 */
	public void eliminarEvaluacion (Evaluacion e) throws Exception{
		boEvaluacion.eliminarEvaluacion(e);
	}
	
	/**
	 * Obtiene la sumatoria del porcentaje de las evaluaciones de una asignatura en un curso
	 * @param c Curso en el que se encuentra la asignatura
	 * @param a la asignatura
	 * @return la sumatoria del porcentaje
	 * @throws Exception En caso de que falle la operacion
	 */
	public double sumatoriaPorcentaje (Curso c, Asignatura a) throws Exception{
		return boEvaluacion.sumatoriaPorcentaje(c, a);
	}
	
	/**
	 * Obtiene la lista de evaluaciones realizadas en una asignatura de un determinado curso
	 * @param c Curso en el cual esta la asignatura
	 * @param a la asignatura
	 * @return la lista de evaluaciones
	 * @throws Exception Si falla la operacion
	 */
	public List<Evaluacion> listaEvaluaciones (Curso c, Asignatura a) throws Exception{
		return boEvaluacion.listaEvaluaciones(c, a);
	}

}
