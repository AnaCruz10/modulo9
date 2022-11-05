package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Marca implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idMarca;
	private String nombre;
	private int idCategoria;
	private String descripcion;
	private Date fechaRegistro; 
	private int status;
	
	private Marcas marcas;
	
	public Marca() {
		// TODO Auto-generated constructor stub
		marcas = new Marcas();
		this.fechaRegistro = new Date();
	}

		
	public int getIdMarca() {
		return idMarca;
	}



	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Date getFechaRegistro() {
		return fechaRegistro;
	}



	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public Marcas getMarcas() {
		return marcas;
	}



	public void setMarcas(Marcas marcas) {
		this.marcas = marcas;
	}



	public void agregar(AjaxBehaviorEvent event)
            throws AbortProcessingException  {
		marcas.agregar(this);
		
	}


	
}
