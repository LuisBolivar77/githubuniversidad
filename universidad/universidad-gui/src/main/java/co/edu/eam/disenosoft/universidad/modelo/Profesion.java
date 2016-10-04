package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

/**
 * Clase que representa una profesion docente.
 * @author Camilo Andres FErrer Butsos.
 *
 */
public class Profesion implements Serializable{
	
	/**
	 * codigo de la profesion.
	 */
	private String codigo;
	/**
	 * Nombre de la profesion.
	 */
	private String nombre;
	
	/**
	 * COnstructor.
	 */
	public Profesion() {
		super();
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Profesion(String codigo, String nombre) {
		super();
		this.codigo = codigo;
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
	
	
	
	
	
}
