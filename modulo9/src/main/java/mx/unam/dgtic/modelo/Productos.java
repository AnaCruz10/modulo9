package mx.unam.dgtic.modelo;

import java.util.ArrayList;
import java.util.List;

public class Productos {
	private List<ProductoEntity> productos = new ArrayList<>();

	public String agregar(ProductoEntity pe) {
		productos.add(pe);
		return "listaProductos";
		
	}

}
