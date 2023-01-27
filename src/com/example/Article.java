package com.example;

import java.time.LocalDate;

public class Article {
    private Long id;
    private String producto;
    private String variedad;
    private Double cantidad;
    private Double precioPorKg;
    private String prod;
    private Double cantMin;
    private LocalDate entryDate;

    public Article() {
    }

//    public Article(Long id, String producto, String variedad, Double cantidad, Double precioPorKg, Productor productor, Double cantMin, LocalDate entryDate) {
//        this.id = id;
//        this.producto = producto;
//        this.variedad = variedad;
//        this.cantidad = cantidad;
//        this.precioPorKg = precioPorKg;
//        this.productor = productor;
//        this.cantMin = cantMin;
//        this.entryDate = entryDate;
//    }

    // TODO Constructor creado desde la línea 75 de la clase Main


    public Article(Long id, String producto, String variedad, Double cantidad, Double precioPorKg, String prod, Double cantMin, LocalDate entryDate) {
        this.id = id;
        this.producto = producto;
        this.variedad = variedad;
        this.cantidad = cantidad;
        this.precioPorKg = precioPorKg;
        this.prod = prod;
        this.cantMin = cantMin;
        this.entryDate = entryDate;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getProducto() { return producto;}

    public void setProducto(String producto) { this.producto = producto;}

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioPorKg() {
        return precioPorKg;
    }

    public void setPrecioPorKg(Double precioPorKg) {
        this.precioPorKg = precioPorKg;
    }

    public String getProd() { return prod; }

    public void setProd(String prod) { this.prod = prod; }

    public Double getCantMin() {
        return cantMin;
    }

    public void setCantMin(Double cantMin) {
        this.cantMin = cantMin;
    }

    public LocalDate getEntryDate() { return entryDate; }

    public void setEntryDate(LocalDate entryDate) { this.entryDate = entryDate; }

    @Override
    public String toString() {
        return "Artículo {" +
                " id=" + id +
                ", producto = '" + producto + '\'' +
                ", variedad = '" + variedad + '\'' +
                ", cantidad = " + cantidad +
                ", precio por kg = " + precioPorKg +
                ", productor = " + prod +
                ", cantidad minima de venta = " + cantMin +
                ", día de entrada = " + entryDate +
                '}';
    }
}
