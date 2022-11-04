package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
@SessionScoped
public class Productos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProductoEntity> productos;

	public Productos() {
		productos = new ArrayList<>();
	}
	
	public void agregar(Producto p) {
		ProductoEntity pe = new ProductoEntity();
		pe.setIdProducto(p.getIdProducto());
		pe.setCodigoBarras(p.getCodigoBarras());
		pe.setNombre(p.getNombre());
		pe.setMarca(p.getMarca());
		pe.setPrecioPublico(p.getPrecioCompra());
		pe.setEstatus(p.getEstatus());
		pe.setStock(p.getEstatus());
		pe.setPieza(p.getPieza());
		productos.add(pe);
		
	}
	
	public List<ProductoEntity> getProductos(){
		return productos;
	}

	public void setProductos(List<ProductoEntity> productos) {
		this.productos = productos;
	}
	
	

}
