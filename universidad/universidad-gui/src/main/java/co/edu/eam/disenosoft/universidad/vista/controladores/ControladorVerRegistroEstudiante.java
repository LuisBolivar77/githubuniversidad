package co.edu.eam.disenosoft.universidad.vista.controladores;

import java.util.List;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOEstudiante;
import co.edu.eam.ingesoft.desarrollo.logica.bo.BORegistroCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;

public class ControladorVerRegistroEstudiante {

	private BOEstudiante boEstu;
	private BORegistroCurso boRegisCurso;

	public ControladorVerRegistroEstudiante() {
		boEstu = new BOEstudiante();
		boRegisCurso = new BORegistroCurso();
	}

	/**
	 * Busca un estudiante
	 * 
	 * @param ced Cedula del estudiante que se desea buscar
	 * @return El estudinte si lo encuntra, de lo contrario null
	 * @throws Exception En caso de que falle la operacion
	 */
	public Estudiante buscarEstudiante(String ced) throws Exception {
		return boEstu.buscarEstudiante(ced);
	}

	/**
	 * 
	 * @param e
	 * @param nomAsign
	 * @throws Exception
	 */
	public void eliminarRegistroCurso(Estudiante e, String nomAsign) throws Exception {
		boRegisCurso.eliminarRegistroCurso(e, nomAsign);
	}

	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public int creditosRegistrados(Estudiante e) throws Exception {
		return boRegisCurso.creditosEstudiante(e);
	}
	
	/**
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public List<RegistroCurso> registrosEstudiante (Estudiante e) throws Exception{
		return boRegisCurso.registrosEstudiantes(e);
	}
	
}
