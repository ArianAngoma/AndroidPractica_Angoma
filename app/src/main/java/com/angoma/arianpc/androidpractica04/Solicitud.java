package com.angoma.arianpc.androidpractica04;

public class Solicitud {

    private Integer id;
    private String email, tipo, motivo, imagen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", motivo='" + motivo + '\'' +
                ", imagen='" + imagen + '\'' +
                '}';
    }


}
