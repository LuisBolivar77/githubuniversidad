/**
 * 
 */
package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

import co.edu.eam.disenosoft.universidad.modelo.enumeraciones.TipoAsignaturaEnum;

/**
 * Clase que representa a una asignatura.
 * @author user
 *
 */
public class Asignatura implements Serializable{

	/**
	 * Nombre de la asignatura-
	 */
	private String nombre;
	/**
	 * Nombre de la asignatura
	 */
	private String codigo;
	
	/**
	 * Tipo de asignatura
	 */
	private TipoAsignaturaEnum tipo;
	
	/**
	 * Numoer de creditos asignatura.
	 */
	private int numeroCreditos;
	/**
	 * 
	 */
	public Asignatura() {
	
	}
	/**
	 * @param nombre
	 * @param codigo
	 * @param tipo
	 * @param numeroCreditos
	 */
	public Asignatura(String nombre, String codigo, TipoAsignaturaEnum tipo,
			int numeroCreditos) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the tipo
	 */
	public TipoAsignaturaEnum getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoAsignaturaEnum tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the numeroCreditos
	 */
	public int getNumeroCreditos() {
		return numeroCreditos;
	}
	/**
	 * @param numeroCreditos the numeroCreditos to set
	 */
	public void setNumeroCreditos(int numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}
	
	

}
