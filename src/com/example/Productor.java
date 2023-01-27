package com.example;

public class Productor {

    private Long id;
    private String nombre;
    private String nif;
    private String direccion;
    private String email;
    private String telefono;

//    public Productor() {
//    }

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

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNif() { return nif; }

    public void setNif(String nif) { this.nif = nif; }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

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