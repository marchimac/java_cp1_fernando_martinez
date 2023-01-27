package com.example;

public class Productor {

    private Long id;
    private final String nombre;
    private final String nif;
    private final String direccion;
    private final String email;
    private final String telefono;

    public Productor(Long id, String nombre, String nif, String direccion, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.nif = nif;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    @Override
    public String toString() {
        return "Productor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}