package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
@SessionScoped
public class UsuarioEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idUsuario;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private String genero;
	private String usuario;
	private String pwd;
	private String direccion;
	private String rol;

	private List<UsuarioEntity> usuarios = new ArrayList<UsuarioEntity>();

	

	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApaterno() {
		return apaterno;
	}



	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}



	public String getAmaterno() {
		return amaterno;
	}



	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}



	public List<UsuarioEntity> getUsuarios() {
		return usuarios;
	}



	public void setUsuario(List<UsuarioEntity> usuarios) {
		this.usuarios = usuarios;
	}



	public void agregar() {
		UsuarioEntity ue = new UsuarioEntity();
		ue.setIdUsuario(idUsuario);
		ue.setNombre(nombre);
		ue.setApaterno(apaterno);
		ue.setAmaterno(amaterno);
		ue.setGenero(genero);
		ue.setUsuario(usuario);
		ue.setPwd(pwd);
		ue.setDireccion(direccion);
		ue.setRol(rol);
		
		usuarios.add(ue);

	}


}
