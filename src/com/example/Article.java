package com.example;

import java.time.LocalDate;

public class Article {
    private Long id;
    private final String producto;
    private final String variedad;
    private Double cantidad;
    private Double precioPorKg;
    private final String prod;
    private Double cantMin;
    private final LocalDate entryDate;

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

    public Double getCantMin() {
        return cantMin;
    }

    public void setCantMin(Double cantMin) {
        this.cantMin = cantMin;
    }

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