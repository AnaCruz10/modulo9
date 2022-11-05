package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
@SessionScoped
public class Marcas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<MarcaEntity> marcas;

	public Marcas() {
		marcas = new ArrayList<>();
	}
	
	public void agregar(Marca m) {
		MarcaEntity me = new MarcaEntity();
		me.setIdMarca(m.getIdMarca());
		me.setNombre(m.getNombre());
		me.setIdCategoria(m.getIdCategoria());
		me.setDescripcion(m.getDescripcion());
		me.setFechaRegistro(m.getFechaRegistro());
		me.setStatus(m.getStatus());
	
		marcas.add(me);
		
	}

	public List<MarcaEntity> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<MarcaEntity> marcas) {
		this.marcas = marcas;
	}
	
	

}
