package co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.dao.definiciones.IDAOEvaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.utilidades.AdministradorEntityManager;

/**
 * Calse responsable de implementar los metodos de la entidad Evaluaci�n
 * 
 * @author LuchoBolivar
 *
 */
public class DAOEvaluacionJPA implements IDAOEvaluacion {

	/**
	 * agrega una evaluaci�n
	 */
	public void agregarEvaluacion(Evaluacion e) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
	}

	/**
	 * Elimina una evaluaci�n
	 */
	public void eliminarEvaluacion(Evaluacion e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(e));
		em.getTransaction().commit();

	}

	/**
	 * Obtiene el porcentaje de evaluaciones de una asignatura
	 */
	public double sumatoriaProcentaje(Curso c, Asignatura a) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Evaluacion.PORCENTAJES_EVALUACION);
		q.setParameter(1, c);
		q.setParameter(2, a);
		List<Double> lista = q.getResultList();
		if (lista.get(0) == null) {
			return 0;
		} else {
			double porcentaje = lista.get(0);
			return porcentaje;
		}
	}
	
	/**
	 * Obtiene la lista de evaluaciones realizadas en una asignatura de un curso
	 */
	public List<Evaluacion> evaluacionesCurso (Curso c, Asignatura a) throws Exception{
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Evaluacion.EVALUACIONES_CURSO);
		q.setParameter(1, c);
		q.setParameter(2, a);
		List<Evaluacion> lista = q.getResultList();
		return lista;
	}

}
