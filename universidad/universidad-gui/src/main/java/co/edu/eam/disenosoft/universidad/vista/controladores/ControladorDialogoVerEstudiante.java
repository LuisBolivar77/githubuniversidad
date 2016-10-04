package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BONota;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Nota;

public class ControladorDialogoVerEstudiante {

	private BORegistroCurso boRegisCurso;
	private BONota boNotas;
	
	public ControladorDialogoVerEstudiante() {
		boRegisCurso = new BORegistroCurso();
		boNotas = new BONota();
	}
	
	/**
	 * Obtiene los creditos de un estudiante
	 * @param e Estudiante al que se le obtendron los creditos
	 * @return los creditos del estudiante
	 * @throws Exception Si falla la operacion
	 */
	public int creditosEstudiante (Estudiante e) throws Exception{
		return boRegisCurso.creditosEstudiante(e);
	}
	
	/**
	 * Obtiene las notas de un estudiante
	 * @param e Estudiante al que se le buscaron las notas
	 * @return las notas del estudiante
	 * @throws Exception Si falla la operacion
	 */
	public List<Nota> notasEstudiante (Estudiante e) throws Exception{
		return boNotas.notasEstudiante(e);
	}
	
	/**
	 * Calcula la nota definitiva de un estudiante
	 * @param eval Evalaluaciones hechas al estudiante
	 * @param notas Notas del estudiante
	 * @return la calificacion del estudiante
	 */
	public double calcuDefinitva (List<Nota> notas){
		return boNotas.calcularDefinitiva(notas);
	}
	
}
