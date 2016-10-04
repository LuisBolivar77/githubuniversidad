package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAONotas;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

public class DAONotasJPA implements IDAONotas {

	/**
	 * Obtiene una lista con las notas de un estudiante
	 */
	public List<Nota> notasEstudiante(Estudiante e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Nota.ESTUDIANTE_NOTA);
		q.setParameter(1, e);
		List<Nota> lista = q.getResultList();
		return lista;
	}

	/**
	 * Agrega una nota
	 * 
	 * @param n
	 *            nota que se desea agregar
	 * @throws Exception
	 *             si falla la operaci�n
	 */
	public void agregarCalificacion(Nota n) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(n);
		em.getTransaction().commit();
	}

	/**
	 * Edita la nota
	 * 
	 * @param n
	 *            la nota que se desea editar
	 * @throws Exception
	 *             si falla la operacion
	 */
	public void editarNota(Nota n) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(n);
		em.getTransaction().commit();
	}

	/**
	 * Obtiene la nota de una evaluaci�n de un estudiante
	 * 
	 * @param e
	 *            El estudiante
	 * @param a
	 *            La Evaluaci�n
	 * @return La calificacion
	 * @throws Exception
	 *             si falla la operaci�n
	 */
	public List<Nota> notasEstudianteEvaluacion(Estudiante e, Evaluacion eval) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Nota.NOTA_ESTUDIANTE);
		q.setParameter(1, e);
		q.setParameter(2, eval);
		List<Nota> lista = q.getResultList();
		return lista;
	}

	public Nota buscar(Nota n) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Nota.class, n.getCodigoNota());
	}

	/**
	 * Obtiene las notas de una evaluaci�n
	 * @param nombreEval Nombre de la evalucaci�n
	 * @return las notas
	 * @throws Exception si falla la operaci�n
	 */
	public List<Nota> notasEvaluacion(String nombreEval) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Nota.NOTAS_EN_EVALUACION);
		q.setParameter(1, nombreEval);
		List<Nota> notas = q.getResultList();
		return notas;
	}
}
