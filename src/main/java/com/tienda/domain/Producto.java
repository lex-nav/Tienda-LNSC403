package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;

    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name 
    = "ruta_imagen")
    private String rutaImagen;
    private Boolean activo;
    
    @ManyToOne​
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    
    public Producto() {

    }

    public Long getidProducto() {
        return idProducto;
    }

      public Producto(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = imagen;
        this.activo = activo;
    }


    //////// Revisar con el profe
    ///
    ///
    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getIdProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setRutaImagen(String cargaImagen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
