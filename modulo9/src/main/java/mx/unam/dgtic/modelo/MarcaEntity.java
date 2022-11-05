package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
@SessionScoped
public class MarcaEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idMarca;
	private String nombre;
	private int idCategoria;
	private String descripcion;
	private Date fechaRegistro; 
	private int status;

	private List<MarcaEntity> marcas = new ArrayList<MarcaEntity>();

	public List<MarcaEntity> getMarcas() {
		return marcas;
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




	public void agregar() {
		MarcaEntity me = new MarcaEntity();
		me.setIdMarca(idMarca);
		me.setNombre(nombre);
		me.setIdCategoria(idCategoria);
		me.setDescripcion(descripcion);
		me.setFechaRegistro(fechaRegistro);
		me.setStatus(status);
		marcas.add(me);

	}


}
