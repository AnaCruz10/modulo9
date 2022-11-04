package mx.unam.dgtic.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idProducto;
	private String codigoBarras;
	private String nombre;
	private String marca;//private Marca marca;
	private double precioPublico;
	private double precioCompra;
	private int estatus;
	//private String fechaRegistro; //private Date fechaRegistro;
	//private String fechaUltimaEdicion;
	//private String direccionImagen;
	private int stock;
	private int pieza;
	
	//private List<Producto> productos = new ArrayList<Producto>();
	private Productos productos;
	
	public Producto() {
		// TODO Auto-generated constructor stub
		productos = new Productos();
	}

	public int getIdProducto() {
		return idProducto;
	}

	public List<ProductoEntity> getProductos() {
		return productos.getProductos();
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecioPublico() {
		return precioPublico;
	}

	public void setPrecioPublico(double precioPublico) {
		this.precioPublico = precioPublico;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}



	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPieza() {
		return pieza;
	}

	public void setPieza(int pieza) {
		this.pieza = pieza;
	}

	
	
	public String agregar() {
		productos.agregar(this);
		System.out.println(productos.getProductos().size());
		return "listaProductos";
	}

	

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", codigoBarras=" + codigoBarras + ", nombre=" + nombre
				+ ", marca=" + marca + ", precioPublico=" + precioPublico + ", precioCompra=" + precioCompra
				+ ", estatus=" + estatus + ", stock=" + stock + ", pieza=" + pieza+ "]";
	}

	
}
