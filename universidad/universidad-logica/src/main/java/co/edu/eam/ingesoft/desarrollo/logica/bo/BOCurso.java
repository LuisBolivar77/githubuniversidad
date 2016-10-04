package co.edu.eam.ingesoft.desarrollo.logica.bo;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.excepcion.ExcepcionNegocio;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOSesionCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOCursoJPA;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa.DAOSesionCursoJPA;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.SesionCurso;

public class BOCurso {

	private IDAOCurso daoCurso;
	private IDAOSesionCurso idaoSesiorCur;

	public BOCurso() {
		// TODO Auto-generated constructor stub
		daoCurso = new DAOCursoJPA();
		idaoSesiorCur = new DAOSesionCursoJPA();
	}

	/**
	 * Crea un curso
	 * 
	 * @param c
	 *            curso que se desea crear
	 * @throws Exception
	 *             Si falla la operaci�n
	 */
	public void crearCurso(Curso c) throws Exception {
		daoCurso.crear(c);
	}

	/**
	 * Busca un curso
	 * 
	 * @param cod
	 *            codigo del curso que se desea buscar
	 * @return el curso
	 * @throws Exception
	 *             en caso de que falle la operci�n
	 */
	public Curso buscarCurso(String cod) throws Exception {
		return daoCurso.buscar(cod);
	}

	public void editarCurso(Curso c) throws Exception {
		List<SesionCurso> sesiDoc = idaoSesiorCur.listarSesionesDocente(c.getProfesor());
		boolean cru = false;
		for (SesionCurso sesionCurso : sesiDoc) {
			for (SesionCurso sesiActu : c.getSesiones()) {
				if (sesionCurso.getDia().equals(sesiActu.getDia())
						&& sesionCurso.getHoraInicio() <= sesiActu.getHoraInicio()
						&& sesionCurso.getHoraFinal() > sesiActu.getHoraInicio()) {
					cru = true;
				}

			}
		}
		if (cru == true) {
			throw new ExcepcionNegocio(
					" el curso a asignar tienes sesiones con los mismos horarios de las sesiones actuales del docente");
		} else {
			daoCurso.editar(c);
		}
	}

	public List<Curso> listarCursoAsignatura(Asignatura as) throws Exception {
		return daoCurso.cursosAsignatura(as);
	}

	public List<Curso> cursosDocente(Profesor p) throws Exception {
		return daoCurso.cursosDocente(p);
	}

}
