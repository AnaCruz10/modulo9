package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
@SessionScoped
public class Usuarios implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<UsuarioEntity> usuarios;

	public Usuarios() {
		usuarios = new ArrayList<>();
	}
	
	public void agregar(Usuario u) {
		UsuarioEntity ue = new UsuarioEntity();
		ue.setIdUsuario(u.getIdUsuario());
		ue.setNombre(u.getNombre());
		ue.setApaterno(u.getApaterno());
		ue.setAmaterno(u.getAmaterno());
		ue.setGenero(u.getGenero());
		ue.setUsuario(u.getUsuario());
		ue.setPwd(u.getPwd());
		ue.setDireccion(u.getDireccion());
		ue.setRol(u.getRol());
			
		usuarios.add(ue);
		
	}

	public List<UsuarioEntity> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioEntity> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
