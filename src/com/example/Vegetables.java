package com.example;

public class Vegetables {
    private String producto;
    private String variedad;
    private Double cantidad;
    private Double precioPorKg;
    private Productor productor;
    private Double cantMin;

    public Vegetables() {
    }

    public Vegetables(String producto, String variedad, Double cantidad, Double precioPorKg, Productor productor, Double cantMin) {
        this.producto = producto;
        this.variedad = variedad;
        this.cantidad = cantidad;
        this.precioPorKg = precioPorKg;
        this.productor = productor;
        this.cantMin = cantMin;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

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

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public Double getCantMin() {
        return cantMin;
    }

    public void setCantMin(Double cantMin) {
        this.cantMin = cantMin;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "producto='" + producto + '\'' +
                ", variedad='" + variedad + '\'' +
                ", cantidad=" + cantidad +
                ", precioPorKg=" + precioPorKg +
                ", productor=" + productor +
                ", cantMin=" + cantMin +
                '}';
    }
}
