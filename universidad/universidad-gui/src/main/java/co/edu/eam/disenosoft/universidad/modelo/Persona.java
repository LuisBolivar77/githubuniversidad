package co.edu.eam.disenosoft.universidad.modelo;

import java.io.Serializable;

/**
 * Clase que representa una Persona.
 * 
 * @author Camilo Andres Ferrer Bustos.
 * 
 */
public class Persona implements Serializable {

	/**
	 * Nombre de la persona.
	 */
	protected String nombre;
	/**
	 * Apellido de la persona
	 */
	protected String apellido;
	/**
	 * Cedula de la persona.
	 */
	protected String cedula;
	/**
	 * Correo de la persona.
	 */
	protected String correo;
	/**
	 * Direccion de la persona
	 */
	protected String direccion;
	/**
	 * Telefono de la persona.
	 */
	protected String telefono;

	/**
	 * COsntructor.
	 */
	public Persona() {
		super();
	}

	/**
	 * Constructor de la persona.
	 * @param nombre
	 * @param apellido
	 * @param cedula
	 * @param correo
	 * @param direccion
	 * @param telefono
	 */
	public Persona(String nombre, String apellido, String cedula,
			String correo, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	

}
