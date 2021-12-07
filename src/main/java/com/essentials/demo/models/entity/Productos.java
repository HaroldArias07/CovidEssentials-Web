package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;
	private String nombre_producto;
	private double precio_producto;
	private int stock_producto;
	private String categoria_producto;
	private String descripción_producto;
	private String imagen_producto;
	
	public int getId_producto() {
		return id_producto;
	}
	
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	public String getNombre_producto() {
		return nombre_producto;
	}
	
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	
	public double getPrecio_producto() {
		return precio_producto;
	}
	
	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}
	
	public int getStock_producto() {
		return stock_producto;
	}
	
	public void setStock_producto(int stock_producto) {
		this.stock_producto = stock_producto;
	}
	
	public String getCategoria_producto() {
		return categoria_producto;
	}
	
	public void setCategoria_producto(String categoria_producto) {
		this.categoria_producto = categoria_producto;
	}
	
	public String getDescripción_producto() {
		return descripción_producto;
	}
	
	public void setDescripción_producto(String descripción_producto) {
		this.descripción_producto = descripción_producto;
	}
	
	public String getImagen_producto() {
		return imagen_producto;
	}
	
	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}
	
	public Productos(int id_producto, String nombre_producto, double precio_producto, int stock_producto,
			String categoria_producto, String descripción_producto, String imagen_producto) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.stock_producto = stock_producto;
		this.categoria_producto = categoria_producto;
		this.descripción_producto = descripción_producto;
		this.imagen_producto = imagen_producto;
	}
	
	public Productos() {
		super();
	}
	
	
	
}
